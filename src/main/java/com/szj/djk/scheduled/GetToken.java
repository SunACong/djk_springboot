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

//    @PostConstruct
    public void init() {
        //String sql = "SELECT single_straightness, single_medium_convexity, finished_thickness, finished_width, lqci.finished_roll_diameter, finished_weight, surface_quality, surface_quality_remark, appearance_quality, appearance_quality_remark, correct_strength, correct_extension FROM lmdp_qc_cold_inspect lqci, lmdp_qc_cold_mechanics_report lqcmr where lqci.batch_num = lqcmr.batch_num";
        String sql = "SELECT batch_num batchNum, ts, consumer, single_straightness singleStraightness, single_medium_convexity singleMediumConvexity, finished_thickness finishedThickness, finished_width finishedWidth, finished_roll_diameter finishedRollDiameter, finished_weight finishedWeight, surface_quality surfaceQualityRemark, correct_strength correctStrength, correct_extension correctExtension FROM lmdp_qc_cold_inspect lqci, lmdp_qc_cold_mechanics_report lqcmr where lqci.batch_num = lqcmr.batch_num";
        long startTime = System.currentTimeMillis();
        /**
         * 获取token
         */
        MyHttp.GetToken();
        System.out.println(MyHttp.tokenMap);

        /**
         * 获取数据，返回JsonObject
         */
        JSONObject jsonObject = MyHttp.GetDataInfo(sql);
        List<ProductQuality> productQualities = JSON.parseArray(jsonObject.getString("Result"), ProductQuality.class);

        System.out.println(productQualities);
        //List<ProductQuality> collect = productQualities.stream().map(item -> {
        //    if (item.getSingleStraightness() != null) {
        //        boolean b = item.getSingleStraightness() >= 1 ? true : false;
        //        item.setIsQuality(b);
        //    }else {
        //        item.setIsQuality(null);
        //    }
        //    return item;
        //}).collect(Collectors.toList());
        productQualityMapper.batchInsertOrUpdate(productQualities);
        long endTime = System.currentTimeMillis();
        System.out.println("更新【token】缓存结束，耗时： " + (endTime - startTime) + "ms");
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
//        init();
    }
}
