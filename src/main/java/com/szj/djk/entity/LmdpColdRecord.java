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
 * 冷轧生产原始记录
 * @TableName lmdp_cold_record
 */
@TableName(value ="lmdp_cold_record")
@Data
public class LmdpColdRecord implements Serializable {
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
     * 主操手
     */
    @TableField(value = "main_operator")
    private String mainOperator;

    /**
     * 副操
     */
    @TableField(value = "assistant_operator")
    private String assistantOperator;

    /**
     * 班次
     */
    @TableField(value = "work_shift")
    private String workShift;

    /**
     * 日期
     */
    @TableField(value = "record_date")
    private Date recordDate;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 合金牌号
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 冷轧卷号
     */
    @TableField(value = "batch_num")
    private String batchNum;

    /**
     * 道次号
     */
    @TableField(value = "record_num")
    private Integer recordNum;

    /**
     * 尺寸规格#入口厚度
     */
    @TableField(value = "thick_in")
    private BigDecimal thickIn;

    /**
     * 尺寸规格#出口厚度
     */
    @TableField(value = "thick_out")
    private BigDecimal thickOut;

    /**
     * 尺寸规格#宽度
     */
    @TableField(value = "width")
    private BigDecimal width;

    /**
     * 轧制参数#轧制速度
     */
    @TableField(value = "rolling_speed")
    private BigDecimal rollingSpeed;

    /**
     * 轧制参数#轧制力
     */
    @TableField(value = "rolling_force")
    private BigDecimal rollingForce;

    /**
     * 轧制参数#开卷张应力
     */
    @TableField(value = "decoil_tensile_stress")
    private BigDecimal decoilTensileStress;

    /**
     * 轧制参数#卷取张应力
     */
    @TableField(value = "reeling_tensile_stress")
    private BigDecimal reelingTensileStress;

    /**
     * 轧制参数#版型曲线
     */
    @TableField(value = "curve")
    private BigDecimal curve;

    /**
     * 工艺油#油温
     */
    @TableField(value = "oil_temperature")
    private BigDecimal oilTemperature;

    /**
     * 工艺油#油压
     */
    @TableField(value = "oil_pressure")
    private BigDecimal oilPressure;

    /**
     * 工艺油#流量
     */
    @TableField(value = "oil_flow")
    private BigDecimal oilFlow;

    /**
     * 金属平衡#入口重量
     */
    @TableField(value = "actioning_weight")
    private BigDecimal actioningWeight;

    /**
     * 金属平衡#出口重量
     */
    @TableField(value = "producing_weight")
    private BigDecimal producingWeight;

    /**
     * 金属平衡#废料重量
     */
    @TableField(value = "waste_weight")
    private BigDecimal wasteWeight;

    /**
     * 质量异常情况
     */
    @TableField(value = "quality")
    private String quality;

    /**
     * 班组
     */
    @TableField(value = "work_group")
    private String workGroup;

    /**
     * 冷轧生产开始时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 冷轧生产结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 气源压力
     */
    @TableField(value = "air_source_press")
    private BigDecimal airSourcePress;

    /**
     * 坯料重量（t）
     */
    @TableField(value = "blank_weight")
    private BigDecimal blankWeight;

    /**
     * 订货单位
     */
    @TableField(value = "customer")
    private String customer;

    /**
     * 生产顺序
     */
    @TableField(value = "produce_order")
    private String produceOrder;

    /**
     * 压缩空气温度
     */
    @TableField(value = "air_temperature")
    private BigDecimal airTemperature;

    /**
     * 轧辊辊号
     */
    @TableField(value = "roll_num")
    private String rollNum;

    /**
     * 主操手#第二道次
     */
    @TableField(value = "main_operator2")
    private String mainOperator2;

    /**
     * 班次#第二道次
     */
    @TableField(value = "work_shift2")
    private String workShift2;

    /**
     * 生产顺序#第二道次
     */
    @TableField(value = "produce_order2")
    private String produceOrder2;

    /**
     * 入口厚度（mm）#第二道次
     */
    @TableField(value = "thick_in2")
    private BigDecimal thickIn2;

    /**
     * 出口厚度（mm）#第二道次
     */
    @TableField(value = "thick_out2")
    private BigDecimal thickOut2;

    /**
     * 宽度（mm）#第二道次
     */
    @TableField(value = "width2")
    private BigDecimal width2;

