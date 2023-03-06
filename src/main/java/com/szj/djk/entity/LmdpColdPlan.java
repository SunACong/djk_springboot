package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 冷轧生产计划表
 * @TableName lmdp_cold_plan
 */
@TableName(value ="lmdp_cold_plan")
@Data
public class LmdpColdPlan implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer coldreductionstripId;

    /**
     * 冷轧带材计划编号
     */
    private String coldreductionstripNum;

    /**
     * 计划工程师
     */
    private String planningengineer;

    /**
     * 审核人
     */
    private String checker;

    /**
     * 审批结果
     */
    private String result;

    /**
     * 指定日期
     */
    private String drawupTime;

    /**
     * 软删除标识
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
     * 客户名称
     */
    private String client;

    /**
     * 合金状态
     */
    private String state;

    /**
     * 产品用途
     */
    private String productuse;

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
     * 来料规格
     */
    private String comeSpec;

    /**
     * 成品规格
     */
    private String productSpec;

    /**
     * 成品状态
     */
    private String productState;

    /**
     * 成品管芯材质
     */
    private String productQuality;

    /**
     * 成品卷径范围(mm)
     */
    private String productArea;

    /**
     * 单卷重量(吨)
     */
    private String singleHeight;

    /**
     * 卷数
     */
    private String volumeTotal;

    /**
     * 总重量(吨)
     */
    private String heightTotal;

    /**
     * 生产单位A
     */
    private String productionUnitA;

    /**
     * 生产单位B
     */
    private String productionUnitB;

    /**
     * 交货日期A
     */
    private String deliveredTimeA;

    /**
     * 交货日期B
     */
    private String deliveredTimeB;

    /**
     * 抗拉强度ob/Mpa
     */
    private String tensileStrength;

    /**
     * 延伸率
     */
    private String elongation;

    /**
     * 折弯性能
     */
    private String bendingPerformance;

    /**
     * 纵向厚度偏差mm
     */
    private String endwiseHeight;

    /**
     * 宽度偏差mm
     */
    private String warpWidth;

    /**
     * 凸面率%
     */
    private String convexRate;

    /**
     * 产品外观质量及轧制要求
     */
    private String appearanceReq;

    /**
     * 产品质检
     */
    private String productCheck;

    /**
     * 计划类型
     */
    private Integer type;

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
     * 平直度
     */
    private String flatness;

    /**
     * 楔形率%
     */
    private String wedge;

    /**
     * 同板差
     */
    private String same;

    /**
     * 坯料表面粗糙度
     */
    private String roughness;

    /**
     * 卷材端面串层
     */
    private String stringLayer;

    /**
     * 卷材端面塔
     */
    private String dagoba;

    /**
     * 卷端面其他要求
     */
    private String otherrequirement;

    /**
     * 执行标准
     */
    private String dataName;

    /**
     * 冷轧带材生产计划数据字典id
     */
    private Integer dataId;

    /**
     * 包装完成日期
     */
    private String packing;

    /**
     * 生产随行卡id
     */
    private String cardIds;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}