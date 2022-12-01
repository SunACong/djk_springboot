package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 生产工序平均时间存储表
 * @TableName lmdp_avg_time
 */
@TableName(value ="lmdp_avg_time")
@Data
public class LmdpAvgTime  {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 最近一次更新时间
     */
    private Date updateTime;

    /**
     * 铸轧计划平均时长
     */
    private Double castplan;

    /**
     * 熔炉生产平均时间
     */
    private Double smelthold;

    /**
     * 保温平均时间
     */
    private Double baowen;

    /**
     * 保温(精练 一)平均时间
     */
    private Double baowen1;

    /**
     * 保温(精练 二)平均时间
     */
    private Double baowen2;

    /**
     * 保温(精练三)平均时间
     */
    private Double baowen3;

    /**
     * 保温(精练四)平均时间
     */
    private Double baowen4;

    /**
     * 保温(精练 五)平均时间
     */
    private Double baowen5;

    /**
     * 铸轧生产平均时间
     */
    private Double castpro;

    /**
     * 铸轧卷质检平均时间
     */
    private Double castreel;

    /**
     * 冷轧生产计划平均时间
     */
    private Double coldplan;

    /**
     * 冷轧工序平均时间
     */
    private Double coldproduce;

    /**
     * 退火平均时间
     */
    private Double furnace;

    /**
     * 冷轧卷成品质检平均时间
     */
    private Double reelreport;

    /**
     * 重卷中切平均时间
     */
    private Double rereeler;

    /**
     * 冷轧卷入库平均时间
     */
    private Double store;

    /**
     * 包装检验平均时间
     */
    private Double packageTime;

    /**
     * 备注
     */
    private String note;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
