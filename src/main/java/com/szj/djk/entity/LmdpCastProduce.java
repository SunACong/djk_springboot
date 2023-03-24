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
 * 铸轧工序
 * @TableName lmdp_cast_produce
 */
@TableName(value ="lmdp_cast_produce")
@Data
public class LmdpCastProduce implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

    /**
     * 关联计划ID
     */
    @TableField(value = "plan_id")
    private String planId;

    /**
     * 关联熔次号
     */
    @TableField(value = "smelt_times")
    private String smeltTimes;

    /**
     * 铸轧卷号
     */
    @TableField(value = "reel_num")
    private String reelNum;

    /**
     * 牌号
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 客户信息
     */
    @TableField(value = "customer")
    private String customer;

    /**
     * 板厚
     */
    @TableField(value = "thick")
    private BigDecimal thick;

    /**
     * 规格宽度
     */
    @TableField(value = "width")
    private BigDecimal width;

    /**
     * 订单卷数-卷序
     */
    @TableField(value = "order_reel_num")
    private String orderReelNum;

    /**
     * 立板编号-卷序
     */
    @TableField(value = "riser_reel_num")
    private String riserReelNum;

    /**
     * 除气箱参数设定值#炉气温度℃
     */
    @TableField(value = "param_degasser_gas_temp")
    private BigDecimal paramDegasserGasTemp;

    /**
     * 除气箱参数设定值#铝液温度℃
     */
    @TableField(value = "param_degasser_al_temp")
    private BigDecimal paramDegasserAlTemp;

    /**
     * 除气箱参数设定值#氩气Mpa
     */
    @TableField(value = "param_degasser_argon_press")
    private BigDecimal paramDegasserArgonPress;

    /**
     * 除气箱参数设定值#流量L/min
     */
    @TableField(value = "param_degasser_flow")
    private BigDecimal paramDegasserFlow;

    /**
     * 除气箱参数设定值#转子转速r/min
     */
    @TableField(value = "param_degasser_rpm")
    private BigDecimal paramDegasserRpm;

    /**
     * 过滤箱显示值#炉气温度℃
     */
    @TableField(value = "param_degasser_")
    private BigDecimal paramDegasser;

    /**
     * 过滤箱显示值#铝液温度℃
     */
    @TableField(value = "param_filter_al_temp")
    private BigDecimal paramFilterAlTemp;

    /**
     * 过滤箱入口测氢#测氢时间
     */
    @TableField(value = "param_filter_h_time")
    private Date paramFilterHTime;

    /**
     * 过滤箱入口测氢#测氢温度℃
     */
    @TableField(value = "param_filter_h_temp")
    private BigDecimal paramFilterHTemp;

    /**
     * 过滤箱入口测氢#含量ml/100gAL
     */
    @TableField(value = "param_filter_hdaf")
    private BigDecimal paramFilterHdaf;

    /**
     * 前箱工艺温度℃#铝液温度
     */
    @TableField(value = "param_front_al_temp")
    private BigDecimal paramFrontAlTemp;

    /**
     * 前箱工艺温度℃#环境温度#1次
     */
    @TableField(value = "param_front_env_temp1")
    private BigDecimal paramFrontEnvTemp1;

    /**
     * 前箱工艺温度℃#环境温度#2次
     */
    @TableField(value = "param_front_env_temp2")
    private BigDecimal paramFrontEnvTemp2;

    /**
     * 循环冷却系统#水温℃#设定温度
     */
    @TableField(value = "param_water_set_temp")
    private BigDecimal paramWaterSetTemp;

    /**
     * 循环冷却系统#水温℃#入口温度38
     */
    @TableField(value = "param_water_in_temp")
    private BigDecimal paramWaterInTemp;

    /**
     * 循环冷却系统#出口水温℃#上辊
     */
    @TableField(value = "param_water_out_tr")
    private BigDecimal paramWaterOutTr;

    /**
     * 循环冷却系统#出口水温℃#下辊
     */
    @TableField(value = "param_water_out_lr")
    private BigDecimal paramWaterOutLr;

    /**
     * 循环冷却系统#频率设定值Hz
     */
    @TableField(value = "param_water_set_freq")
    private BigDecimal paramWaterSetFreq;

    /**
     * 循环冷却系统#水流量#上辊L/min
     */
    @TableField(value = "param_water_flow_tr")
    private BigDecimal paramWaterFlowTr;

    /**
     * 循环冷却系统#水流量#下辊L/min
     */
    @TableField(value = "param_water_flow_lr")
    private BigDecimal paramWaterFlowLr;

    /**
     * 循环冷却系统#水压Mpa#入口
     */
    @TableField(value = "param_water_press_in")
    private BigDecimal paramWaterPressIn;

    /**
     * 循环冷却系统#水压Mpa#出口#上辊
     */
    @TableField(value = "param_water_press_out_tr")
    private BigDecimal paramWaterPressOutTr;

    /**
     * 循环冷却系统#水压Mpa#出口#下辊
     */
    @TableField(value = "param_water_press_out_lr")
    private BigDecimal paramWaterPressOutLr;

    /**
     * 铸轧卷工艺#辊缝mm
     */
    @TableField(value = "param_cast_gap")
    private BigDecimal paramCastGap;

    /**
     * 铸轧卷工艺#开口mm
     */
    @TableField(value = "param_cast_open")
    private BigDecimal paramCastOpen;

    /**
     * 铸轧卷工艺#铸轧区mm
     */
    @TableField(value = "param_cast_area")
    private BigDecimal paramCastArea;

    /**
     * 铸轧卷工艺#速度mm/min#主机
     */
    @TableField(value = "param_cast_speed_host")
    private BigDecimal paramCastSpeedHost;

    /**
     * 铸轧卷工艺#速度mm/min#带材
     */
    @TableField(value = "param_cast_speed_stuff")
    private BigDecimal paramCastSpeedStuff;

    /**
     * 铸轧卷工艺#主机电流A#上辊
     */
    @TableField(value = "param_cast_cur_tr")
    private BigDecimal paramCastCurTr;

    /**
     * 铸轧卷工艺#主机电流A#下辊
     */
    @TableField(value = "param_cast_cur_lr")
    private BigDecimal paramCastCurLr;

    /**
     * 铸轧卷工艺#预应力t#操WS
     */
    @TableField(value = "param_cast_prestress_ws")
    private BigDecimal paramCastPrestressWs;

    /**
     * 铸轧卷工艺#预应力t#传DS
     */
    @TableField(value = "param_cast_prestress_ds")
    private BigDecimal paramCastPrestressDs;

    /**
     * 铸轧卷工艺#卷曲机#张力KN
     */
    @TableField(value = "param_cast_crimping_tension")
    private BigDecimal paramCastCrimpingTension;

    /**
     * 铸轧卷工艺#卷曲机#电流A
     */
    @TableField(value = "param_cast_cur")
    private BigDecimal paramCastCur;

    /**
     * 铸轧卷工艺#在线#板厚mm
     */
    @TableField(value = "param_cast_thick")
    private BigDecimal paramCastThick;

    /**
     * 铸轧卷工艺#在线#板宽mm
     */
    @TableField(value = "param_cast_width")
    private BigDecimal paramCastWidth;

    /**
     * 铸轧卷工艺#钛丝#品牌
     */
    @TableField(value = "param_cast_ti_brand")
    private String paramCastTiBrand;

    /**
     * 铸轧卷工艺#钛丝#速度mm/min
     */
    @TableField(value = "param_cast_ti_speed")
    private BigDecimal paramCastTiSpeed;

    /**
     * 上卷信息#上卷班组ID
     */
    @TableField(value = "proc_upper_group_id")
    private String procUpperGroupId;

    /**
     * 上卷信息#上卷班组名称
     */
    @TableField(value = "proc_upper_group_name")
    private String procUpperGroupName;

    /**
     * 上卷信息#轧制工ID
     */
    @TableField(value = "proc_upper_caster_id")
    private String procUpperCasterId;

    /**
     * 上卷信息#轧制工名称
     */
    @TableField(value = "proc_upper_caster_name")
    private String procUpperCasterName;

    /**
     * 上卷信息#上卷时间
     */
    @TableField(value = "proc_upper_time")
    private Date procUpperTime;

    /**
     * 上卷信息#交班壁厚
     */
    @TableField(value = "proc_upper_shift_tthick")
    private BigDecimal procUpperShiftTthick;

    /**
     * 上卷信息#交班卷重
     */
    @TableField(value = "proc_upper_shift_tweight")
    private BigDecimal procUpperShiftTweight;

    /**
     * 大卷径未上下卷#大卷班组ID
     */
    @TableField(value = "proc_big_group_id")
    private String procBigGroupId;

    /**
     * 大卷径未上下卷#大卷班组名称
     */
    @TableField(value = "proc_big_group_name")
    private String procBigGroupName;

    /**
     * 大卷径未上下卷#轧制工ID
     */
    @TableField(value = "proc_big_caster_id")
    private String procBigCasterId;

    /**
     * 大卷径未上下卷#轧制工名称
     */
    @TableField(value = "proc_big_caster_name")
    private String procBigCasterName;

    /**
     * 大卷径未上下卷#交班壁厚(kg)
     */
    @TableField(value = "proc_big_shift_thick")
    private BigDecimal procBigShiftThick;

    /**
     * 大卷径未上下卷#交班卷重(kg)
     */
    @TableField(value = "proc_big_shift_weight")
    private BigDecimal procBigShiftWeight;

    /**
     * 大卷径未上下卷#当班卷重(kg)
     */
    @TableField(value = "proc_big_duty_weight")
    private BigDecimal procBigDutyWeight;

    /**
     * 下卷信息#下卷班组ID
     */
    @TableField(value = "proc_lower_group_id")
    private String procLowerGroupId;

    /**
     * 下卷信息#下卷班组名称
     */
    @TableField(value = "proc_lower_group_name")
    private String procLowerGroupName;

    /**
     * 下卷信息#轧制工ID
     */
    @TableField(value = "proc_lower_caster_id")
    private String procLowerCasterId;

    /**
     * 下卷信息#轧制工名称
     */
    @TableField(value = "proc_lower_caster_name")
    private String procLowerCasterName;

    /**
     * 下卷信息#库位号
     */
    @TableField(value = "proc_lower_location_num")
    private String procLowerLocationNum;

    /**
     * 下卷信息#当班卷重
     */
    @TableField(value = "proc_lower_duty_weight")
    private BigDecimal procLowerDutyWeight;

    /**
     * 下卷信息#卸卷时间
     */
    @TableField(value = "proc_lower_remove_time")
    private Date procLowerRemoveTime;

    /**
     * 下卷信息#卷径±2mm
     */
    @TableField(value = "proc_lower_roll_diameter")
    private BigDecimal procLowerRollDiameter;

    /**
     * 下卷信息#铸轧卷净重(kg)
     */
    @TableField(value = "proc_lower_real_weight")
    private BigDecimal procLowerRealWeight;

    /**
     * 下卷信息#理论卷重(kg)
     */
    @TableField(value = "proc_lower_theory_weight")
    private BigDecimal procLowerTheoryWeight;

    /**
     * 下卷信息#净重与理论卷重偏差(kg)
     */
    @TableField(value = "proc_lower_weight_dev")
    private BigDecimal procLowerWeightDev;

    /**
     * 憋前嘴辊间隙稳流器检查
     */
    @TableField(value = "proc_before_stabilizer_check")
    private String procBeforeStabilizerCheck;

    /**
     * 最低速度mm/min
     */
    @TableField(value = "proc_min_speed")
    private BigDecimal procMinSpeed;

    /**
     * 憋后嘴辊间隙稳流器检查
     */
    @TableField(value = "proc_after_stabilizer_check")
    private String procAfterStabilizerCheck;

    /**
     * 上机后目测稳流器状态
     */
    @TableField(value = "proc_stabilizer_status")
    private String procStabilizerStatus;

    /**
     * 憋氧化膜相关调整稳流器等操作备注
     */
    @TableField(value = "proc_remark")
    private String procRemark;

    /**
     * 操作时间
     */
    @TableField(value = "proc_operation_time")
    private Date procOperationTime;

    /**
     * 操作责任人ID
     */
    @TableField(value = "proc_operator_id")
    private String procOperatorId;

    /**
     * 操作责任人名称
     */
    @TableField(value = "proc_operator_name")
    private String procOperatorName;

    /**
     * 缺陷描述及处理方法
     */
    @TableField(value = "process_qc_solution")
    private String processQcSolution;

    /**
     * 责任班组ID
     */
    @TableField(value = "process_qc_duty_group_id")
    private String processQcDutyGroupId;

    /**
     * 责任班组名称
     */
    @TableField(value = "process_qc_duty_group_name")
    private String processQcDutyGroupName;

    /**
     * 废料明细kg
     */
    @TableField(value = "process_qc_scrap_weight")
    private BigDecimal processQcScrapWeight;

    /**
     * 倒炉作业#时间
     */
    @TableField(value = "qtfh_turndown_time")
    private Date qtfhTurndownTime;

    /**
     * 倒炉作业#熔次号
     */
    @TableField(value = "qtfh_turndown_smelt_num")
    private String qtfhTurndownSmeltNum;

    /**
     * 更换控流钎#换前温度℃
     */
    @TableField(value = "qtfh_prep_temp")
    private BigDecimal qtfhPrepTemp;

    /**
     * 更换控流钎#更换时间
     */
    @TableField(value = "qtfh_change_time")
    private Date qtfhChangeTime;

    /**
     * 更换控流钎#低点温度℃
     */
    @TableField(value = "qtfh_low_temp")
    private BigDecimal qtfhLowTemp;

    /**
     * 生产过程控制汇总备注栏
     */
    @TableField(value = "caster_remark")
    private String casterRemark;

    /**
     * 每小时通过量
     */
    @TableField(value = "caster_count")
    private BigDecimal casterCount;

    /**
     * 时长（分钟）
     */
    @TableField(value = "caster_duration")
    private Integer casterDuration;

    /**
     * 创建人ID
     */
    @TableField(value = "creator_id")
    private String creatorId;

    /**
     * 创建人姓名
     */
    @TableField(value = "creator_name")
    private String creatorName;

    /**
     * 修改人ID
     */
    @TableField(value = "reviser_id")
    private String reviserId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 
     */
    @TableField(value = "ts")
    private Date ts;

    /**
     * 除气箱参数实际值#炉气温度℃
     */
    @TableField(value = "actual_degasser_gas_temp")
    private BigDecimal actualDegasserGasTemp;

    /**
     * 除气箱参数实际值#铝液温度℃
     */
    @TableField(value = "actual_degasser_al_temp")
    private BigDecimal actualDegasserAlTemp;

    /**
     * 除气箱参数实际值#氩气Mpa
     */
    @TableField(value = "actual_degasser_argon_press")
    private BigDecimal actualDegasserArgonPress;

    /**
     * 除气箱参数实际值#流量L/min
     */
    @TableField(value = "actual_degasser_flow")
    private BigDecimal actualDegasserFlow;

    /**
     * 除气箱参数实际值#转子转速r/min
     */
    @TableField(value = "actual_degasser_rpm")
    private BigDecimal actualDegasserRpm;

    /**
     * 过滤箱设定值#炉气温度℃
     */
    @TableField(value = "degasser_temp_set")
    private BigDecimal degasserTempSet;

    /**
     * 过滤箱设定值#铝液温度℃
     */
    @TableField(value = "filter_al_temp_set")
    private BigDecimal filterAlTempSet;

    /**
     * 生产线号
     */
    @TableField(value = "heat_num")
    private String heatNum;

    /**
     * 卷径
     */
    @TableField(value = "roll_diameter")
    private BigDecimal rollDiameter;

    /**
     * 上机时间
     */
    @TableField(value = "cast_start_time")
    private Date castStartTime;

    /**
     * 生产进度
     */
    @TableField(value = "produce_status")
    private String produceStatus;

    /**
     * 铸轧辊编号
     */
    @TableField(value = "roll_number")
    private String rollNumber;

    /**
     * 轧辊凸度
     */
    @TableField(value = "convexity")
    private BigDecimal convexity;

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
        LmdpCastProduce other = (LmdpCastProduce) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlanId() == null ? other.getPlanId() == null : this.getPlanId().equals(other.getPlanId()))
            && (this.getSmeltTimes() == null ? other.getSmeltTimes() == null : this.getSmeltTimes().equals(other.getSmeltTimes()))
            && (this.getReelNum() == null ? other.getReelNum() == null : this.getReelNum().equals(other.getReelNum()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getCustomer() == null ? other.getCustomer() == null : this.getCustomer().equals(other.getCustomer()))
            && (this.getThick() == null ? other.getThick() == null : this.getThick().equals(other.getThick()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getOrderReelNum() == null ? other.getOrderReelNum() == null : this.getOrderReelNum().equals(other.getOrderReelNum()))
            && (this.getRiserReelNum() == null ? other.getRiserReelNum() == null : this.getRiserReelNum().equals(other.getRiserReelNum()))
            && (this.getParamDegasserGasTemp() == null ? other.getParamDegasserGasTemp() == null : this.getParamDegasserGasTemp().equals(other.getParamDegasserGasTemp()))
            && (this.getParamDegasserAlTemp() == null ? other.getParamDegasserAlTemp() == null : this.getParamDegasserAlTemp().equals(other.getParamDegasserAlTemp()))
            && (this.getParamDegasserArgonPress() == null ? other.getParamDegasserArgonPress() == null : this.getParamDegasserArgonPress().equals(other.getParamDegasserArgonPress()))
            && (this.getParamDegasserFlow() == null ? other.getParamDegasserFlow() == null : this.getParamDegasserFlow().equals(other.getParamDegasserFlow()))
            && (this.getParamDegasserRpm() == null ? other.getParamDegasserRpm() == null : this.getParamDegasserRpm().equals(other.getParamDegasserRpm()))
            && (this.getParamDegasser() == null ? other.getParamDegasser() == null : this.getParamDegasser().equals(other.getParamDegasser()))
            && (this.getParamFilterAlTemp() == null ? other.getParamFilterAlTemp() == null : this.getParamFilterAlTemp().equals(other.getParamFilterAlTemp()))
            && (this.getParamFilterHTime() == null ? other.getParamFilterHTime() == null : this.getParamFilterHTime().equals(other.getParamFilterHTime()))
            && (this.getParamFilterHTemp() == null ? other.getParamFilterHTemp() == null : this.getParamFilterHTemp().equals(other.getParamFilterHTemp()))
            && (this.getParamFilterHdaf() == null ? other.getParamFilterHdaf() == null : this.getParamFilterHdaf().equals(other.getParamFilterHdaf()))
            && (this.getParamFrontAlTemp() == null ? other.getParamFrontAlTemp() == null : this.getParamFrontAlTemp().equals(other.getParamFrontAlTemp()))
            && (this.getParamFrontEnvTemp1() == null ? other.getParamFrontEnvTemp1() == null : this.getParamFrontEnvTemp1().equals(other.getParamFrontEnvTemp1()))
            && (this.getParamFrontEnvTemp2() == null ? other.getParamFrontEnvTemp2() == null : this.getParamFrontEnvTemp2().equals(other.getParamFrontEnvTemp2()))
            && (this.getParamWaterSetTemp() == null ? other.getParamWaterSetTemp() == null : this.getParamWaterSetTemp().equals(other.getParamWaterSetTemp()))
            && (this.getParamWaterInTemp() == null ? other.getParamWaterInTemp() == null : this.getParamWaterInTemp().equals(other.getParamWaterInTemp()))
            && (this.getParamWaterOutTr() == null ? other.getParamWaterOutTr() == null : this.getParamWaterOutTr().equals(other.getParamWaterOutTr()))
            && (this.getParamWaterOutLr() == null ? other.getParamWaterOutLr() == null : this.getParamWaterOutLr().equals(other.getParamWaterOutLr()))
            && (this.getParamWaterSetFreq() == null ? other.getParamWaterSetFreq() == null : this.getParamWaterSetFreq().equals(other.getParamWaterSetFreq()))
            && (this.getParamWaterFlowTr() == null ? other.getParamWaterFlowTr() == null : this.getParamWaterFlowTr().equals(other.getParamWaterFlowTr()))
            && (this.getParamWaterFlowLr() == null ? other.getParamWaterFlowLr() == null : this.getParamWaterFlowLr().equals(other.getParamWaterFlowLr()))
            && (this.getParamWaterPressIn() == null ? other.getParamWaterPressIn() == null : this.getParamWaterPressIn().equals(other.getParamWaterPressIn()))
            && (this.getParamWaterPressOutTr() == null ? other.getParamWaterPressOutTr() == null : this.getParamWaterPressOutTr().equals(other.getParamWaterPressOutTr()))
            && (this.getParamWaterPressOutLr() == null ? other.getParamWaterPressOutLr() == null : this.getParamWaterPressOutLr().equals(other.getParamWaterPressOutLr()))
            && (this.getParamCastGap() == null ? other.getParamCastGap() == null : this.getParamCastGap().equals(other.getParamCastGap()))
            && (this.getParamCastOpen() == null ? other.getParamCastOpen() == null : this.getParamCastOpen().equals(other.getParamCastOpen()))
            && (this.getParamCastArea() == null ? other.getParamCastArea() == null : this.getParamCastArea().equals(other.getParamCastArea()))
            && (this.getParamCastSpeedHost() == null ? other.getParamCastSpeedHost() == null : this.getParamCastSpeedHost().equals(other.getParamCastSpeedHost()))
            && (this.getParamCastSpeedStuff() == null ? other.getParamCastSpeedStuff() == null : this.getParamCastSpeedStuff().equals(other.getParamCastSpeedStuff()))
            && (this.getParamCastCurTr() == null ? other.getParamCastCurTr() == null : this.getParamCastCurTr().equals(other.getParamCastCurTr()))
            && (this.getParamCastCurLr() == null ? other.getParamCastCurLr() == null : this.getParamCastCurLr().equals(other.getParamCastCurLr()))
            && (this.getParamCastPrestressWs() == null ? other.getParamCastPrestressWs() == null : this.getParamCastPrestressWs().equals(other.getParamCastPrestressWs()))
            && (this.getParamCastPrestressDs() == null ? other.getParamCastPrestressDs() == null : this.getParamCastPrestressDs().equals(other.getParamCastPrestressDs()))
            && (this.getParamCastCrimpingTension() == null ? other.getParamCastCrimpingTension() == null : this.getParamCastCrimpingTension().equals(other.getParamCastCrimpingTension()))
            && (this.getParamCastCur() == null ? other.getParamCastCur() == null : this.getParamCastCur().equals(other.getParamCastCur()))
            && (this.getParamCastThick() == null ? other.getParamCastThick() == null : this.getParamCastThick().equals(other.getParamCastThick()))
            && (this.getParamCastWidth() == null ? other.getParamCastWidth() == null : this.getParamCastWidth().equals(other.getParamCastWidth()))
            && (this.getParamCastTiBrand() == null ? other.getParamCastTiBrand() == null : this.getParamCastTiBrand().equals(other.getParamCastTiBrand()))
            && (this.getParamCastTiSpeed() == null ? other.getParamCastTiSpeed() == null : this.getParamCastTiSpeed().equals(other.getParamCastTiSpeed()))
            && (this.getProcUpperGroupId() == null ? other.getProcUpperGroupId() == null : this.getProcUpperGroupId().equals(other.getProcUpperGroupId()))
            && (this.getProcUpperGroupName() == null ? other.getProcUpperGroupName() == null : this.getProcUpperGroupName().equals(other.getProcUpperGroupName()))
            && (this.getProcUpperCasterId() == null ? other.getProcUpperCasterId() == null : this.getProcUpperCasterId().equals(other.getProcUpperCasterId()))
            && (this.getProcUpperCasterName() == null ? other.getProcUpperCasterName() == null : this.getProcUpperCasterName().equals(other.getProcUpperCasterName()))
            && (this.getProcUpperTime() == null ? other.getProcUpperTime() == null : this.getProcUpperTime().equals(other.getProcUpperTime()))
            && (this.getProcUpperShiftTthick() == null ? other.getProcUpperShiftTthick() == null : this.getProcUpperShiftTthick().equals(other.getProcUpperShiftTthick()))
            && (this.getProcUpperShiftTweight() == null ? other.getProcUpperShiftTweight() == null : this.getProcUpperShiftTweight().equals(other.getProcUpperShiftTweight()))
            && (this.getProcBigGroupId() == null ? other.getProcBigGroupId() == null : this.getProcBigGroupId().equals(other.getProcBigGroupId()))
            && (this.getProcBigGroupName() == null ? other.getProcBigGroupName() == null : this.getProcBigGroupName().equals(other.getProcBigGroupName()))
            && (this.getProcBigCasterId() == null ? other.getProcBigCasterId() == null : this.getProcBigCasterId().equals(other.getProcBigCasterId()))
            && (this.getProcBigCasterName() == null ? other.getProcBigCasterName() == null : this.getProcBigCasterName().equals(other.getProcBigCasterName()))
            && (this.getProcBigShiftThick() == null ? other.getProcBigShiftThick() == null : this.getProcBigShiftThick().equals(other.getProcBigShiftThick()))
            && (this.getProcBigShiftWeight() == null ? other.getProcBigShiftWeight() == null : this.getProcBigShiftWeight().equals(other.getProcBigShiftWeight()))
            && (this.getProcBigDutyWeight() == null ? other.getProcBigDutyWeight() == null : this.getProcBigDutyWeight().equals(other.getProcBigDutyWeight()))
            && (this.getProcLowerGroupId() == null ? other.getProcLowerGroupId() == null : this.getProcLowerGroupId().equals(other.getProcLowerGroupId()))
            && (this.getProcLowerGroupName() == null ? other.getProcLowerGroupName() == null : this.getProcLowerGroupName().equals(other.getProcLowerGroupName()))
            && (this.getProcLowerCasterId() == null ? other.getProcLowerCasterId() == null : this.getProcLowerCasterId().equals(other.getProcLowerCasterId()))
            && (this.getProcLowerCasterName() == null ? other.getProcLowerCasterName() == null : this.getProcLowerCasterName().equals(other.getProcLowerCasterName()))
            && (this.getProcLowerLocationNum() == null ? other.getProcLowerLocationNum() == null : this.getProcLowerLocationNum().equals(other.getProcLowerLocationNum()))
            && (this.getProcLowerDutyWeight() == null ? other.getProcLowerDutyWeight() == null : this.getProcLowerDutyWeight().equals(other.getProcLowerDutyWeight()))
            && (this.getProcLowerRemoveTime() == null ? other.getProcLowerRemoveTime() == null : this.getProcLowerRemoveTime().equals(other.getProcLowerRemoveTime()))
            && (this.getProcLowerRollDiameter() == null ? other.getProcLowerRollDiameter() == null : this.getProcLowerRollDiameter().equals(other.getProcLowerRollDiameter()))
            && (this.getProcLowerRealWeight() == null ? other.getProcLowerRealWeight() == null : this.getProcLowerRealWeight().equals(other.getProcLowerRealWeight()))
            && (this.getProcLowerTheoryWeight() == null ? other.getProcLowerTheoryWeight() == null : this.getProcLowerTheoryWeight().equals(other.getProcLowerTheoryWeight()))
            && (this.getProcLowerWeightDev() == null ? other.getProcLowerWeightDev() == null : this.getProcLowerWeightDev().equals(other.getProcLowerWeightDev()))
            && (this.getProcBeforeStabilizerCheck() == null ? other.getProcBeforeStabilizerCheck() == null : this.getProcBeforeStabilizerCheck().equals(other.getProcBeforeStabilizerCheck()))
            && (this.getProcMinSpeed() == null ? other.getProcMinSpeed() == null : this.getProcMinSpeed().equals(other.getProcMinSpeed()))
            && (this.getProcAfterStabilizerCheck() == null ? other.getProcAfterStabilizerCheck() == null : this.getProcAfterStabilizerCheck().equals(other.getProcAfterStabilizerCheck()))
            && (this.getProcStabilizerStatus() == null ? other.getProcStabilizerStatus() == null : this.getProcStabilizerStatus().equals(other.getProcStabilizerStatus()))
            && (this.getProcRemark() == null ? other.getProcRemark() == null : this.getProcRemark().equals(other.getProcRemark()))
            && (this.getProcOperationTime() == null ? other.getProcOperationTime() == null : this.getProcOperationTime().equals(other.getProcOperationTime()))
            && (this.getProcOperatorId() == null ? other.getProcOperatorId() == null : this.getProcOperatorId().equals(other.getProcOperatorId()))
            && (this.getProcOperatorName() == null ? other.getProcOperatorName() == null : this.getProcOperatorName().equals(other.getProcOperatorName()))
            && (this.getProcessQcSolution() == null ? other.getProcessQcSolution() == null : this.getProcessQcSolution().equals(other.getProcessQcSolution()))
            && (this.getProcessQcDutyGroupId() == null ? other.getProcessQcDutyGroupId() == null : this.getProcessQcDutyGroupId().equals(other.getProcessQcDutyGroupId()))
            && (this.getProcessQcDutyGroupName() == null ? other.getProcessQcDutyGroupName() == null : this.getProcessQcDutyGroupName().equals(other.getProcessQcDutyGroupName()))
            && (this.getProcessQcScrapWeight() == null ? other.getProcessQcScrapWeight() == null : this.getProcessQcScrapWeight().equals(other.getProcessQcScrapWeight()))
            && (this.getQtfhTurndownTime() == null ? other.getQtfhTurndownTime() == null : this.getQtfhTurndownTime().equals(other.getQtfhTurndownTime()))
            && (this.getQtfhTurndownSmeltNum() == null ? other.getQtfhTurndownSmeltNum() == null : this.getQtfhTurndownSmeltNum().equals(other.getQtfhTurndownSmeltNum()))
            && (this.getQtfhPrepTemp() == null ? other.getQtfhPrepTemp() == null : this.getQtfhPrepTemp().equals(other.getQtfhPrepTemp()))
            && (this.getQtfhChangeTime() == null ? other.getQtfhChangeTime() == null : this.getQtfhChangeTime().equals(other.getQtfhChangeTime()))
            && (this.getQtfhLowTemp() == null ? other.getQtfhLowTemp() == null : this.getQtfhLowTemp().equals(other.getQtfhLowTemp()))
            && (this.getCasterRemark() == null ? other.getCasterRemark() == null : this.getCasterRemark().equals(other.getCasterRemark()))
            && (this.getCasterCount() == null ? other.getCasterCount() == null : this.getCasterCount().equals(other.getCasterCount()))
            && (this.getCasterDuration() == null ? other.getCasterDuration() == null : this.getCasterDuration().equals(other.getCasterDuration()))
            && (this.getCreatorId() == null ? other.getCreatorId() == null : this.getCreatorId().equals(other.getCreatorId()))
            && (this.getCreatorName() == null ? other.getCreatorName() == null : this.getCreatorName().equals(other.getCreatorName()))
            && (this.getReviserId() == null ? other.getReviserId() == null : this.getReviserId().equals(other.getReviserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getTs() == null ? other.getTs() == null : this.getTs().equals(other.getTs()))
            && (this.getActualDegasserGasTemp() == null ? other.getActualDegasserGasTemp() == null : this.getActualDegasserGasTemp().equals(other.getActualDegasserGasTemp()))
            && (this.getActualDegasserAlTemp() == null ? other.getActualDegasserAlTemp() == null : this.getActualDegasserAlTemp().equals(other.getActualDegasserAlTemp()))
            && (this.getActualDegasserArgonPress() == null ? other.getActualDegasserArgonPress() == null : this.getActualDegasserArgonPress().equals(other.getActualDegasserArgonPress()))
            && (this.getActualDegasserFlow() == null ? other.getActualDegasserFlow() == null : this.getActualDegasserFlow().equals(other.getActualDegasserFlow()))
            && (this.getActualDegasserRpm() == null ? other.getActualDegasserRpm() == null : this.getActualDegasserRpm().equals(other.getActualDegasserRpm()))
            && (this.getDegasserTempSet() == null ? other.getDegasserTempSet() == null : this.getDegasserTempSet().equals(other.getDegasserTempSet()))
            && (this.getFilterAlTempSet() == null ? other.getFilterAlTempSet() == null : this.getFilterAlTempSet().equals(other.getFilterAlTempSet()))
            && (this.getHeatNum() == null ? other.getHeatNum() == null : this.getHeatNum().equals(other.getHeatNum()))
            && (this.getRollDiameter() == null ? other.getRollDiameter() == null : this.getRollDiameter().equals(other.getRollDiameter()))
            && (this.getCastStartTime() == null ? other.getCastStartTime() == null : this.getCastStartTime().equals(other.getCastStartTime()))
            && (this.getProduceStatus() == null ? other.getProduceStatus() == null : this.getProduceStatus().equals(other.getProduceStatus()))
            && (this.getRollNumber() == null ? other.getRollNumber() == null : this.getRollNumber().equals(other.getRollNumber()))
            && (this.getConvexity() == null ? other.getConvexity() == null : this.getConvexity().equals(other.getConvexity()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        result = prime * result + ((getSmeltTimes() == null) ? 0 : getSmeltTimes().hashCode());
        result = prime * result + ((getReelNum() == null) ? 0 : getReelNum().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        result = prime * result + ((getThick() == null) ? 0 : getThick().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getOrderReelNum() == null) ? 0 : getOrderReelNum().hashCode());
        result = prime * result + ((getRiserReelNum() == null) ? 0 : getRiserReelNum().hashCode());
        result = prime * result + ((getParamDegasserGasTemp() == null) ? 0 : getParamDegasserGasTemp().hashCode());
        result = prime * result + ((getParamDegasserAlTemp() == null) ? 0 : getParamDegasserAlTemp().hashCode());
        result = prime * result + ((getParamDegasserArgonPress() == null) ? 0 : getParamDegasserArgonPress().hashCode());
        result = prime * result + ((getParamDegasserFlow() == null) ? 0 : getParamDegasserFlow().hashCode());
        result = prime * result + ((getParamDegasserRpm() == null) ? 0 : getParamDegasserRpm().hashCode());
        result = prime * result + ((getParamDegasser() == null) ? 0 : getParamDegasser().hashCode());
        result = prime * result + ((getParamFilterAlTemp() == null) ? 0 : getParamFilterAlTemp().hashCode());
        result = prime * result + ((getParamFilterHTime() == null) ? 0 : getParamFilterHTime().hashCode());
        result = prime * result + ((getParamFilterHTemp() == null) ? 0 : getParamFilterHTemp().hashCode());
        result = prime * result + ((getParamFilterHdaf() == null) ? 0 : getParamFilterHdaf().hashCode());
        result = prime * result + ((getParamFrontAlTemp() == null) ? 0 : getParamFrontAlTemp().hashCode());
        result = prime * result + ((getParamFrontEnvTemp1() == null) ? 0 : getParamFrontEnvTemp1().hashCode());
        result = prime * result + ((getParamFrontEnvTemp2() == null) ? 0 : getParamFrontEnvTemp2().hashCode());
        result = prime * result + ((getParamWaterSetTemp() == null) ? 0 : getParamWaterSetTemp().hashCode());
        result = prime * result + ((getParamWaterInTemp() == null) ? 0 : getParamWaterInTemp().hashCode());
        result = prime * result + ((getParamWaterOutTr() == null) ? 0 : getParamWaterOutTr().hashCode());
        result = prime * result + ((getParamWaterOutLr() == null) ? 0 : getParamWaterOutLr().hashCode());
        result = prime * result + ((getParamWaterSetFreq() == null) ? 0 : getParamWaterSetFreq().hashCode());
        result = prime * result + ((getParamWaterFlowTr() == null) ? 0 : getParamWaterFlowTr().hashCode());
        result = prime * result + ((getParamWaterFlowLr() == null) ? 0 : getParamWaterFlowLr().hashCode());
        result = prime * result + ((getParamWaterPressIn() == null) ? 0 : getParamWaterPressIn().hashCode());
        result = prime * result + ((getParamWaterPressOutTr() == null) ? 0 : getParamWaterPressOutTr().hashCode());
        result = prime * result + ((getParamWaterPressOutLr() == null) ? 0 : getParamWaterPressOutLr().hashCode());
        result = prime * result + ((getParamCastGap() == null) ? 0 : getParamCastGap().hashCode());
        result = prime * result + ((getParamCastOpen() == null) ? 0 : getParamCastOpen().hashCode());
        result = prime * result + ((getParamCastArea() == null) ? 0 : getParamCastArea().hashCode());
        result = prime * result + ((getParamCastSpeedHost() == null) ? 0 : getParamCastSpeedHost().hashCode());
        result = prime * result + ((getParamCastSpeedStuff() == null) ? 0 : getParamCastSpeedStuff().hashCode());
        result = prime * result + ((getParamCastCurTr() == null) ? 0 : getParamCastCurTr().hashCode());
        result = prime * result + ((getParamCastCurLr() == null) ? 0 : getParamCastCurLr().hashCode());
        result = prime * result + ((getParamCastPrestressWs() == null) ? 0 : getParamCastPrestressWs().hashCode());
        result = prime * result + ((getParamCastPrestressDs() == null) ? 0 : getParamCastPrestressDs().hashCode());
        result = prime * result + ((getParamCastCrimpingTension() == null) ? 0 : getParamCastCrimpingTension().hashCode());
        result = prime * result + ((getParamCastCur() == null) ? 0 : getParamCastCur().hashCode());
        result = prime * result + ((getParamCastThick() == null) ? 0 : getParamCastThick().hashCode());
        result = prime * result + ((getParamCastWidth() == null) ? 0 : getParamCastWidth().hashCode());
        result = prime * result + ((getParamCastTiBrand() == null) ? 0 : getParamCastTiBrand().hashCode());
        result = prime * result + ((getParamCastTiSpeed() == null) ? 0 : getParamCastTiSpeed().hashCode());
        result = prime * result + ((getProcUpperGroupId() == null) ? 0 : getProcUpperGroupId().hashCode());
        result = prime * result + ((getProcUpperGroupName() == null) ? 0 : getProcUpperGroupName().hashCode());
        result = prime * result + ((getProcUpperCasterId() == null) ? 0 : getProcUpperCasterId().hashCode());
        result = prime * result + ((getProcUpperCasterName() == null) ? 0 : getProcUpperCasterName().hashCode());
        result = prime * result + ((getProcUpperTime() == null) ? 0 : getProcUpperTime().hashCode());
        result = prime * result + ((getProcUpperShiftTthick() == null) ? 0 : getProcUpperShiftTthick().hashCode());
        result = prime * result + ((getProcUpperShiftTweight() == null) ? 0 : getProcUpperShiftTweight().hashCode());
        result = prime * result + ((getProcBigGroupId() == null) ? 0 : getProcBigGroupId().hashCode());
        result = prime * result + ((getProcBigGroupName() == null) ? 0 : getProcBigGroupName().hashCode());
        result = prime * result + ((getProcBigCasterId() == null) ? 0 : getProcBigCasterId().hashCode());
        result = prime * result + ((getProcBigCasterName() == null) ? 0 : getProcBigCasterName().hashCode());
        result = prime * result + ((getProcBigShiftThick() == null) ? 0 : getProcBigShiftThick().hashCode());
        result = prime * result + ((getProcBigShiftWeight() == null) ? 0 : getProcBigShiftWeight().hashCode());
        result = prime * result + ((getProcBigDutyWeight() == null) ? 0 : getProcBigDutyWeight().hashCode());
        result = prime * result + ((getProcLowerGroupId() == null) ? 0 : getProcLowerGroupId().hashCode());
        result = prime * result + ((getProcLowerGroupName() == null) ? 0 : getProcLowerGroupName().hashCode());
        result = prime * result + ((getProcLowerCasterId() == null) ? 0 : getProcLowerCasterId().hashCode());
        result = prime * result + ((getProcLowerCasterName() == null) ? 0 : getProcLowerCasterName().hashCode());
        result = prime * result + ((getProcLowerLocationNum() == null) ? 0 : getProcLowerLocationNum().hashCode());
        result = prime * result + ((getProcLowerDutyWeight() == null) ? 0 : getProcLowerDutyWeight().hashCode());
        result = prime * result + ((getProcLowerRemoveTime() == null) ? 0 : getProcLowerRemoveTime().hashCode());
        result = prime * result + ((getProcLowerRollDiameter() == null) ? 0 : getProcLowerRollDiameter().hashCode());
        result = prime * result + ((getProcLowerRealWeight() == null) ? 0 : getProcLowerRealWeight().hashCode());
        result = prime * result + ((getProcLowerTheoryWeight() == null) ? 0 : getProcLowerTheoryWeight().hashCode());
        result = prime * result + ((getProcLowerWeightDev() == null) ? 0 : getProcLowerWeightDev().hashCode());
        result = prime * result + ((getProcBeforeStabilizerCheck() == null) ? 0 : getProcBeforeStabilizerCheck().hashCode());
        result = prime * result + ((getProcMinSpeed() == null) ? 0 : getProcMinSpeed().hashCode());
        result = prime * result + ((getProcAfterStabilizerCheck() == null) ? 0 : getProcAfterStabilizerCheck().hashCode());
        result = prime * result + ((getProcStabilizerStatus() == null) ? 0 : getProcStabilizerStatus().hashCode());
        result = prime * result + ((getProcRemark() == null) ? 0 : getProcRemark().hashCode());
        result = prime * result + ((getProcOperationTime() == null) ? 0 : getProcOperationTime().hashCode());
        result = prime * result + ((getProcOperatorId() == null) ? 0 : getProcOperatorId().hashCode());
        result = prime * result + ((getProcOperatorName() == null) ? 0 : getProcOperatorName().hashCode());
        result = prime * result + ((getProcessQcSolution() == null) ? 0 : getProcessQcSolution().hashCode());
        result = prime * result + ((getProcessQcDutyGroupId() == null) ? 0 : getProcessQcDutyGroupId().hashCode());
        result = prime * result + ((getProcessQcDutyGroupName() == null) ? 0 : getProcessQcDutyGroupName().hashCode());
        result = prime * result + ((getProcessQcScrapWeight() == null) ? 0 : getProcessQcScrapWeight().hashCode());
        result = prime * result + ((getQtfhTurndownTime() == null) ? 0 : getQtfhTurndownTime().hashCode());
        result = prime * result + ((getQtfhTurndownSmeltNum() == null) ? 0 : getQtfhTurndownSmeltNum().hashCode());
        result = prime * result + ((getQtfhPrepTemp() == null) ? 0 : getQtfhPrepTemp().hashCode());
        result = prime * result + ((getQtfhChangeTime() == null) ? 0 : getQtfhChangeTime().hashCode());
        result = prime * result + ((getQtfhLowTemp() == null) ? 0 : getQtfhLowTemp().hashCode());
        result = prime * result + ((getCasterRemark() == null) ? 0 : getCasterRemark().hashCode());
        result = prime * result + ((getCasterCount() == null) ? 0 : getCasterCount().hashCode());
        result = prime * result + ((getCasterDuration() == null) ? 0 : getCasterDuration().hashCode());
        result = prime * result + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        result = prime * result + ((getCreatorName() == null) ? 0 : getCreatorName().hashCode());
        result = prime * result + ((getReviserId() == null) ? 0 : getReviserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getTs() == null) ? 0 : getTs().hashCode());
        result = prime * result + ((getActualDegasserGasTemp() == null) ? 0 : getActualDegasserGasTemp().hashCode());
        result = prime * result + ((getActualDegasserAlTemp() == null) ? 0 : getActualDegasserAlTemp().hashCode());
        result = prime * result + ((getActualDegasserArgonPress() == null) ? 0 : getActualDegasserArgonPress().hashCode());
        result = prime * result + ((getActualDegasserFlow() == null) ? 0 : getActualDegasserFlow().hashCode());
        result = prime * result + ((getActualDegasserRpm() == null) ? 0 : getActualDegasserRpm().hashCode());
        result = prime * result + ((getDegasserTempSet() == null) ? 0 : getDegasserTempSet().hashCode());
        result = prime * result + ((getFilterAlTempSet() == null) ? 0 : getFilterAlTempSet().hashCode());
        result = prime * result + ((getHeatNum() == null) ? 0 : getHeatNum().hashCode());
        result = prime * result + ((getRollDiameter() == null) ? 0 : getRollDiameter().hashCode());
        result = prime * result + ((getCastStartTime() == null) ? 0 : getCastStartTime().hashCode());
        result = prime * result + ((getProduceStatus() == null) ? 0 : getProduceStatus().hashCode());
        result = prime * result + ((getRollNumber() == null) ? 0 : getRollNumber().hashCode());
        result = prime * result + ((getConvexity() == null) ? 0 : getConvexity().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", planId=").append(planId);
        sb.append(", smeltTimes=").append(smeltTimes);
        sb.append(", reelNum=").append(reelNum);
        sb.append(", brand=").append(brand);
        sb.append(", customer=").append(customer);
        sb.append(", thick=").append(thick);
        sb.append(", width=").append(width);
        sb.append(", orderReelNum=").append(orderReelNum);
        sb.append(", riserReelNum=").append(riserReelNum);
        sb.append(", paramDegasserGasTemp=").append(paramDegasserGasTemp);
        sb.append(", paramDegasserAlTemp=").append(paramDegasserAlTemp);
        sb.append(", paramDegasserArgonPress=").append(paramDegasserArgonPress);
        sb.append(", paramDegasserFlow=").append(paramDegasserFlow);
        sb.append(", paramDegasserRpm=").append(paramDegasserRpm);
        sb.append(", paramDegasser=").append(paramDegasser);
        sb.append(", paramFilterAlTemp=").append(paramFilterAlTemp);
        sb.append(", paramFilterHTime=").append(paramFilterHTime);
        sb.append(", paramFilterHTemp=").append(paramFilterHTemp);
        sb.append(", paramFilterHdaf=").append(paramFilterHdaf);
        sb.append(", paramFrontAlTemp=").append(paramFrontAlTemp);
        sb.append(", paramFrontEnvTemp1=").append(paramFrontEnvTemp1);
        sb.append(", paramFrontEnvTemp2=").append(paramFrontEnvTemp2);
        sb.append(", paramWaterSetTemp=").append(paramWaterSetTemp);
        sb.append(", paramWaterInTemp=").append(paramWaterInTemp);
        sb.append(", paramWaterOutTr=").append(paramWaterOutTr);
        sb.append(", paramWaterOutLr=").append(paramWaterOutLr);
        sb.append(", paramWaterSetFreq=").append(paramWaterSetFreq);
        sb.append(", paramWaterFlowTr=").append(paramWaterFlowTr);
        sb.append(", paramWaterFlowLr=").append(paramWaterFlowLr);
        sb.append(", paramWaterPressIn=").append(paramWaterPressIn);
        sb.append(", paramWaterPressOutTr=").append(paramWaterPressOutTr);
        sb.append(", paramWaterPressOutLr=").append(paramWaterPressOutLr);
        sb.append(", paramCastGap=").append(paramCastGap);
        sb.append(", paramCastOpen=").append(paramCastOpen);
        sb.append(", paramCastArea=").append(paramCastArea);
        sb.append(", paramCastSpeedHost=").append(paramCastSpeedHost);
        sb.append(", paramCastSpeedStuff=").append(paramCastSpeedStuff);
        sb.append(", paramCastCurTr=").append(paramCastCurTr);
        sb.append(", paramCastCurLr=").append(paramCastCurLr);
        sb.append(", paramCastPrestressWs=").append(paramCastPrestressWs);
        sb.append(", paramCastPrestressDs=").append(paramCastPrestressDs);
        sb.append(", paramCastCrimpingTension=").append(paramCastCrimpingTension);
        sb.append(", paramCastCur=").append(paramCastCur);
        sb.append(", paramCastThick=").append(paramCastThick);
        sb.append(", paramCastWidth=").append(paramCastWidth);
        sb.append(", paramCastTiBrand=").append(paramCastTiBrand);
        sb.append(", paramCastTiSpeed=").append(paramCastTiSpeed);
        sb.append(", procUpperGroupId=").append(procUpperGroupId);
        sb.append(", procUpperGroupName=").append(procUpperGroupName);
        sb.append(", procUpperCasterId=").append(procUpperCasterId);
        sb.append(", procUpperCasterName=").append(procUpperCasterName);
        sb.append(", procUpperTime=").append(procUpperTime);
        sb.append(", procUpperShiftTthick=").append(procUpperShiftTthick);
        sb.append(", procUpperShiftTweight=").append(procUpperShiftTweight);
        sb.append(", procBigGroupId=").append(procBigGroupId);
        sb.append(", procBigGroupName=").append(procBigGroupName);
        sb.append(", procBigCasterId=").append(procBigCasterId);
        sb.append(", procBigCasterName=").append(procBigCasterName);
        sb.append(", procBigShiftThick=").append(procBigShiftThick);
        sb.append(", procBigShiftWeight=").append(procBigShiftWeight);
        sb.append(", procBigDutyWeight=").append(procBigDutyWeight);
        sb.append(", procLowerGroupId=").append(procLowerGroupId);
        sb.append(", procLowerGroupName=").append(procLowerGroupName);
        sb.append(", procLowerCasterId=").append(procLowerCasterId);
        sb.append(", procLowerCasterName=").append(procLowerCasterName);
        sb.append(", procLowerLocationNum=").append(procLowerLocationNum);
        sb.append(", procLowerDutyWeight=").append(procLowerDutyWeight);
        sb.append(", procLowerRemoveTime=").append(procLowerRemoveTime);
        sb.append(", procLowerRollDiameter=").append(procLowerRollDiameter);
        sb.append(", procLowerRealWeight=").append(procLowerRealWeight);
        sb.append(", procLowerTheoryWeight=").append(procLowerTheoryWeight);
        sb.append(", procLowerWeightDev=").append(procLowerWeightDev);
        sb.append(", procBeforeStabilizerCheck=").append(procBeforeStabilizerCheck);
        sb.append(", procMinSpeed=").append(procMinSpeed);
        sb.append(", procAfterStabilizerCheck=").append(procAfterStabilizerCheck);
        sb.append(", procStabilizerStatus=").append(procStabilizerStatus);
        sb.append(", procRemark=").append(procRemark);
        sb.append(", procOperationTime=").append(procOperationTime);
        sb.append(", procOperatorId=").append(procOperatorId);
        sb.append(", procOperatorName=").append(procOperatorName);
        sb.append(", processQcSolution=").append(processQcSolution);
        sb.append(", processQcDutyGroupId=").append(processQcDutyGroupId);
        sb.append(", processQcDutyGroupName=").append(processQcDutyGroupName);
        sb.append(", processQcScrapWeight=").append(processQcScrapWeight);
        sb.append(", qtfhTurndownTime=").append(qtfhTurndownTime);
        sb.append(", qtfhTurndownSmeltNum=").append(qtfhTurndownSmeltNum);
        sb.append(", qtfhPrepTemp=").append(qtfhPrepTemp);
        sb.append(", qtfhChangeTime=").append(qtfhChangeTime);
        sb.append(", qtfhLowTemp=").append(qtfhLowTemp);
        sb.append(", casterRemark=").append(casterRemark);
        sb.append(", casterCount=").append(casterCount);
        sb.append(", casterDuration=").append(casterDuration);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", creatorName=").append(creatorName);
        sb.append(", reviserId=").append(reviserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", ts=").append(ts);
        sb.append(", actualDegasserGasTemp=").append(actualDegasserGasTemp);
        sb.append(", actualDegasserAlTemp=").append(actualDegasserAlTemp);
        sb.append(", actualDegasserArgonPress=").append(actualDegasserArgonPress);
        sb.append(", actualDegasserFlow=").append(actualDegasserFlow);
        sb.append(", actualDegasserRpm=").append(actualDegasserRpm);
        sb.append(", degasserTempSet=").append(degasserTempSet);
        sb.append(", filterAlTempSet=").append(filterAlTempSet);
        sb.append(", heatNum=").append(heatNum);
        sb.append(", rollDiameter=").append(rollDiameter);
        sb.append(", castStartTime=").append(castStartTime);
        sb.append(", produceStatus=").append(produceStatus);
        sb.append(", rollNumber=").append(rollNumber);
        sb.append(", convexity=").append(convexity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}