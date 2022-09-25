package com.szj.djk.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.szj.djk.entity.ProductQuality;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MyHttp
 * @Authoc 孙少聪
 * @Date 2022/9/24 19:06:42
 */
@Slf4j
public class MyHttp{

    public static Map<String, String> tokenMap = new HashMap<String, String>();

    /**
     * 获取token值
     */
    public static void GetToken(){
        RestTemplate restTemplate = new RestTemplate();
        String token = "";
        System.out.println("开始系统获取【token】");
        long startTime = System.currentTimeMillis();
        String url = "http://route.weexx.cn:20046/api/v1.0/auth/gettoken";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject json = new JSONObject();
        json.put("useraccount", "zhaoqiang");
        json.put("password", "e10adc3949ba59abbe56e057f20f883e");
        HttpEntity<JSONObject> request = new HttpEntity<>(json, headers);

        ResponseEntity<String> response = restTemplate.postForEntity( url, request , String.class );
        JSONObject jsonObject =(JSONObject) JSONObject.parseObject(response.getBody()).get("data");
        token = jsonObject.getString("token");
        tokenMap.put("token",token);
    }

    /**
     * 根据sql语句查询想要的数据
     * @param sql
     * @return
     */
    public static JSONObject GetDataInfo(String sql){
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://route.weexx.cn:20045/bus/v1.0/ExecuteSql";

        HttpHeaders headers = new HttpHeaders();
        Map<String, String> map = new HashMap<>();
        map.put("Content-Type", "application/json");
        map.put("bus_sra_token", MyHttp.tokenMap.get("token"));
        headers.setAll(map);

        JSONObject json = new JSONObject();
        JSONObject json1 = new JSONObject();
        json1.put("Sql",sql);
        json.put("MessageSequence", "20200501880001");
        json.put("RequestParam", json1);

        HttpEntity<JSONObject> request = new HttpEntity<>(json, headers);

        ResponseEntity<String> response = restTemplate.postForEntity( url, request , String.class );
        JSONObject jsonObject =(JSONObject) JSONObject.parseObject(response.getBody()).get("ResponseParam");
        return jsonObject;
    }
}
