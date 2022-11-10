package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_fourth_concise
 */
@TableName(value ="lmdp_fourth_concise")
@Data
public class LmdpFourthConcise implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String holdRefine4FollowTime;

    /**
     * 
     */
    private String holdRefine4BeginTime;

    /**
     * 
     */
    private String holdRefine4EndTime;

    /**
     * 
     */
    private String holdRefine4Duration;

    /**
     * 
     */
    private String holdRefine4Temp;

    /**
     * 
     */
    private String holdRefine4Medium;

    /**
     * 
     */
    private String holdRefine4Dose;

    /**
     * 
     */
    private String holdRefine4ColdStuffDose;

    /**
     * 
     */
    private String holdRefine4GroupId;

    /**
     * 
     */
    private String holdRefine4GroupName;

    /**
     * 
     */
    private String holdRefine4CasterId;

    /**
     * 
     */
    private String holdRefine4CasterName;

    /**
     * 
     */
    private String holdRefine4SmelterId;

    /**
     * 
     */
    private String holdRefine4SmelterName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}