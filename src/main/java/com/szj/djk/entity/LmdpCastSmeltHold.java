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
    @TableId(value = "id")
    private String id;

    /**
     * 关联计划ID
     */
    @TableField(value = "plan_id")
    private String planId;

    /**
     * 熔次号
     */
    @TableField(value = "smelt_times")
    private String smeltTimes;

    /**
     * 生产线号
     */
    @TableField(value = "heat_num")
    private String heatNum;

    /**
     * 牌号
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 装炉时间
     */
    @TableField(value = "feed_time")
    private Date feedTime;

    /**
     * 装炉班组ID
     */
    @TableField(value = "feed_group_id")
    private String feedGroupId;

    /**
     * 装炉班组名称
     */
    @TableField(value = "feed_group_name")
    private String feedGroupName;

    /**
     * 燃气表显示值
     */
    @TableField(value = "gas_prep_value")
    private Integer gasPrepValue;

    /**
     * 铝锭99.70％
     */
    @TableField(value = "stuff_al_pig")
    private Integer stuffAlPig;

    /**
     * 铸轧卷
     */
    @TableField(value = "stuff_cast_reel")
    private BigDecimal stuffCastReel;

    /**
     * 大块料
     */
    @TableField(value = "stuff_big")
    private BigDecimal stuffBig;

    /**
     * 冷轧厚料≥0.6mm
     */
    @TableField(value = "stuff_cold_thick")
    private BigDecimal stuffColdThick;

    /**
     * 冷轧薄料＜0.6mm
     */
    @TableField(value = "stuff_cold_thin")
    private BigDecimal stuffColdThin;

    /**
     * 炼渣铝块
     */
    @TableField(value = "stuff_al_slag")
    private BigDecimal stuffAlSlag;

    /**
     * 样板板头料跑渣料
     */
    @TableField(value = "stuff_sample_slag")
    private BigDecimal stuffSampleSlag;

    /**
     * 切边料
     */
    @TableField(value = "stuff_trim")
    private BigDecimal stuffTrim;

    /**
     * 其他废料#名称
     */
    @TableField(value = "stuff_other_name")
    private String stuffOtherName;

    /**
     * 其他废料#重量
     */
    @TableField(value = "stuff_other_weight")
    private BigDecimal stuffOtherWeight;

    /**
     * 电解原铝#灌铝班组ID
     */
    @TableField(value = "stuff_al_group_id")
    private String stuffAlGroupId;

    /**
     * 电解原铝#灌铝班组名称
     */
    @TableField(value = "stuff_al_group_name")
    private String stuffAlGroupName;

    /**
     * 电解原铝#累计重量
     */
    @TableField(value = "stuff_al_weight")
    private BigDecimal stuffAlWeight;

    /**
     * 总装炉量
     */
    @TableField(value = "stuff_total_weight")
    private BigDecimal stuffTotalWeight;

    /**
     * 固液比
     */
    @TableField(value = "stuff_stl_ratio")
    private BigDecimal stuffStlRatio;

    /**
     * 点火时间
     */
    @TableField(value = "firing_time")
    private Date firingTime;

    /**
     * 叉车搅拌#refine1_wt_fe第1次时间
     */
    @TableField(value = "forklift_stir_time1")
    private Date forkliftStirTime1;

    /**
     * 叉车搅拌#第2次时间
     */
    @TableField(value = "forklift_stir_time2")
    private Date forkliftStirTime2;

    /**
     * 叉车搅拌#第3次时间
     */
    @TableField(value = "forklift_stir_time3")
    private Date forkliftStirTime3;

    /**
     * 叉车搅拌#班组ID
     */
    @TableField(value = "forklift_group_id")
    private String forkliftGroupId;

    /**
     * 叉车搅拌#班组名称
     */
    @TableField(value = "forklift_group_name")
    private String forkliftGroupName;

    /**
     * 叉车搅拌#叉车工ID
     */
    @TableField(value = "forklift_driver_id")
    private String forkliftDriverId;

    /**
     * 叉车搅拌#叉车工名称
     */
    @TableField(value = "forklift_driver_name")
    private String forkliftDriverName;

    /**
     * 预扒渣#时间
     */
    @TableField(value = "drossing_time")
    private Date drossingTime;

    /**
     * 预扒渣#温度
     */
    @TableField(value = "drossing_temp")
    private BigDecimal drossingTemp;

    /**
     * 配比前取样#时间
     */
    @TableField(value = "prep_sampling_time")
    private Date prepSamplingTime;

    /**
     * 配比前取样#温度
     */
    @TableField(value = "prep_sampling_temp")
    private BigDecimal prepSamplingTemp;

    /**
     * 合金添加时间
     */
    @TableField(value = "alloy_refine1_add_time")
    private Date alloyRefine1AddTime;

    /**
     * 铁剂
     */
    @TableField(value = "alloy_refine1_fe")
    private BigDecimal alloyRefine1Fe;

    /**
     * 速溶硅
     */
    @TableField(value = "alloy_refine1_si")
    private BigDecimal alloyRefine1Si;

    /**
     * 铝硅合金
     */
    @TableField(value = "alloy_refine1_al_si")
    private BigDecimal alloyRefine1AlSi;

    /**
     * 东盛铜剂
     */
    @TableField(value = "alloy_refine1_cu")
    private BigDecimal alloyRefine1Cu;

    /**
     * 东盛锰剂
     */
    @TableField(value = "alloy_refine1_mn")
    private BigDecimal alloyRefine1Mn;

    /**
     * 铝钛合金
     */
    @TableField(value = "alloy_refine1_al_ti")
    private BigDecimal alloyRefine1AlTi;

    /**
     * 其他合金名称#合金名称
     */
    @TableField(value = "alloy_refine1_other_name")
    private String alloyRefine1OtherName;

    /**
     * 其他合金名称#添加量
     */
    @TableField(value = "alloy_refine1_other_dose")
    private BigDecimal alloyRefine1OtherDose;

    /**
     * 添加量复核#班组ID
     */
    @TableField(value = "alloy_refine1_smelt_group_id")
    private String alloyRefine1SmeltGroupId;

    /**
     * 添加量复核#班组名称
     */
    @TableField(value = "alloy_refine1_smelt_group_name")
    private String alloyRefine1SmeltGroupName;

    /**
     * 添加量复核#熔炼工ID
     */
    @TableField(value = "alloy_refine1_smelter_id")
    private String alloyRefine1SmelterId;

    /**
     * 添加量复核#熔炼工名称
     */
    @TableField(value = "alloy_refine1_smelter_name")
    private String alloyRefine1SmelterName;

    /**
     * 喷粉精炼#开始时间
     */
    @TableField(value = "mim_refine1_begin_time")
    private Date mimRefine1BeginTime;

    /**
     * 喷粉精炼#结束时间
     */
    @TableField(value = "mim_refine1_end_time")
    private Date mimRefine1EndTime;

    /**
     * 喷粉精炼#温度
     */
    @TableField(value = "mim_refine1_temp")
    private BigDecimal mimRefine1Temp;

    /**
     * 喷粉精炼#精炼剂#介质
     */
    @TableField(value = "mim_refine1_medium")
    private String mimRefine1Medium;

    /**
     * 喷粉精炼#精炼剂#用量
     */
    @TableField(value = "mim_refine1_dose")
    private BigDecimal mimRefine1Dose;

    /**
     * 喷粉精炼#班组ID
     */
    @TableField(value = "mim_refine1_group_id")
    private String mimRefine1GroupId;

    /**
     * 喷粉精炼#班组名称
     */
    @TableField(value = "mim_refine1_group_name")
    private String mimRefine1GroupName;

    /**
     * 喷粉精炼#熔炼工ID
     */
    @TableField(value = "mim_refine1_smelter_id")
    private String mimRefine1SmelterId;

    /**
     * 喷粉精炼#熔炼工名称
     */
    @TableField(value = "mim_refine1_smelter_name")
    private String mimRefine1SmelterName;

    /**
     * 取样时间
     */
    @TableField(value = "refine1_sampling_time")
    private Date refine1SamplingTime;

    /**
     * 取样温度
     */
    @TableField(value = "refine1_sampling_temp")
    private String refine1SamplingTemp;

    /**
     * 配比班组id
     */
    @TableField(value = "refine1_ratio_group_id")
    private String refine1RatioGroupId;

    /**
     * 配比班组名称
     */
    @TableField(value = "refine1_ratio_group_name")
    private String refine1RatioGroupName;

    /**
     * 合金添加时间
     */
    @TableField(value = "alloy_refine2_add_time")
    private Date alloyRefine2AddTime;

    /**
     * 铁剂
     */
    @TableField(value = "alloy_refine2_fe")
    private BigDecimal alloyRefine2Fe;

    /**
     * 速溶硅
     */
    @TableField(value = "alloy_refine2_si")
    private BigDecimal alloyRefine2Si;

    /**
     * 铝硅合金
     */
    @TableField(value = "alloy_refine2_al_si")
    private BigDecimal alloyRefine2AlSi;

    /**
     * 东盛铜剂
     */
    @TableField(value = "alloy_refine2_cu")
    private BigDecimal alloyRefine2Cu;

    /**
     * 东盛锰剂
     */
    @TableField(value = "alloy_refine2_mn")
    private BigDecimal alloyRefine2Mn;

    /**
     * 铝钛合金
     */
    @TableField(value = "alloy_refine2_al_ti")
    private BigDecimal alloyRefine2AlTi;

    /**
     * 其他合金名称#合金名称
     */
    @TableField(value = "alloy_refine2_other_name")
    private String alloyRefine2OtherName;

    /**
     * 其他合金名称#添加量
     */
    @TableField(value = "alloy_refine2_other_dose")
    private BigDecimal alloyRefine2OtherDose;

    /**
     * 添加量复核#班组ID
     */
    @TableField(value = "alloy_refine2_group_id")
    private String alloyRefine2GroupId;

    /**
     * 添加量复核#班组名称
     */
    @TableField(value = "alloy_refine2_group_name")
    private String alloyRefine2GroupName;

    /**
     * 添加量复核#熔炼工ID
     */
    @TableField(value = "alloy_refine2_smelter_id")
    private String alloyRefine2SmelterId;

    /**
     * 添加量复核#熔炼工名称
     */
    @TableField(value = "alloy_refine2_smelter_name")
    private String alloyRefine2SmelterName;

    /**
     * 开始时间
     */
    @TableField(value = "grain_refine1_begin_time")
    private Date grainRefine1BeginTime;

    /**
     * 结束时间
     */
    @TableField(value = "grain_refine1_end_time")
    private Date grainRefine1EndTime;

    /**
     * 温度
     */
    @TableField(value = "grain_refine1_temp")
    private BigDecimal grainRefine1Temp;

    /**
     * 精炼剂#介质
     */
    @TableField(value = "grain_refine1_medium")
    private String grainRefine1Medium;

    /**
     * 精炼剂#用量
     */
    @TableField(value = "grain_refine1_dose")
    private BigDecimal grainRefine1Dose;

    /**
     * 班组ID
     */
    @TableField(value = "grain_refine1_smelt_group_id")
    private String grainRefine1SmeltGroupId;

    /**
     * 班组名称
     */
    @TableField(value = "grain_refine1_smelt_group_name")
    private String grainRefine1SmeltGroupName;

    /**
     * 熔炼工ID
     */
    @TableField(value = "grain_refine1_smelter_id")
    private String grainRefine1SmelterId;

    /**
     * 熔炼工名称
     */
    @TableField(value = "grain_refine1_smelter_name")
    private String grainRefine1SmelterName;

    /**
     * 操作工ID
     */
    @TableField(value = "grain_refine1_operator_id")
    private String grainRefine1OperatorId;

    /**
     * 操作工名称
     */
    @TableField(value = "grain_refine1_operator_name")
    private String grainRefine1OperatorName;

    /**
     * 扒渣班组ID
     */
    @TableField(value = "grain_refine1_drossing_group_id")
    private String grainRefine1DrossingGroupId;

    /**
     * 扒渣班组名称
     */
    @TableField(value = "grain_refine1_drossing_group_name")
    private String grainRefine1DrossingGroupName;

    /**
     * 开始时间
     */
    @TableField(value = "grain_refine2_begin_time")
    private Date grainRefine2BeginTime;

    /**
     * 结束时间
     */
    @TableField(value = "grain_refine2_end_time")
    private Date grainRefine2EndTime;

    /**
     * 温度
     */
    @TableField(value = "grain_refine2_temp")
    private BigDecimal grainRefine2Temp;

    /**
     * 精炼剂#介质
     */
    @TableField(value = "grain_refine2_medium")
    private String grainRefine2Medium;

    /**
     * 精炼剂#用量
     */
    @TableField(value = "grain_refine2_dose")
    private BigDecimal grainRefine2Dose;

    /**
     * 班组ID
     */
    @TableField(value = "grain_refine2_smelt_group_id")
    private String grainRefine2SmeltGroupId;

    /**
     * 班组名称
     */
    @TableField(value = "grain_refine2_smelt_group_name")
    private String grainRefine2SmeltGroupName;

    /**
     * 熔炼工ID
     */
    @TableField(value = "grain_refine2_smelter_id")
    private String grainRefine2SmelterId;

    /**
     * 熔炼工名称
     */
    @TableField(value = "grain_refine2_smelter_name")
    private String grainRefine2SmelterName;

    /**
     * 操作工ID
     */
    @TableField(value = "grain_refine2_operator_id")
    private String grainRefine2OperatorId;

    /**
     * 操作工名称
     */
    @TableField(value = "grain_refine2_operator_name")
    private String grainRefine2OperatorName;

    /**
     * 扒渣班组ID
     */
    @TableField(value = "grain_refine2_drossing_group_id")
    private String grainRefine2DrossingGroupId;

    /**
     * 扒渣班组名称
     */
    @TableField(value = "grain_refine2_drossing_group_name")
    private String grainRefine2DrossingGroupName;

    /**
     * 取样时间
     */
    @TableField(value = "prep_turndown_sampling_time")
    private Date prepTurndownSamplingTime;

    /**
     * 取样温度
     */
    @TableField(value = "prep_turndown_sampling_temp")
    private BigDecimal prepTurndownSamplingTemp;

    /**
     * 倒炉班组
     */
    @TableField(value = "turndown_group_id")
    private String turndownGroupId;

    /**
     * 熔炼工
     */
    @TableField(value = "turndown_smelter_id")
    private String turndownSmelterId;

    /**
     * 熔炼炉#温度
     */
    @TableField(value = "turndown_temp")
    private BigDecimal turndownTemp;

    /**
     * 倒炉作业#开始时间
     */
    @TableField(value = "turndown_begin_time")
    private Date turndownBeginTime;

    /**
     * 倒炉作业#结束时间
     */
    @TableField(value = "turndown_end_time")
    private Date turndownEndTime;

    /**
     * 倒炉作业#燃气抄表
     */
    @TableField(value = "gas_post_value")
    private BigDecimal gasPostValue;

    /**
     * 清炉工ID
     */
    @TableField(value = "turndown_cleaner_id")
    private String turndownCleanerId;

    /**
     * 清炉工名称
     */
    @TableField(value = "turndown_cleaner_name")
    private String turndownCleanerName;

    /**
     * 熔炼工序备注
     */
    @TableField(value = "smelt_remark")
    private String smeltRemark;

    /**
     * 熔炼工序审核
     */
    @TableField(value = "smelt_approve")
    private String smeltApprove;

    /**
     * 创建人ID
     */
    @TableField(value = "creator_id")
    private String creatorId;

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
     * 预扒渣温度测量时间
     */
    @TableField(value = "drossing_temp_time")
    private Date drossingTempTime;

    /**
     * 喷粉精炼温度测量时间
     */
    @TableField(value = "mim_refine1_temp_time")
    private Date mimRefine1TempTime;

    /**
     * 液体、颗粒精炼温度测量时间
     */
    @TableField(value = "grain_refine1_temp_time")
    private Date grainRefine1TempTime;

    /**
     * 二次液体、颗粒精炼温度测量时间
     */
    @TableField(value = "grain_refine2_temp_time")
    private Date grainRefine2TempTime;

    /**
     * 倒炉温度测量时间
     */
    @TableField(value = "turndown_temp_time")
    private Date turndownTempTime;

    /**
     * 单熔次燃气用量
     */
    @TableField(value = "single_gas_consumption")
    private BigDecimal singleGasConsumption;

    /**
     * 装炉前燃气抄表#造渣剂加入量
     */
    @TableField(value = "making_slag_agent_add_amount")
    private BigDecimal makingSlagAgentAddAmount;

    /**
     * 预扒渣#预扒渣前造渣剂加入量
     */
    @TableField(value = "making_pre_slag_agent_add_amount")
    private BigDecimal makingPreSlagAgentAddAmount;

    /**
     * 叉车搅拌#班组ID2
     */
    @TableField(value = "forklift_group_id2")
    private String forkliftGroupId2;

    /**
     * 叉车搅拌#班组名称2
     */
    @TableField(value = "forklift_group_name2")
    private String forkliftGroupName2;

    /**
     * 叉车搅拌#叉车工ID2
     */
    @TableField(value = "forklift_driver_id2")
    private String forkliftDriverId2;

    /**
     * 叉车搅拌#叉车工名称2
     */
    @TableField(value = "forklift_driver_name2")
    private String forkliftDriverName2;

    /**
     * 叉车搅拌#班组ID3
     */
    @TableField(value = "forklift_group_id3")
    private String forkliftGroupId3;

    /**
     * 叉车搅拌#班组名称3
     */
    @TableField(value = "forklift_group_name3")
    private String forkliftGroupName3;

    /**
     * 叉车搅拌#叉车工ID3
     */
    @TableField(value = "forklift_driver_id3")
    private String forkliftDriverId3;

    /**
     * 叉车搅拌#叉车工名称3
     */
    @TableField(value = "forklift_driver_name3")
    private String forkliftDriverName3;

    /**
     * 其他废料#名称
     */
    @TableField(value = "stuff_other_name1")
    private String stuffOtherName1;

    /**
     * 其他废料#重量
     */
    @TableField(value = "stuff_other_weight1")
    private BigDecimal stuffOtherWeight1;

    /**
     * 其他废料#名称
     */
    @TableField(value = "stuff_other_name2")
    private String stuffOtherName2;

    /**
     * 其他废料#重量
     */
    @TableField(value = "stuff_other_weight2")
    private BigDecimal stuffOtherWeight2;

    /**
     * 其他废料#名称
     */
    @TableField(value = "stuff_other_name3")
    private String stuffOtherName3;

    /**
     * 其他废料#重量
     */
    @TableField(value = "stuff_other_weight3")
    private BigDecimal stuffOtherWeight3;

    /**
     * 配比前取样#配比前取样复查
     */
    @TableField(value = "prep_sampling_review")
    private String prepSamplingReview;

    /**
     * 配比后取样#配比后取样复查
     */
    @TableField(value = "after_sampling_review")
    private String afterSamplingReview;

    /**
     * 倒炉前取样复查
     */
    @TableField(value = "prep_turndown_sampling_review")
    private String prepTurndownSamplingReview;

    /**
     * 保温炉取样复查
     */
    @TableField(value = "holding_furnace_sampling_review")
    private String holdingFurnaceSamplingReview;

    /**
     * 西盛铁剂
     */
    @TableField(value = "alloy_refine1_fe_west")
    private BigDecimal alloyRefine1FeWest;

    /**
     * 西盛铁剂
     */
    @TableField(value = "alloy_refine2_fe_west")
    private BigDecimal alloyRefine2FeWest;

    /**
     * 配比前取样复查#时间
     */
    @TableField(value = "prep_sampling_time_re")
    private Date prepSamplingTimeRe;

    /**
     * 配比前取样复查#温度
     */
    @TableField(value = "prep_sampling_temp_re")
    private BigDecimal prepSamplingTempRe;

    /**
     * 配比后取样复查#取样时间
     */
    @TableField(value = "refine1_sampling_time_re")
    private Date refine1SamplingTimeRe;

    /**
     * 配比后取样复查#取样温度
     */
    @TableField(value = "refine1_sampling_temp_re")
    private BigDecimal refine1SamplingTempRe;

    /**
     * 倒炉前取样复查#取样时间
     */
    @TableField(value = "prep_turndown_sampling_time_re")
    private Date prepTurndownSamplingTimeRe;

    /**
     * 倒炉前取样复查#取样温度
     */
    @TableField(value = "prep_turndown_sampling_temp_re")
    private BigDecimal prepTurndownSamplingTempRe;

    /**
     * 天然气单耗
     */
    @TableField(value = "gas_unit_consumption")
    private BigDecimal gasUnitConsumption;

    /**
     * 铸轧卷工艺卡编号，关联lmdp_cast_process_card->card_number
     */
    @TableField(value = "cast_card_number")
    private String castCardNumber;

    /**
     * 清炉班组id
     */
    @TableField(value = "clear_group_id")
    private String clearGroupId;

    /**
     * 抬包电解槽号1
     */
    @TableField(value = "lining_pot_num1")
    private String liningPotNum1;

    /**
     * 抬包电解槽号2
     */
    @TableField(value = "lining_pot_num2")
    private String liningPotNum2;

    /**
     * 抬包电解槽号3
     */
    @TableField(value = "lining_pot_num3")
    private String liningPotNum3;

    /**
     * 抬包净重1
     */
    @TableField(value = "lining_weight1")
    private BigDecimal liningWeight1;

    /**
     * 抬包净重2
     */
    @TableField(value = "lining_weight2")
    private BigDecimal liningWeight2;

    /**
     * 抬包净重3
     */
    @TableField(value = "lining_weight3")
    private BigDecimal liningWeight3;

    /**
     * 品位1
     */
    @TableField(value = "quality_position1")
    private String qualityPosition1;

    /**
     * 品位2
     */
    @TableField(value = "quality_position2")
    private String qualityPosition2;

    /**
     * 品位3
     */
    @TableField(value = "quality_position3")
    private String qualityPosition3;

    /**
     * 生产进度
     */
    @TableField(value = "produce_status")
    private String produceStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}