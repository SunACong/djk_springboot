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
 * 熔炼工序
 * @TableName lmdp_cast_smelt_hold
 */
@TableName(value ="lmdp_cast_smelt_hold")
@Data
public class LmdpCastSmeltHold implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 关联计划ID
     */
    private String planId;

    /**
     * 熔次号
     */
    private String smeltTimes;

    /**
     * 生产线号
     */
    private String heatNum;

    /**
     * 牌号
     */
    private String brand;

    /**
     * 装炉时间
     */
    private Date feedTime;

    /**
     * 装炉班组ID
     */
    private String feedGroupId;

    /**
     * 装炉班组名称
     */
    private String feedGroupName;

    /**
     * 燃气表显示值
     */
    private Integer gasPrepValue;

    /**
     * 铝锭99.70％
     */
    private BigDecimal stuffAlPig;

    /**
     * 铸轧卷
     */
    private BigDecimal stuffCastReel;

    /**
     * 大块料
     */
    private BigDecimal stuffBig;

    /**
     * 冷轧厚料≥0.6mm
     */
    private BigDecimal stuffColdThick;

    /**
     * 冷轧薄料＜0.6mm
     */
    private BigDecimal stuffColdThin;

    /**
     * 炼渣铝块
     */
    private BigDecimal stuffAlSlag;

    /**
     * 样板板头料跑渣料
     */
    private BigDecimal stuffSampleSlag;

    /**
     * 切边料
     */
    private BigDecimal stuffTrim;

    /**
     * 其他废料#名称
     */
    private String stuffOtherName;

    /**
     * 其他废料#重量
     */
    private BigDecimal stuffOtherWeight;

    /**
     * 其他废料#名称
     */
    private String stuffOtherName1;

    /**
     * 其他废料#重量
     */
    private BigDecimal stuffOtherWeight1;

    /**
     * 其他废料#名称
     */
    private String stuffOtherName2;

    /**
     * 其他废料#重量
     */
    private BigDecimal stuffOtherWeight2;

    /**
     * 其他废料#名称
     */
    private String stuffOtherName3;

    /**
     * 其他废料#重量
     */
    private BigDecimal stuffOtherWeight3;

    /**
     * 电解原铝#灌铝班组ID
     */
    private String stuffAlGroupId;

    /**
     * 电解原铝#灌铝班组名称
     */
    private String stuffAlGroupName;

    /**
     * 电解原铝#累计重量
     */
    private BigDecimal stuffAlWeight;

    /**
     * 总装炉量
     */
    private BigDecimal stuffTotalWeight;

    /**
     * 固液比
     */
    private BigDecimal stuffStlRatio;

    /**
     * 点火时间
     */
    private Date firingTime;

    /**
     * 叉车搅拌#refine1_wt_fe第1次时间
     */
    private Date forkliftStirTime1;

    /**
     * 叉车搅拌#第2次时间
     */
    private Date forkliftStirTime2;

    /**
     * 叉车搅拌#第3次时间
     */
    private Date forkliftStirTime3;

    /**
     * 叉车搅拌#班组ID
     */
    private String forkliftGroupId;

    /**
     * 叉车搅拌#班组名称
     */
    private String forkliftGroupName;

    /**
     * 叉车搅拌#叉车工ID
     */
    private String forkliftDriverId;

    /**
     * 叉车搅拌#叉车工名称
     */
    private String forkliftDriverName;

    /**
     * 叉车搅拌#班组ID2
     */
    private String forkliftGroupId2;

    /**
     * 叉车搅拌#班组名称2
     */
    private String forkliftGroupName2;

    /**
     * 叉车搅拌#叉车工ID2
     */
    private String forkliftDriverId2;

    /**
     * 叉车搅拌#叉车工名称2
     */
    private String forkliftDriverName2;

    /**
     * 叉车搅拌#班组ID3
     */
    private String forkliftGroupId3;

    /**
     * 叉车搅拌#班组名称3
     */
    private String forkliftGroupName3;

    /**
     * 叉车搅拌#叉车工ID3
     */
    private String forkliftDriverId3;

    /**
     * 叉车搅拌#叉车工名称3
     */
    private String forkliftDriverName3;

    /**
     * 预扒渣#时间
     */
    private Date drossingTime;

    /**
     * 预扒渣#温度
     */
    private BigDecimal drossingTemp;

    /**
     * 配比前取样#时间
     */
    private Date prepSamplingTime;

    /**
     * 配比前取样#温度
     */
    private BigDecimal prepSamplingTemp;

    /**
     * 配比前取样复查#时间
     */
    private Date prepSamplingTimeRe;

    /**
     * 配比前取样复查#温度
     */
    private BigDecimal prepSamplingTempRe;

    /**
     * 合金添加时间
     */
    private Date alloyRefine1AddTime;

    /**
     * 东盛铁剂
     */
    private BigDecimal alloyRefine1Fe;

    /**
     * 西盛铁剂
     */
    private BigDecimal alloyRefine1FeWest;

    /**
     * 速溶硅
     */
    private BigDecimal alloyRefine1Si;

    /**
     * 铝硅合金
     */
    private BigDecimal alloyRefine1AlSi;

    /**
     * 铜剂
     */
    private BigDecimal alloyRefine1Cu;

    /**
     * 锰剂
     */
    private BigDecimal alloyRefine1Mn;

    /**
     * 铝钛合金
     */
    private BigDecimal alloyRefine1AlTi;

    /**
     * 其他合金名称#合金名称
     */
    private String alloyRefine1OtherName;

    /**
     * 其他合金名称#添加量
     */
    private BigDecimal alloyRefine1OtherDose;

    /**
     * 添加量复核#班组ID
     */
    private String alloyRefine1SmeltGroupId;

    /**
     * 添加量复核#班组名称
     */
    private String alloyRefine1SmeltGroupName;

    /**
     * 添加量复核#熔炼工ID
     */
    private String alloyRefine1SmelterId;

    /**
     * 添加量复核#熔炼工名称
     */
    private String alloyRefine1SmelterName;

    /**
     * 喷粉精炼#开始时间
     */
    private Date mimRefine1BeginTime;

    /**
     * 喷粉精炼#结束时间
     */
    private Date mimRefine1EndTime;

    /**
     * 喷粉精炼#温度
     */
    private BigDecimal mimRefine1Temp;

    /**
     * 喷粉精炼#精炼剂#介质
     */
    private String mimRefine1Medium;

    /**
     * 喷粉精炼#精炼剂#用量
     */
    private BigDecimal mimRefine1Dose;

    /**
     * 喷粉精炼#班组ID
     */
    private String mimRefine1GroupId;

    /**
     * 喷粉精炼#班组名称
     */
    private String mimRefine1GroupName;

    /**
     * 喷粉精炼#熔炼工ID
     */
    private String mimRefine1SmelterId;

    /**
     * 喷粉精炼#熔炼工名称
     */
    private String mimRefine1SmelterName;

    /**
     * 取样时间
     */
    private Date refine1SamplingTime;

    /**
     * 取样温度
     */
    private BigDecimal refine1SamplingTemp;

    /**
     * 配比班组id
     */
    private String refine1RatioGroupId;

    /**
     * 配比班组名称
     */
    private String refine1RatioGroupName;

    /**
     * 配比后取样复查#取样时间
     */
    private Date refine1SamplingTimeRe;

    /**
     * 配比后取样复查#取样温度
     */
    private BigDecimal refine1SamplingTempRe;

    /**
     * 合金添加时间
     */
    private Date alloyRefine2AddTime;

    /**
     * 东盛铁剂
     */
    private BigDecimal alloyRefine2Fe;

    /**
     * 西盛铁剂
     */
    private BigDecimal alloyRefine2FeWest;

    /**
     * 速溶硅
     */
    private BigDecimal alloyRefine2Si;

    /**
     * 铝硅合金
     */
    private BigDecimal alloyRefine2AlSi;

    /**
     * 铜剂
     */
    private BigDecimal alloyRefine2Cu;

    /**
     * 锰剂
     */
    private BigDecimal alloyRefine2Mn;

    /**
     * 铝钛合金
     */
    private BigDecimal alloyRefine2AlTi;

    /**
     * 其他合金名称#合金名称
     */
    private String alloyRefine2OtherName;

    /**
     * 其他合金名称#添加量
     */
    private BigDecimal alloyRefine2OtherDose;

    /**
     * 添加量复核#班组ID
     */
    private String alloyRefine2GroupId;

    /**
     * 添加量复核#班组名称
     */
    private String alloyRefine2GroupName;

    /**
     * 添加量复核#熔炼工ID
     */
    private String alloyRefine2SmelterId;

    /**
     * 添加量复核#熔炼工名称
     */
    private String alloyRefine2SmelterName;

    /**
     * 开始时间
     */
    private Date grainRefine1BeginTime;

    /**
     * 结束时间
     */
    private Date grainRefine1EndTime;

    /**
     * 温度
     */
    private BigDecimal grainRefine1Temp;

    /**
     * 精炼剂#介质
     */
    private String grainRefine1Medium;

    /**
     * 精炼剂#用量
     */
    private BigDecimal grainRefine1Dose;

    /**
     * 班组ID
     */
    private String grainRefine1SmeltGroupId;

    /**
     * 班组名称
     */
    private String grainRefine1SmeltGroupName;

    /**
     * 熔炼工ID
     */
    private String grainRefine1SmelterId;

    /**
     * 熔炼工名称
     */
    private String grainRefine1SmelterName;

    /**
     * 操作工ID
     */
    private String grainRefine1OperatorId;

    /**
     * 操作工名称
     */
    private String grainRefine1OperatorName;

    /**
     * 扒渣班组ID
     */
    private String grainRefine1DrossingGroupId;

    /**
     * 扒渣班组名称
     */
    private String grainRefine1DrossingGroupName;

    /**
     * 开始时间
     */
    private Date grainRefine2BeginTime;

    /**
     * 结束时间
     */
    private Date grainRefine2EndTime;

    /**
     * 温度
     */
    private BigDecimal grainRefine2Temp;

    /**
     * 精炼剂#介质
     */
    private String grainRefine2Medium;

    /**
     * 精炼剂#用量
     */
    private BigDecimal grainRefine2Dose;

    /**
     * 班组ID
     */
    private String grainRefine2SmeltGroupId;

    /**
     * 班组名称
     */
    private String grainRefine2SmeltGroupName;

    /**
     * 熔炼工ID
     */
    private String grainRefine2SmelterId;

    /**
     * 熔炼工名称
     */
    private String grainRefine2SmelterName;

    /**
     * 操作工ID
     */
    private String grainRefine2OperatorId;

    /**
     * 操作工名称
     */
    private String grainRefine2OperatorName;

    /**
     * 扒渣班组ID
     */
    private String grainRefine2DrossingGroupId;

    /**
     * 扒渣班组名称
     */
    private String grainRefine2DrossingGroupName;

    /**
     * 取样时间
     */
    private Date prepTurndownSamplingTime;

    /**
     * 取样温度
     */
    private BigDecimal prepTurndownSamplingTemp;

    /**
     * 倒炉班组
     */
    private String turndownGroupId;

    /**
     * 熔炼工
     */
    private String turndownSmelterId;

    /**
     * 熔炼炉#温度
     */
    private BigDecimal turndownTemp;

    /**
     * 倒炉作业#开始时间
     */
    private Date turndownBeginTime;

    /**
     * 倒炉作业#结束时间
     */
    private Date turndownEndTime;

    /**
     * 倒炉作业#燃气抄表
     */
    private BigDecimal gasPostValue;

    /**
     * 清炉工ID
     */
    private String turndownCleanerId;

    /**
     * 清炉工名称
     */
    private String turndownCleanerName;

    /**
     * 熔炼工序备注
     */
    private String smeltRemark;

    /**
     * 熔炼工序审核
     */
    private String smeltApprove;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 修改人ID
     */
    private String reviserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 
     */
    private Date ts;

    /**
     * 预扒渣温度测量时间
     */
    private Date drossingTempTime;

    /**
     * 喷粉精炼温度测量时间
     */
    private Date mimRefine1TempTime;

    /**
     * 液体、颗粒精炼温度测量时间
     */
    private Date grainRefine1TempTime;

    /**
     * 二次液体、颗粒精炼温度测量时间
     */
    private Date grainRefine2TempTime;

    /**
     * 倒炉温度测量时间
     */
    private Date turndownTempTime;

    /**
     * 天然气单耗
     */
    private BigDecimal gasUnitConsumption;

    /**
     * 装炉前燃气抄表#炉料装炉前造渣剂加入量
     */
    private BigDecimal makingSlagAgentAddAmount;

    /**
     * 预扒渣#预扒渣前造渣剂加入量
     */
    private BigDecimal makingPreSlagAgentAddAmount;

    /**
     * 单熔次燃气用量
     */
    private BigDecimal singleGasConsumption;

    /**
     * 倒炉前取样复查#取样时间
     */
    private Date prepTurndownSamplingTimeRe;

    /**
     * 倒炉前取样复查#取样温度
     */
    private BigDecimal prepTurndownSamplingTempRe;

    /**
     * 清炉班组id
     */
    private String clearGroupId;

    /**
     * 抬包电解槽号1
     */
    private String liningPotNum1;

    /**
     * 抬包电解槽号2
     */
    private String liningPotNum2;

    /**
     * 抬包电解槽号3
     */
    private String liningPotNum3;

    /**
     * 抬包净重1
     */
    private BigDecimal liningWeight1;

    /**
     * 抬包净重2
     */
    private BigDecimal liningWeight2;

    /**
     * 抬包净重3
     */
    private BigDecimal liningWeight3;

    /**
     * 品位1
     */
    private String qualityPosition1;

    /**
     * 品位2
     */
    private String qualityPosition2;

    /**
     * 品位3
     */
    private String qualityPosition3;

    /**
     * 工艺卡编号
     */
    private String castCardNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}