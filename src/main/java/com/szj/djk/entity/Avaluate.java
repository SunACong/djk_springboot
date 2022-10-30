package com.szj.djk.entity;

import lombok.Data;

/**
 * @ClassName Avaluate
 * @Author 张高义
 * @Create 2022/10/8 0008 下午 16:48
 */
@Data
public class Avaluate {
    private Long id; //id
    private String name; //指标名称
    private String danWei; //单位
    private Double minValue; //最小值
    private Double maxValue; //最大值
    private String deviceId; //设备号

}
