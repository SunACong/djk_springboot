package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cast_produce
 */
@TableName(value ="lmdp_cast_produce")
@Data
public class LmdpCastProduce implements Serializable {
    /**
     * id
     */
    @TableId
    private String id;

    /**
     * 数据来源
     */
    private String datasourceOrgcode;

    /**
     * 数据时间
     */
    private Date datatime;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 数据ID
     */
    private String dataId;

    /**
     * 入库时间
     */
    private Date enterTime;

    /**
     * 上传区域
     */
    private String uploadAreacode;

    /**
     * 关联计划ID
     */
    private String planId;

    /**
     * 关联熔次号
     */
    private String smeltTimes;

    /**
     * 铸轧卷号
     */
    private String reelNum;

    /**
     * 牌号
     */
    private String brand;

    /**
     * 客户信息
     */
    private String customer;

    /**
     * 板厚
     */
    private String thick;

    /**
     * 规格宽度
     */
    private String width;

    /**
     * 订单卷数-卷序
     */
    private String orderReelNum;

    /**
     * 立板编号-卷序
     */
    private String riserReelNum;

    /**
     * 除气箱参数设定值#炉气温度℃
     */
    private Double paramDegasserGasTemp;

    /**
     * 除气箱参数设定值#铝液温度℃
     */
    private Double paramDegasserAlTemp;

    /**
     * 除气箱参数设定值#氩气Mpa
     */
    private Double paramDegasserArgonPress;

    /**
     * 除气箱参数设定值#流量L/min
     */
    private Double paramDegasserFlow;

    /**
     * 除气箱参数设定值#转子转速r/min
     */
    private Double paramDegasserRpm;

    /**
     * 过滤箱显示值#炉气温度℃
     */
    private Double paramDegasserTemp;

    /**
     * 过滤箱入口测氢#测氢时间
     */
    private Date paramFilterHTime;

    /**
     * 过滤箱入口测氢#测氢温度℃
     */
    private Double paramFilterHTemp;

    /**
     * 过滤箱入口测氢#含量ml/100gAL
     */
    private Double paramFilterHdaf;

    /**
     * 前箱工艺温度℃#铝液温度
     */
    private Double paramFrontAlTemp;

    /**
     * 前箱工艺温度℃#环境温度#1次
     */
    private Double paramFrontEnvTemp1;

    /**
     * 前箱工艺温度℃#环境温度#2次
     */
    private Double paramFrontEnvTemp2;

    /**
     * 循环冷却系统#水温℃#设定温度
     */
    private Double paramWaterSetTemp;

    /**
     * 循环冷却系统#水温℃#入口温度38
     */
    private Double paramWaterInTemp;

    /**
     * 循环冷却系统#出口水温℃#上辊
     */
    private Double paramWaterOutTr;

    /**
     * 循环冷却系统#出口水温℃#下辊
     */
    private Double paramWaterOutLr;

    /**
     * 循环冷却系统#频率设定值Hz
     */
    private Double paramWaterSetFreq;

    /**
     * 循环冷却系统#水流量#上辊L/min
     */
    private Double paramWaterFlowTr;

    /**
     * 循环冷却系统#水流量#下辊L/min
     */
    private Double paramWaterFlowLr;

    /**
     * 循环冷却系统#水压Mpa#入口
     */
    private Double paramWaterPressIn;

    /**
     * 循环冷却系统#水压Mpa#出口#上辊
     */
    private Double paramWaterPressOutTr;

    /**
     * 循环冷却系统#水压Mpa#出口#下辊
     */
    private Double paramWaterPressOutLr;

    /**
     * 铸轧卷工艺#辊缝mm
     */
    private Double paramCastGap;

    /**
     * 铸轧卷工艺#开口mm
     */
    private Double paramCastOpen;

    /**
     * 铸轧卷工艺#铸轧区mm
     */
    private Double paramCastArea;

    /**
     * 铸轧卷工艺#速度mm/min#主机
     */
    private Double paramCastSpeedHost;

    /**
     * 铸轧卷工艺#速度mm/min#带材
     */
    private Double paramCastSpeedStuff;

    /**
     * 铸轧卷工艺#主机电流A#上辊
     */
    private Double paramCastCurTr;

    /**
     * 铸轧卷工艺#主机电流A#下辊
     */
    private Double paramCastCurLr;

    /**
     * 铸轧卷工艺#预应力t#操WS
     */
    private Double paramCastPrestressWs;

    /**
     * 铸轧卷工艺#预应力t#传DS
     */
    private Double paramCastPrestressDs;

    /**
     * 铸轧卷工艺#卷曲机#张力KN
     */
    private Double paramCastCrimpingTension;

    /**
     * 铸轧卷工艺#卷曲机#电流A
     */
    private Double paramCastCur;

