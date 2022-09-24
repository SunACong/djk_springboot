package com.szj.djk.utils;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName GetToken
 * @Authoc 孙少聪
 * @Date 2022/9/24 14:57:11
 */

@Slf4j
@Component
public class GetToken {


    @PostConstruct
    public void init() {
        String sql = "SELECT single_straightness, single_medium_convexity, finished_thickness, finished_width, lqci.finished_roll_diameter, finished_weight, surface_quality, surface_quality_remark, appearance_quality, appearance_quality_remark, correct_strength, correct_extension FROM lmdp_qc_cold_inspect lqci, lmdp_qc_cold_mechanics_report lqcmr where lqci.batch_num = lqcmr.batch_num";        long startTime = System.currentTimeMillis();

        MyHttp.GetToken();
        System.out.println(MyHttp.tokenMap);
        Object o = MyHttp.GetDataInfo(sql);
        System.out.println(o.toString());
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
        init();
    }



}
