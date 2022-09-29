package com.szj.djk.scheduled;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.szj.djk.entity.ProductQuality;
import com.szj.djk.mapper.ProductQualityMapper;
import com.szj.djk.utils.MyHttp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void init() {
        /**
         * 拼接sql语句
         * 第一次启动的话，把时间调整到 1970-01-01 00:00:00
         */
        String maxDate = productQualityMapper.selectMaxDate();
        if (maxDate == null){
            maxDate = "1970-01-01 00:00:00";
        }
        log.info("查询起始日期:{}",maxDate);
        String sql = "SELECT batch_num batchNum, lqci.ts lqciTs, lqcmr.ts lqcmrTs ,consumer," +
                " single_straightness singleStraightness, single_medium_convexity singleMediumConvexity, finished_thickness finishedThickness, finished_width finishedWidth, finished_roll_diameter finishedRollDiameter, finished_weight finishedWeight, surface_quality surfaceQualityRemark, correct_strength correctStrength, correct_extension correctExtension" +
                " FROM lmdp_qc_cold_inspect lqci, lmdp_qc_cold_mechanics_report lqcmr" +
                " where lqci.batch_num = lqcmr.batch_num and lqci.ts > '" + maxDate + "' and lqcmr.ts > '" + maxDate + "'";
        /**
         * 获取token
         * 全局获取token值 MyHttp.tokenMap
         */
        MyHttp.GetToken();
        log.info("token:{}",MyHttp.tokenMap);
        /**
         * 获取数据，返回JsonObject
         * 接着转换为我们需要的实体类
         */
        JSONObject jsonObject = MyHttp.GetDataInfo(sql);
        List<ProductQuality> productQualities = JSON.parseArray(jsonObject.getString("Result"), ProductQuality.class);
        // 如果最近没有更新数据就不去执行插入操作
        if (productQualities.size() != 0){
            List<ProductQuality> collect = productQualities.stream().map(item -> {
                plateTypeJudgment(item);
                sizeDeviationJudgment(item);
                mechanicalPropertiesJudgment(item);
                appearanceQualityJudgment(item);
                surfaceQualityJudgment(item);
                qualityJudgment(item);
                return item;
            }).collect(Collectors.toList());
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
    @Scheduled(cron = "0 0 0/1 * * ? ")
    public void start() {
        init();
    }

    /**
     * 以下所有判断结果
     * 0 不合格
     * 1 合格
     * 2 暂时不能评定
     * @param productQuality
     * @return
     */
    private void plateTypeJudgment(ProductQuality productQuality){
        if (productQuality.getSingleStraightness() != null && productQuality.getSingleMediumConvexity() != null){
            productQuality.setPlateType(1);
        }else {
            productQuality.setPlateType(2);
        }
    }
    private void sizeDeviationJudgment(ProductQuality productQuality){
        if (productQuality.getFinishedThickness() != null && productQuality.getFinishedWidth() != null){
            productQuality.setSizeDeviation(1);
        }else {
            productQuality.setSizeDeviation(2);
        }
    }
    private void mechanicalPropertiesJudgment(ProductQuality productQuality){
        if (productQuality.getCorrectExtension() != null && productQuality.getCorrectStrength() != null){
            productQuality.setMechanicalProperties(1);
        }else {
            productQuality.setMechanicalProperties(2);
        }
    }
    private void surfaceQualityJudgment(ProductQuality productQuality){
        if (productQuality.getSurfaceQualityRemark() != null){
            productQuality.setSurfaceQuality(1);
        }else {
            productQuality.setSurfaceQuality(2);
        }
    }
    private void appearanceQualityJudgment(ProductQuality productQuality){
        if (productQuality.getFinishedRollDiameter() != null && productQuality.getFinishedWidth() != null){
            productQuality.setAppearanceQuality(1);
        }else {
            productQuality.setAppearanceQuality(2);
        }
    }
    private void qualityJudgment(ProductQuality productQuality){
        if (productQuality.getPlateType() == 1 && productQuality.getSizeDeviation() == 1 && productQuality.getMechanicalProperties() == 1 && productQuality.getSurfaceQuality() == 1 && productQuality.getAppearanceQuality() == 1){
            productQuality.setQualityJudgment(1);
        }else {
            productQuality.setQualityJudgment(2);
        }
    }
}