    /**
     * 开卷张力（kg/mm²）#第二道次
     */
    @TableField(value = "decoil_tensile_stress2")
    private BigDecimal decoilTensileStress2;

    /**
     * 卷取张力（kg/mm²）#第二道次
     */
    @TableField(value = "reeling_tensile_stress2")
    private BigDecimal reelingTensileStress2;

    /**
     * 轧制速度（m/min）#第二道次
     */
    @TableField(value = "rolling_speed2")
    private BigDecimal rollingSpeed2;

    /**
     * 轧制油温度（°C）#第二道次
     */
    @TableField(value = "oil_temperature2")
    private BigDecimal oilTemperature2;

    /**
     * 轧制油流量#第二道次
     */
    @TableField(value = "oil_flow2")
    private BigDecimal oilFlow2;

    /**
     * 压缩空气温度（°C）#第二道次
     */
    @TableField(value = "air_temperature2")
    private BigDecimal airTemperature2;

    /**
     * 气源压力#第二道次
     */
    @TableField(value = "air_source_press2")
    private BigDecimal airSourcePress2;

    /**
     * AFC曲线#第二道次
     */
    @TableField(value = "curve2")
    private BigDecimal curve2;

    /**
     * 轧制力（kg/mm²）#第二道次
     */
    @TableField(value = "rolling_force2")
    private BigDecimal rollingForce2;

    /**
     * 入口重量(kg)#第二道次
     */
    @TableField(value = "actioning_weight2")
    private BigDecimal actioningWeight2;

    /**
     * 出口重量(kg)#第二道次
     */
    @TableField(value = "producing_weight2")
    private BigDecimal producingWeight2;

    /**
     * 轧辊辊号#第二道次
     */
    @TableField(value = "roll_num2")
    private String rollNum2;

    /**
     * 主操手#第三道次
     */
    @TableField(value = "main_operator3")
    private String mainOperator3;

    /**
     * 班次#第三道次
     */
    @TableField(value = "work_shift3")
    private String workShift3;

    /**
     * 生产顺序#第三道次
     */
    @TableField(value = "produce_order3")
    private String produceOrder3;

    /**
     * 入口厚度（mm）#第三道次
     */
    @TableField(value = "thick_in3")
    private BigDecimal thickIn3;

    /**
     * 出口厚度（mm）#第三道次
     */
    @TableField(value = "thick_out3")
    private BigDecimal thickOut3;

    /**
     * 宽度（mm）#第三道次
     */
    @TableField(value = "width3")
    private BigDecimal width3;

    /**
     * 开卷张力（kg/mm²）#第三道次
     */
    @TableField(value = "decoil_tensile_stress3")
    private BigDecimal decoilTensileStress3;

    /**
     * 卷取张力（kg/mm²）#第三道次
     */
    @TableField(value = "reeling_tensile_stress3")
    private BigDecimal reelingTensileStress3;

    /**
     * 轧制速度（m/min）#第三道次
     */
    @TableField(value = "rolling_speed3")
    private BigDecimal rollingSpeed3;

    /**
     * 轧制油温度（°C）#第三道次
     */
    @TableField(value = "oil_temperature3")
    private BigDecimal oilTemperature3;

    /**
     * 轧制油流量#第三道次
     */
    @TableField(value = "oil_flow3")
    private BigDecimal oilFlow3;

    /**
     * 压缩空气温度（°C）#第三道次
     */
    @TableField(value = "air_temperature3")
    private BigDecimal airTemperature3;

    /**
     * 气源压力#第三道次
     */
    @TableField(value = "air_source_press3")
    private BigDecimal airSourcePress3;

    /**
     * AFC曲线#第三道次
     */
    @TableField(value = "curve3")
    private BigDecimal curve3;

    /**
     * 轧制力（kg/mm²）#第三道次
     */
    @TableField(value = "rolling_force3")
    private BigDecimal rollingForce3;

    /**
     * 入口重量(kg)#第三道次
     */
    @TableField(value = "actioning_weight3")
    private BigDecimal actioningWeight3;

    /**
     * 出口重量(kg)#第三道次
     */
    @TableField(value = "producing_weight3")
    private BigDecimal producingWeight3;

    /**
     * 轧辊辊号#第三道次
     */
    @TableField(value = "roll_num3")
    private String rollNum3;

