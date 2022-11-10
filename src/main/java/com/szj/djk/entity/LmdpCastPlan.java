package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cast_plan
 */
@TableName(value ="lmdp_cast_plan")
@Data
public class LmdpCastPlan implements Serializable {
    /**
     * 
     */
    private String planId;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private String createUser;

    /**
     * 
     */
    private String lastmodifyTime;

    /**
     * 
     */
    private String lastmodifyUser;

    /**
     * 
     */
    private String produceId;

    /**
     * 
     */
    private String productionUnitA;

    /**
     * 
     */
    private String deliveredTimeA;

    /**
     * 
     */
    private String productionUnitB;

    /**
     * 
     */
    private String deliveredTimeB;

    /**
     * 
     */
    private String fe;

    /**
     * 
     */
    private String si;

    /**
     * 
     */
    private String cu;

    /**
     * 
     */
    private String ti;

    /**
     * 
     */
    private String mn;

    /**
     * 
     */
    private String zn;

    /**
     * 
     */
    private String cr;

    /**
     * 
     */
    private String mg;

    /**
     * 
     */
    private String otherSingle;

    /**
     * 
     */
    private String otherTotal;

    /**
     * 
     */
    private String ai;

    /**
     * 
     */
    private String thicknessDev;

    /**
     * 
     */
    private String widthDev;

    /**
     * 
     */
    private String doubleDev;

    /**
     * 
     */
    private String convexity;

    /**
     * 
     */
    private String convexityAvg;

    /**
     * 
     */
    private String infeedPoint;

    /**
     * 
     */
    private String endwisePoint;

    /**
     * 
     */
    private String endwiseThickness;

    /**
     * 
     */
    private String presentationQuality;

    /**
     * 
     */
    private String insideQuality;

    /**
     * 
     */
    private String qualityProject;

    /**
     * 
     */
    private String otherDemand;

    /**
     * 
     */
    private String planningEngineer;

    /**
     * 
     */
    private String checker;

    /**
     * 
     */
    private String drawupTime;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String client;

    /**
     * 
     */
    private String productuse;

    /**
     * 
     */
    private String state;

    /**
     * 
     */
    private String specification;

    /**
     * 
     */
    private String rollspecification;

    /**
     * 
     */
    private String inside;

    /**
     * 
     */
    private String scope;

    /**
     * 
     */
    private String weight;

    /**
     * 
     */
    private String count;

    /**
     * 
     */
    private String allweight;

    /**
     * 
     */
    private String deliveredTimeA2;

    /**
     * 
     */
    private String deliveredTimeB2;

    /**
     * 
     */
    private String productneedsId;

    /**
     * 
     */
    private String other;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private String finished;

    /**
     * 
     */
    private String sleeveWidth;

    /**
     * 
     */
    private String sleevePath;

    /**
     * 
     */
    private String alloyNumber;

    /**
     * 
     */
    private String ni;

    /**
     * 
     */
    private String dataName;

    /**
     * 
     */
    private String dataId;

    /**
     * 
     */
    private String castflowId;

    /**
     * 
     */
    private String castflowName;

    /**
     * 
     */
    private String reviewNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}