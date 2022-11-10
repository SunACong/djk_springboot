package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_fifth_concise
 */
@TableName(value ="lmdp_fifth_concise")
@Data
public class LmdpFifthConcise implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String holdRefine5FollowTime;

    /**
     * 
     */
    private String holdRefine5BeginTime;

    /**
     * 
     */
    private String holdRefine5EndTime;

    /**
     * 
     */
    private String holdRefine5Duration;

    /**
     * 
     */
    private String holdRefine5Temp;

    /**
     * 
     */
    private String holdRefine5Medium;

    /**
     * 
     */
    private String holdRefine5Dose;

    /**
     * 
     */
    private String holdRefine5ColdStuffDose;

    /**
     * 
     */
    private String holdRefine5GroupId;

    /**
     * 
     */
    private String holdRefine5GroupName;

    /**
     * 
     */
    private String holdRefine5CasterId;

    /**
     * 
     */
    private String holdRefine5CasterName;

    /**
     * 
     */
    private String holdRefine5SmelterId;

    /**
     * 
     */
    private String holdRefine5SmelterName;

    /**
     * 
     */
    private String holdRemark;

    /**
     * 
     */
    private String holdApprove;

    /**
     * 
     */
    private String deleteFlag;

    /**
     * 
     */
    private String creatorId;

    /**
     * 
     */
    private String creatorName;

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