package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    @TableId(value = "coldreductionstrip_id")
    private Long coldreductionstripId;

    /**
     * 冷轧带材计划编号
     */
    @TableField(value = "coldreductionstrip_num")
    private String coldreductionstripNum;

    /**
     * 计划工程师
     */
    @TableField(value = "planningengineer")
    private String planningengineer;

    /**
     * 审核人
     */
    @TableField(value = "checker")
    private String checker;

    /**
     * 审批结果
     */
    @TableField(value = "result")
    private String result;

    /**
     * 指定日期
     */
    @TableField(value = "drawup_time")
    private Date drawupTime;

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
     * 创建人
     */
    @TableField(value = "create_user")
    private String createUser;

    /**
     * 最后修改时间
     */
    @TableField(value = "lastmodify_time")
    private Date lastmodifyTime;

    /**
     * 最后修改人
     */
    @TableField(value = "lastmodify_user")
    private String lastmodifyUser;

    /**
     * 客户
     */
    @TableField(value = "client")
    private String client;

    /**
     * 状态
     */
    @TableField(value = "state")
    private String state;

    /**
     * 产品类别
     */
    @TableField(value = "productuse")
    private String productuse;

    /**
     * 交付时间_A2
     */
    @TableField(value = "delivered_time_a2")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date deliveredTimeA2;

    /**
     * 交付时间_B2
     */
    @TableField(value = "delivered_time_b2")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date deliveredTimeB2;

    /**
     * 所属产品需求id
     */
    @TableField(value = "productneeds_id")
    private Long productneedsId;

    /**
     * come_spec
     */
    @TableField(value = "come_spec")
    private String comeSpec;

    /**
     * 成品规格
     */
    @TableField(value = "product_spec")
    private String productSpec;

    /**
     * 成品状态
     */
    @TableField(value = "product_state")
    private String productState;

    /**
     * 成品管芯材质
     */
    @TableField(value = "product_quality")
    private String productQuality;

    /**
     * 成品卷径范围(mm)
     */
    @TableField(value = "product_area")
    private String productArea;

    /**
     * 单卷重量(吨)
     */
    @TableField(value = "single_height")
    private String singleHeight;

    /**
     * 卷数
     */
    @TableField(value = "volume_total")
    private Long volumeTotal;

    /**
     * 总重量(吨)
     */
    @TableField(value = "height_total")
    private String heightTotal;

    /**
     * 生产单位A
     */
    @TableField(value = "production_unit_a")
    private String productionUnitA;

    /**
     * 生产单位B
     */
    @TableField(value = "production_unit_b")
    private String productionUnitB;

    /**
     * 交货日期A
     */
    @TableField(value = "delivered_time_a")
    private Date deliveredTimeA;

    /**
     * 交货日期B
     */
    @TableField(value = "delivered_time_b")
    private Date deliveredTimeB;

    /**
     * 抗拉强度ob/Mpa
     */
    @TableField(value = "tensile_strength")
    private String tensileStrength;

    /**
     * 延伸率
     */
    @TableField(value = "elongation")
    private String elongation;

    /**
     * 折弯性能
     */
    @TableField(value = "bending_performance")
    private String bendingPerformance;

    /**
     * 纵向厚度偏差mm
     */
    @TableField(value = "endwise_height")
    private String endwiseHeight;

    /**
     * 宽度偏差mm
     */
    @TableField(value = "warp_width")
    private String warpWidth;

    /**
     * 凸面率%
     */
    @TableField(value = "convex_rate")
    private String convexRate;

    /**
     * 产品外观质量及轧制要求
     */
    @TableField(value = "appearance_req")
    private String appearanceReq;

    /**
     * 产品质检
     */
    @TableField(value = "product_check")
    private String productCheck;

    /**
     * 类型
     */
    @TableField(value = "type")
    private Long type;

    /**
     * 完成
     */
    @TableField(value = "finished")
    private Long finished;

    /**
     * 套筒长度
     */
    @TableField(value = "sleeve_width")
    private String sleeveWidth;

    /**
     * 套筒直径
     */
    @TableField(value = "sleeve_path")
    private String sleevePath;

    /**
     * 合金牌号
     */
    @TableField(value = "alloy_number")
    private String alloyNumber;

    /**
     * 平直度
     */
    @TableField(value = "flatness")
    private String flatness;

    /**
     * 楔形率%
     */
    @TableField(value = "wedge")
    private String wedge;

    /**
     * 同板差
     */
    @TableField(value = "same")
    private String same;

    /**
     * 坯料表面粗糙度
     */
    @TableField(value = "roughness")
    private String roughness;

    /**
     * 卷材端面串层
     */
    @TableField(value = "string_layer")
    private String stringLayer;

    /**
     * 卷材端面塔
     */
    @TableField(value = "dagoba")
    private String dagoba;

    /**
     * 卷端面其他要求
     */
    @TableField(value = "otherrequirement")
    private String otherrequirement;

    /**
     * 执行标准
     */
    @TableField(value = "data_name")
    private String dataName;

    /**
     * 冷轧带材生产计划数据字典id
     */
    @TableField(value = "data_id")
    private String dataId;

    /**
     * 包装
     */
    @TableField(value = "packing")
    private String packing;

    /**
     * 检查2
     */
    @TableField(value = "checked2")
    private String checked2;

    /**
     * 检查3
     */
    @TableField(value = "checked3")
    private String checked3;

    /**
     * cardlds
     */
    @TableField(value = "cardlds")
    private String cardlds;

    /**
     * 质检人1
     */
    @TableField(value = "checker1")
    private String checker1;

    /**
     * 质检人2
     */
    @TableField(value = "checker2")
    private String checker2;

    /**
     * 完成备注
     */
    @TableField(value = "finish_remark")
    private String finishRemark;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

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
     * 冷轧生产计划表数据字典id
     */
    @TableField(value = "erp_data_id")
    private Long erpDataId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}