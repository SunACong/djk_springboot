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
    private Integer wasteTrimmingWeight;

    /**
     * 其他废料量#下线重量kg
     */
    private Integer wasteOffLineWeight;

    /**
     * 其他废料量#成品重量kg
     */
    private Integer wasteProductWeight;

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
     * 操作类型  字典：operate_type
     */
    private String operateType;

    /**
     * 班组  字典：work_group_cn
     */
    private String workGroup;

    /**
     * 重卷工艺卡编号
     */
    private String rereelerCardNumber;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}