package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.szj.djk.common.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 冷轧卷质检报告
 * @TableName lmdp_qc_cold_reel_report
 */
@TableName(value ="lmdp_qc_cold_reel_report")
@Data
public class LmdpQcColdReelReport extends BaseEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
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
     * 质检员判定
     */
    @TableField(value = "inspector_judge")
    private String inspectorJudge;

    /**
     * 序号
     */
    @TableField(value = "sort_order")
    private Integer sortOrder;

    /**
     * 客户名称
     */
    @TableField(value = "consumer")
    private String consumer;

    /**
     * 冷轧卷号
     */
    @TableField(value = "batch_num")
    private String batchNum;

    /**
     * 厚度
     */
    @TableField(value = "thickness")
    private BigDecimal thickness;

    /**
     * 宽度
     */
    @TableField(value = "width")
    private BigDecimal width;

    /**
     * 卷径
     */
    @TableField(value = "roll_diameter")
    private BigDecimal rollDiameter;

    /**
     * 合金牌号
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 状态
     */
    @TableField(value = "status")
    private String status;

    /**
     * 重量
     */
    @TableField(value = "weight")
    private BigDecimal weight;

    /**
     * 板形质量
     */
    @TableField(value = "shape_qc")
    private String shapeQc;

    @TableField(value = "comprehensive_judge")
    private String comprehensiveJudge;

    /**
     * 尺寸偏差
     */
    @TableField(value = "dimensional_deviation")
    private String dimensionalDeviation;

    /**
     * 力学性能
     */
    @TableField(value = "mechanical_property")
    private String mechanicalProperty;

    /**
     * 表面质量
     */
    @TableField(value = "surface_qc")
    private String surfaceQc;

    /**
     * 外观质量
     */
    @TableField(value = "facade_qc")
    private String facadeQc;

    /**
     * 晶粒度
     */
    @TableField(value = "sample_level")
    private String sampleLevel;

    /**
     * 执行标准
     */
    @TableField(value = "executive_standard")
    private String executiveStandard;

    /**
     * 综合判定
     */
    @TableField(value = "judge_result")
    private String judgeResult;

    /**
     * 不合格处理意见
     */
    @TableField(value = "handle_advice")
    private String handleAdvice;

    /**
     * 质检员
     */
    @TableField(value = "inspector")
    private String inspector;

    /**
     * 班长
     */
    @TableField(value = "monitor")
    private String monitor;

    /**
     * 日期时间
     */
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    @TableField(value = "report_time")
    private Date reportTime;

    /**
     * 处理意见
     */
    @TableField(value = "advise")
    private String advise;

    /**
     * 粗糙度（μm）
     */
    @TableField(value = "roughness")
    private BigDecimal roughness;

    /**
     * 中凸度%
     */
    @TableField(value = "single_convexity")
    private BigDecimal singleConvexity;

    /**
     * 楔形率%
     */
    @TableField(value = "wedge_rate")
    private BigDecimal wedgeRate;

    /**
     * 厚度#称重法（mm）
     */
    @TableField(value = "weighing_thickness")
    private BigDecimal weighingThickness;

    /**
     * 中凸度#称重法%
     */
    @TableField(value = "weighing_convexity")
    private BigDecimal weighingConvexity;

    /**
     * 板形质量备注
     */
    @TableField(value = "shape_qc_remark")
    private String shapeQcRemark;

    /**
     * 尺寸偏差备注
     */
    @TableField(value = "dimensional_deviation_remark")
    private String dimensionalDeviationRemark;

    /**
     * 力学性能备注
     */
    @TableField(value = "mechanical_property_remark")
    private String mechanicalPropertyRemark;

    /**
     * 表面质量备注
     */
    @TableField(value = "surface_qc_remark")
    private String surfaceQcRemark;

    /**
     * 外观质量备注
     */
    @TableField(value = "facade_qc_remark")
    private String facadeQcRemark;

    /**
     * 晶粒度备注
     */
    @TableField(value = "sample_level_remark")
    private String sampleLevelRemark;

    /**
     * 发评审建议，字典：review_advice
     */
    @TableField(value = "review_advice")
    private String reviewAdvice;

    /**
     * 冷轧日期
     */
    @TableField(value = "cold_date")
    private Date coldDate;

    /**
     * 产品类型
     */
    @TableField(value = "product_type")
    private String productType;

    /**
     * 氢含量
     */
    @TableField(value = "hydrogen_content")
    private String hydrogenContent;

    /**
     * 计划表
     */
    @TableField(exist = false)
    private SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip;

    /**
     * 巡检表
     */
    @TableField(exist = false)
    private LmdpQcColdInspect lmdpQcColdInspect;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}