package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cast_smelt_hold
 */
@TableName(value ="lmdp_cast_smelt_hold")
@Data
public class LmdpCastSmeltHold implements Serializable {
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
    private String smeltTimes;

    /**
     * 
     */
    private String heatNum;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String feedTime;

    /**
     * 
     */
    private String feedGroupId;

    /**
     * 
     */
    private String feedGroupName;

    /**
     * 
     */
    private String gasPrepValue;

    /**
     * 
     */
    private String stuffAlPig;

    /**
     * 
     */
    private String stuffCastReel;

    /**
     * 
     */
    private String stuffBig;

    /**
     * 
     */
    private String stuffColdThick;

    /**
     * 
     */
    private String stuffColdThin;

    /**
     * 
     */
    private String stuffAlSlag;

    /**
     * 
     */
    private String stuffSampleSlag;

    /**
     * 
     */
    private String stuffTrim;

    /**
     * 
     */
    private String stuffOtherName;

    /**
     * 
     */
    private String stuffOtherWeight;

    /**
     * 
     */
    private String stuffAlGroupId;

    /**
     * 
     */
    private String stuffAlGroupName;

    /**
     * 
     */
    private String stuffAlWeight;

    /**
     * 
     */
    private String stuffTotalWeight;

    /**
     * 
     */
    private String stuffStlRatio;

    /**
     * 
     */
    private String firingTime;

    /**
     * 
     */
    private String forkliftStirTime1;

    /**
     * 
     */
    private String forkliftStirTime2;

    /**
     * 
     */
    private String forkliftStirTime3;

    /**
     * 
     */
    private String forkliftGroupId;

    /**
     * 
     */
    private String forkliftGroupName;

    /**
     * 
     */
    private String forkliftDriverId;

    /**
     * 
     */
    private String forkliftDriverName;

    /**
     * 
     */
    private String drossingTime;

    /**
     * 
     */
    private String drossingTemp;

    /**
     * 
     */
    private String prepSamplingTime;

    /**
     * 
     */
    private String prepSamplingTemp;

    /**
     * 
     */
    private String alloyRefine1AddTime;

    /**
     * 
     */
    private String alloyRefine1Fe;

    /**
     * 
     */
    private String alloyRefine1Si;

    /**
     * 
     */
    private String alloyRefine1AlSi;

    /**
     * 
     */
    private String alloyRefine1Cu;

    /**
     * 
     */
    private String alloyRefine1Mn;

    /**
     * 
     */
    private String alloyRefine1AlTi;

    /**
     * 
     */
    private String alloyRefine1OtherName;

    /**
     * 
     */
    private String alloyRefine1OtherDose;

    /**
     * 
     */
    private String alloyRefine1SmeltGroupId;

    /**
     * 
     */
    private String alloyRefine1SmeltGroupName;

    /**
     * 
     */
    private String alloyRefine1SmelterId;

    /**
     * 
     */
    private String alloyRefine1SmelterName;

    /**
     * 
     */
    private String mimRefine1BeginTime;

    /**
     * 
     */
    private String mimRefine1EndTime;

    /**
     * 
     */
    private String mimRefine1Temp;

    /**
     * 
     */
    private String mimRefine1Medium;

    /**
     * 
     */
    private String mimRefine1Dose;

    /**
     * 
     */
    private String mimRefine1GroupId;

    /**
     * 
     */
    private String mimRefine1GroupName;

    /**
     * 
     */
    private String mimRefine1SmelterId;

    /**
     * 
     */
    private String mimRefine1SmelterName;

    /**
     * 
     */
    private String refine1SamplingTime;

    /**
     * 
     */
    private String refine1SamplingTemp;

    /**
     * 
     */
    private String refine1RatioGroupId;

    /**
     * 
     */
    private String refine1RatioGroupName;

    /**
     * 
     */
    private String alloyRefine2AddTime;

    /**
     * 
     */
    private String alloyRefine2Fe;

    /**
     * 
     */
    private String alloyRefine2Si;

    /**
     * 
     */
    private String alloyRefine2AlSi;

    /**
     * 
     */
    private String alloyRefine2Cu;

    /**
     * 
     */
    private String alloyRefine2Mn;

    /**
     * 
     */
    private String alloyRefine2AlTi;

    /**
     * 
     */
    private String alloyRefine2OtherName;

    /**
     * 
     */
    private String alloyRefine2OtherDose;

    /**
     * 
     */
    private String alloyRefine2GroupId;

    /**
     * 
     */
    private String alloyRefine2GroupName;

    /**
     * 
     */
    private String alloyRefine2SmelterId;

    /**
     * 
     */
    private String alloyRefine2SmelterName;

    /**
     * 
     */
    private String grainRefine1BeginTime;

    /**
     * 
     */
    private String grainRefine1EndTime;

    /**
     * 
     */
    private String grainRefine1Temp;

    /**
     * 
     */
    private String grainRefine1Medium;

    /**
     * 
     */
    private String grainRefine1Dose;

    /**
     * 
     */
    private String grainRefine1SmeltGroupId;

    /**
     * 
     */
    private String grainRefine1SmeltGroupName;

    /**
     * 
     */
    private String grainRefine1SmelterId;

    /**
     * 
     */
    private String grainRefine1SmelterName;

    /**
     * 
     */
    private String grainRefine1OperatorId;

    /**
     * 
     */
    private String grainRefine1OperatorName;

    /**
     * 
     */
    private String grainRefine1DrossingGroupId;

    /**
     * 
     */
    private String grainRefine1DrossingGroupName;

    /**
     * 
     */
    private String grainRefine2BeginTime;

    /**
     * 
     */
    private String grainRefine2EndTime;

    /**
     * 
     */
    private String grainRefine2Temp;

    /**
     * 
     */
    private String grainRefine2Medium;

    /**
     * 
     */
    private String grainRefine2Dose;

    /**
     * 
     */
    private String grainRefine2SmeltGroupId;

    /**
     * 
     */
    private String grainRefine2SmeltGroupName;

    /**
     * 
     */
    private String grainRefine2SmelterId;

    /**
     * 
     */
    private String grainRefine2SmelterName;

    /**
     * 
     */
    private String grainRefine2OperatorId;

    /**
     * 
     */
    private String grainRefine2OperatorName;

    /**
     * 
     */
    private String grainRefine2DrossingGroupId;

    /**
     * 
     */
    private String grainRefine2DrossingGroupName;

    /**
     * 
     */
    private String prepTurndownSamplingTime;

    /**
     * 
     */
    private String prepTurndownSamplingTemp;

    /**
     * 
     */
    private String turndownGroupId;

    /**
     * 
     */
    private String turndownSmelterId;

    /**
     * 
     */
    private String turndownTemp;

    /**
     * 
     */
    private String turndownBeginTime;

    /**
     * 
     */
    private String turndownEndTime;

    /**
     * 
     */
    private String gasPostValue;

    /**
     * 
     */
    private String turndownCleanerId;

    /**
     * 
     */
    private String turndownCleanerName;

    /**
     * 
     */
    private String smeltRemark;

    /**
     * 
     */
    private String smeltApprove;

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