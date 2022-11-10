package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cold_produce
 */
@TableName(value ="lmdp_cold_produce")
@Data
public class LmdpColdProduce implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String planId;

    /**
     * 
     */
    private String consumerName;

    /**
     * 
     */
    private String reelNum;

    /**
     * 
     */
    private String batchNum;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String productUse;

    /**
     * 
     */
    private String blankSize;

    /**
     * 
     */
    private String blankWeight;

    /**
     * 
     */
    private String deliveryDate;

    /**
     * 
     */
    private String productThick;

    /**
     * 
     */
    private String productWidth;

    /**
     * 
     */
    private String productStatus;

    /**
     * 
     */
    private String annealingThick;

    /**
     * 
     */
    private String coggingTime;

    /**
     * 
     */
    private String coggingGroupId;

    /**
     * 
     */
    private String coggingGroupName;

    /**
     * 
     */
    private String coggingWorkShift;

    /**
     * 
     */
    private String coggingOrder;

    /**
     * 
     */
    private String midRollTime;

    /**
     * 
     */
    private String midRollGroupId;

    /**
     * 
     */
    private String midRollGroupName;

    /**
     * 
     */
    private String midRollWorkShift;

    /**
     * 
     */
    private String midRollOrder;

    /**
     * 
     */
    private String midRollWeight;

    /**
     * 
     */
    private String planishTime;

    /**
     * 
     */
    private String planishGroupId;

    /**
     * 
     */
    private String planishGroupName;

    /**
     * 
     */
    private String planishWorkShift;

    /**
     * 
     */
    private String planishOrder;

    /**
     * 
     */
    private String coldProductWeight;

    /**
     * 
     */
    private String plateCut;

    /**
     * 
     */
    private String coldTailing26;

    /**
     * 
     */
    private String coldTailing6;

    /**
     * 
     */
    private String cutSpeed;

    /**
     * 
     */
    private String cutTime;

    /**
     * 
     */
    private String cutWorkShift;

    /**
     * 
     */
    private String cutGroupId;

    /**
     * 
     */
    private String cutGroupName;

    /**
     * 
     */
    private String cutSizeH;

    /**
     * 
     */
    private String cutSizeW;

    /**
     * 
     */
    private String recoilingWeight;

    /**
     * 
     */
    private String modelDesc;

    /**
     * 
     */
    private String produceStatus;

    /**
     * 
     */
    private String storageInTime;

    /**
     * 
     */
    private String storageInWeight;

    /**
     * 
     */
    private String reformPlanNum;

    /**
     * 
     */
    private String coldYield;

    /**
     * 
     */
    private String rereelYield;

    /**
     * 
     */
    private String offLineYield;

    /**
     * 
     */
    private String storageInYield;

    /**
     * 
     */
    private String rereelHeading;

    /**
     * 
     */
    private String rereelTailing;

    /**
     * 
     */
    private String heading;

    /**
     * 
     */
    private String headingReason;

    /**
     * 
     */
    private String tailing;

    /**
     * 
     */
    private String tailingReason;

    /**
     * 
     */
    private String headingWeight;

    /**
     * 
     */
    private String tailingWeight;

    /**
     * 
     */
    private String qcDesc;

    /**
     * 
     */
    private String qcId;

    /**
     * 
     */
    private String qcName;

    /**
     * 
     */
    private String sleeve;

    /**
     * 
     */
    private String hotRoll;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private String creatorId;

    /**
     * 
     */
    private String reviserId;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private String ts;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}