package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_third_concise
 */
@TableName(value ="lmdp_third_concise")
@Data
public class LmdpThirdConcise implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String holdRefine3FollowTime;

    /**
     * 
     */
    private String holdRefine3BeginTime;

    /**
     * 
     */
    private String holdRefine3EndTime;

    /**
     * 
     */
    private String holdRefine3Duration;

    /**
     * 
     */
    private String holdRefine3Temp;

    /**
     * 
     */
    private String holdRefine3Medium;

    /**
     * 
     */
    private String holdRefine3Dose;

    /**
     * 
     */
    private String holdRefine3ColdStuffDose;

    /**
     * 
     */
    private String holdRefine3GroupId;

    /**
     * 
     */
    private String holdRefine3GroupName;

    /**
     * 
     */
    private String holdRefine3CasterId;

    /**
     * 
     */
    private String holdRefine3CasterName;

    /**
     * 
     */
    private String holdRefine3SmelterId;

    /**
     * 
     */
    private String holdRefine3SmelterName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}