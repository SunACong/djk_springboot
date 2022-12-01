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
 * @TableName lmdp_cold_plan
 */
@TableName(value ="lmdp_cold_plan")
@Data
public class LmdpColdPlan implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

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
     * 冷轧带材生产计划数据字典id
     */
    private Integer dataId;

    /**
     * 入库时间
     */
    private Date enterTime;

    /**
     * 上传区域
     */
    private String uploadAreacode;

    /**
     * 冷轧带材计划主键
     */
    private String coldreductionstripId;

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
    private Integer deleteFlag;

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
    private Date deliveredTimeA2;

    /**
     * 交货日期B2
     */
    private Date deliveredTimeB2;

    /**
     * 所属产品需求
     */
    private String productneedsId;

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
    private String type;

    /**
     * 计划完成状态
     */
    private String finished;

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
     * 包装完成日期
     */
    private Date packing;

    /**
     * 关联来料信息
     */
    private String cardids;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}