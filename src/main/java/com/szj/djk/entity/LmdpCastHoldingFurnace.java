package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cast_holding_furnace
 */
@TableName(value ="lmdp_cast_holding_furnace")
@Data
public class LmdpCastHoldingFurnace implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String smeltTimes;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String turndownBeforeBeginTime;

    /**
     * 
     */
    private String turndownBeforeGroupId;

    /**
     * 
     */
    private String turndownBeforeTemp;

    /**
     * 
     */
    private String turndownBeforeRemainingHeight;

    /**
     * 
     */
    private String turndownAfterTopTemp;

    /**
     * 
     */
    private String turndownAfterTemp;

    /**
     * 
     */
    private String turndownAfterEndTime;

    /**
     * 
     */
    private String turndownAfterPeriodTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}