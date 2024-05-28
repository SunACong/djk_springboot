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
 * 冷轧卷力学性能测定记录
 * @TableName lmdp_qc_cold_mechanics_report
 */
@TableName(value ="lmdp_qc_cold_mechanics_report")
@Data
public class LmdpQcColdMechanicsReport implements Serializable {
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
     * 委托单号
     */
    private String entrustOrder;

    /**
     * 试样名称
     */
    private String sampleName;

    /**
     * 试验项目
     */
    private String sampleProject;

    /**
     * 委托单位
     */
    private String entrustOrg;

    /**
     * 日期时间
     */
    private Date entrustTime;

    /**
     * 冷轧卷号
     */
    private String batchNum;

    /**
     * 规格
     */
    private String model;

    /**
     * 样号1
     */
    private String sample1Num;

    /**
     * 样宽1（mm）
     */
    private BigDecimal sample1Width;

    /**
     * 样厚1（mm）
     */
    private BigDecimal sample1Thickness;

    /**
     * 抗拉强度1（Rm/MPa）
     */
    private BigDecimal sample1Strength;

    /**
     * 伸长率1(A50mm/%)
     */
    private BigDecimal sample1Extension;

    /**
     * 样号2
     */
    private String sample2Num;

    /**
     * 样宽2（mm）
     */
    private BigDecimal sample2Width;

    /**
     * 样厚2（mm）
     */
    private BigDecimal sample2Thickness;

    /**
     * 抗拉强度2（Rm/MPa）
     */
    private BigDecimal sample2Strength;

    /**
     * 伸长率2(A50mm/%)
     */
    private BigDecimal sample2Extension;

    /**
     * 样号3
     */
    private String sample3Num;

    /**
     * 样宽3（mm）
     */
    private BigDecimal sample3Width;

    /**
     * 样厚3（mm）
     */
    private BigDecimal sample3Thickness;

    /**
     * 抗拉强度3（Rm/MPa）
     */
    private BigDecimal sample3Strength;

    /**
     * 伸长率3(A50mm/%)
     */
    private BigDecimal sample3Extension;

    /**
     * 抗拉强度平均值
     */
    private BigDecimal avgStrength;

    /**
     * 伸长率平均值
     */
    private BigDecimal avgExtension;

    /**
     * 抗拉强度修正结果
     */
    private String correctStrength;

    /**
     * 伸长率修正结果
     */
    private String correctExtension;

    /**
     * 备注
     */
    private String remark;

    /**
     * 理化分析员
     */
    private String analyst;

    /**
     * 报告日期
     */
    private Date reportTime;

    /**
     * 样本类型
     */
    private String sampleType;

    /**
     * 复检分类
     */
    private String recheckClassification;

    /**
     * 分析结果
     */
    private String judgeResult;

    /**
     * ①号样#上板面#晶粒度级别#单位(mm)字典(晶粒度等级grain_size)
     */
    private String grainSize1Up;

    /**
     * ①号#下板面#晶粒度级别#单位(mm)字典(晶粒度等级grain_size)
     */
    private String grainSize1Down;

    /**
     * 样宽4（mm）
     */
    private BigDecimal sample4Width;

    /**
     * 样厚4（mm）
     */
    private BigDecimal sample4Thickness;

    /**
     * 抗拉强度4（Rm/MPa）
     */
    private BigDecimal sample4Strength;

    /**
     * 伸长率4(A50mm/%)
     */
    private BigDecimal sample4Extension;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}