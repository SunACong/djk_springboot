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
 * 单笔客户投诉台账
 * @TableName lmdp_qc_complaint_detail
 */
@TableName(value ="lmdp_qc_complaint_detail")
@Data
public class LmdpQcComplaintDetail implements Serializable {
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
     * 修改时间
     */
    private Date ts;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 投诉日期
     */
    private Date complaintTime;

    /**
     * 投诉卷号
     */
    private String batchNum;

    /**
     * 铸轧日期
     */
    private Date castDate;

    /**
     * 冷轧日期
     */
    private Date coldDate;

    /**
     * 铸轧规格
     */
    private String castModel;

    /**
     * 冷轧规格
     */
    private String coldModel;

    /**
     * 合金
     */
    private String brand;

    /**
     * 状态
     */
    private String status;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 氢含量
     */
    private BigDecimal hydrogenContent;

    /**
     * 产品类别
     */
    private String productType;

    /**
     * 投诉问题
     */
    private String complaintDesc;

    /**
     * 投诉重量（kg）
     */
    private BigDecimal complaintWeight;

    /**
     * 报废重量（kg）
     */
    private BigDecimal scrapWeight;

    /**
     * 降级重量（kg）
     */
    private BigDecimal demotionWeight;

    /**
     * 铸轧责任重量（kg）
     */
    private BigDecimal castWeight;

    /**
     * 冷轧责任重量（kg）
     */
    private BigDecimal coldWeight;

    /**
     * 当时铝价（元）
     */
    private BigDecimal alPrice;

    /**
     * 管理人员id
     */
    private String managerId;

    /**
     * 管理人员姓名
     */
    private String managerName;

    /**
     * 分管负责人id
     */
    private String chargeId;

    /**
     * 分管负责人姓名
     */
    private String chargeName;

    /**
     * 主管负责人id
     */
    private String directorId;

    /**
     * 主管负责人姓名
     */
    private String directorName;

    /**
     * 总损失金额（元）
     */
    private BigDecimal totalLossAmount;

    /**
     * 管理人员处罚金额（元）
     */
    private BigDecimal managerPunishAmount;

    /**
     * 分管负责人处罚金额（元）
     */
    private BigDecimal chargePunishAmount;

    /**
     * 主管负责人处罚金额（元）
     */
    private BigDecimal directorPunishAmount;

    /**
     * 投诉报告
     */
    private String complaintReport;

    /**
     * 铸轧卷质检说明
     */
    private String castInspectDescription;

    /**
     * 冷轧卷质检说明
     */
    private String coldInspectDescription;

    /**
     * 客户名称
     */
    private String customer;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}