    /**
     * 主操手#第四道次
     */
    @TableField(value = "main_operator4")
    private String mainOperator4;

    /**
     * 班次#第四道次
     */
    @TableField(value = "work_shift4")
    private String workShift4;

    /**
     * 生产顺序#第四道次
     */
    @TableField(value = "produce_order4")
    private String produceOrder4;

    /**
     * 入口厚度（mm）#第四道次
     */
    @TableField(value = "thick_in4")
    private BigDecimal thickIn4;

    /**
     * 出口厚度（mm）#第四道次
     */
    @TableField(value = "thick_out4")
    private BigDecimal thickOut4;

    /**
     * 宽度（mm）#第四道次
     */
    @TableField(value = "width4")
    private BigDecimal width4;

    /**
     * 开卷张力（kg/mm²）#第四道次
     */
    @TableField(value = "decoil_tensile_stress4")
    private BigDecimal decoilTensileStress4;

    /**
     * 卷取张力（kg/mm²）#第四道次
     */
    @TableField(value = "reeling_tensile_stress4")
    private BigDecimal reelingTensileStress4;

    /**
     * 轧制速度（m/min）#第四道次
     */
    @TableField(value = "rolling_speed4")
    private BigDecimal rollingSpeed4;

    /**
     * 轧制油温度（°C）#第四道次
     */
    @TableField(value = "oil_temperature4")
    private BigDecimal oilTemperature4;

    /**
     * 轧制油流量#第四道次
     */
    @TableField(value = "oil_flow4")
    private BigDecimal oilFlow4;

    /**
     * 压缩空气温度（°C）#第四道次
     */
    @TableField(value = "air_temperature4")
    private BigDecimal airTemperature4;

    /**
     * 气源压力#第四道次
     */
    @TableField(value = "air_source_press4")
    private BigDecimal airSourcePress4;

    /**
     * AFC曲线#第四道次
     */
    @TableField(value = "curve4")
    private BigDecimal curve4;

    /**
     * 轧制力（kg/mm²）#第四道次
     */
    @TableField(value = "rolling_force4")
    private BigDecimal rollingForce4;

    /**
     * 入口重量(kg)#第四道次
     */
    @TableField(value = "actioning_weight4")
    private BigDecimal actioningWeight4;

    /**
     * 出口重量(kg)#第四道次
     */
    @TableField(value = "producing_weight4")
    private BigDecimal producingWeight4;

    /**
     * 轧辊辊号#第四道次
     */
    @TableField(value = "roll_num4")
    private String rollNum4;

    /**
     * 主操手#第五道次
     */
    @TableField(value = "main_operator5")
    private String mainOperator5;

    /**
     * 班次#第五道次
     */
    @TableField(value = "work_shift5")
    private String workShift5;

    /**
     * 生产顺序#第五道次
     */
    @TableField(value = "produce_order5")
    private String produceOrder5;

    /**
     * 入口厚度（mm）#第五道次
     */
    @TableField(value = "thick_in5")
    private BigDecimal thickIn5;

    /**
     * 出口厚度（mm）#第五道次
     */
    @TableField(value = "thick_out5")
    private BigDecimal thickOut5;

    /**
     * 宽度（mm）#第五道次
     */
    @TableField(value = "width5")
    private BigDecimal width5;

    /**
     * 开卷张力（kg/mm²）#第五道次
     */
    @TableField(value = "decoil_tensile_stress5")
    private BigDecimal decoilTensileStress5;

    /**
     * 卷取张力（kg/mm²）#第五道次
     */
    @TableField(value = "reeling_tensile_stress5")
    private BigDecimal reelingTensileStress5;

    /**
     * 轧制速度（m/min）#第五道次
     */
    @TableField(value = "rolling_speed5")
    private BigDecimal rollingSpeed5;

    /**
     * 轧制油温度（°C）#第五道次
     */
    @TableField(value = "oil_temperature5")
    private BigDecimal oilTemperature5;

    /**
     * 轧制油流量#第五道次
     */
    @TableField(value = "oil_flow5")
    private BigDecimal oilFlow5;

    /**
     * 压缩空气温度（°C）#第五道次
     */
    @TableField(value = "air_temperature5")
    private BigDecimal airTemperature5;

    /**
     * 气源压力#第五道次
     */
    @TableField(value = "air_source_press5")
    private BigDecimal airSourcePress5;

