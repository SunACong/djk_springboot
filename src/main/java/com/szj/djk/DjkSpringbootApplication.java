package com.szj.djk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling //开启定时器功能
@SpringBootApplication
public class DjkSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DjkSpringbootApplication.class, args);
        System.out.println("丹江口项目启动成功。。。。。。");
    }

    // 禁用Ping Method
    static {
        System.setProperty("druid.mysql.usePingMethod","false");
    }
}
