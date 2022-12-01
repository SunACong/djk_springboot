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
 * @TableName lmdp_cold_produce
 */
@TableName(value ="lmdp_cold_produce")
@Data
public class LmdpColdProduce implements Serializable {
    /**
     * id
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
     * 计划id
     */
    private String planId;

    /**
     * 订货单位
     */
    private String consumerName;

    /**
     * (铸轧卷号)来料卷号
     */
    private String reelNum;

    /**
     * 冷轧卷号
     */
    private String batchNum;

    /**
     * 合金牌号
     */
    private String brand;

    /**
     * 用途
     */
    private String productUse;

    /**
     * 来料厚宽
     */
    private String blankSize;

    /**
     * 坯料重量(kg)
     */
    private String blankWeight;

    /**
     * 预定交货日期
     */
    private Date deliveryDate;

    /**
     * 成品厚度
     */
    private Double productThick;

    /**
     * 成品宽度
     */
    private Double productWidth;

    /**
     * 成品状态
     */
    private String productStatus;

    /**
     * 退火厚度mm
     */
    private Double annealingThick;

    /**
     * 开坯时间
     */
    private Date coggingTime;

    /**
     * 开坯班组id
     */
    private String coggingGroupId;

    /**
     * 开坯班组名称
     */
    private String coggingGroupName;

    /**
     * 班次
     */
    private String coggingWorkShift;

    /**
     * 顺序
     */
    private Integer coggingOrder;

    /**
     * 中轧时间
     */
    private Date midRollTime;

    /**
     * 中轧班组id
     */
    private String midRollGroupId;

    /**
     * 中轧班组名称
     */
    private String midRollGroupName;

    /**
     * 班次
     */
    private String midRollWorkShift;

    /**
     * 顺序
     */
    private Integer midRollOrder;

    /**
     * 中轧重量kg
     */
    private Double midRollWeight;

    /**
     * 精轧时间
     */
    private Date planishTime;

    /**
     * 精轧班组id
     */
    private String planishGroupId;

    /**
     * 精轧班组名称
     */
    private String planishGroupName;

    /**
     * 班次
     */
    private String planishWorkShift;

    /**
     * 顺序
     */
    private Double planishOrder;

    /**
     * 冷轧成品重量
     */
    private Double coldProductWeight;

    /**
     * 板型情况
     */
    private String plateCut;

    /**
     * 冷轧0.26尾料kg
     */
    private Double coldTailing26;

    /**
     * 冷轧0.6尾料kg
     */
    private Double coldTailing6;

    /**
     * 剪切速度
     */
    private String cutSpeed;

    /**
     * 切 边时 间
     */
    private Date cutTime;

    /**
     * 班次
     */
    private String cutWorkShift;

    /**
     * 切边班组id
     */
    private String cutGroupId;

    /**
     * 切边班组名称
     */
    private String cutGroupName;

    /**
     * 成品切边厚度(mm)
     */
    private Double cutSizeH;

    /**
     * 成品切边宽度(mm)
     */
    private Double cutSizeW;

    /**
     * 重卷成品重量(kg)
     */
    private Double recoilingWeight;

    /**
     * 版型情况
     */
    private String modelDesc;

    /**
     * 生产状态
     */
    private String produceStatus;

    /**
     * 入库时间
     */
    private Date storageInTime;

    /**
     * 入库重量
     */
    private String storageInWeight;

    /**
     * 改制计划号
     */
    private String reformPlanNum;

    /**
     * 冷轧成品率
     */
    private String coldYield;

    /**
     * 重卷成品率
     */
    private String rereelYield;

    /**
     * 下线成品率
     */
    private String offLineYield;

    /**
     * 入库成品率
     */
    private String storageInYield;

    /**
     * 重卷头料kg
     */
    private Double rereelHeading;

    /**
     * 重卷尾料kg
     */
    private Double rereelTailing;

    /**
     * 头料Mkg
     */
    private Double heading;

    /**
     * 甩除原因
     */
    private String headingReason;

    /**
     * 尾料Mkg
     */
    private String tailing;

    /**
     * 甩除原因
     */
    private String tailingReason;

    /**
     * 头料总重kg
     */
    private String headingWeight;

    /**
     * 尾料总重kg
     */
    private String tailingWeight;

    /**
     * 整卷质量情况
     */
    private String qcDesc;

    /**
     * 质检员ID
     */
    private String qcId;

    /**
     * 质检员姓名
     */
    private String qcName;

    /**
     * 套筒
     */
    private String sleeve;

    /**
     * 热轧卷
     */
    private String hotRoll;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 修改人id
     */
    private String reviserId;

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