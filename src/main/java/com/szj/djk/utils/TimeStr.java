package com.szj.djk.utils;

import java.text.SimpleDateFormat;
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
 }


