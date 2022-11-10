package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cold_rereeler_record
 */
@TableName(value ="lmdp_cold_rereeler_record")
@Data
public class LmdpColdRereelerRecord implements Serializable {
    /**
     * 
     */
    private String id;

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
    private String mainOperator;

    /**
     * 
     */
    private String assistantOperator;

    /**
     * 
     */
    private String workShift;

    /**
     * 
     */
    private String recordDate;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String productName;

    /**
     * 
     */
    private String reelNum;

    /**
     * 
     */
    private String originRegular;

    /**
     * 
     */
    private String batchNum;

    /**
     * 
     */
    private String processedRegular;

    /**
     * 
     */
    private String machineSpeed;

    /**
     * 
     */
    private String reelingTensileStress;

    /**
     * 
     */
    private String knifeGap;

    /**
     * 
     */
    private String originWeight;

    /**
     * 
     */
    private String processedWeight;

    /**
     * 
     */
    private String wasteMaterialHead;

    /**
     * 
     */
    private String wasteMaterialTail;

    /**
     * 
     */
    private String wasteMaterialElse;

    /**
     * 
     */
    private String quality;

    /**
     * 
     */
    private String result;

    /**
     * 
     */
    private String confirmer;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}