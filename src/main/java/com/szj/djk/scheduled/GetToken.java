package com.szj.djk.scheduled;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.szj.djk.entity.Lqci;
import com.szj.djk.entity.ProcessStandard;
import com.szj.djk.entity.ProductQuality;
import com.szj.djk.mapper.ProductQualityMapper;
import com.szj.djk.service.LqciService;
import com.szj.djk.service.ProcessStandardService;
import com.szj.djk.service.ProductQualityService;
import com.szj.djk.utils.MyHttp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName GetToken
 * @Authoc 孙少聪
 * @Date 2022/9/25 09:17:51
 */

@Slf4j
@Component
public class GetToken {

    @Autowired
    private ProductQualityMapper productQualityMapper;

    @Autowired
    private ProductQualityService productQualityService;

    @Autowired
    private ProcessStandardService processStandardService;

    @Autowired
    private LqciService lqciService;

    private List<ProcessStandard> processStandards;

/*    @PostConstruct
    public void init1() {
        // 构造日期查询条件
        Date date = productQualityMapper.selectMaxDate();
        String maxDate = "";
        if (date == null){
            maxDate = "1970-01-01 00:00:00";
        }else {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            maxDate = format.format(date);
        }
        log.info("查询起始日期:{}",maxDate);

        // 修改了sql语句但是未测试，根据自己数据库测试的sql语句
        String sql = "SELECT batch_num batchNum, lqci.ts lqciTs, lqcmr.ts lqcmrTs ,consumer," +
                " single_straightness singleStraightness, single_medium_convexity singleMediumConvexity, finished_thickness finishedThickness, finished_width finishedWidth, finished_roll_diameter finishedRollDiameter, finished_weight finishedWeight, surface_quality surfaceQualityRemark, correct_strength correctStrength, correct_extension correctExtension" +
                " FROM lmdp_qc_cold_inspect lqci left join lmdp_qc_cold_mechanics_report lqcmr" +
                " on lqci.batch_num = lqcmr.batch_num where lqci.ts > '" + maxDate + "' or lqcmr.ts > '" + maxDate + "'";

        // 获取token
        // 全局获取token值 MyHttp.tokenMap
        MyHttp.GetToken();
        log.info("token:{}",MyHttp.tokenMap);

        // 获取数据，返回JsonObject 接着转换为我们需要的实体类
        JSONObject jsonObject = MyHttp.GetDataInfo(sql);
        List<ProductQuality> productQualities = JSON.parseArray(jsonObject.getString("Result"), ProductQuality.class);
        // 如果最近没有更新数据就不去执行插入操作
        if (productQualities.size() != 0){
            // 获取标准，标准较少直接全部获取，对应的直接获取对应位置的标准即可，少了数据库查询语句
            // 最好是根据id来，但是目前是根据对应元素来实现
            processStandards = processStandardService.list();

            // 判断各大板块是否合格
            List<ProductQuality> collect = productQualities.stream().map(item -> {
                ProcessStandard processStandard = processStandards.get(Integer.parseInt(item.getConsumer()));
                plateTypeJudgment(item, processStandard);
                sizeDeviationJudgment(item, processStandard);
                mechanicalPropertiesJudgment(item, processStandard);
                appearanceQualityJudgment(item, processStandard);
                surfaceQualityJudgment(item, processStandard);
                qualityJudgment(item);
                return item;
            }).collect(Collectors.toList());

            // 批量插入和更新
            productQualityMapper.batchInsertOrUpdate(productQualities);
        }
    }*/

    public void init() {
        // 获取从最后时间段到此时的数据
        Date startTime = productQualityMapper.selectMaxDate();
        List<Lqci> lqcis = lqciService.selectLqciAndLqcmr(startTime);

        // 获取数据，返回JsonObject 接着转换为我们需要的实体类
        List<ProductQuality> productQualities = productQualityMapper.selectLqciAndLqcmrToProductQuality(startTime);
        log.info("productQualities:{}",productQualities);
        // 如果最近没有更新数据就不去执行插入操作
        if (productQualities.size() != 0){
            // 获取标准，标准较少直接全部获取，对应的直接获取对应位置的标准即可，少了数据库查询语句
            // 最好是根据id来，但是目前是根据对应元素来实现
            processStandards = processStandardService.list();

            // 判断各大板块是否合格
            List<ProductQuality> collect = productQualities.stream().map(item -> {
                ProcessStandard processStandard = processStandards.get(Integer.parseInt(item.getConsumer())-1);
                log.info("标准{}",processStandard);
                plateTypeJudgment(item, processStandard);
                sizeDeviationJudgment(item, processStandard);
                mechanicalPropertiesJudgment(item, processStandard);
                appearanceQualityJudgment(item, processStandard);
                surfaceQualityJudgment(item, processStandard);
                qualityJudgment(item);
                return item;
            }).collect(Collectors.toList());
            // 批量插入和更新
            productQualityMapper.batchInsertOrUpdate(productQualities);
        }
    }

