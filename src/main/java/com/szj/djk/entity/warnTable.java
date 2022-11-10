package com.szj.djk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName warnTable
 * @Author 张高义
 * @Create 2022/11/8 0008 上午 11:16
 */
@Data
public class warnTable {
    /**id*/
    private Long idNumber;

    /**指标名称*/
    private String rollingName;

    /**时间*/
    @JsonFormat(pattern = "yyyy-MM-dd :hh:mm:ss")
    private Date rollingProduceTime;

    /**数值*/
    private Integer rollingValue;
}
