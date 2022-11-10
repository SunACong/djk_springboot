package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_first_concise
 */
@TableName(value ="lmdp_first_concise")
@Data
public class LmdpFirstConcise implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String holdRefine1BeginTime;

    /**
     * 
     */
    private String holdRefine1EndTime;

    /**
     * 
     */
    private String holdRefine1Duration;

    /**
     * 
     */
    private String holdRefine1Temp;

    /**
     * 
     */
    private String holdRefine1Medium;

    /**
     * 
     */
    private String holdRefine1Dose;

    /**
     * 
     */
    private String holdRefine1ColdStuffDose;

    /**
     * 
     */
    private String holdRefine1GroupId;

    /**
     * 
     */
    private String holdRefine1GroupName;

    /**
     * 
     */
    private String holdRefine1CasterId;

    /**
     * 
     */
    private String holdRefine1CasterName;

    /**
     * 
     */
    private String holdRefine1SmelterId;

    /**
     * 
     */
    private String holdRefine1SmelterName;

    /**
     * 
     */
    private String holdRefine1SamplingTime;

    /**
     * 
     */
    private String holdRefine1SamplingTemp;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}