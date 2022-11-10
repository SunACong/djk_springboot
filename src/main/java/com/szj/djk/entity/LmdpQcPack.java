package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_qc_pack
 */
@TableName(value ="lmdp_qc_pack")
@Data
public class LmdpQcPack implements Serializable {
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
    private String batchNum;

    /**
     * 
     */
    private String model;

    /**
     * 
     */
    private String alloyStatus;

    /**
     * 
     */
    private String rollDiameter;

    /**
     * 
     */
    private String weight;

    /**
     * 
     */
    private String sample;

    /**
     * 
     */
    private String cert;

    /**
     * 
     */
    private String productCcie;

    /**
     * 
     */
    private String packageQc;

    /**
     * 
     */
    private String outerLabel;

    /**
     * 
     */
    private String packageTime;

    /**
     * 
     */
    private String inspectorId;

    /**
     * 
     */
    private String reportTime;

    /**
     * 
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}