    /**
     * 铸轧卷工艺#在线#板厚mm
     */
    private Double paramCastThick;

    /**
     * 铸轧卷工艺#在线#板宽mm
     */
    private Double paramCastWidth;

    /**
     * 铸轧卷工艺#钛丝#品牌
     */
    private Double paramCastTiBrand;

    /**
     * 铸轧卷工艺#钛丝#速度mm/min
     */
    private Double paramCastTiSpeed;

    /**
     * 上卷信息#上卷班组ID
     */
    private String procUpperGroupId;

    /**
     * 上卷信息#上卷班组名称
     */
    private String procUpperGroupName;

    /**
     * 上卷信息#轧制工ID
     */
    private String procUpperCasterId;

    /**
     * 下卷信息#轧制工名称
     */
    private String procLowerCasterName;

    /**
     * 上卷信息#上卷时间
     */
    private Date procUpperTime;

    /**
     * 上卷信息#交班壁厚
     */
    private String procUpperShiftTthick;

    /**
     * 上卷信息#交班卷重
     */
    private String procUpperShiftTweight;

    /**
     * 大卷径未上下卷#大卷班组ID
     */
    private String procBigGroupId;

    /**
     * 大卷径未上下卷#大卷班组名称
     */
    private String procBigGroupName;

    /**
     * 大卷径未上下卷#轧制工ID
     */
    private String procBigCasterId;

    /**
     * 大卷径未上下卷#轧制工名称
     */
    private String procBigCasterName;

    /**
     * 大卷径未上下卷#交班壁厚(kg)
     */
    private Double procBigShiftThick;

    /**
     * 大卷径未上下卷#交班卷重(kg)
     */
    private Double procBigShiftWeight;

    /**
     * 大卷径未上下卷#当班卷重(kg)
     */
    private String procBigDutyWeight;

    /**
     * 下卷信息#下卷班组ID
     */
    private String procLowerGroupId;

    /**
     * 下卷信息#下卷班组名称
     */
    private String procLowerGroupName;

    /**
     * 下卷信息#轧制工ID
     */
    private String procLowerCasterId;

    /**
     * 下卷信息#库位号
     */
    private String procLowerLocationNum;

    /**
     * 下卷信息#当班卷重
     */
    private String procLowerDutyWeight;

    /**
     * 下卷信息#卸卷时间
     */
    private Date procLowerRemoveTime;

    /**
     * 下卷信息#卷径±2mm
     */
    private Double procLowerRollDiameter;

    /**
     * 下卷信息#铸轧卷净重(kg)
     */
    private Double procLowerRealWeight;

    /**
     * 下卷信息#理论卷重(kg)
     */
    private Double procLowerTheoryWeight;

    /**
     * 下卷信息#净重与理论卷重偏差(kg)
     */
    private Double procLowerWeightDev;

    /**
     * 憋前嘴辊间隙稳流器检查
     */
    private String procBeforeStabilizerCheck;

    /**
     * 最低速度mm/min
     */
    private Double procMinSpeed;

    /**
     * 憋后嘴辊间隙稳流器检查
     */
    private String procAfterStabilizerCheck;

    /**
     * 上机后目测稳流器状态
     */
    private String procStabilizerStatus;

    /**
     * 憋氧化膜相关调整稳流器等操作备注
     */
    private String procRemark;

    /**
     * 操作时间
     */
    private Date procOperationTime;

    /**
     * 操作责任人ID
     */
    private String procOperatorId;

    /**
     * 操作责任人名称
     */
    private String procOperatorName;

    /**
     * 缺陷描述及处理方法
     */
    private String processQcSolution;

    /**
     * 责任班组ID
     */
    private String processQcDutyGroupId;

    /**
     * 责任班组名称
     */
    private String processQcDutyGroupName;

    /**
     * 废料明细kg
     */
    private Double processQcScrapWeight;

    /**
     * 倒炉作业#时间
     */
    private Date qtfhTurndownTime;

    /**
     * 倒炉作业#熔次号
     */
    private String qtfhTurndownSmeltNum;

    /**
     * 更换控流钎#换前温度℃
     */
    private Double qtfhPrepTemp;

    /**
     * 更换控流钎#更换时间
     */
    private Date qtfhChangeTime;

    /**
     * 更换控流钎#低点温度℃
     */
    private Double qtfhLowTemp;

    /**
     * 生产过程控制汇总备注栏
     */
    private String casterRemark;

    /**
     * 每小时通过量
     */
    private Double casterCount;

    /**
     * 时长（分钟）
     */
    private Double casterDuration;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 创建人姓名
     */
    private String creatorName;

    /**
     * 修改人ID
     */
    private String reviserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date ts;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}