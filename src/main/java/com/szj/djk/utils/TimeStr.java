package com.szj.djk.utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeStr{
     private TimeStr() {
     }
     //private String timeStr1= LocalDateTime.now().minusSeconds(20).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
    //private String timeStr2=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));

     public static String getTimeStr1() {
         //impleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
         return LocalDateTime.now().minusSeconds(20).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
     }
    public static String getTimeStr2() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//        Date date = new Date();
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
    }

    public static Double getGapTime(Date date) {
        // 将Date对象转换为LocalDateTime对象，以便进行计算
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), java.time.ZoneId.systemDefault());

        // 获取当前时间的LocalDateTime对象
        LocalDateTime now = LocalDateTime.now();

        // 计算时间差异
        Duration duration = Duration.between(localDateTime, now);

        // 计算时间差异的小时数
        long diffInHours = duration.toHours();

        return (double) diffInHours;
    }

 }


