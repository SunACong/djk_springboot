package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName lmdp_cold_store_record
 */
@TableName(value ="lmdp_cold_store_record")
@Data
public class LmdpColdStoreRecord implements Serializable {
    /**
     * ID
     */
    @TableId
    private String id;

    /**
     * 数据来源
     */
    private String datasourceOrgcode;

    /**
     * 数据时间
     */
    private Date datatime;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 数据ID
     */
    private String dataId;

    /**
     * 入库时间
     */
    private Date enterTime;

    /**
     * 上传区域
     */
    private String uploadAreacode;

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
     * 重量kg
     */
    private String weight;

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
     * 修改时间
     */
    private Date ts;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}