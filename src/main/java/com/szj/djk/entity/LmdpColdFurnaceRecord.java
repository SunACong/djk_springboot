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
    @TableId(value = "id")
    private String id;

    /**
     * 
     */
    @TableField(value = "ts")
    private Date ts;

    /**
     * 创建人
     */
    @TableField(value = "creator_id")
    private String creatorId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 卷号
     */
    @TableField(value = "batch_num")
    private String batchNum;

    /**
     * 退火日期
     */
    @TableField(value = "record_date")
    private Date recordDate;

    /**
     * 退火炉号
     */
    @TableField(value = "furnace_num")
    private String furnaceNum;

    /**
     * 退火开始时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 退火结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 单条退火记录时间
     */
    @TableField(value = "total_time")
    private String totalTime;

    /**
     * 炉气温度(℃)Ⅰ区
     */
    @TableField(value = "gas_temperature1")
    private BigDecimal gasTemperature1;

    /**
     * 炉气温度(℃)Ⅱ区
     */
    @TableField(value = "gas_temperature2")
    private BigDecimal gasTemperature2;

    /**
     * 炉气温度(℃)Ⅲ区
     */
    @TableField(value = "gas_temperature3")
    private BigDecimal gasTemperature3;

    /**
     * 料温(℃)1
     */
    @TableField(value = "material_temperature1")
    private BigDecimal materialTemperature1;

    /**
     * 料温(℃)2
     */
    @TableField(value = "material_temperature2")
    private BigDecimal materialTemperature2;

    /**
     * 水压MPa
     */
    @TableField(value = "hydraulic_pressure")
    private BigDecimal hydraulicPressure;

    /**
     * 气压MPa
     */
    @TableField(value = "gas_pressure")
    private BigDecimal gasPressure;

    /**
     * 进风风机轴承温度℃
     */
    @TableField(value = "intake_fan_temperature")
    private BigDecimal intakeFanTemperature;

    /**
     * 排烟风机轴承温度℃
     */
    @TableField(value = "exhaust_fan_temperature")
    private BigDecimal exhaustFanTemperature;

    /**
     * 循环风机轴承温度(℃)Ⅰ区
     */
    @TableField(value = "cycle_fan_temperature1")
    private BigDecimal cycleFanTemperature1;

    /**
     * 循环风机轴承温度(℃)Ⅱ区
     */
    @TableField(value = "cycle_fan_temperature2")
    private BigDecimal cycleFanTemperature2;

    /**
     * 循环风机轴承温度(℃)Ⅲ区
     */
    @TableField(value = "cycle_fan_temperature3")
    private BigDecimal cycleFanTemperature3;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 操作手
     */
    @TableField(value = "operator")
    private String operator;

    /**
     * 退火厚度（mm）
     */
    @TableField(value = "annealing_thick")
    private BigDecimal annealingThick;

    /**
     * 质检员
     */
    @TableField(value = "inspector_id")
    private String inspectorId;

    /**
     * 退火工艺卡编号
     */
    @TableField(value = "furnace_card_number")
    private String furnaceCardNumber;

    /**
     * 合金
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 卷数（个）
     */
    @TableField(value = "roll_num")
    private Integer rollNum;

    /**
     * 装炉总量（t）
     */
    @TableField(value = "furnace_total")
    private BigDecimal furnaceTotal;

    /**
     * 装炉位置
     */
    @TableField(value = "furnace_position")
    private String furnacePosition;

    /**
     * 装炉人员
     */
    @TableField(value = "furnace_operator1")
    private String furnaceOperator1;

    /**
     * 出炉人员
     */
    @TableField(value = "furnace_operator2")
    private String furnaceOperator2;

    /**
     * 料温控制/炉气控制
     */
    @TableField(value = "temp_power_control")
    private String tempPowerControl;

    /**
     * 起始电量（kw.h）
     */
    @TableField(value = "power_before")
    private BigDecimal powerBefore;

    /**
     * 终止电量（kw.h）
     */
    @TableField(value = "power_after")
    private BigDecimal powerAfter;

    /**
     * 运行时长
     */
    @TableField(value = "running_during")
    private String runningDuring;

    /**
     * 本炉电耗（kw.h）
     */
    @TableField(value = "power_loss")
    private BigDecimal powerLoss;

    /**
     * 吨电耗（kw.h/t）
     */
    @TableField(value = "per_power_loss")
    private BigDecimal perPowerLoss;

    /**
     * 装炉人员
     */
    @TableField(value = "furnace_operator1_id")
    private String furnaceOperator1Id;

    /**
     * 出炉人员
     */
    @TableField(value = "furnace_operator2_id")
    private String furnaceOperator2Id;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}