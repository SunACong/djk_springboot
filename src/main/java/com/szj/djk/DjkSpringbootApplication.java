package com.szj.djk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableScheduling //开启定时器功能
@SpringBootApplication
@EnableTransactionManagement
public class DjkSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DjkSpringbootApplication.class, args);
        System.out.println("  _____       _ _  __\n" +
                " |  __ \\     | | |/ /\n" +
                " | |  | |    | | ' /\n" +
                " | |  | |_   | |  <\n" +
                " | |__| | |__| | . \\\n" +
                " |_____/ \\____/|_|\\_\\\n");
    }

    // 禁用Ping Method
    static {
        System.setProperty("druid.mysql.usePingMethod","false");
    }
}
