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
 * 冷轧卷质检报告
 * @TableName lmdp_qc_cold_reel_report
 */
@TableName(value ="lmdp_qc_cold_reel_report")
@Data
public class LmdpQcColdReelReport implements Serializable {
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
     * 序号
     */
    private Integer sortOrder;

    /**
     * 客户名称
     */
    private String consumer;

    /**
     * 冷轧卷号
     */
    private String batchNum;

    /**
     * 厚度
     */
    private BigDecimal thickness;

    /**
     * 宽度
     */
    private BigDecimal width;

    /**
     * 卷径
     */
    private BigDecimal rollDiameter;

    /**
     * 合金牌号
     */
    private String brand;

    /**
     * 状态
     */
    private String status;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 板形质量
     */
    private String shapeQc;

    /**
     * 尺寸偏差
     */
    private String dimensionalDeviation;

    /**
     * 力学性能
     */
    private String mechanicalProperty;

    /**
     * 表面质量
     */
    private String surfaceQc;

    /**
     * 外观质量
     */
    private String facadeQc;

    /**
     * 晶粒度
     */
    private String sampleLevel;

    /**
     * 执行标准
     */
    private String executiveStandard;

    /**
     * 综合判定
     */
    private String judgeResult;

    /**
     * 不合格处理意见
     */
    private String handleAdvice;

    /**
     * 质检员
     */
    private String inspector;

    /**
     * 班长
     */
    private String monitor;

    /**
     * 日期时间
     */
    private Date reportTime;

    /**
     * 处理意见
     */
    private String advise;

    /**
     * 冷轧日期
     */
    private Date coldDate;

    /**
     * 氢含量
     */
    private String hydrogenContent;

    /**
     * 产品类型
     */
    private String productType;

    /**
     * 中凸度%
     */
    private BigDecimal singleConvexity;

    /**
     * 楔形率%
     */
    private BigDecimal wedgeRate;

    /**
     * 厚度#称重法（mm）
     */
    private BigDecimal weighingThickness;

    /**
     * 中凸度#称重法%
     */
    private BigDecimal weighingConvexity;

    /**
     * 粗糙度（μm）
     */
    private BigDecimal roughness;

    /**
     * 板形质量备注
     */
    private String shapeQcRemark;

    /**
     * 尺寸偏差备注
     */
    private String dimensionalDeviationRemark;

    /**
     * 力学性能备注
     */
    private String mechanicalPropertyRemark;

    /**
     * 表面质量备注
     */
    private String surfaceQcRemark;

    /**
     * 外观质量备注
     */
    private String facadeQcRemark;

    /**
     * 晶粒度备注
     */
    private String sampleLevelRemark;

    /**
     * 发评审建议
     */
    private String reviewAdvice;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}