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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LmdpColdRecord other = (LmdpColdRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTs() == null ? other.getTs() == null : this.getTs().equals(other.getTs()))
            && (this.getCreatorId() == null ? other.getCreatorId() == null : this.getCreatorId().equals(other.getCreatorId()))
            && (this.getMainOperator() == null ? other.getMainOperator() == null : this.getMainOperator().equals(other.getMainOperator()))
            && (this.getAssistantOperator() == null ? other.getAssistantOperator() == null : this.getAssistantOperator().equals(other.getAssistantOperator()))
            && (this.getWorkShift() == null ? other.getWorkShift() == null : this.getWorkShift().equals(other.getWorkShift()))
            && (this.getRecordDate() == null ? other.getRecordDate() == null : this.getRecordDate().equals(other.getRecordDate()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getBatchNum() == null ? other.getBatchNum() == null : this.getBatchNum().equals(other.getBatchNum()))
            && (this.getRecordNum() == null ? other.getRecordNum() == null : this.getRecordNum().equals(other.getRecordNum()))
            && (this.getThickIn() == null ? other.getThickIn() == null : this.getThickIn().equals(other.getThickIn()))
            && (this.getThickOut() == null ? other.getThickOut() == null : this.getThickOut().equals(other.getThickOut()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getRollingSpeed() == null ? other.getRollingSpeed() == null : this.getRollingSpeed().equals(other.getRollingSpeed()))
            && (this.getRollingForce() == null ? other.getRollingForce() == null : this.getRollingForce().equals(other.getRollingForce()))
            && (this.getDecoilTensileStress() == null ? other.getDecoilTensileStress() == null : this.getDecoilTensileStress().equals(other.getDecoilTensileStress()))
            && (this.getReelingTensileStress() == null ? other.getReelingTensileStress() == null : this.getReelingTensileStress().equals(other.getReelingTensileStress()))
            && (this.getCurve() == null ? other.getCurve() == null : this.getCurve().equals(other.getCurve()))
            && (this.getOilTemperature() == null ? other.getOilTemperature() == null : this.getOilTemperature().equals(other.getOilTemperature()))
            && (this.getOilPressure() == null ? other.getOilPressure() == null : this.getOilPressure().equals(other.getOilPressure()))
            && (this.getOilFlow() == null ? other.getOilFlow() == null : this.getOilFlow().equals(other.getOilFlow()))
            && (this.getActioningWeight() == null ? other.getActioningWeight() == null : this.getActioningWeight().equals(other.getActioningWeight()))
            && (this.getProducingWeight() == null ? other.getProducingWeight() == null : this.getProducingWeight().equals(other.getProducingWeight()))
            && (this.getWasteWeight() == null ? other.getWasteWeight() == null : this.getWasteWeight().equals(other.getWasteWeight()))
            && (this.getQuality() == null ? other.getQuality() == null : this.getQuality().equals(other.getQuality()))
            && (this.getWorkGroup() == null ? other.getWorkGroup() == null : this.getWorkGroup().equals(other.getWorkGroup()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getAirSourcePress() == null ? other.getAirSourcePress() == null : this.getAirSourcePress().equals(other.getAirSourcePress()))
            && (this.getBlankWeight() == null ? other.getBlankWeight() == null : this.getBlankWeight().equals(other.getBlankWeight()))
            && (this.getCustomer() == null ? other.getCustomer() == null : this.getCustomer().equals(other.getCustomer()))
            && (this.getProduceOrder() == null ? other.getProduceOrder() == null : this.getProduceOrder().equals(other.getProduceOrder()))
            && (this.getAirTemperature() == null ? other.getAirTemperature() == null : this.getAirTemperature().equals(other.getAirTemperature()))
            && (this.getRollNum() == null ? other.getRollNum() == null : this.getRollNum().equals(other.getRollNum()))
            && (this.getMainOperator2() == null ? other.getMainOperator2() == null : this.getMainOperator2().equals(other.getMainOperator2()))
            && (this.getWorkShift2() == null ? other.getWorkShift2() == null : this.getWorkShift2().equals(other.getWorkShift2()))
            && (this.getProduceOrder2() == null ? other.getProduceOrder2() == null : this.getProduceOrder2().equals(other.getProduceOrder2()))
            && (this.getThickIn2() == null ? other.getThickIn2() == null : this.getThickIn2().equals(other.getThickIn2()))
            && (this.getThickOut2() == null ? other.getThickOut2() == null : this.getThickOut2().equals(other.getThickOut2()))
            && (this.getWidth2() == null ? other.getWidth2() == null : this.getWidth2().equals(other.getWidth2()))
            && (this.getDecoilTensileStress2() == null ? other.getDecoilTensileStress2() == null : this.getDecoilTensileStress2().equals(other.getDecoilTensileStress2()))
            && (this.getReelingTensileStress2() == null ? other.getReelingTensileStress2() == null : this.getReelingTensileStress2().equals(other.getReelingTensileStress2()))
            && (this.getRollingSpeed2() == null ? other.getRollingSpeed2() == null : this.getRollingSpeed2().equals(other.getRollingSpeed2()))
            && (this.getOilTemperature2() == null ? other.getOilTemperature2() == null : this.getOilTemperature2().equals(other.getOilTemperature2()))
            && (this.getOilFlow2() == null ? other.getOilFlow2() == null : this.getOilFlow2().equals(other.getOilFlow2()))
            && (this.getAirTemperature2() == null ? other.getAirTemperature2() == null : this.getAirTemperature2().equals(other.getAirTemperature2()))
            && (this.getAirSourcePress2() == null ? other.getAirSourcePress2() == null : this.getAirSourcePress2().equals(other.getAirSourcePress2()))
            && (this.getCurve2() == null ? other.getCurve2() == null : this.getCurve2().equals(other.getCurve2()))
            && (this.getRollingForce2() == null ? other.getRollingForce2() == null : this.getRollingForce2().equals(other.getRollingForce2()))
            && (this.getActioningWeight2() == null ? other.getActioningWeight2() == null : this.getActioningWeight2().equals(other.getActioningWeight2()))
            && (this.getProducingWeight2() == null ? other.getProducingWeight2() == null : this.getProducingWeight2().equals(other.getProducingWeight2()))
            && (this.getRollNum2() == null ? other.getRollNum2() == null : this.getRollNum2().equals(other.getRollNum2()))
            && (this.getMainOperator3() == null ? other.getMainOperator3() == null : this.getMainOperator3().equals(other.getMainOperator3()))
            && (this.getWorkShift3() == null ? other.getWorkShift3() == null : this.getWorkShift3().equals(other.getWorkShift3()))
            && (this.getProduceOrder3() == null ? other.getProduceOrder3() == null : this.getProduceOrder3().equals(other.getProduceOrder3()))
            && (this.getThickIn3() == null ? other.getThickIn3() == null : this.getThickIn3().equals(other.getThickIn3()))
            && (this.getThickOut3() == null ? other.getThickOut3() == null : this.getThickOut3().equals(other.getThickOut3()))
            && (this.getWidth3() == null ? other.getWidth3() == null : this.getWidth3().equals(other.getWidth3()))
            && (this.getDecoilTensileStress3() == null ? other.getDecoilTensileStress3() == null : this.getDecoilTensileStress3().equals(other.getDecoilTensileStress3()))
            && (this.getReelingTensileStress3() == null ? other.getReelingTensileStress3() == null : this.getReelingTensileStress3().equals(other.getReelingTensileStress3()))
            && (this.getRollingSpeed3() == null ? other.getRollingSpeed3() == null : this.getRollingSpeed3().equals(other.getRollingSpeed3()))
            && (this.getOilTemperature3() == null ? other.getOilTemperature3() == null : this.getOilTemperature3().equals(other.getOilTemperature3()))
            && (this.getOilFlow3() == null ? other.getOilFlow3() == null : this.getOilFlow3().equals(other.getOilFlow3()))
            && (this.getAirTemperature3() == null ? other.getAirTemperature3() == null : this.getAirTemperature3().equals(other.getAirTemperature3()))
            && (this.getAirSourcePress3() == null ? other.getAirSourcePress3() == null : this.getAirSourcePress3().equals(other.getAirSourcePress3()))
            && (this.getCurve3() == null ? other.getCurve3() == null : this.getCurve3().equals(other.getCurve3()))
            && (this.getRollingForce3() == null ? other.getRollingForce3() == null : this.getRollingForce3().equals(other.getRollingForce3()))
            && (this.getActioningWeight3() == null ? other.getActioningWeight3() == null : this.getActioningWeight3().equals(other.getActioningWeight3()))
            && (this.getProducingWeight3() == null ? other.getProducingWeight3() == null : this.getProducingWeight3().equals(other.getProducingWeight3()))
            && (this.getRollNum3() == null ? other.getRollNum3() == null : this.getRollNum3().equals(other.getRollNum3()))
            && (this.getMainOperator4() == null ? other.getMainOperator4() == null : this.getMainOperator4().equals(other.getMainOperator4()))
            && (this.getWorkShift4() == null ? other.getWorkShift4() == null : this.getWorkShift4().equals(other.getWorkShift4()))
            && (this.getProduceOrder4() == null ? other.getProduceOrder4() == null : this.getProduceOrder4().equals(other.getProduceOrder4()))
            && (this.getThickIn4() == null ? other.getThickIn4() == null : this.getThickIn4().equals(other.getThickIn4()))
            && (this.getThickOut4() == null ? other.getThickOut4() == null : this.getThickOut4().equals(other.getThickOut4()))
            && (this.getWidth4() == null ? other.getWidth4() == null : this.getWidth4().equals(other.getWidth4()))
            && (this.getDecoilTensileStress4() == null ? other.getDecoilTensileStress4() == null : this.getDecoilTensileStress4().equals(other.getDecoilTensileStress4()))
            && (this.getReelingTensileStress4() == null ? other.getReelingTensileStress4() == null : this.getReelingTensileStress4().equals(other.getReelingTensileStress4()))
            && (this.getRollingSpeed4() == null ? other.getRollingSpeed4() == null : this.getRollingSpeed4().equals(other.getRollingSpeed4()))
            && (this.getOilTemperature4() == null ? other.getOilTemperature4() == null : this.getOilTemperature4().equals(other.getOilTemperature4()))
            && (this.getOilFlow4() == null ? other.getOilFlow4() == null : this.getOilFlow4().equals(other.getOilFlow4()))
            && (this.getAirTemperature4() == null ? other.getAirTemperature4() == null : this.getAirTemperature4().equals(other.getAirTemperature4()))
            && (this.getAirSourcePress4() == null ? other.getAirSourcePress4() == null : this.getAirSourcePress4().equals(other.getAirSourcePress4()))
            && (this.getCurve4() == null ? other.getCurve4() == null : this.getCurve4().equals(other.getCurve4()))
            && (this.getRollingForce4() == null ? other.getRollingForce4() == null : this.getRollingForce4().equals(other.getRollingForce4()))
            && (this.getActioningWeight4() == null ? other.getActioningWeight4() == null : this.getActioningWeight4().equals(other.getActioningWeight4()))
            && (this.getProducingWeight4() == null ? other.getProducingWeight4() == null : this.getProducingWeight4().equals(other.getProducingWeight4()))
            && (this.getRollNum4() == null ? other.getRollNum4() == null : this.getRollNum4().equals(other.getRollNum4()))
            && (this.getMainOperator5() == null ? other.getMainOperator5() == null : this.getMainOperator5().equals(other.getMainOperator5()))
            && (this.getWorkShift5() == null ? other.getWorkShift5() == null : this.getWorkShift5().equals(other.getWorkShift5()))
            && (this.getProduceOrder5() == null ? other.getProduceOrder5() == null : this.getProduceOrder5().equals(other.getProduceOrder5()))
            && (this.getThickIn5() == null ? other.getThickIn5() == null : this.getThickIn5().equals(other.getThickIn5()))
            && (this.getThickOut5() == null ? other.getThickOut5() == null : this.getThickOut5().equals(other.getThickOut5()))
            && (this.getWidth5() == null ? other.getWidth5() == null : this.getWidth5().equals(other.getWidth5()))
            && (this.getDecoilTensileStress5() == null ? other.getDecoilTensileStress5() == null : this.getDecoilTensileStress5().equals(other.getDecoilTensileStress5()))
            && (this.getReelingTensileStress5() == null ? other.getReelingTensileStress5() == null : this.getReelingTensileStress5().equals(other.getReelingTensileStress5()))
            && (this.getRollingSpeed5() == null ? other.getRollingSpeed5() == null : this.getRollingSpeed5().equals(other.getRollingSpeed5()))
            && (this.getOilTemperature5() == null ? other.getOilTemperature5() == null : this.getOilTemperature5().equals(other.getOilTemperature5()))
            && (this.getOilFlow5() == null ? other.getOilFlow5() == null : this.getOilFlow5().equals(other.getOilFlow5()))
            && (this.getAirTemperature5() == null ? other.getAirTemperature5() == null : this.getAirTemperature5().equals(other.getAirTemperature5()))
            && (this.getAirSourcePress5() == null ? other.getAirSourcePress5() == null : this.getAirSourcePress5().equals(other.getAirSourcePress5()))
            && (this.getCurve5() == null ? other.getCurve5() == null : this.getCurve5().equals(other.getCurve5()))
            && (this.getRollingForce5() == null ? other.getRollingForce5() == null : this.getRollingForce5().equals(other.getRollingForce5()))
            && (this.getActioningWeight5() == null ? other.getActioningWeight5() == null : this.getActioningWeight5().equals(other.getActioningWeight5()))
            && (this.getProducingWeight5() == null ? other.getProducingWeight5() == null : this.getProducingWeight5().equals(other.getProducingWeight5()))
            && (this.getRollNum5() == null ? other.getRollNum5() == null : this.getRollNum5().equals(other.getRollNum5()))
            && (this.getMainOperator6() == null ? other.getMainOperator6() == null : this.getMainOperator6().equals(other.getMainOperator6()))
            && (this.getWorkShift6() == null ? other.getWorkShift6() == null : this.getWorkShift6().equals(other.getWorkShift6()))
            && (this.getProduceOrder6() == null ? other.getProduceOrder6() == null : this.getProduceOrder6().equals(other.getProduceOrder6()))
            && (this.getThickIn6() == null ? other.getThickIn6() == null : this.getThickIn6().equals(other.getThickIn6()))
            && (this.getThickOut6() == null ? other.getThickOut6() == null : this.getThickOut6().equals(other.getThickOut6()))
            && (this.getWidth6() == null ? other.getWidth6() == null : this.getWidth6().equals(other.getWidth6()))
            && (this.getDecoilTensileStress6() == null ? other.getDecoilTensileStress6() == null : this.getDecoilTensileStress6().equals(other.getDecoilTensileStress6()))
            && (this.getReelingTensileStress6() == null ? other.getReelingTensileStress6() == null : this.getReelingTensileStress6().equals(other.getReelingTensileStress6()))
            && (this.getRollingSpeed6() == null ? other.getRollingSpeed6() == null : this.getRollingSpeed6().equals(other.getRollingSpeed6()))
            && (this.getOilTemperature6() == null ? other.getOilTemperature6() == null : this.getOilTemperature6().equals(other.getOilTemperature6()))
            && (this.getOilFlow6() == null ? other.getOilFlow6() == null : this.getOilFlow6().equals(other.getOilFlow6()))
            && (this.getAirTemperature6() == null ? other.getAirTemperature6() == null : this.getAirTemperature6().equals(other.getAirTemperature6()))
            && (this.getAirSourcePress6() == null ? other.getAirSourcePress6() == null : this.getAirSourcePress6().equals(other.getAirSourcePress6()))
            && (this.getCurve6() == null ? other.getCurve6() == null : this.getCurve6().equals(other.getCurve6()))
            && (this.getRollingForce6() == null ? other.getRollingForce6() == null : this.getRollingForce6().equals(other.getRollingForce6()))
            && (this.getActioningWeight6() == null ? other.getActioningWeight6() == null : this.getActioningWeight6().equals(other.getActioningWeight6()))
            && (this.getProducingWeight6() == null ? other.getProducingWeight6() == null : this.getProducingWeight6().equals(other.getProducingWeight6()))
            && (this.getRollNum6() == null ? other.getRollNum6() == null : this.getRollNum6().equals(other.getRollNum6()))
            && (this.getProduceNum() == null ? other.getProduceNum() == null : this.getProduceNum().equals(other.getProduceNum()))
            && (this.getColdFinishedWeight() == null ? other.getColdFinishedWeight() == null : this.getColdFinishedWeight().equals(other.getColdFinishedWeight()))
            && (this.getWorkGroup2() == null ? other.getWorkGroup2() == null : this.getWorkGroup2().equals(other.getWorkGroup2()))
            && (this.getWorkGroup3() == null ? other.getWorkGroup3() == null : this.getWorkGroup3().equals(other.getWorkGroup3()))
            && (this.getWorkGroup4() == null ? other.getWorkGroup4() == null : this.getWorkGroup4().equals(other.getWorkGroup4()))
            && (this.getWorkGroup5() == null ? other.getWorkGroup5() == null : this.getWorkGroup5().equals(other.getWorkGroup5()))
            && (this.getWorkGroup6() == null ? other.getWorkGroup6() == null : this.getWorkGroup6().equals(other.getWorkGroup6()))
            && (this.getColdCardNumber() == null ? other.getColdCardNumber() == null : this.getColdCardNumber().equals(other.getColdCardNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTs() == null) ? 0 : getTs().hashCode());
        result = prime * result + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        result = prime * result + ((getMainOperator() == null) ? 0 : getMainOperator().hashCode());
        result = prime * result + ((getAssistantOperator() == null) ? 0 : getAssistantOperator().hashCode());
        result = prime * result + ((getWorkShift() == null) ? 0 : getWorkShift().hashCode());
        result = prime * result + ((getRecordDate() == null) ? 0 : getRecordDate().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getBatchNum() == null) ? 0 : getBatchNum().hashCode());
        result = prime * result + ((getRecordNum() == null) ? 0 : getRecordNum().hashCode());
        result = prime * result + ((getThickIn() == null) ? 0 : getThickIn().hashCode());
        result = prime * result + ((getThickOut() == null) ? 0 : getThickOut().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getRollingSpeed() == null) ? 0 : getRollingSpeed().hashCode());
        result = prime * result + ((getRollingForce() == null) ? 0 : getRollingForce().hashCode());
        result = prime * result + ((getDecoilTensileStress() == null) ? 0 : getDecoilTensileStress().hashCode());
        result = prime * result + ((getReelingTensileStress() == null) ? 0 : getReelingTensileStress().hashCode());
        result = prime * result + ((getCurve() == null) ? 0 : getCurve().hashCode());
        result = prime * result + ((getOilTemperature() == null) ? 0 : getOilTemperature().hashCode());
        result = prime * result + ((getOilPressure() == null) ? 0 : getOilPressure().hashCode());
        result = prime * result + ((getOilFlow() == null) ? 0 : getOilFlow().hashCode());
        result = prime * result + ((getActioningWeight() == null) ? 0 : getActioningWeight().hashCode());
        result = prime * result + ((getProducingWeight() == null) ? 0 : getProducingWeight().hashCode());
        result = prime * result + ((getWasteWeight() == null) ? 0 : getWasteWeight().hashCode());
        result = prime * result + ((getQuality() == null) ? 0 : getQuality().hashCode());
        result = prime * result + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getAirSourcePress() == null) ? 0 : getAirSourcePress().hashCode());
        result = prime * result + ((getBlankWeight() == null) ? 0 : getBlankWeight().hashCode());
        result = prime * result + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        result = prime * result + ((getProduceOrder() == null) ? 0 : getProduceOrder().hashCode());
        result = prime * result + ((getAirTemperature() == null) ? 0 : getAirTemperature().hashCode());
        result = prime * result + ((getRollNum() == null) ? 0 : getRollNum().hashCode());
        result = prime * result + ((getMainOperator2() == null) ? 0 : getMainOperator2().hashCode());
        result = prime * result + ((getWorkShift2() == null) ? 0 : getWorkShift2().hashCode());
        result = prime * result + ((getProduceOrder2() == null) ? 0 : getProduceOrder2().hashCode());
        result = prime * result + ((getThickIn2() == null) ? 0 : getThickIn2().hashCode());
        result = prime * result + ((getThickOut2() == null) ? 0 : getThickOut2().hashCode());
        result = prime * result + ((getWidth2() == null) ? 0 : getWidth2().hashCode());
        result = prime * result + ((getDecoilTensileStress2() == null) ? 0 : getDecoilTensileStress2().hashCode());
        result = prime * result + ((getReelingTensileStress2() == null) ? 0 : getReelingTensileStress2().hashCode());
        result = prime * result + ((getRollingSpeed2() == null) ? 0 : getRollingSpeed2().hashCode());
        result = prime * result + ((getOilTemperature2() == null) ? 0 : getOilTemperature2().hashCode());
        result = prime * result + ((getOilFlow2() == null) ? 0 : getOilFlow2().hashCode());
        result = prime * result + ((getAirTemperature2() == null) ? 0 : getAirTemperature2().hashCode());
        result = prime * result + ((getAirSourcePress2() == null) ? 0 : getAirSourcePress2().hashCode());
        result = prime * result + ((getCurve2() == null) ? 0 : getCurve2().hashCode());
        result = prime * result + ((getRollingForce2() == null) ? 0 : getRollingForce2().hashCode());
        result = prime * result + ((getActioningWeight2() == null) ? 0 : getActioningWeight2().hashCode());
        result = prime * result + ((getProducingWeight2() == null) ? 0 : getProducingWeight2().hashCode());
        result = prime * result + ((getRollNum2() == null) ? 0 : getRollNum2().hashCode());
        result = prime * result + ((getMainOperator3() == null) ? 0 : getMainOperator3().hashCode());
        result = prime * result + ((getWorkShift3() == null) ? 0 : getWorkShift3().hashCode());
        result = prime * result + ((getProduceOrder3() == null) ? 0 : getProduceOrder3().hashCode());
        result = prime * result + ((getThickIn3() == null) ? 0 : getThickIn3().hashCode());
        result = prime * result + ((getThickOut3() == null) ? 0 : getThickOut3().hashCode());
        result = prime * result + ((getWidth3() == null) ? 0 : getWidth3().hashCode());
        result = prime * result + ((getDecoilTensileStress3() == null) ? 0 : getDecoilTensileStress3().hashCode());
        result = prime * result + ((getReelingTensileStress3() == null) ? 0 : getReelingTensileStress3().hashCode());
        result = prime * result + ((getRollingSpeed3() == null) ? 0 : getRollingSpeed3().hashCode());
        result = prime * result + ((getOilTemperature3() == null) ? 0 : getOilTemperature3().hashCode());
        result = prime * result + ((getOilFlow3() == null) ? 0 : getOilFlow3().hashCode());
        result = prime * result + ((getAirTemperature3() == null) ? 0 : getAirTemperature3().hashCode());
        result = prime * result + ((getAirSourcePress3() == null) ? 0 : getAirSourcePress3().hashCode());
        result = prime * result + ((getCurve3() == null) ? 0 : getCurve3().hashCode());
        result = prime * result + ((getRollingForce3() == null) ? 0 : getRollingForce3().hashCode());
        result = prime * result + ((getActioningWeight3() == null) ? 0 : getActioningWeight3().hashCode());
        result = prime * result + ((getProducingWeight3() == null) ? 0 : getProducingWeight3().hashCode());
        result = prime * result + ((getRollNum3() == null) ? 0 : getRollNum3().hashCode());
        result = prime * result + ((getMainOperator4() == null) ? 0 : getMainOperator4().hashCode());
        result = prime * result + ((getWorkShift4() == null) ? 0 : getWorkShift4().hashCode());
        result = prime * result + ((getProduceOrder4() == null) ? 0 : getProduceOrder4().hashCode());
        result = prime * result + ((getThickIn4() == null) ? 0 : getThickIn4().hashCode());
        result = prime * result + ((getThickOut4() == null) ? 0 : getThickOut4().hashCode());
        result = prime * result + ((getWidth4() == null) ? 0 : getWidth4().hashCode());
        result = prime * result + ((getDecoilTensileStress4() == null) ? 0 : getDecoilTensileStress4().hashCode());
        result = prime * result + ((getReelingTensileStress4() == null) ? 0 : getReelingTensileStress4().hashCode());
        result = prime * result + ((getRollingSpeed4() == null) ? 0 : getRollingSpeed4().hashCode());
        result = prime * result + ((getOilTemperature4() == null) ? 0 : getOilTemperature4().hashCode());
        result = prime * result + ((getOilFlow4() == null) ? 0 : getOilFlow4().hashCode());
        result = prime * result + ((getAirTemperature4() == null) ? 0 : getAirTemperature4().hashCode());
        result = prime * result + ((getAirSourcePress4() == null) ? 0 : getAirSourcePress4().hashCode());
        result = prime * result + ((getCurve4() == null) ? 0 : getCurve4().hashCode());
        result = prime * result + ((getRollingForce4() == null) ? 0 : getRollingForce4().hashCode());
        result = prime * result + ((getActioningWeight4() == null) ? 0 : getActioningWeight4().hashCode());
        result = prime * result + ((getProducingWeight4() == null) ? 0 : getProducingWeight4().hashCode());
        result = prime * result + ((getRollNum4() == null) ? 0 : getRollNum4().hashCode());
        result = prime * result + ((getMainOperator5() == null) ? 0 : getMainOperator5().hashCode());
        result = prime * result + ((getWorkShift5() == null) ? 0 : getWorkShift5().hashCode());
        result = prime * result + ((getProduceOrder5() == null) ? 0 : getProduceOrder5().hashCode());
        result = prime * result + ((getThickIn5() == null) ? 0 : getThickIn5().hashCode());
        result = prime * result + ((getThickOut5() == null) ? 0 : getThickOut5().hashCode());
        result = prime * result + ((getWidth5() == null) ? 0 : getWidth5().hashCode());
        result = prime * result + ((getDecoilTensileStress5() == null) ? 0 : getDecoilTensileStress5().hashCode());
        result = prime * result + ((getReelingTensileStress5() == null) ? 0 : getReelingTensileStress5().hashCode());
        result = prime * result + ((getRollingSpeed5() == null) ? 0 : getRollingSpeed5().hashCode());
        result = prime * result + ((getOilTemperature5() == null) ? 0 : getOilTemperature5().hashCode());
        result = prime * result + ((getOilFlow5() == null) ? 0 : getOilFlow5().hashCode());
        result = prime * result + ((getAirTemperature5() == null) ? 0 : getAirTemperature5().hashCode());
        result = prime * result + ((getAirSourcePress5() == null) ? 0 : getAirSourcePress5().hashCode());
        result = prime * result + ((getCurve5() == null) ? 0 : getCurve5().hashCode());
        result = prime * result + ((getRollingForce5() == null) ? 0 : getRollingForce5().hashCode());
        result = prime * result + ((getActioningWeight5() == null) ? 0 : getActioningWeight5().hashCode());
        result = prime * result + ((getProducingWeight5() == null) ? 0 : getProducingWeight5().hashCode());
        result = prime * result + ((getRollNum5() == null) ? 0 : getRollNum5().hashCode());
        result = prime * result + ((getMainOperator6() == null) ? 0 : getMainOperator6().hashCode());
        result = prime * result + ((getWorkShift6() == null) ? 0 : getWorkShift6().hashCode());
        result = prime * result + ((getProduceOrder6() == null) ? 0 : getProduceOrder6().hashCode());
        result = prime * result + ((getThickIn6() == null) ? 0 : getThickIn6().hashCode());
        result = prime * result + ((getThickOut6() == null) ? 0 : getThickOut6().hashCode());
        result = prime * result + ((getWidth6() == null) ? 0 : getWidth6().hashCode());
        result = prime * result + ((getDecoilTensileStress6() == null) ? 0 : getDecoilTensileStress6().hashCode());
        result = prime * result + ((getReelingTensileStress6() == null) ? 0 : getReelingTensileStress6().hashCode());
        result = prime * result + ((getRollingSpeed6() == null) ? 0 : getRollingSpeed6().hashCode());
        result = prime * result + ((getOilTemperature6() == null) ? 0 : getOilTemperature6().hashCode());
        result = prime * result + ((getOilFlow6() == null) ? 0 : getOilFlow6().hashCode());
        result = prime * result + ((getAirTemperature6() == null) ? 0 : getAirTemperature6().hashCode());
        result = prime * result + ((getAirSourcePress6() == null) ? 0 : getAirSourcePress6().hashCode());
        result = prime * result + ((getCurve6() == null) ? 0 : getCurve6().hashCode());
        result = prime * result + ((getRollingForce6() == null) ? 0 : getRollingForce6().hashCode());
        result = prime * result + ((getActioningWeight6() == null) ? 0 : getActioningWeight6().hashCode());
        result = prime * result + ((getProducingWeight6() == null) ? 0 : getProducingWeight6().hashCode());
        result = prime * result + ((getRollNum6() == null) ? 0 : getRollNum6().hashCode());
        result = prime * result + ((getProduceNum() == null) ? 0 : getProduceNum().hashCode());
        result = prime * result + ((getColdFinishedWeight() == null) ? 0 : getColdFinishedWeight().hashCode());
        result = prime * result + ((getWorkGroup2() == null) ? 0 : getWorkGroup2().hashCode());
        result = prime * result + ((getWorkGroup3() == null) ? 0 : getWorkGroup3().hashCode());
        result = prime * result + ((getWorkGroup4() == null) ? 0 : getWorkGroup4().hashCode());
        result = prime * result + ((getWorkGroup5() == null) ? 0 : getWorkGroup5().hashCode());
        result = prime * result + ((getWorkGroup6() == null) ? 0 : getWorkGroup6().hashCode());
        result = prime * result + ((getColdCardNumber() == null) ? 0 : getColdCardNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ts=").append(ts);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", mainOperator=").append(mainOperator);
        sb.append(", assistantOperator=").append(assistantOperator);
        sb.append(", workShift=").append(workShift);
        sb.append(", recordDate=").append(recordDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", brand=").append(brand);
        sb.append(", batchNum=").append(batchNum);
        sb.append(", recordNum=").append(recordNum);
        sb.append(", thickIn=").append(thickIn);
        sb.append(", thickOut=").append(thickOut);
        sb.append(", width=").append(width);
        sb.append(", rollingSpeed=").append(rollingSpeed);
        sb.append(", rollingForce=").append(rollingForce);
        sb.append(", decoilTensileStress=").append(decoilTensileStress);
        sb.append(", reelingTensileStress=").append(reelingTensileStress);
        sb.append(", curve=").append(curve);
        sb.append(", oilTemperature=").append(oilTemperature);
        sb.append(", oilPressure=").append(oilPressure);
        sb.append(", oilFlow=").append(oilFlow);
        sb.append(", actioningWeight=").append(actioningWeight);
        sb.append(", producingWeight=").append(producingWeight);
        sb.append(", wasteWeight=").append(wasteWeight);
        sb.append(", quality=").append(quality);
        sb.append(", workGroup=").append(workGroup);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", airSourcePress=").append(airSourcePress);
        sb.append(", blankWeight=").append(blankWeight);
        sb.append(", customer=").append(customer);
        sb.append(", produceOrder=").append(produceOrder);
        sb.append(", airTemperature=").append(airTemperature);
        sb.append(", rollNum=").append(rollNum);
        sb.append(", mainOperator2=").append(mainOperator2);
        sb.append(", workShift2=").append(workShift2);
        sb.append(", produceOrder2=").append(produceOrder2);
        sb.append(", thickIn2=").append(thickIn2);
        sb.append(", thickOut2=").append(thickOut2);
        sb.append(", width2=").append(width2);
        sb.append(", decoilTensileStress2=").append(decoilTensileStress2);
        sb.append(", reelingTensileStress2=").append(reelingTensileStress2);
        sb.append(", rollingSpeed2=").append(rollingSpeed2);
        sb.append(", oilTemperature2=").append(oilTemperature2);
        sb.append(", oilFlow2=").append(oilFlow2);
        sb.append(", airTemperature2=").append(airTemperature2);
        sb.append(", airSourcePress2=").append(airSourcePress2);
        sb.append(", curve2=").append(curve2);
        sb.append(", rollingForce2=").append(rollingForce2);
        sb.append(", actioningWeight2=").append(actioningWeight2);
        sb.append(", producingWeight2=").append(producingWeight2);
        sb.append(", rollNum2=").append(rollNum2);
        sb.append(", mainOperator3=").append(mainOperator3);
        sb.append(", workShift3=").append(workShift3);
        sb.append(", produceOrder3=").append(produceOrder3);
        sb.append(", thickIn3=").append(thickIn3);
        sb.append(", thickOut3=").append(thickOut3);
        sb.append(", width3=").append(width3);
        sb.append(", decoilTensileStress3=").append(decoilTensileStress3);
        sb.append(", reelingTensileStress3=").append(reelingTensileStress3);
        sb.append(", rollingSpeed3=").append(rollingSpeed3);
        sb.append(", oilTemperature3=").append(oilTemperature3);
        sb.append(", oilFlow3=").append(oilFlow3);
        sb.append(", airTemperature3=").append(airTemperature3);
        sb.append(", airSourcePress3=").append(airSourcePress3);
        sb.append(", curve3=").append(curve3);
        sb.append(", rollingForce3=").append(rollingForce3);
        sb.append(", actioningWeight3=").append(actioningWeight3);
        sb.append(", producingWeight3=").append(producingWeight3);
        sb.append(", rollNum3=").append(rollNum3);
        sb.append(", mainOperator4=").append(mainOperator4);
        sb.append(", workShift4=").append(workShift4);
        sb.append(", produceOrder4=").append(produceOrder4);
        sb.append(", thickIn4=").append(thickIn4);
        sb.append(", thickOut4=").append(thickOut4);
        sb.append(", width4=").append(width4);
        sb.append(", decoilTensileStress4=").append(decoilTensileStress4);
        sb.append(", reelingTensileStress4=").append(reelingTensileStress4);
        sb.append(", rollingSpeed4=").append(rollingSpeed4);
        sb.append(", oilTemperature4=").append(oilTemperature4);
        sb.append(", oilFlow4=").append(oilFlow4);
        sb.append(", airTemperature4=").append(airTemperature4);
        sb.append(", airSourcePress4=").append(airSourcePress4);
        sb.append(", curve4=").append(curve4);
        sb.append(", rollingForce4=").append(rollingForce4);
        sb.append(", actioningWeight4=").append(actioningWeight4);
        sb.append(", producingWeight4=").append(producingWeight4);
        sb.append(", rollNum4=").append(rollNum4);
        sb.append(", mainOperator5=").append(mainOperator5);
        sb.append(", workShift5=").append(workShift5);
        sb.append(", produceOrder5=").append(produceOrder5);
        sb.append(", thickIn5=").append(thickIn5);
        sb.append(", thickOut5=").append(thickOut5);
        sb.append(", width5=").append(width5);
        sb.append(", decoilTensileStress5=").append(decoilTensileStress5);
        sb.append(", reelingTensileStress5=").append(reelingTensileStress5);
        sb.append(", rollingSpeed5=").append(rollingSpeed5);
        sb.append(", oilTemperature5=").append(oilTemperature5);
        sb.append(", oilFlow5=").append(oilFlow5);
        sb.append(", airTemperature5=").append(airTemperature5);
        sb.append(", airSourcePress5=").append(airSourcePress5);
        sb.append(", curve5=").append(curve5);
        sb.append(", rollingForce5=").append(rollingForce5);
        sb.append(", actioningWeight5=").append(actioningWeight5);
        sb.append(", producingWeight5=").append(producingWeight5);
        sb.append(", rollNum5=").append(rollNum5);
        sb.append(", mainOperator6=").append(mainOperator6);
        sb.append(", workShift6=").append(workShift6);
        sb.append(", produceOrder6=").append(produceOrder6);
        sb.append(", thickIn6=").append(thickIn6);
        sb.append(", thickOut6=").append(thickOut6);
        sb.append(", width6=").append(width6);
        sb.append(", decoilTensileStress6=").append(decoilTensileStress6);
        sb.append(", reelingTensileStress6=").append(reelingTensileStress6);
        sb.append(", rollingSpeed6=").append(rollingSpeed6);
        sb.append(", oilTemperature6=").append(oilTemperature6);
        sb.append(", oilFlow6=").append(oilFlow6);
        sb.append(", airTemperature6=").append(airTemperature6);
        sb.append(", airSourcePress6=").append(airSourcePress6);
        sb.append(", curve6=").append(curve6);
        sb.append(", rollingForce6=").append(rollingForce6);
        sb.append(", actioningWeight6=").append(actioningWeight6);
        sb.append(", producingWeight6=").append(producingWeight6);
        sb.append(", rollNum6=").append(rollNum6);
        sb.append(", produceNum=").append(produceNum);
        sb.append(", coldFinishedWeight=").append(coldFinishedWeight);
        sb.append(", workGroup2=").append(workGroup2);
        sb.append(", workGroup3=").append(workGroup3);
        sb.append(", workGroup4=").append(workGroup4);
        sb.append(", workGroup5=").append(workGroup5);
        sb.append(", workGroup6=").append(workGroup6);
        sb.append(", coldCardNumber=").append(coldCardNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}