package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_qc_cold_reel_report
 */
@TableName(value ="lmdp_qc_cold_reel_report")
@Data
public class LmdpQcColdReelReport implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private String ts;

    /**
     * 
     */
    private String creatorId;

    /**
     * 
     */
    private String sortOrder;

    /**
     * 
     */
    private String consumer;

    /**
     * 
     */
    private String batchNum;

    /**
     * 
     */
    private String thickness;

    /**
     * 
     */
    private String width;

    /**
     * 
     */
    private String rollDiameter;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String weight;

    /**
     * 
     */
    private String shapeQc;

    /**
     * 
     */
    private String dimensionalDeviation;

    /**
     * 
     */
    private String mechanicalProperty;

    /**
     * 
     */
    private String surfaceQc;

    /**
     * 
     */
    private String facadeQc;

    /**
     * 
     */
    private String sampleLevel;

    /**
     * 
     */
    private String executiveStandard;

    /**
     * 
     */
    private String judgeResult;

    /**
     * 
     */
    private String handleAdvice;

    /**
     * 
     */
    private String inspector;

    /**
     * 
     */
    private String monitor;

    /**
     * 
     */
    private String reportTime;

    /**
     * 
     */
    private String advise;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}