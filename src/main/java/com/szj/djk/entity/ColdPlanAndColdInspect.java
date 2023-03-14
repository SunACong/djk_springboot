package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @TableName cold_plan_and_cold_inspect
 */
@TableName(value ="cold_plan_and_cold_inspect")
@Data
public class ColdPlanAndColdInspect implements Serializable {
    /**
     * 批号（冷轧卷号）
     */
    @TableId
    private String batchNum;

    /**
     * 计划编号
     */
    private String planNum;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date ts;

    /**
     * 客户名称
     */
    private String consumer;

    /**
     * 产品用途
     */
    private String productUse;

    /**
     * 成品规格
     */
    private String model;

    /**
     * 成品卷径
     */
    private String rollDiameter;

    /**
     * 来料信息#卷号
     */
    private String reelNum;

    /**
     * 单项质检记录#厚度（mm)
     */
    private Double singleHeight;

    /**
     * 单项质检记录#宽度（mm)
     */
    private Double singleWidth;

    /**
     * 单项质检记录#中凸度(%)
     */
    private Double singleMediumConvexity;

    /**
     * 单项质检记录#平直度(I)
     */
    private Double singleStraightness;

    /**
     * 单项质检记录#抗拉强度(Rm/MPa)
     */
    private Double singleStrength;

    /**
     * 单项质检记录#延伸率(%)
     */
    private Double singleExtension;

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
     * 冷轧成品#厚度
     */
    private Double finishedThickness;

    /**
     * 冷轧成品#宽度
     */
    private Double finishedWidth;

    /**
     * 冷轧成品#卷径
     */
    private Double finishedRollDiameter;

    /**
     * 冷轧成品#重量
     */
    private Double finishedWeight;

    /**
     * 冷轧成品#横向厚度
     */
    private Double finishedTransverseThickness;

    /**
     * 冷轧成品#纵向厚度
     */
    private Double finishedLongitudinalThickness;

    /**
     * 冷轧成品#厚差记录
     */
    private String finishedThicknessDifference;

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
    private Double finishedFullbandLength;

    /**
     * 单项质检记录#卷径（mm）
     */
    private Double singleRollDiameter;

    /**
     * 单项质检记录#卷重（kg）
     */
    private Double singleRollWeight;

    /**
     * 单项质检记录#楔形率（%）
     */
    private Double singleWedgeRatio;

    /**
     * 力学测定#带材种类  字典：带材种类
     */
    private String stripType;

    /**
     * 力学测定#抗拉强度复检（Rm/MPa）
     */
    private Double singleStrengthRe;

    /**
     * 力学测定#延伸率复检（%）
     */
    private Double singleExtensionRe;

    /**
     * 力学测定#90°折弯性能要求  字典：bending_requirements
     */
    private String bendingPerformanceRequirements;

    /**
     * 力学测定#90°折弯性能复检  字典：bending_requirements
     */
    private String bendingPerformanceRe;

    /**
     * 力学测定#评审意见
     */
    private String mechanicalMeasureReview;

    /**
     * 成品管芯材质
     */
    private String productQuality;

    /**
     * 成品卷径范围(mm)
     */
    private String productArea;

    /**
     * 单卷重量(吨)
     */
    private String sSingleHeight;

    /**
     * 抗拉强度ob/Mpa
     */
    private String tensileStrength;

    /**
     * 延伸率
     */
    private String elongation;

    /**
     * 折弯性能
     */
    private String bendingPerformance;

    /**
     * 纵向厚度偏差mm
     */
    private String endwiseHeight;

    /**
     * 宽度偏差mm
     */
    private String warpWidth;

    /**
     * 凸面率%
     */
    private String convexRate;

    /**
     * 产品外观质量及轧制要求
     */
    private String appearanceReq;

    /**
     * 平直度
     */
    private String flatness;

    /**
     * 楔形率%
     */
    private String wedge;

    /**
     * 同板差
     */
    private String same;

    /**
     * 坯料表面粗糙度
     */
    private String roughness;

    /**
     * 卷材端面串层
     */
    private String stringLayer;

    /**
     * 卷材端面塔
     */
    private String dagoba;

    /**
     * 卷端面其他要求
     */
    private String otherrequirement;

    /**
     * 执行标准
     */
    private String dataName;

    /**
     * 板型判定
     */
    private Integer plateTypeDetermination;

    /**
     * 力学性能判定
     */
    private Integer mechanicalPropertiesDetermination;

    /**
     * 尺寸偏差判定
     */
    private Integer dimensionalDeviationDetermination;

    /**
     * 表面质量判定
     */
    private Integer surfaceQualityDetermination;

    /**
     * 外观质量判定
     */
    private Integer appearanceQualityDetermination;

    /**
     * 开始判定日期
     */
    private Date determinationCreateTime;

    /**
     * 更新判定日期
     */
    private Date determinationUpdateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
