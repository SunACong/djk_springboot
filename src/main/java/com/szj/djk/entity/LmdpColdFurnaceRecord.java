package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 退火生产原始记录
 * @TableName lmdp_cold_furnace_record
 */
@TableName(value ="lmdp_cold_furnace_record")
@Data
public class LmdpColdFurnaceRecord implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 
     */
    private Date ts;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 卷号
     */
    private String batchNum;

    /**
     * 退火日期
     */
    private Date recordDate;

    /**
     * 退火炉号
     */
    private String furnaceNum;

    /**
     * 退火开始时间
     */
    private Date startTime;

    /**
     * 退火结束时间
     */
    private Date endTime;

    /**
     * 单条退火记录时间
     */
    private String totalTime;

    /**
     * 炉气温度(℃)Ⅰ区
     */
    private BigDecimal gasTemperature1;

    /**
     * 炉气温度(℃)Ⅱ区
     */
    private BigDecimal gasTemperature2;

    /**
     * 炉气温度(℃)Ⅲ区
     */
    private BigDecimal gasTemperature3;

    /**
     * 料温(℃)1
     */
    private BigDecimal materialTemperature1;

    /**
     * 料温(℃)2
     */
    private BigDecimal materialTemperature2;

    /**
     * 水压MPa
     */
    private BigDecimal hydraulicPressure;

    /**
     * 气压MPa
     */
    private BigDecimal gasPressure;

    /**
     * 进风风机轴承温度℃
     */
    private BigDecimal intakeFanTemperature;

    /**
     * 排烟风机轴承温度℃
     */
    private BigDecimal exhaustFanTemperature;

    /**
     * 循环风机轴承温度(℃)Ⅰ区
     */
    private BigDecimal cycleFanTemperature1;

    /**
     * 循环风机轴承温度(℃)Ⅱ区
     */
    private BigDecimal cycleFanTemperature2;

    /**
     * 循环风机轴承温度(℃)Ⅲ区
     */
    private BigDecimal cycleFanTemperature3;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作手
     */
    private String operator;

    /**
     * 退火厚度（mm）
     */
    private BigDecimal annealingThick;

    /**
     * 退火工艺卡编号
     */
    private String furnaceCardNumber;

    /**
     * 合金
     */
    private String brand;

    /**
     * 卷数（个）
     */
    private Integer rollNum;

    /**
     * 装炉总量（t）
     */
    private BigDecimal furnaceTotal;

    /**
     * 装炉位置
     */
    private String furnacePosition;

    /**
     * 装炉人员
     */
    private String furnaceOperator1;

    /**
     * 出炉人员
     */
    private String furnaceOperator2;

    /**
     * 料温控制/炉气控制
     */
    private String tempPowerControl;

    /**
     * 起始电量（kw.h）
     */
    private BigDecimal powerBefore;

    /**
     * 终止电量（kw.h）
     */
    private BigDecimal powerAfter;

    /**
     * 运行时长
     */
    private String runningDuring;

    /**
     * 本炉电耗（kw.h）
     */
    private BigDecimal powerLoss;

    /**
     * 吨电耗（kw.h/t）
     */
    private BigDecimal perPowerLoss;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}