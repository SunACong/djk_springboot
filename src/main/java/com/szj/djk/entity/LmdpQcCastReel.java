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
 * 铸轧卷质检报告单
 * @TableName lmdp_qc_cast_reel
 */
@TableName(value ="lmdp_qc_cast_reel")
@Data
public class LmdpQcCastReel implements Serializable {
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
     * 批号(铸轧卷号)
     */
    @TableField(value = "reel_num")
    private String reelNum;

    /**
     * 规格
     */
    @TableField(value = "model")
    private String model;

    /**
     * 牌号
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 重量
     */
    @TableField(value = "weight")
    private BigDecimal weight;

    /**
     * 化学成份
     */
    @TableField(value = "wt")
    private String wt;

    /**
     * 铝熔体氢含量
     */
    @TableField(value = "hdaf")
    private String hdaf;

    /**
     * 低倍组织
     */
    @TableField(value = "lps_size")
    private String lpsSize;

    /**
     * 晶粒度
     */
    @TableField(value = "sample_level")
    private String sampleLevel;

    /**
     * 高倍组织
     */
    @TableField(value = "hps_size")
    private String hpsSize;

    /**
     * 高倍组织图片
     */
    @TableField(value = "hps_picture")
    private String hpsPicture;

    /**
     * 板形质量
     */
    @TableField(value = "shape_qc")
    private String shapeQc;

    /**
     * 厚度(mm)
     */
    @TableField(value = "thickness")
    private BigDecimal thickness;

    /**
     * 宽度(mm)
     */
    @TableField(value = "width")
    private BigDecimal width;

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
     * 铸轧卷质量判定
结果
     */
    @TableField(value = "judge_result")
    private String judgeResult;

    /**
     * 铸轧卷质量缺陷描述
     */
    @TableField(value = "judge_reamrk")
    private String judgeReamrk;

    /**
     * 主机速度
     */
    @TableField(value = "host_speed")
    private BigDecimal hostSpeed;

    /**
     * 钛丝品牌
     */
    @TableField(value = "ti_wire_brand")
    private String tiWireBrand;

    /**
     * 钛丝速度
     */
    @TableField(value = "ti_wire_speed")
    private BigDecimal tiWireSpeed;

    /**
     * 下卷时间
     */
    @TableField(value = "next_reel_time")
    private Date nextReelTime;

    /**
     * 处理意见
     */
    @TableField(value = "advise")
    private String advise;

    /**
     * 质检员
     */
    @TableField(value = "inspector_id")
    private String inspectorId;

    /**
     * 日期及时间
     */
    @TableField(value = "report_time")
    private Date reportTime;

    /**
     * 晶粒度图片
     */
    @TableField(value = "sample_level_picture")
    private String sampleLevelPicture;

    /**
     * 低倍组织图片
     */
    @TableField(value = "lps_picture")
    private String lpsPicture;

    /**
     * 尺寸偏差
     */
    @TableField(value = "dimensional_deviation")
    private String dimensionalDeviation;

    /**
     * 质检班长复核
     */
    @TableField(value = "inspect_monitor_check")
    private String inspectMonitorCheck;

    /**
     * 发评审建议
     */
    @TableField(value = "review_advice")
    private String reviewAdvice;

    /**
     * 化学成分备注
     */
    @TableField(value = "wt_remark")
    private String wtRemark;

    /**
     * 铝熔体氢含量备注
     */
    @TableField(value = "hdaf_remark")
    private String hdafRemark;

    /**
     * 尺寸偏差备注
     */
    @TableField(value = "dimensional_deviation_remark")
    private String dimensionalDeviationRemark;

    /**
     * 低倍组织备注
     */
    @TableField(value = "lps_size_remark")
    private String lpsSizeRemark;

    /**
     * 高倍组织备注
     */
    @TableField(value = "hps_size_remark")
    private String hpsSizeRemark;

    /**
     * 板型质量备注
     */
    @TableField(value = "shape_qc_remark")
    private String shapeQcRemark;

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
     * 审核员
     */
    @TableField(value = "auditor")
    private String auditor;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}