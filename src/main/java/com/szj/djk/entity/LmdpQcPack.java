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
 * 包装检验记录表
 * @TableName lmdp_qc_pack
 */
@TableName(value ="lmdp_qc_pack")
@Data
public class LmdpQcPack implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 
     */
    private Date ts;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 冷轧卷号
     */
    private String batchNum;

    /**
     * 规格
     */
    private String model;

    /**
     * 合金状态
     */
    private String alloyStatus;

    /**
     * 卷径Φ
     */
    private BigDecimal rollDiameter;

    /**
     * 重量（t）
     */
    private BigDecimal weight;

    /**
     * 随卷试样
     */
    private String sample;

    /**
     * 合格证
     */
    private String cert;

    /**
     * 产品证书
     */
    private String productCcie;

    /**
     * 包装质量
     */
    private String packageQc;

    /**
     * 外标签
     */
    private String outerLabel;

    /**
     * 包装日期
     */
    private Date packageTime;

    /**
     * 质检员
     */
    private String inspectorId;

    /**
     * 报告时间
     */
    private Date reportTime;

    /**
     * 备 注
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}