    @PreDestroy
    public void destroy() {
        //系统运行结束
    }

    /**
     * 这里是每2小时执行一次，更新token缓存
     * 可以根据token有效时长进行更新
     * @return
     */
    @Scheduled(cron = "0 0/1 * * * ? ")
    public void start() {
//        init();
    }

    /**
     * 以下所有判断结果
     * 0 不合格
     * 1 合格
     * 2 暂时不能评定
     * @param productQuality
     * @return
     */
    private void plateTypeJudgment(ProductQuality productQuality, ProcessStandard processStandard){
        if (productQuality.getSingleStraightness() != null && productQuality.getSingleMediumConvexity() != null){
            if(productQuality.getSingleStraightness() <= processStandard.getStraightness() && productQuality.getSingleMediumConvexity() >= processStandard.getMediumConvexityLow() && productQuality.getSingleMediumConvexity() <= processStandard.getMediumConvexityHigh()){
                productQuality.setPlateType(1);
                return;
            }else {
                productQuality.setPlateType(0);
            }
        }else {
            productQuality.setPlateType(2);
        }
    }
    private void sizeDeviationJudgment(ProductQuality productQuality, ProcessStandard processStandard){
        if (productQuality.getFinishedThickness() != null && productQuality.getFinishedWidth() != null){
            productQuality.setSizeDeviation(1);
        }else {
            productQuality.setSizeDeviation(2);
        }
    }
    private void mechanicalPropertiesJudgment(ProductQuality productQuality, ProcessStandard processStandard){
        if (productQuality.getCorrectExtension() != null && productQuality.getCorrectStrength() != null){
            if(productQuality.getCorrectExtension()>=processStandard.getElongation() && productQuality.getCorrectStrength()<=processStandard.getTensileStrengthHigh() && productQuality.getCorrectStrength()>=processStandard.getTensileStrengthLow()){
                productQuality.setMechanicalProperties(1);
                return;
            }else {
                productQuality.setMechanicalProperties(0);
            }
        }else {
            productQuality.setMechanicalProperties(2);
        }
    }
    private void surfaceQualityJudgment(ProductQuality productQuality, ProcessStandard processStandard){
        if (productQuality.getSurfaceQualityRemark() != null){
            productQuality.setSurfaceQuality(1);
        }else {
            productQuality.setSurfaceQuality(2);
        }
    }
    private void appearanceQualityJudgment(ProductQuality productQuality, ProcessStandard processStandard){
        if (productQuality.getFinishedRollDiameter() != null && productQuality.getFinishedWeight() != null){
            if(productQuality.getFinishedRollDiameter()<=processStandard.getRollDiameterHigh() && productQuality.getFinishedRollDiameter()>=processStandard.getRollDiameterLow() && productQuality.getFinishedWeight()<=processStandard.getRollWeightHigh() && productQuality.getFinishedWeight()>=processStandard.getRollWeightLow()){
                productQuality.setAppearanceQuality(1);
                return;
            }else {
                productQuality.setAppearanceQuality(0);
            }
        }else {
            productQuality.setAppearanceQuality(2);
        }
    }
    private void qualityJudgment(ProductQuality productQuality){
        if (productQuality.getPlateType() == 1 && productQuality.getSizeDeviation() == 1 && productQuality.getMechanicalProperties() == 1 && productQuality.getSurfaceQuality() == 1 && productQuality.getAppearanceQuality() == 1){
            productQuality.setQualityJudgment(1);
        }else if(productQuality.getPlateType() == 0 || productQuality.getSizeDeviation() == 0 || productQuality.getMechanicalProperties() == 0 || productQuality.getSurfaceQuality() == 0 || productQuality.getAppearanceQuality() == 0){
            productQuality.setQualityJudgment(0);
        }else {
            productQuality.setQualityJudgment(2);
        }
    }
}
