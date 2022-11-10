package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_second_concise
 */
@TableName(value ="lmdp_second_concise")
@Data
public class LmdpSecondConcise implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String holdRefine2FollowTime;

    /**
     * 
     */
    private String holdRefine2BeginTime;

    /**
     * 
     */
    private String holdRefine2EndTime;

    /**
     * 
     */
    private String holdRefine2Duration;

    /**
     * 
     */
    private String holdRefine2Temp;

    /**
     * 
     */
    private String holdRefine2Medium;

    /**
     * 
     */
    private String holdRefine2Dose;

    /**
     * 
     */
    private String holdRefine2ColdStuffDose;

    /**
     * 
     */
    private String holdRefine2GroupId;

    /**
     * 
     */
    private String holdRefine2GroupName;

    /**
     * 
     */
    private String holdRefine2CasterId;

    /**
     * 
     */
    private String holdRefine2CasterName;

    /**
     * 
     */
    private String holdRefine2SmelterId;

    /**
     * 
     */
    private String holdRefine2SmelterName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}