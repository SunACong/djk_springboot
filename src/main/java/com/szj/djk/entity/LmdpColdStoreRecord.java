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
    @TableId
    private String id;

    /**
     * 库位区域
     */
    private String area;

    /**
     * 货架号
     */
    private String shelves;

    /**
     * 冷轧卷号
     */
    private String reelNum;

    /**
     * 牌号
     */
    private String brand;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 板型情况
     */
    private String plateCut;

    /**
     * 用途
     */
    private String productUse;

    /**
     * 客户名称
     */
    private String consumerName;

    /**
     * 入库人
     */
    private String storerId;

    /**
     * 入库时间
     */
    private Date storageTime;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 
     */
    private Date ts;

    /**
     * 产品类型：成品、在制品
     */
    private String productType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}