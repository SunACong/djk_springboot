package com.szj.djk.ssc.entity;

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
    @TableId
    private String id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *
     */
    private Date ts;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 计划编号
     */
    private String planNum;

    /**
     * 客户名称
     */
    private String consumer;

    /**
     * 产品用途
     */
    private String productUse;

    /**
     * 批号（冷轧卷号）
     */
    private String batchNum;

    /**
     * 合金牌号
     */
    private String brand;

    /**
     * 成品状态
     */
    private String status;

    /**
     * 成品规格
     */
    private String model;

    /**
     * 成品卷径
     */
    private String rollDiameter;

    /**
     * 是否剖分卷（废弃）
     */
    private String splitFlag;

    /**
     * 入口厚度
     */
    private BigDecimal cold1ThickIn;

    /**
     * 出口厚度
     */
    private BigDecimal cold1ThickOut;

    /**
     * 备注
     */
    private String cold1Remark;

    /**
     * 抽查照片
     */
    private String cold1Picture;

    /**
     * 质检员
     */
    private String cold1Inspector;

    /**
     * 轧制时间
     */
    private Date cold1Time;

    /**
     * 入口厚度
     */
    private BigDecimal cold2ThickIn;

    /**
     * 出口厚度
     */
    private BigDecimal cold2ThickOut;

    /**
     * 备注
     */
    private String cold2Remark;

    /**
     * 抽查照片
     */
    private String cold2Picture;

    /**
     * 质检员
     */
    private String cold2Inspector;

    /**
     * 轧制时间
     */
    private Date cold2Time;

    /**
     * 入口厚度
     */
    private BigDecimal cold3ThickIn;

    /**
     * 出口厚度
     */
    private BigDecimal cold3ThickOut;

    /**
     * 备注
     */
    private String cold3Remark;

    /**
     * 抽查照片
     */
    private String cold3Picture;

    /**
     * 质检员
     */
    private String cold3Inspector;

    /**
     * 轧制时间
     */
    private Date cold3Time;

    /**
     * 入口厚度
     */
    private BigDecimal cold4ThickIn;

    /**
     * 出口厚度
     */
    private BigDecimal cold4ThickOut;

    /**
     * 备注
     */
    private String cold4Remark;

    /**
     * 抽查照片
     */
    private String cold4Picture;

    /**
     * 质检员
     */
    private String cold4Inspector;

    /**
     * 轧制时间
     */
    private Date cold4Time;

    /**
     * 入口厚度
     */
    private BigDecimal cold5ThickIn;

    /**
     * 出口厚度
     */
    private BigDecimal cold5ThickOut;

    /**
     * 备注
     */
    private String cold5Remark;

    /**
     * 抽查照片
     */
    private String cold5Picture;

    /**
     * 质检员
     */
    private String cold5Inspector;

    /**
     * 轧制时间
     */
    private Date cold5Time;

    /**
     * 第1次退火#工艺符合性
     */
    private String annealing1Workmanship;

    /**
     * 第2次退火#工艺符合性
     */
    private String annealing2Workmanship;

    /**
     * 第3次退火#工艺符合性
     */
    private String annealing3Workmanship;

    /**
     * 来料信息#卷号
     */
    private String reelNum;

    /**
     * 第1次切边#厚度
     */
    private BigDecimal thickness;

    /**
     * 第1次切边#来料宽度
     */
    private BigDecimal originWidth;

    /**
     * 第1次切边#切后宽度
     */
    private BigDecimal width;

    /**
     * 第1次切边#头料
     */
    private String headStock;

    /**
     * 第1次切边#甩除原因
     */
    private String headRejectReason;

    /**
     * 第1次切边#尾料
     */
    private String tailStock;

    /**
     * 第1次切边#甩除原因
     */
    private String tailRejectReason;

    /**
     * 第1次切边#外圈扒除
     */
    private String outerRemove;

    /**
     * 第1次切边#扒除原因
     */
    private String removeReason;

    /**
     * 第1次切边#切后重量（废弃）
     */
    private BigDecimal cutWeight;

    /**
     * 第1次切边#横向厚度（废弃）
     */
    private BigDecimal transverseThickness;

    /**
     * 第1次切边#纵向厚度（废弃）
     */
    private BigDecimal longitudinalThickness;

    /**
     * 第1次切边#质检员（废弃）
     */
    private String cutInspector;

    /**
     * 第1次切边#时间（废弃）
     */
    private Date cutTime;

    /**
     * 第1次切边#观察照片（废弃）
     */
    private Date cutPicture;

    /**
     * 单项质检记录#厚度（mm)
     */
    private BigDecimal singleHeight;

    /**
     * 单项质检记录#宽度（mm)
     */
    private BigDecimal singleWidth;

    /**
     * 单项质检记录#中凸度(%)
     */
    private BigDecimal singleMediumConvexity;

    /**
     * 单项质检记录#平直度(I)
     */
    private BigDecimal singleStraightness;

    /**
     * 单项质检记录#抗拉强度(Rm/MPa)
     */
    private BigDecimal singleStrength;

    /**
     * 单项质检记录#延伸率(%)
     */
    private BigDecimal singleExtension;

    /**
     * 单项质检记录#晶粒度
     */
    private String singleGrainSize;

    /**
     * 单项质检记录#粗糙度
     */
    private String singleRoughness;

    /**
     * 单项质检记录#表面质量是否合格
     */
    private String surfaceQuality;

    /**
     * 单项质检记录#表面质量描述
     */
    private String surfaceQualityRemark;

    /**
     * 单项质检记录#外观质量是否合格
     */
    private String appearanceQuality;

    /**
     * 单项质检记录#外观质量描述
     */
    private String appearanceQualityRemark;

    /**
     * 记事#坯料厚度
     */
    private BigDecimal accountOriginThickness;

    /**
     * 记事#坯料宽度
     */
    private BigDecimal accountOriginWidth;

    /**
     * 记事#坯料重量
     */
    private BigDecimal accountOriginWeight;

    /**
     * 冷轧成品#厚度
     */
    private BigDecimal finishedThickness;

    /**
     * 冷轧成品#宽度
     */
    private BigDecimal finishedWidth;

    /**
     * 冷轧成品#卷径
     */
    private BigDecimal finishedRollDiameter;

    /**
     * 冷轧成品#重量
     */
    private BigDecimal finishedWeight;

    /**
     * 冷轧成品#外圈扒除
     */
    private String finishedOuterRemove;

    /**
     * 冷轧成品#扒除原因
     */
    private String finishedRemoveReason;

    /**
     * 冷轧成品#横向厚度
     */
    private BigDecimal finishedTransverseThickness;

    /**
     * 冷轧成品#纵向厚度
     */
    private BigDecimal finishedLongitudinalThickness;

    /**
     * 冷轧成品#厚差记录
     */
    private String finishedThicknessDifference;

    /**
     * 冷轧计划厚度(mm)（废弃）
     */
    private String endwiseHeight;

    /**
     * 冷轧计划宽度(mm)（废弃）
     */
    private String warpWidth;

    /**
     * 冷轧计划中凸度（废弃）
     */
    private String convexRate;

    /**
     * 冷轧计划平直度（废弃）
     */
    private String flatness;

    /**
     * 冷轧计划抗拉强度ob/Mpa（废弃）
     */
    private String tensileStrength;

    /**
     * 冷轧计划延伸率（废弃）
     */
    private String elongation;

    /**
     * 冷轧计划晶粒度（废弃）
     */
    private String grain;

    /**
     * 冷轧计划坯料表面粗糙度（废弃）
     */
    private String roughness;

    /**
     * 冷轧成品#厚差曲线图
     */
    private String finishedThicknessDifferencePicture;

    /**
     * 入口厚度（mm）
     */
    private BigDecimal cold6ThickIn;

    /**
     * 出口厚度（mm）
     */
    private BigDecimal cold6ThickOut;

    /**
     * 备注
     */
    private String cold6Remark;

    /**
     * 抽查照片
     */
    private String cold6Picture;

    /**
     * 质检员
     */
    private String cold6Inspector;

    /**
     * 轧制时间
     */
    private Date cold6Time;

    /**
     * 铸坯异常信息（废弃）
     */
    private String castAbnormalInfo;

    /**
     * 后续轧制工作安排（废弃）
     */
    private String rollPlan;

    /**
     * 每日生产和质量异常#第一道冷轧工序
     */
    private String cold1DailyQcSituation;

    /**
     * 每日生产和质量异常#第二道冷轧工序
     */
    private String cold2DailyQcSituation;

    /**
     * 每日生产和质量异常#第三道冷轧工序
     */
    private String cold3DailyQcSituation;

    /**
     * 每日生产和质量异常#第四道冷轧工序
     */
    private String cold4DailyQcSituation;

    /**
     * 每日生产和质量异常#第五道冷轧工序
     */
    private String cold5DailyQcSituation;

    /**
     * 每日生产和质量异常#第六道冷轧工序
     */
    private String cold6DailyQcSituation;

    /**
     * 每日生产和质量异常#第一次退火工序
     */
    private String furnace1DailyQcSituation;

    /**
     * 每日生产和质量异常#第二次退火工序
     */
    private String furnace2DailyQcSituation;

    /**
     * 每日生产和质量异常#第三次退火工序
     */
    private String furnace3DailyQcSituation;

    /**
     * 每日生产和质量异常#重卷工序（废弃）
     */
    private String reelerDailyQcSituation;

    /**
     * 第1次退火#质检员
     */
    private String annealing1Inspector;

    /**
     * 第2次退火#质检员
     */
    private String annealing2Inspector;

    /**
     * 第3次退火#质检员
     */
    private String annealing3Inspector;

    /**
     * 第1次退火#退火厚度（mm）
     */
    private BigDecimal annealing1Thick;

    /**
     * 第2次退火#退火厚度（mm）
     */
    private BigDecimal annealing2Thick;

    /**
     * 第3次退火#退火厚度（mm）
     */
    private BigDecimal annealing3Thick;

    /**
     * 退火炉号
     */
    private String furnaceNum;

    /**
     * 卷重要求
     */
    private String rollweightRequirements;

    /**
     * 来料信息#卷径（mm）
     */
    private BigDecimal originRollDiameter;

    /**
     * 来料信息#异常信息
     */
    private String originAbnormalInformation;

    /**
     * 来料信息#处置要求
     */
    private String originDisposalRequirements;

    /**
     * 第1次退火#入炉时间
     */
    private Date annealing1Entrytime;

    /**
     * 第1次退火#出炉时间
     */
    private Date annealing1Exittime;

    /**
     * 第2次退火#入炉时间
     */
    private Date annealing2Entrytime;

    /**
     * 第2次退火#出炉时间
     */
    private Date annealing2Exittime;

    /**
     * 第3次退火#入炉时间
     */
    private Date annealing3Entrytime;

    /**
     * 第3次退火#出炉时间
     */
    private Date annealing3Exittime;

    /**
     * 记事#不合格事实描述
     */
    private String accountUnqualifiedFact;

    /**
     * 记事#不合格评审意见
     */
    private String accountUnqualifiedReview;

    /**
     * 冷轧成品#全带长（m）
     */
    private BigDecimal finishedFullbandLength;

    /**
     * 单项质检记录#卷径
     */
    private BigDecimal singleRollDiameter;

    /**
     * 单项质检记录#卷重
     */
    private BigDecimal singleRollWeight;

    /**
     * 单项质检记录#楔形率
     */
    private BigDecimal singleWedgeRatio;

    /**
     * 力学测定#带材种类  字典：带材种类
     */
    private String stripType;

    /**
     * 力学测定#抗拉强度复检（Rm/MPa）
     */
    private BigDecimal singleStrengthRe;

    /**
     * 力学测定#延伸率复检（%）
     */
    private BigDecimal singleExtensionRe;

    /**
     * 力学测定#90°折弯性能要求  字典：bending_requirements
     */
    private String bendingPerformanceRequirements;

    /**
     * 力学测定#90°折弯性能复检  字典：bending_requirements
     */
    private String bendingPerformanceRe;

    /**
     * 力学测定#评审意见
     */
    private String mechanicalMeasureReview;

    /**
     * 重卷工序#头料异常甩除照片
     */
    private String headAbnormalRejectPicture;

    /**
     * 重卷工序#头料异常甩除视频
     */
    private String headAbnormalRejectVedio;

    /**
     * 重卷工序#尾料异常甩除照片
     */
    private String tailAbnormalRejectPicture;

    /**
     * 重卷工序#尾料异常甩除视频
     */
    private String tailAbnormalRejectVedio;

    /**
     * 重卷工序#外圈扒除异常甩除照片
     */
    private String outerAbnormalRejectPicture;

    /**
     * 优箔信息#厚度（mm）
     */
    private BigDecimal weighingThickness;

    /**
     * 优箔信息#中凸度（%）
     */
    private BigDecimal weighingConvexity;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
