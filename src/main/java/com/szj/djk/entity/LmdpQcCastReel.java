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
     * 批号(铸轧卷号)
     */
    private String reelNum;

    /**
     * 规格
     */
    private String model;

    /**
     * 牌号
     */
    private String brand;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 化学成份
     */
    private String wt;

    /**
     * 铝熔体氢含量
     */
    private String hdaf;

    /**
     * 低倍组织
     */
    private String lpsSize;

    /**
     * 晶粒度
     */
    private String sampleLevel;

    /**
     * 高倍组织
     */
    private String hpsSize;

    /**
     * 高倍组织图片
     */
    private String hpsPicture;

    /**
     * 板形质量
     */
    private String shapeQc;

    /**
     * 厚度(mm)
     */
    private BigDecimal thickness;

    /**
     * 宽度(mm)
     */
    private BigDecimal width;

    /**
     * 表面质量
     */
    private String surfaceQc;

    /**
     * 外观质量
     */
    private String facadeQc;

    /**
     * 铸轧卷质量判定
结果
     */
    private String judgeResult;

    /**
     * 铸轧卷质量缺陷描述
     */
    private String judgeReamrk;

    /**
     * 主机速度
     */
    private BigDecimal hostSpeed;

    /**
     * 钛丝品牌
     */
    private String tiWireBrand;

    /**
     * 钛丝速度
     */
    private BigDecimal tiWireSpeed;

    /**
     * 下卷时间
     */
    private Date nextReelTime;

    /**
     * 处理意见
     */
    private String advise;

    /**
     * 质检员
     */
    private String inspectorId;

    /**
     * 日期及时间
     */
    private Date reportTime;

    /**
     * 晶粒度图片
     */
    private String sampleLevelPicture;

    /**
     * 低倍组织图片
     */
    private String lpsPicture;

    /**
     * 尺寸偏差
     */
    private String dimensionalDeviation;

    /**
     * 质检班长复核
     */
    private String inspectMonitorCheck;

    /**
     * 审核员
     */
    private String auditor;

    /**
     * 发评审建议
     */
    private String reviewAdvice;

    /**
     * 化学成分备注
     */
    private String wtRemark;

    /**
     * 铝熔体氢含量备注
     */
    private String hdafRemark;

    /**
     * 尺寸偏差备注
     */
    private String dimensionalDeviationRemark;

    /**
     * 低倍组织备注
     */
    private String lpsSizeRemark;

    /**
     * 高倍组织备注
     */
    private String hpsSizeRemark;

    /**
     * 板型质量备注
     */
    private String shapeQcRemark;

    /**
     * 表面质量备注
     */
    private String surfaceQcRemark;

    /**
     * 外观质量备注
     */
    private String facadeQcRemark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}