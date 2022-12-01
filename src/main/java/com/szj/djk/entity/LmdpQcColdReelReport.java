package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName lmdp_qc_cold_reel_report
 */
@TableName(value ="lmdp_qc_cold_reel_report")
@Data
public class LmdpQcColdReelReport implements Serializable {
    /**
     * ID
     */
    @TableId
    private String id;

    /**
     * 数据来源
     */
    private String datasourceOrgcode;

    /**
     * 数据时间
     */
    private Date datatime;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 数据ID
     */
    private String dataId;

    /**
     * 入库时间
     */
    private Date enterTime;

    /**
     * 上传区域
     */
    private String uploadAreacode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date ts;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 序号
     */
    private String sortOrder;

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
    private Double thickness;

    /**
     * 宽度
     */
    private Double width;

    /**
     * 卷径
     */
    private Double rollDiameter;

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
    private Double weight;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}