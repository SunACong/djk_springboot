package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 铸轧生产计划表
 * @TableName erp_plan_rollcasting
 */
@TableName(value ="erp_plan_rollcasting")
@Data
public class ErpPlanRollcasting implements Serializable {
    /**
     * 数据ID
     */
    @TableId(value = "data_id")
    private String dataId;

    /**
     * 数据类型
     */
    @TableField(value = "datatype")
    private String datatype;

    /**
     * 入库时间
     */
    @TableField(value = "enter_time")
    private Date enterTime;

    /**
     * 数据时间
     */
    @TableField(value = "datatime")
    private Date datatime;

    /**
     * 数据导入批次号
     */
    @TableField(value = "_import_task_id")
    private String importTaskId;

    /**
     * 铸轧生产计划表数据字典id
     */
    @TableField(value = "erp_data_id")
    private Long erpDataId;

    /**
     * 质检项目
     */
    @TableField(value = "quality_project")
    private String qualityProject;

    /**
     * 质检人2
     */
    @TableField(value = "checker2")
    private String checker2;

    /**
     * 总重量
     */
    @TableField(value = "allweight")
    private String allweight;

    /**
     * 质检人1
     */
    @TableField(value = "checker1")
    private String checker1;

    /**
     * 生产单位B
     */
    @TableField(value = "production_unit_b")
    private String productionUnitB;

    /**
     * 生产单位A
     */
    @TableField(value = "production_unit_a")
    private String productionUnitA;

    /**
     * 审核人
     */
    @TableField(value = "checker")
    private String checker;

    /**
     * 计划类型
     */
    @TableField(value = "type")
    private Long type;

    /**
     * 内径/管芯/材质
     */
    @TableField(value = "inside")
    private String inside;

    /**
     * 计划工程师
     */
    @TableField(value = "palnning_engineer")
    private String palnningEngineer;

    /**
     * Cu%
     */
    @TableField(value = "Cu")
    private String cu;

    /**
     * 资金流动id
     */
    @TableField(value = "castFlow_id")
    private Long castflowId;

    /**
     * 合金牌号
     */
    @TableField(value = "alloy_number")
    private String alloyNumber;

    /**
     * Ti%
     */
    @TableField(value = "Ti")
    private String ti;

    /**
     * 其他-总和
     */
    @TableField(value = "other_total")
    private String otherTotal;

    /**
     * 状态
     */
    @TableField(value = "state")
    private String state;

    /**
     * 软删除标识
     */
    @TableField(value = "delete_flag")
    private String deleteFlag;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 数量
     */
    @TableField(value = "count")
    private Long count;

    /**
     * AI%
     */
    @TableField(value = "AI")
    private String ai;

    /**
     * 重量
     */
    @TableField(value = "weight")
    private String weight;

    /**
     * 套筒直径
     */
    @TableField(value = "sleeve_path")
    private String sleevePath;

    /**
     * 完成
     */
    @TableField(value = "finished")
    private Long finished;

    /**
     * 生产随行卡id
     */
    @TableField(value = "card_id")
    private Long cardId;

    /**
     * 生产计划编号
     */
    @TableField(value = "produce_id")
    private String produceId;

    /**
     * 最后修改人
     */
    @TableField(value = "lastmodify_user")
    private String lastmodifyUser;

    /**
     * 横向相临两点差值
     */
    @TableField(value = "infeed_point")
    private String infeedPoint;

    /**
     * 交付时间_B2
     */
    @TableField(value = "delivered_time_b2")
    private Date deliveredTimeB2;

    /**
     * 铸轧坯料外观质量
     */
    @TableField(value = "presentation_quality")
    private String presentationQuality;

    /**
     * 最后修改时间
     */
    @TableField(value = "lastmodify_time")
    private Date lastmodifyTime;

    /**
     * Mg%
     */
    @TableField(value = "Mg")
    private String mg;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String createUser;

    /**
     * 计划工程师
     */
    @TableField(value = "planning_engineer")
    private String planningEngineer;

    /**
     * 其他-单个
     */
    @TableField(value = "other_single")
    private String otherSingle;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 其他要求
     */
    @TableField(value = "other_demand")
    private String otherDemand;

    /**
     * 制定日期
     */
    @TableField(value = "drawup_time")
    private Date drawupTime;

    /**
     * Mn%
     */
    @TableField(value = "Mn")
    private String mn;

    /**
     * 其他
     */
    @TableField(value = "other")
    private String other;

    /**
     * 完成备注
     */
    @TableField(value = "finish_remark")
    private String finishRemark;

    /**
     * 产品类别
     */
    @TableField(value = "productuse")
    private String productuse;

    /**
     * 两边板厚差mm
     */
    @TableField(value = "double_dev")
    private String doubleDev;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 每个锟周长纵向厚度差
     */
    @TableField(value = "endwise_thickness")
    private String endwiseThickness;

    /**
     * 中凸度%
     */
    @TableField(value = "convexity")
    private String convexity;

    /**
     * 判定结果
     */
    @TableField(value = "result")
    private String result;

    /**
     * 铸轧坯料内在质量
     */
    @TableField(value = "inside_quality")
    private String insideQuality;

    /**
     * 套筒长度
     */
    @TableField(value = "sleeve_width")
    private String sleeveWidth;

    /**
     * Zn%
     */
    @TableField(value = "Zn")
    private String zn;

    /**
     * 执行标准
     */
    @TableField(value = "data_name")
    private String dataName;

    /**
     * 辊规格
     */
    @TableField(value = "rollspecification")
    private String rollspecification;

    /**
     * 卷径范围
     */
    @TableField(value = "scope")
    private String scope;

    /**
     * Zr%
     */
    @TableField(value = "Zr")
    private String zr;

    /**
     * 纵向相临两点差值
     */
    @TableField(value = "endwise_point")
    private String endwisePoint;

    /**
     * 客户
     */
    @TableField(value = "client")
    private String client;

    /**
     * Ni%
     */
    @TableField(value = "Ni")
    private String ni;

    /**
     * 交付时间_A2
     */
    @TableField(value = "delivered_time_a2")
    private Date deliveredTimeA2;

    /**
     * Fe%
     */
    @TableField(value = "Fe")
    private String fe;

    /**
     * 所属产品需求id
     */
    @TableField(value = "productneeds_id")
    private Long productneedsId;

    /**
     * 厚度偏差mm
     */
    @TableField(value = "thickness_dev")
    private String thicknessDev;

    /**
     * 规格
     */
    @TableField(value = "specification")
    private String specification;

    /**
     * 宽度偏差mm
     */
    @TableField(value = "width_dev")
    private String widthDev;

    /**
     * 平均中凸度%
     */
    @TableField(value = "convexity_avg")
    private String convexityAvg;

    /**
     * Si%
     */
    @TableField(value = "Si")
    private String si;

    /**
     * 交货日期B
     */
    @TableField(value = "delivered_time_b")
    private Date deliveredTimeB;

    /**
     * 交货日期A
     */
    @TableField(value = "delivered_time_a")
    private Date deliveredTimeA;

    /**
     * 资金流动name
     */
    @TableField(value = "castFlow_name")
    private String castflowName;

    /**
     * 计划主键
     */
    @TableField(value = "plan_id")
    private Long planId;

    /**
     * 订单评审编号
     */
    @TableField(value = "review_number")
    private String reviewNumber;

    /**
     * Cr%
     */
    @TableField(value = "Cr")
    private String cr;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}