    /**
     * AFC曲线#第五道次
     */
    @TableField(value = "curve5")
    private BigDecimal curve5;

    /**
     * 轧制力（kg/mm²）#第五道次
     */
    @TableField(value = "rolling_force5")
    private BigDecimal rollingForce5;

    /**
     * 入口重量(kg)#第五道次
     */
    @TableField(value = "actioning_weight5")
    private BigDecimal actioningWeight5;

    /**
     * 出口重量(kg)#第五道次
     */
    @TableField(value = "producing_weight5")
    private BigDecimal producingWeight5;

    /**
     * 轧辊辊号#第五道次
     */
    @TableField(value = "roll_num5")
    private String rollNum5;

    /**
     * 主操手#第六道次
     */
    @TableField(value = "main_operator6")
    private String mainOperator6;

    /**
     * 班次#第六道次
     */
    @TableField(value = "work_shift6")
    private String workShift6;

    /**
     * 生产顺序#第六道次
     */
    @TableField(value = "produce_order6")
    private String produceOrder6;

    /**
     * 入口厚度（mm）#第六道次
     */
    @TableField(value = "thick_in6")
    private BigDecimal thickIn6;

    /**
     * 出口厚度（mm）#第六道次
     */
    @TableField(value = "thick_out6")
    private BigDecimal thickOut6;

    /**
     * 宽度（mm）#第六道次
     */
    @TableField(value = "width6")
    private BigDecimal width6;

    /**
     * 开卷张力（kg/mm²）#第六道次
     */
    @TableField(value = "decoil_tensile_stress6")
    private BigDecimal decoilTensileStress6;

    /**
     * 卷取张力（kg/mm²）#第六道次
     */
    @TableField(value = "reeling_tensile_stress6")
    private BigDecimal reelingTensileStress6;

    /**
     * 轧制速度（m/min）#第六道次
     */
    @TableField(value = "rolling_speed6")
    private BigDecimal rollingSpeed6;

    /**
     * 轧制油温度（°C）#第六道次
     */
    @TableField(value = "oil_temperature6")
    private BigDecimal oilTemperature6;

    /**
     * 轧制油流量#第六道次
     */
    @TableField(value = "oil_flow6")
    private BigDecimal oilFlow6;

    /**
     * 压缩空气温度（°C）#第六道次
     */
    @TableField(value = "air_temperature6")
    private BigDecimal airTemperature6;

    /**
     * 气源压力#第六道次
     */
    @TableField(value = "air_source_press6")
    private BigDecimal airSourcePress6;

    /**
     * AFC曲线#第六道次
     */
    @TableField(value = "curve6")
    private BigDecimal curve6;

    /**
     * 轧制力（kg/mm²）#第六道次
     */
    @TableField(value = "rolling_force6")
    private BigDecimal rollingForce6;

    /**
     * 入口重量(kg)#第六道次
     */
    @TableField(value = "actioning_weight6")
    private BigDecimal actioningWeight6;

    /**
     * 出口重量(kg)#第六道次
     */
    @TableField(value = "producing_weight6")
    private BigDecimal producingWeight6;

    /**
     * 轧辊辊号#第六道次
     */
    @TableField(value = "roll_num6")
    private String rollNum6;

    /**
     * 生产道次总数
     */
    @TableField(value = "produce_num")
    private Integer produceNum;

    /**
     * 冷轧成品重量（t）
     */
    @TableField(value = "cold_finished_weight")
    private BigDecimal coldFinishedWeight;

    /**
     * 班组#第二道次  字典：work_group_cn
     */
    @TableField(value = "work_group2")
    private String workGroup2;

    /**
     * 班组#第三道次  字典：work_group_cn
     */
    @TableField(value = "work_group3")
    private String workGroup3;

    /**
     * 班组#第四道次  字典：work_group_cn
     */
    @TableField(value = "work_group4")
    private String workGroup4;

    /**
     * 班组#第五道次  字典：work_group_cn
     */
    @TableField(value = "work_group5")
    private String workGroup5;

    /**
     * 班组#第六道次  字典：work_group_cn
     */
    @TableField(value = "work_group6")
    private String workGroup6;

    /**
     * 冷轧道次工艺卡编号
     */
    @TableField(value = "cold_card_number")
    private String coldCardNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}