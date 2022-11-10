package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_qc_cast_reel
 */
@TableName(value ="lmdp_qc_cast_reel")
@Data
public class LmdpQcCastReel implements Serializable {
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
    private String reelNum;

    /**
     * 
     */
    private String model;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String weight;

    /**
     * 
     */
    private String wt;

    /**
     * 
     */
    private String hdaf;

    /**
     * 
     */
    private String lpsSize;

    /**
     * 
     */
    private String sampleLevel;

    /**
     * 
     */
    private String hpsSize;

    /**
     * 
     */
    private String hpsPicture;

    /**
     * 
     */
    private String shapeQc;

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
    private String surfaceQc;

    /**
     * 
     */
    private String facadeQc;

    /**
     * 
     */
    private String judgeResult;

    /**
     * 
     */
    private String judgeReamrk;

    /**
     * 
     */
    private String hostSpeed;

    /**
     * 
     */
    private String tiWireBrand;

    /**
     * 
     */
    private String tiWireSpeed;

    /**
     * 
     */
    private String nextReelTime;

    /**
     * 
     */
    private String advise;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}