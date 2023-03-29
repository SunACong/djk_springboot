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
 * 投诉现场处理
 * @TableName lmdp_qc_complaint_handle
 */
@TableName(value ="lmdp_qc_complaint_handle")
@Data
public class LmdpQcComplaintHandle implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

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
     * 创建人
     */
    @TableField(value = "creator_id")
    private String creatorId;

    /**
     * 投诉日期
     */
    @TableField(value = "complaint_time")
    private Date complaintTime;

    /**
     * 客户
     */
    @TableField(value = "consumer")
    private String consumer;

    /**
     * 产品类别
     */
    @TableField(value = "product_type")
    private String productType;

    /**
     * 投诉冷轧卷号
     */
    @TableField(value = "batch_num")
    private String batchNum;

    /**
     * 投诉质量问题
     */
    @TableField(value = "complaint_desc")
    private String complaintDesc;

    /**
     * 投诉重量
     */
    @TableField(value = "complaint_weight")
    private String complaintWeight;

    /**
     * 处理预案
     */
    @TableField(value = "treatment_plan")
    private String treatmentPlan;

    /**
     * 现场处理情况
     */
    @TableField(value = "site_treatment")
    private String siteTreatment;

    /**
     * 现场处理结果
     */
    @TableField(value = "site_treatment_result")
    private String siteTreatmentResult;

    /**
     * 经济损失（元）
     */
    @TableField(value = "loss_amount")
    private BigDecimal lossAmount;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}