package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cold_plan
 */
@TableName(value ="lmdp_cold_plan")
@Data
public class LmdpColdPlan implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String coldreductionstripId;

    /**
     * 
     */
    private String coldreductionstripNum;

    /**
     * 
     */
    private String planningengineer;

    /**
     * 
     */
    private String checker;

    /**
     * 
     */
    private String result;

    /**
     * 
     */
    private String drawupTime;

    /**
     * 
     */
    private String deleteFlag;

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
    private String client;

    /**
     * 
     */
    private String state;

    /**
     * 
     */
    private String productuse;

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
    private String comeSpec;

    /**
     * 
     */
    private String productSpec;

    /**
     * 
     */
    private String productState;

    /**
     * 
     */
    private String productQuality;

    /**
     * 
     */
    private String productArea;

    /**
     * 
     */
    private String singleHeight;

    /**
     * 
     */
    private String volumeTotal;

    /**
     * 
     */
    private String heightTotal;

    /**
     * 
     */
    private String productionUnitA;

    /**
     * 
     */
    private String productionUnitB;

    /**
     * 
     */
    private String deliveredTimeA;

    /**
     * 
     */
    private String deliveredTimeB;

    /**
     * 
     */
    private String tensileStrength;

    /**
     * 
     */
    private String elongation;

    /**
     * 
     */
    private String bendingPerformance;

    /**
     * 
     */
    private String endwiseHeight;

    /**
     * 
     */
    private String warpWidth;

    /**
     * 
     */
    private String convexRate;

    /**
     * 
     */
    private String appearanceReq;

    /**
     * 
     */
    private String productCheck;

    /**
     * 
     */
    private String type;

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
    private String flatness;

    /**
     * 
     */
    private String wedge;

    /**
     * 
     */
    private String same;

    /**
     * 
     */
    private String roughness;

    /**
     * 
     */
    private String stringLayer;

    /**
     * 
     */
    private String dagoba;

    /**
     * 
     */
    private String otherrequirement;

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
    private String packing;

    /**
     * 
     */
    private String cardids;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}