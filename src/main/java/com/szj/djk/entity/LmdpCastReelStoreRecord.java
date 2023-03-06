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
    @TableId
    private String id;

    /**
     * 区域
     */
    private String area;

    /**
     * 货架号
     */
    private String shelves;

    /**
     * 状态，字典：转入、转出
     */
    private String status;

    /**
     * 卷号
     */
    private String reelNum;

    /**
     * 牌号
     */
    private String brand;

    /**
     * 规格
     */
    private String model;

    /**
     * 卷径
     */
    private String rollDiameter;

    /**
     * 用途
     */
    private String productUse;

    /**
     * 入库人ID
     */
    private String storerId;

    /**
     * 入库人姓名
     */
    private String storerName;

    /**
     * 入库时间
     */
    private Date storageTime;

    /**
     * 出库人ID
     */
    private String deliveryId;

    /**
     * 出库人名称
     */
    private String deliveryName;

    /**
     * 出库时间
     */
    private Date deliveryTime;

    /**
     * 客户名称
     */
    private String consumerName;

    /**
     * 逻辑删除，是否删除 :0、未删除；1、删除
     */
    private Integer deleteFlag;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 创建人姓名
     */
    private String creatorName;

    /**
     * 修改人id
     */
    private String reviserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date ts;

    /**
     * 转运时间
     */
    private Date transferTime;

    /**
     * 质检判定信息
     */
    private String inspectionDecisionInformation;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}