package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.szj.djk.common.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 重卷生产原始记录
 * @TableName lmdp_cold_rereeler_record
 */
@TableName(value ="lmdp_cold_rereeler_record")
@Data
public class LmdpColdRereelerRecord extends BaseEntity implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 
     */
    private Date ts;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 主操手
     */
    private String mainOperator;

    /**
     * 辅助工
     */
    private String assistantOperator;

    /**
     * 班次
     */
    private String workShift;

    /**
     * 日期
     */
    private Date recordDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 合金状态
     */
    private String brand;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 来料卷号(铸轧卷号)
     */
    private String reelNum;

    /**
     * 来料规格mm
     */
    private String originRegular;

    /**
     * 加工后冷轧卷号
     */
    private String batchNum;

    /**
     * 加工后规格mm
     */
    private String processedRegular;

    /**
     * 运行参数#机列速度m/min
     */
    private BigDecimal machineSpeed;

    /**
     * 运行参数#卷取张应力N/M2
     */
    private BigDecimal reelingTensileStress;

    /**
     * 运行参数#刀缝间隙MM
     */
    private BigDecimal knifeGap;

    /**
     * 金属平衡#投料量Kg
     */
    private Integer originWeight;

    /**
     * 金属平衡#成品量Kg
     */
    private Integer processedWeight;

    /**
     * 金属平衡#废料量#头料M
     */
    private Integer wasteMaterialHead;

    /**
     * 金属平衡#废料量#尾料M
     */
    private Integer wasteMaterialTail;

    /**
     * 金属平衡#废料量#其它Kg
     */
    private Integer wasteMaterialElse;

    /**
     * 质量状况#质量情况
     */
    private String quality;

    /**
     * 质量状况#判定结果
     */
    private String result;

    /**
     * 质量状况#确认人
     */
    private String confirmer;

    /**
     * 道次
     */
    private Integer recordNum;

    /**
     * 头尾料甩除米数
     */
    private BigDecimal headTailWasteMeters;

    /**
     * 异常甩除原因
     */
    private String abnormalWasteReason;

    /**
     * 板面质量描述
     */
    private String surfaceQualityDesc;

    /**
     * 其他废料量#切边重量kg
     */
    private BigDecimal wasteTrimmingWeight;

    /**
     * 其他废料量#下线重量kg
     */
    private BigDecimal wasteOffLineWeight;

    /**
     * 其他废料量#成品重量kg
     */
    private BigDecimal wasteProductWeight;

    /**
     * 操作类型  字典：operate_type
     */
    private String operateType;

    /**
     * 切边时间
     */
    private Date trimmingTime;

    /**
     * 生产顺序
     */
    private String produceOrder;

    /**
     * 来料宽度（mm）
     */
    private BigDecimal originWidth;

    /**
     * 成品切边宽度（mm）
     */
    private BigDecimal finishedTrimmingWidth;

    /**
     * 剪切张力N/m²
     */
    private BigDecimal shearTension;

    /**
     * 剪切速度m/min
     */
    private BigDecimal shearSpeed;

    /**
     * 重卷成品重量（kg）
     */
    private BigDecimal rereelerFinishedWeight;

    /**
     * 头料甩除原因 字典：throw_reason
     */
    private String headRejectReason;

    /**
     * 尾料甩除原因 字典：throw_reason
     */
    private String tailRejectReason;

    /**
     * 套筒规格
     */
    private String sleeveSpecification;

    /**
     * 班组  字典：work_group_cn
     */
    private String workGroup;

    /**
     * 重卷工艺卡编号
     */
    private String rereelerCardNumber;

    /**
     * 套筒重量
     */
    private BigDecimal sleeveWeight;

    /**
     * 质量情况
     */
    private String sleeveQuality;

    /**
     * 套筒生产日期
     */
    private Date sleeveProduceDate;

    /**
     * 检验人
     */
    private String sleeveInspectorId;

    /**
     * 确认人
     */
    private String sleeveCheckerId;

    /**
     * 供货商
     */
    private String supplier;

    /**
     * 投料口重量
     */
    private BigDecimal inputWeight;

    /**
     * 批次号
     */
    private String numOrder;

    /**
     * 切分后纸套筒规格
     */
    private String cuttedSleeveSpecification;

    /**
     * 来料厚度
     */
    private BigDecimal originThick;

    /**
     * 重卷结束时间
     */
    private Date sleeveEndDate;

    /**
     * 重卷开始#电度（kw·h）
     */
    private BigDecimal startPower;

    /**
     * 重卷结束#电度（kw·h）
     */
    private BigDecimal endPower;

    /**
     * 铸坯重量kg
     */
    private BigDecimal castWeight;

    /**
     * 成品规格
     */
    private String productSpec;

    /**
     * 成品宽差
     */
    private String warpWidth;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}