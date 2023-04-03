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
     * 铸轧辊编号#上辊
     */
    @TableField(value = "roll1_number")
    private String roll1Number;

    /**
     * 铸轧辊凸度#上辊
     */
    @TableField(value = "convexity1")
    private BigDecimal convexity1;

    /**
     * 铸轧辊编号#下辊
     */
    @TableField(value = "roll2_number")
    private String roll2Number;

    /**
     * 铸轧辊凸度#下辊
     */
    @TableField(value = "convexity2")
    private BigDecimal convexity2;

    /**
     * 铸轧辊辊径#上辊
     */
    @TableField(value = "roll1_diameter")
    private BigDecimal roll1Diameter;

    /**
     * 铸轧辊辊径#下辊
     */
    @TableField(value = "roll2_diameter")
    private BigDecimal roll2Diameter;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}