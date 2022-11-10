package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cold_store_record
 */
@TableName(value ="lmdp_cold_store_record")
@Data
public class LmdpColdStoreRecord implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String area;

    /**
     * 
     */
    private String shelves;

    /**
     * 
     */
    private String reelNum;

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String weight;

    /**
     * 
     */
    private String plateCut;

    /**
     * 
     */
    private String productUse;

    /**
     * 
     */
    private String consumerName;

    /**
     * 
     */
    private String storerId;

    /**
     * 
     */
    private String storageTime;

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
    private String ts;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}