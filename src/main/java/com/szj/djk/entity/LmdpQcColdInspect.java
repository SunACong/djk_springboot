package com.szj.djk.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 冷轧工序质量巡检记录
 * @TableName lmdp_qc_cold_inspect
 */
@TableName(value ="lmdp_qc_cold_inspect")
@Data
public class LmdpQcColdInspect implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

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
     * 创建人
     */
    @TableField(value = "creator_id")
    private String creatorId;

    /**
     * 计划编号
     */
    @TableField(value = "plan_num")
    private String planNum;

    /**
     * 客户名称
     */
    @TableField(value = "consumer")
    private String consumer;

    /**
     * 产品用途
     */
    @TableField(value = "product_use")
    private String productUse;

    /**
     * 批号（冷轧卷号）
     */
    @TableField(value = "batch_num")
    private String batchNum;

    /**
     * 合金牌号
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 成品状态
     */
    @TableField(value = "status")
    private String status;

    /**
     * 成品规格
     */
    @TableField(value = "model")
    private String model;

    /**
     * 成品卷径
     */
    @TableField(value = "roll_diameter")
    private String rollDiameter;

    /**
     * 是否剖分卷（废弃）
     */
    @TableField(value = "split_flag")
    private String splitFlag;

    /**
     * 入口厚度
     */
    @TableField(value = "cold1_thick_in")
    private BigDecimal cold1ThickIn;

    /**
     * 出口厚度
     */
    @TableField(value = "cold1_thick_out")
    private BigDecimal cold1ThickOut;

    /**
     * 备注
     */
    @TableField(value = "cold1_remark")
    private String cold1Remark;

    /**
     * 抽查照片
     */
    @TableField(value = "cold1_picture")
    private String cold1Picture;

    /**
     * 质检员
     */
    @TableField(value = "cold1_inspector")
    private String cold1Inspector;

    /**
     * 轧制时间
     */
    @TableField(value = "cold1_time")
    private Date cold1Time;

    /**
     * 入口厚度
     */
    @TableField(value = "cold2_thick_in")
    private BigDecimal cold2ThickIn;

    /**
     * 出口厚度
     */
    @TableField(value = "cold2_thick_out")
    private BigDecimal cold2ThickOut;

    /**
     * 备注
     */
    @TableField(value = "cold2_remark")
    private String cold2Remark;

    /**
     * 抽查照片
     */
    @TableField(value = "cold2_picture")
    private String cold2Picture;

    /**
     * 质检员
     */
    @TableField(value = "cold2_inspector")
    private String cold2Inspector;

    /**
     * 轧制时间
     */
    @TableField(value = "cold2_time")
    private Date cold2Time;

    /**
     * 入口厚度
     */
    @TableField(value = "cold3_thick_in")
    private BigDecimal cold3ThickIn;

    /**
     * 出口厚度
     */
    @TableField(value = "cold3_thick_out")
    private BigDecimal cold3ThickOut;

    /**
     * 备注
     */
    @TableField(value = "cold3_remark")
    private String cold3Remark;

    /**
     * 抽查照片
     */
    @TableField(value = "cold3_picture")
    private String cold3Picture;

    /**
     * 质检员
     */
    @TableField(value = "cold3_inspector")
    private String cold3Inspector;

    /**
     * 轧制时间
     */
    @TableField(value = "cold3_time")
    private Date cold3Time;

    /**
     * 入口厚度
     */
    @TableField(value = "cold4_thick_in")
    private BigDecimal cold4ThickIn;

    /**
     * 出口厚度
     */
    @TableField(value = "cold4_thick_out")
    private BigDecimal cold4ThickOut;

    /**
     * 备注
     */
    @TableField(value = "cold4_remark")
    private String cold4Remark;

    /**
     * 抽查照片
     */
    @TableField(value = "cold4_picture")
    private String cold4Picture;

    /**
     * 质检员
     */
    @TableField(value = "cold4_inspector")
    private String cold4Inspector;

    /**
     * 轧制时间
     */
    @TableField(value = "cold4_time")
    private Date cold4Time;

    /**
     * 入口厚度
     */
    @TableField(value = "cold5_thick_in")
    private BigDecimal cold5ThickIn;

    /**
     * 出口厚度
     */
    @TableField(value = "cold5_thick_out")
    private BigDecimal cold5ThickOut;

    /**
     * 备注
     */
    @TableField(value = "cold5_remark")
    private String cold5Remark;

    /**
     * 抽查照片
     */
    @TableField(value = "cold5_picture")
    private String cold5Picture;

    /**
     * 质检员
     */
    @TableField(value = "cold5_inspector")
    private String cold5Inspector;

    /**
     * 轧制时间
     */
    @TableField(value = "cold5_time")
    private Date cold5Time;

    /**
     * 第1次退火#工艺符合性
     */
    @TableField(value = "process_compliance1")
    private String processCompliance1;

    /**
     * 第2次退火#工艺符合性
     */
    @TableField(value = "process_compliance2")
    private String processCompliance2;

    /**
     * 第3次退火#工艺符合性
     */
    @TableField(value = "process_compliance3")
    private String processCompliance3;

    /**
     * 来料信息#卷号
     */
    @TableField(value = "reel_num")
    private String reelNum;

    /**
     * 第1次切边#厚度
     */
    @TableField(value = "thickness")
    private BigDecimal thickness;

    /**
     * 第1次切边#来料宽度
     */
    @TableField(value = "origin_width")
    private BigDecimal originWidth;

    /**
     * 第1次切边#切后宽度
     */
    @TableField(value = "width")
    private BigDecimal width;

    /**
     * 第1次切边#头料
     */
    @TableField(value = "head_stock")
    private String headStock;

    /**
     * 第1次切边#甩除原因
     */
    @TableField(value = "head_reject_reason")
    private String headRejectReason;

    /**
     * 第1次切边#尾料
     */
    @TableField(value = "tail_stock")
    private String tailStock;

    /**
     * 第1次切边#甩除原因
     */
    @TableField(value = "tail_reject_reason")
    private String tailRejectReason;

    /**
     * 第1次切边#外圈扒除
     */
    @TableField(value = "outer_remove")
    private String outerRemove;

    /**
     * 第1次切边#扒除原因
     */
    @TableField(value = "remove_reason")
    private String removeReason;

    /**
     * 第1次切边#切后重量（废弃）
     */
    @TableField(value = "cut_weight")
    private BigDecimal cutWeight;

    /**
     * 第1次切边#横向厚度（废弃）
     */
    @TableField(value = "transverse_thickness")
    private BigDecimal transverseThickness;

    /**
     * 第1次切边#纵向厚度（废弃）
     */
    @TableField(value = "longitudinal_thickness")
    private BigDecimal longitudinalThickness;

    /**
     * 第1次切边#质检员（废弃）
     */
    @TableField(value = "cut_inspector")
    private String cutInspector;

    /**
     * 第1次切边#时间（废弃）
     */
    @TableField(value = "cut_time")
    private Date cutTime;

    /**
     * 第1次切边#观察照片（废弃）
     */
    @TableField(value = "cut_picture")
    private Date cutPicture;

    /**
     * 单项质检记录#厚度（mm)
     */
    @TableField(value = "single_height")
    private BigDecimal singleHeight;

    /**
     * 单项质检记录#宽度（mm)
     */
    @TableField(value = "single_width")
    private BigDecimal singleWidth;

    /**
     * 单项质检记录#中凸度(%)
     */
    @TableField(value = "single_medium_convexity")
    private BigDecimal singleMediumConvexity;

    /**
     * 单项质检记录#平直度(I)
     */
    @TableField(value = "single_straightness")
    private BigDecimal singleStraightness;

    /**
     * 单项质检记录#抗拉强度(Rm/MPa)
     */
    @TableField(value = "single_strength")
    private BigDecimal singleStrength;

    /**
     * 单项质检记录#延伸率(%)
     */
    @TableField(value = "single_extension")
    private BigDecimal singleExtension;

    /**
     * 单项质检记录#晶粒度
     */
    @TableField(value = "single_grain_size")
    private String singleGrainSize;

    /**
     * 单项质检记录#粗糙度
     */
    @TableField(value = "single_roughness")
    private String singleRoughness;

    /**
     * 单项质检记录#表面质量是否合格
     */
    @TableField(value = "surface_quality")
    private String surfaceQuality;

    /**
     * 单项质检记录#表面质量描述
     */
    @TableField(value = "surface_quality_remark")
    private String surfaceQualityRemark;

    /**
     * 单项质检记录#外观质量是否合格
     */
    @TableField(value = "appearance_quality")
    private String appearanceQuality;

    /**
     * 单项质检记录#外观质量描述
     */
    @TableField(value = "appearance_quality_remark")
    private String appearanceQualityRemark;

    /**
     * 记事#坯料厚度
     */
    @TableField(value = "account_origin_thickness")
    private BigDecimal accountOriginThickness;

    /**
     * 记事#坯料宽度
     */
    @TableField(value = "account_origin_width")
    private BigDecimal accountOriginWidth;

    /**
     * 记事#坯料重量
     */
    @TableField(value = "account_origin_weight")
    private BigDecimal accountOriginWeight;

    /**
     * 冷轧成品#厚度
     */
    @TableField(value = "finished_thickness")
    private BigDecimal finishedThickness;

    /**
     * 冷轧成品#宽度
     */
    @TableField(value = "finished_width")
    private BigDecimal finishedWidth;

    /**
     * 冷轧成品#卷径
     */
    @TableField(value = "finished_roll_diameter")
    private BigDecimal finishedRollDiameter;

    /**
     * 冷轧成品#重量
     */
    @TableField(value = "finished_weight")
    private BigDecimal finishedWeight;

    /**
     * 冷轧成品#外圈扒除
     */
    @TableField(value = "finished_outer_remove")
    private String finishedOuterRemove;

    /**
     * 冷轧成品#扒除原因
     */
    @TableField(value = "finished_remove_reason")
    private String finishedRemoveReason;

    /**
     * 冷轧成品#横向厚度
     */
    @TableField(value = "finished_transverse_thickness")
    private BigDecimal finishedTransverseThickness;

    /**
     * 冷轧成品#纵向厚度
     */
    @TableField(value = "finished_longitudinal_thickness")
    private BigDecimal finishedLongitudinalThickness;

    /**
     * 冷轧成品#厚差记录
     */
    @TableField(value = "finished_thickness_difference")
    private String finishedThicknessDifference;

    /**
     * 冷轧计划厚度(mm)（废弃）
     */
    @TableField(value = "endwise_height")
    private String endwiseHeight;

    /**
     * 冷轧计划宽度(mm)（废弃）
     */
    @TableField(value = "warp_width")
    private String warpWidth;

    /**
     * 冷轧计划中凸度（废弃）
     */
    @TableField(value = "convex_rate")
    private String convexRate;

    /**
     * 冷轧计划平直度（废弃）
     */
    @TableField(value = "flatness")
    private String flatness;

    /**
     * 冷轧计划抗拉强度ob/Mpa（废弃）
     */
    @TableField(value = "tensile_strength")
    private String tensileStrength;

    /**
     * 冷轧计划延伸率（废弃）
     */
    @TableField(value = "elongation")
    private String elongation;

    /**
     * 冷轧计划晶粒度（废弃）
     */
    @TableField(value = "grain")
    private String grain;

    /**
     * 冷轧计划坯料表面粗糙度（废弃）
     */
    @TableField(value = "roughness")
    private String roughness;

    /**
     * 冷轧成品#厚差曲线图
     */
    @TableField(value = "finished_thickness_difference_picture")
    private String finishedThicknessDifferencePicture;

    /**
     * 铸坯异常信息（废弃）
     */
    @TableField(value = "cast_abnormal_info")
    private String castAbnormalInfo;

    /**
     * 后续轧制工作安排（废弃）
     */
    @TableField(value = "roll_plan")
    private String rollPlan;

    /**
     * 入口厚度（mm）
     */
    @TableField(value = "cold6_thick_in")
    private BigDecimal cold6ThickIn;

    /**
     * 出口厚度（mm）
     */
    @TableField(value = "cold6_thick_out")
    private BigDecimal cold6ThickOut;

    /**
     * 备注
     */
    @TableField(value = "cold6_remark")
    private String cold6Remark;

    /**
     * 抽查照片
     */
    @TableField(value = "cold6_picture")
    private String cold6Picture;

    /**
     * 质检员
     */
    @TableField(value = "cold6_inspector")
    private String cold6Inspector;

    /**
     * 轧制时间
     */
    @TableField(value = "cold6_time")
    private Date cold6Time;

    /**
     * 每日生产和质量异常#第一道冷轧工序
     */
    @TableField(value = "cold1_daily_qc_situation")
    private String cold1DailyQcSituation;

    /**
     * 每日生产和质量异常#第二道冷轧工序
     */
    @TableField(value = "cold2_daily_qc_situation")
    private String cold2DailyQcSituation;

    /**
     * 每日生产和质量异常#第三道冷轧工序
     */
    @TableField(value = "cold3_daily_qc_situation")
    private String cold3DailyQcSituation;

    /**
     * 每日生产和质量异常#第四道冷轧工序
     */
    @TableField(value = "cold4_daily_qc_situation")
    private String cold4DailyQcSituation;

    /**
     * 每日生产和质量异常#第五道冷轧工序
     */
    @TableField(value = "cold5_daily_qc_situation")
    private String cold5DailyQcSituation;

    /**
     * 每日生产和质量异常#第六道冷轧工序
     */
    @TableField(value = "cold6_daily_qc_situation")
    private String cold6DailyQcSituation;

    /**
     * 每日生产和质量异常#第一次退火工序
     */
    @TableField(value = "furnace1_daily_qc_situation")
    private String furnace1DailyQcSituation;

    /**
     * 每日生产和质量异常#第二次退火工序
     */
    @TableField(value = "furnace2_daily_qc_situation")
    private String furnace2DailyQcSituation;

    /**
     * 每日生产和质量异常#第三次退火工序
     */
    @TableField(value = "furnace3_daily_qc_situation")
    private String furnace3DailyQcSituation;

    /**
     * 每日生产和质量异常#重卷工序（废弃）
     */
    @TableField(value = "reeler_daily_qc_situation")
    private String reelerDailyQcSituation;

    /**
     * 第1次退火#质检员
     */
    @TableField(value = "annealing1_inspector")
    private String annealing1Inspector;

    /**
     * 第2次退火#质检员
     */
    @TableField(value = "annealing2_inspector")
    private String annealing2Inspector;

    /**
     * 第3次退火#质检员
     */
    @TableField(value = "annealing3_inspector")
    private String annealing3Inspector;

    /**
     * 第1次退火#退火厚度（mm）
     */
    @TableField(value = "annealing1_thick")
    private BigDecimal annealing1Thick;

    /**
     * 第2次退火#退火厚度（mm）
     */
    @TableField(value = "annealing2_thick")
    private BigDecimal annealing2Thick;

    /**
     * 第3次退火#退火厚度（mm）
     */
    @TableField(value = "annealing3_thick")
    private BigDecimal annealing3Thick;

    /**
     * 第1次退火#工艺符合性
     */
    @TableField(value = "annealing1_workmanship")
    private String annealing1Workmanship;

    /**
     * 第2次退火#工艺符合性
     */
    @TableField(value = "annealing2_workmanship")
    private String annealing2Workmanship;

    /**
     * 第3次退火#工艺符合性
     */
    @TableField(value = "annealing3_workmanship")
    private String annealing3Workmanship;

    /**
     * 卷重要求
     */
    @TableField(value = "rollweight_requirements")
    private String rollweightRequirements;

    /**
     * 来料信息#卷径（mm）
     */
    @TableField(value = "origin_roll_diameter")
    private BigDecimal originRollDiameter;

    /**
     * 来料信息#异常信息
     */
    @TableField(value = "origin_abnormal_information")
    private String originAbnormalInformation;

    /**
     * 来料信息#处置要求
     */
    @TableField(value = "origin_disposal_requirements")
    private String originDisposalRequirements;

    /**
     * 第1次退火#入炉时间
     */
    @TableField(value = "annealing1_entrytime")
    private Date annealing1Entrytime;

    /**
     * 第1次退火#出炉时间
     */
    @TableField(value = "annealing1_exittime")
    private Date annealing1Exittime;

    /**
     * 第2次退火#入炉时间
     */
    @TableField(value = "annealing2_entrytime")
    private Date annealing2Entrytime;

    /**
     * 第2次退火#出炉时间
     */
    @TableField(value = "annealing2_exittime")
    private Date annealing2Exittime;

    /**
     * 第3次退火#入炉时间
     */
    @TableField(value = "annealing3_entrytime")
    private Date annealing3Entrytime;

    /**
     * 第3次退火#出炉时间
     */
    @TableField(value = "annealing3_exittime")
    private Date annealing3Exittime;

    /**
     * 记事#不合格事实描述
     */
    @TableField(value = "account_unqualified_fact")
    private String accountUnqualifiedFact;

    /**
     * 记事#不合格评审意见
     */
    @TableField(value = "account_unqualified_review")
    private String accountUnqualifiedReview;

    /**
     * 冷轧成品#全带长（m）
     */
    @TableField(value = "finished_fullband_length")
    private BigDecimal finishedFullbandLength;

    /**
     * 单项质检记录#卷径（mm）
     */
    @TableField(value = "single_roll_diameter")
    private BigDecimal singleRollDiameter;

    /**
     * 单项质检记录#卷重（kg）
     */
    @TableField(value = "single_roll_weight")
    private BigDecimal singleRollWeight;

    /**
     * 单项质检记录#楔形率（%）
     */
    @TableField(value = "single_wedge_ratio")
    private BigDecimal singleWedgeRatio;

    /**
     * 力学测定#带材种类  字典：带材种类
     */
    @TableField(value = "strip_type")
    private String stripType;

    /**
     * 力学测定#抗拉强度复检（Rm/MPa）
     */
    @TableField(value = "single_strength_re")
    private BigDecimal singleStrengthRe;

    /**
     * 力学测定#延伸率复检（%）
     */
    @TableField(value = "single_extension_re")
    private BigDecimal singleExtensionRe;

    /**
     * 力学测定#90°折弯性能要求  字典：bending_requirements
     */
    @TableField(value = "bending_performance_requirements")
    private String bendingPerformanceRequirements;

    /**
     * 力学测定#90°折弯性能复检  字典：bending_requirements
     */
    @TableField(value = "bending_performance_re")
    private String bendingPerformanceRe;

    /**
     * 力学测定#评审意见
     */
    @TableField(value = "mechanical_measure_review")
    private String mechanicalMeasureReview;

    /**
     * 重卷工序#头料异常甩除照片
     */
    @TableField(value = "head_abnormal_reject_picture")
    private String headAbnormalRejectPicture;

    /**
     * 重卷工序#头料异常甩除视频
     */
    @TableField(value = "head_abnormal_reject_vedio")
    private String headAbnormalRejectVedio;

    /**
     * 重卷工序#尾料异常甩除照片
     */
    @TableField(value = "tail_abnormal_reject_picture")
    private String tailAbnormalRejectPicture;

    /**
     * 重卷工序#尾料异常甩除视频
     */
    @TableField(value = "tail_abnormal_reject_vedio")
    private String tailAbnormalRejectVedio;

    /**
     * 重卷工序#外圈扒除异常甩除照片
     */
    @TableField(value = "outer_abnormal_reject_picture")
    private String outerAbnormalRejectPicture;

    /**
     * 优箔信息#厚度（mm）
     */
    @TableField(value = "weighing_thickness")
    private BigDecimal weighingThickness;

    /**
     * 优箔信息#中凸度（%）
     */
    @TableField(value = "weighing_convexity")
    private BigDecimal weighingConvexity;

    /**
     * 退火炉号
     */
    @TableField(value = "furnace_num")
    private String furnaceNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
