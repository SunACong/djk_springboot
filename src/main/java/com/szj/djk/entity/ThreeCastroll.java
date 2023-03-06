package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 
 * @TableName three_castroll
 */
@Data
public class ThreeCastroll implements Serializable {
    /**
     * ts
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private Date ts;

    /**
     * 上辊电机电流
     */
    private Integer upRollMontorA;

    /**
     * 上辊电机线速度
     */
    private Integer upRollMontorLineV;

    /**
     * 下辊电机电流
     */
    private Integer downRollMontorA;

    /**
     * 下辊电机线速度
     */
    private Integer downRollMontorLineV;

    /**
     * 水泵电流
     */
    private Integer pumpA;

    /**
     * 水泵频率
     */
    private Integer pumpF;

    /**
     * 卷取电流
     */
    private Integer rollA;

    /**
     * 卷取速度
     */
    private Integer rollV;

    /**
     * 入口水温
     */
    private Integer inWaterT;

    /**
     * 入口水压
     */
    private Integer inWaterFn;

    /**
     * 上辊水压
     */
    private Integer upRollWaterFn;

    /**
     * 上辊水温
     */
    private Integer upRollWaterT;

    /**
     * 上辊流量
     */
    private Integer upRollFlow;

    /**
     * 下辊水压
     */
    private Integer downRollWaterFn;

    /**
     * 下辊水温
     */
    private Integer downRollWaterT;

    /**
     * 下辊流量
     */
    private Integer downRollFlow;

    /**
     * 操作侧预载力
     */
    private Integer operationPreloadForce;

    /**
     * 传动侧预载力
     */
    private Integer transPreloadForce;

    /**
     * 卷取机张力
     */
    private Integer rollTension;

    /**
     * 卷取卷径
     */
    private Integer rollDiameter;

    /**
     * 钛丝速度
     */
    private Integer tiWireSpeed;

    /**
     * 带材速度
     */
    private Integer withMaterialSpeed;

    /**
     * 插入时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}