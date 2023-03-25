package com.szj.djk.entity;

import lombok.Data;

/**
 * @ClassName valueRange
 * @Author 张高义
 * @Create 2023/2/23 0023 下午 15:27
 */
@Data
public class ValueRange {
    /**
     * 上辊电机电流
     * 上辊电机速度
     * 下辊电机电流
     * 下辊电机速度
     * 主水泵电机电流
     * 主水泵电机速度
     * 备用水泵电机电流
     * 备用水泵电机速度
     * 卷取电机电流
     * 卷取电机速度
     * 上辊水压
     * 上辊水温
     * 上辊流量
     * 下辊水压
     * 下辊水温
     * 下辊流量
     * WS操作侧预载力
     * DS传动侧预载力
     */
    private Double shangDD ;//上辊电机电流
    private Double shangDS ;//上辊电机速度
    private Double xiaDD; //下辊电机电流
    private Double xiaDS; //下辊电机速度
    private Double zhuDD; //主水泵电机电流
    private Double zhuDS; //主水泵电机速度
    private Double beiDD; //备用水泵电机电流
    private Double beiDS; //备用水泵电机速度
    private Double juanDD;//卷取电机电流
    private Double juanDS;//卷取电机速度
    private Double shangSY;//上辊水压
    private Double xiaSY;  //下辊水压
    private Double shangSW;//上辊水温
    private Double shangLL;//上辊流量
    private Double xiaSW; //下辊水温
    private Double xiaLL;//下辊流量
    private Double caoZuoY; //WS操作侧预载力
    private Double dsDongY; //DS传动侧预载力
//    private Double jqDianJ; //DS传动侧预载力
//    private Double dsDongY; //DS传动侧预载力
//    private Double dsDongY; //DS传动侧预载力

    public Double getShangDD() {
        return shangDD;
    }

    public void setShangDD(Double shangDD) {
        this.shangDD = shangDD;
    }

    public Double getXiaDD() {
        return xiaDD;
    }

    public void setXiaDD(Double xiaDD) {
        this.xiaDD = xiaDD;
    }
}
