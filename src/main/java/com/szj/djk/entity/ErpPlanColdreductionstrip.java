package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 冷轧生产计划表
 * @TableName erp_plan_coldreductionstrip
 */
@TableName(value ="erp_plan_coldreductionstrip")
@Data
public class ErpPlanColdreductionstrip implements Serializable {
    /**
     * 冷轧带材计划主键
     */
    @TableId
    private Long coldreductionstripId;

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
    private Date drawupTime;

    /**
     * 软删除标识
     */
    private String deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 最后修改时间
     */
    private Date lastmodifyTime;

    /**
     * 最后修改人
     */
    private String lastmodifyUser;

    /**
     * 客户
     */
    private String client;

    /**
     * 状态
     */
    private String state;

    /**
     * 产品类别
     */
    private String productuse;

    /**
     * 交付时间_A2
     */
    private Date deliveredTimeA2;

    /**
     * 交付时间_B2
     */
    private Date deliveredTimeB2;

    /**
     * 所属产品需求id
     */
    private Long productneedsId;

    /**
     * come_spec
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
    private Long volumeTotal;

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
    private Date deliveredTimeA;

    /**
     * 交货日期B
     */
    private Date deliveredTimeB;

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
     * 类型
     */
    private Long type;

    /**
     * 完成
     */
    private Long finished;

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
     * 包装
     */
    private String packing;

    /**
     * 检查2
     */
    private String checked2;

    /**
     * 检查3
     */
    private String checked3;

    /**
     * cardlds
     */
    private String cardlds;

    /**
     * 质检人1
     */
    private String checker1;

    /**
     * 质检人2
     */
    private String checker2;

    /**
     * 完成备注
     */
    private String finishRemark;

    /**
     * 备注
     */
    private String remark;

    /**
     * 冷轧生产计划表数据字典id
     */
    private Long erpDataId;

    private String dataId;

    private String datatype;
    private String enterTime;
    private String datatime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}