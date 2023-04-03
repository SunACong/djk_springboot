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
 * 重卷生产原始记录
 * @TableName lmdp_cold_rereeler_record
 */
@TableName(value ="lmdp_cold_rereeler_record")
@Data
public class LmdpColdRereelerRecord implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

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
     * 主操手
     */
    @TableField(value = "main_operator")
    private String mainOperator;

    /**
     * 辅助工
     */
    @TableField(value = "assistant_operator")
    private String assistantOperator;

    /**
     * 班次
     */
    @TableField(value = "work_shift")
    private String workShift;

    /**
     * 日期
     */
    @TableField(value = "record_date")
    private Date recordDate;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 合金状态
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 产品名称
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 来料卷号(铸轧卷号)
     */
    @TableField(value = "reel_num")
    private String reelNum;

    /**
     * 来料规格mm
     */
    @TableField(value = "origin_regular")
    private String originRegular;

    /**
     * 加工后冷轧卷号
     */
    @TableField(value = "batch_num")
    private String batchNum;

    /**
     * 加工后规格mm
     */
    @TableField(value = "processed_regular")
    private String processedRegular;

    /**
     * 运行参数#机列速度m/min
     */
    @TableField(value = "machine_speed")
    private BigDecimal machineSpeed;

    /**
     * 运行参数#卷取张应力N/M2
     */
    @TableField(value = "reeling_tensile_stress")
    private BigDecimal reelingTensileStress;

    /**
     * 运行参数#刀缝间隙MM
     */
    @TableField(value = "knife_gap")
    private BigDecimal knifeGap;

    /**
     * 金属平衡#投料量Kg
     */
    @TableField(value = "origin_weight")
    private Integer originWeight;

    /**
     * 金属平衡#成品量Kg
     */
    @TableField(value = "processed_weight")
    private Integer processedWeight;

    /**
     * 金属平衡#废料量#头料M
     */
    @TableField(value = "waste_material_head")
    private Integer wasteMaterialHead;

    /**
     * 金属平衡#废料量#尾料M
     */
    @TableField(value = "waste_material_tail")
    private Integer wasteMaterialTail;

    /**
     * 金属平衡#废料量#其它Kg
     */
    @TableField(value = "waste_material_else")
    private Integer wasteMaterialElse;

    /**
     * 质量状况#质量情况
     */
    @TableField(value = "quality")
    private String quality;

    /**
     * 质量状况#判定结果
     */
    @TableField(value = "result")
    private String result;

    /**
     * 质量状况#确认人
     */
    @TableField(value = "confirmer")
    private String confirmer;

    /**
     * 道次
     */
    @TableField(value = "record_num")
    private Integer recordNum;

    /**
     * 头尾料甩除米数
     */
    @TableField(value = "head_tail_waste_meters")
    private BigDecimal headTailWasteMeters;

    /**
     * 异常甩除原因
     */
    @TableField(value = "abnormal_waste_reason")
    private String abnormalWasteReason;

    /**
     * 板面质量描述
     */
    @TableField(value = "surface_quality_desc")
    private String surfaceQualityDesc;

    /**
     * 其他废料量#切边重量kg
     */
    @TableField(value = "waste_trimming_weight")
    private BigDecimal wasteTrimmingWeight;

    /**
     * 其他废料量#下线重量kg
     */
    @TableField(value = "waste_off_line_weight")
    private BigDecimal wasteOffLineWeight;

    /**
     * 其他废料量#成品重量kg
     */
    @TableField(value = "waste_product_weight")
    private BigDecimal wasteProductWeight;

    /**
     * 操作类型  字典：operate_type
     */
    @TableField(value = "operate_type")
    private String operateType;

    /**
     * 切边时间
     */
    @TableField(value = "trimming_time")
    private Date trimmingTime;

    /**
     * 生产顺序
     */
    @TableField(value = "produce_order")
    private String produceOrder;

    /**
     * 来料宽度（mm）
     */
    @TableField(value = "origin_width")
    private BigDecimal originWidth;

    /**
     * 成品切边宽度（mm）
     */
    @TableField(value = "finished_trimming_width")
    private BigDecimal finishedTrimmingWidth;

    /**
     * 剪切张力N/m²
     */
    @TableField(value = "shear_tension")
    private BigDecimal shearTension;

    /**
     * 剪切速度m/min
     */
    @TableField(value = "shear_speed")
    private BigDecimal shearSpeed;

    /**
     * 重卷成品重量（kg）
     */
    @TableField(value = "rereeler_finished_weight")
    private BigDecimal rereelerFinishedWeight;

    /**
     * 头料甩除原因 字典：throw_reason
     */
    @TableField(value = "head_reject_reason")
    private String headRejectReason;

    /**
     * 尾料甩除原因 字典：throw_reason
     */
    @TableField(value = "tail_reject_reason")
    private String tailRejectReason;

    /**
     * 套筒规格
     */
    @TableField(value = "sleeve_specification")
    private String sleeveSpecification;

    /**
     * 班组  字典：work_group_cn
     */
    @TableField(value = "work_group")
    private String workGroup;

    /**
     * 重卷工艺卡编号
     */
    @TableField(value = "rereeler_card_number")
    private String rereelerCardNumber;

    /**
     * 套筒重量
     */
    @TableField(value = "sleeve_weight")
    private BigDecimal sleeveWeight;

    /**
     * 质量情况
     */
    @TableField(value = "sleeve_quality")
    private String sleeveQuality;

    /**
     * 套筒生产日期
     */
    @TableField(value = "sleeve_produce_date")
    private Date sleeveProduceDate;

    /**
     * 检验人
     */
    @TableField(value = "sleeve_inspector_id")
    private String sleeveInspectorId;

    /**
     * 确认人
     */
    @TableField(value = "sleeve_checker_id")
    private String sleeveCheckerId;

    /**
     * 供货商
     */
    @TableField(value = "supplier")
    private String supplier;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}