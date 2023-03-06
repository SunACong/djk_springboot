package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 铸轧生产计划表
 * @TableName lmdp_cast_plan
 */
@TableName(value ="lmdp_cast_plan")
@Data
public class LmdpCastPlan implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 主键
     */
//    @TableId(type = IdType.AUTO)
    private Integer planId;

    /**
     * 逻辑删除
     */
    private Integer deleteFlag;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 最后修改时间
     */
    private String lastmodifyTime;

    /**
     * 最后修改人
     */
    private String lastmodifyUser;

    /**
     * 生产计划编号
     */
    private String produceId;

    /**
     * 生产单位A
     */
    private String productionUnitA;

    /**
     * 交货日期A
     */
    private String deliveredTimeA;

    /**
     * 生产单位B
     */
    private String productionUnitB;

    /**
     * 交货日期B
     */
    private String deliveredTimeB;

    /**
     * Fe%
     */
    private String fe;

    /**
     * Si%
     */
    private String si;

    /**
     * Cu%
     */
    private String cu;

    /**
     * Ti%
     */
    private String ti;

    /**
     * Mn%
     */
    private String mn;

    /**
     * Zn%
     */
    private String zn;

    /**
     * Zr%
     */
    private String cr;

    /**
     * Mg%
     */
    private String mg;

    /**
     * 其他-单个
     */
    private String otherSingle;

    /**
     * 其他-总和
     */
    private String otherTotal;

    /**
     * AI%
     */
    private String ai;

    /**
     * 厚度偏差mm
     */
    private String thicknessDev;

    /**
     * 宽度偏差mm
     */
    private String widthDev;

    /**
     * 两边板厚差mm
     */
    private String doubleDev;

    /**
     * 中凸度%
     */
    private String convexity;

    /**
     * 平均中凸度%
     */
    private String convexityAvg;

    /**
     * 横向相临两点差值
     */
    private String infeedPoint;

    /**
     * 纵向相临两点差值
     */
    private String endwisePoint;

    /**
     * 每个锟周长纵向厚度差
     */
    private String endwiseThickness;

    /**
     * 铸轧坯料外观质量
     */
    private String presentationQuality;

    /**
     * 铸轧坯料内在质量
     */
    private String insideQuality;

    /**
     * 质检项目
     */
    private String qualityProject;

    /**
     * 其他要求
     */
    private String otherDemand;

    /**
     * 计划工程师
     */
    private String planningEngineer;

    /**
     * 审核人
     */
    private String checker;

    /**
     * 制定日期
     */
    private String drawupTime;

    /**
     * 计划类型
     */
    private Integer type;

    /**
     * 客户名称
     */
    private String client;

    /**
     * 产品用途
     */
    private String productuse;

    /**
     * 合金状态
     */
    private String state;

    /**
     * 铸轧带材规格（mm）
     */
    private String specification;

    /**
     * 铸轧卷规格（mm）
     */
    private String rollspecification;

    /**
     * 内径/管芯材质
     */
    private String inside;

    /**
     * 卷径范围（mm）
     */
    private String scope;

    /**
     * 单卷重量（吨)
     */
    private String weight;

    /**
     * 卷数
     */
    private String count;

    /**
     * 总重量（吨）
     */
    private String allweight;

    /**
     * 交货日期A2
     */
    private String deliveredTimeA2;

    /**
     * 交货日期B2
     */
    private String deliveredTimeB2;

    /**
     * 所属产品需求
     */
    private Integer productneedsId;

    /**
     * 待确认
     */
    private String other;

    /**
     * 备注
     */
    private String remark;

    /**
     * 计划完成状态
     */
    private Integer finished;

    /**
     * 套筒长度
     */
    private String sleeveWidth;

    /**
     * 套筒直径
     */
    private String sleevePath;

    /**
     * 合金牌号
     */
    private String alloyNumber;

    /**
     * Ni%
     */
    private String ni;

    /**
     * 执行标准
     */
    private String dataName;

    /**
     * 铸轧坯料生产计划数据字典id
     */
    private Integer dataId;

    /**
     * 待确认
     */
    private Integer castflowId;

    /**
     * 待确认
     */
    private String castflowName;

    /**
     * 订单评审编号
     */
    private String reviewNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
