package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 冷轧卷入库记录
 * @TableName lmdp_cold_store_record
 */
@TableName(value ="lmdp_cold_store_record")
@Data
public class LmdpColdStoreRecord implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

    /**
     * 区域【废弃】从lmdp_cold_store关联
     */
    @TableField(value = "area")
    private String area;

    /**
     * 货架号【废弃】从lmdp_cold_store关联
     */
    @TableField(value = "shelves")
    private String shelves;

    /**
     * 冷轧卷号
     */
    @TableField(value = "reel_num")
    private String reelNum;

    /**
     * 牌号
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 重量
     */
    @TableField(value = "weight")
    private BigDecimal weight;

    /**
     * 板型情况
     */
    @TableField(value = "plate_cut")
    private String plateCut;

    /**
     * 用途
     */
    @TableField(value = "product_use")
    private String productUse;

    /**
     * 客户名称
     */
    @TableField(value = "consumer_name")
    private String consumerName;

    /**
     * 入库人
     */
    @TableField(value = "storer_id")
    private String storerId;

    /**
     * 入库时间
     */
    @TableField(value = "storage_time")
    private Date storageTime;

    /**
     * 创建人
     */
    @TableField(value = "creator_id")
    private String creatorId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 
     */
    @TableField(value = "ts")
    private Date ts;

    /**
     * 产品类型：成品、在制品
     */
    @TableField(value = "product_type")
    private String productType;

    /**
     * 货架号
     */
    @TableField(value = "shelve_id")
    private String shelveId;

    /**
     * 库存状态，字典lmdp_store_status：in-入库、out-出库
     */
    @TableField(value = "store_status")
    private String storeStatus;

    /**
     * 出库人
     */
    @TableField(value = "deliverer_id")
    private String delivererId;

    /**
     * 出库时间
     */
    @TableField(value = "delivery_time")
    private Date deliveryTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}