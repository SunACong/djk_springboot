package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cold_furnace_record
 */
@TableName(value ="lmdp_cold_furnace_record")
@Data
public class LmdpColdFurnaceRecord implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String ts;

    /**
     * 
     */
    private String creatorId;

    /**
     * 
     */
    private String createTime;

    /**
     * 
     */
    private String batchNum;

    /**
     * 
     */
    private String recordDate;

    /**
     * 
     */
    private String furnaceNum;

    /**
     * 
     */
    private String startTime;

    /**
     * 
     */
    private String endTime;

    /**
     * 
     */
    private String recordTime;

    /**
     * 
     */
    private String gasTemperature1;

    /**
     * 
     */
    private String gasTemperature2;

    /**
     * 
     */
    private String gasTemperature3;

    /**
     * 
     */
    private String materialTemperature1;

    /**
     * 
     */
    private String materialTemperature2;

    /**
     * 
     */
    private String hydraulicPressure;

    /**
     * 
     */
    private String gasPressure;

    /**
     * 
     */
    private String intakeFanTemperature;

    /**
     * 
     */
    private String exhaustFanTemperature;

    /**
     * 
     */
    private String cycleFanTemperature1;

    /**
     * 
     */
    private String cycleFanTemperature2;

    /**
     * 
     */
    private String cycleFanTemperature3;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private String operator;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}