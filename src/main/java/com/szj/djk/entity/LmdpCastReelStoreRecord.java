package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 铸轧仓储记录
 * @TableName lmdp_cast_reel_store_record
 */
@TableName(value ="lmdp_cast_reel_store_record")
@Data
public class LmdpCastReelStoreRecord implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

    /**
     * 区域
     */
    @TableField(value = "area")
    private String area;

    /**
     * 货架号
     */
    @TableField(value = "shelves")
    private String shelves;

    /**
     * 状态，字典：转入、转出
     */
    @TableField(value = "status")
    private String status;

    /**
     * 卷号
     */
    @TableField(value = "reel_num")
    private String reelNum;

    /**
     * 牌号
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 规格
     */
    @TableField(value = "model")
    private String model;

    /**
     * 卷径
     */
    @TableField(value = "roll_diameter")
    private String rollDiameter;

    /**
     * 用途
     */
    @TableField(value = "product_use")
    private String productUse;

    /**
     * 入库人ID
     */
    @TableField(value = "storer_id")
    private String storerId;

    /**
     * 入库人姓名
     */
    @TableField(value = "storer_name")
    private String storerName;

    /**
     * 入库时间
     */
    @TableField(value = "storage_time")
    private Date storageTime;

    /**
     * 出库人ID
     */
    @TableField(value = "delivery_id")
    private String deliveryId;

    /**
     * 出库人名称
     */
    @TableField(value = "delivery_name")
    private String deliveryName;

    /**
     * 出库时间
     */
    @TableField(value = "delivery_time")
    private Date deliveryTime;

    /**
     * 客户名称
     */
    @TableField(value = "consumer_name")
    private String consumerName;

    /**
     * 逻辑删除，是否删除 :0、未删除；1、删除
     */
    @TableField(value = "delete_flag")
    private Integer deleteFlag;

    /**
     * 创建人ID
     */
    @TableField(value = "creator_id")
    private String creatorId;

    /**
     * 创建人姓名
     */
    @TableField(value = "creator_name")
    private String creatorName;

    /**
     * 修改人id
     */
    @TableField(value = "reviser_id")
    private String reviserId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "ts")
    private Date ts;

    /**
     * 转运时间
     */
    @TableField(value = "transfer_time")
    private Date transferTime;

    /**
     * 质检判定信息
     */
    @TableField(value = "inspection_decision_Information")
    private String inspectionDecisionInformation;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}