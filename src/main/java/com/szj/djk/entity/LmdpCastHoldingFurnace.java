package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 保温工序
 * @TableName lmdp_cast_holding_furnace
 */
@TableName(value ="lmdp_cast_holding_furnace")
@Data
public class LmdpCastHoldingFurnace implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;

    /**
     * 熔次号
     */
    @TableField(value = "smelt_times")
    private String smeltTimes;

    /**
     * 牌号
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 倒炉前保温炉参数-倒炉开始时间
     */
    @TableField(value = "turndown_before_begin_time")
    private Date turndownBeforeBeginTime;

    /**
     * 倒炉前保温炉参数-倒炉班组
     */
    @TableField(value = "turndown_before_group_id")
    private String turndownBeforeGroupId;

    /**
     * 倒炉前保温炉参数-温度℃
     */
    @TableField(value = "turndown_before_temp")
    private BigDecimal turndownBeforeTemp;

    /**
     * 倒炉前保温炉参数-余量高度
     */
    @TableField(value = "turndown_before_remaining_height")
    private BigDecimal turndownBeforeRemainingHeight;

    /**
     * 倒炉后参数-峰值温度℃
     */
    @TableField(value = "turndown_after_top_temp")
    private BigDecimal turndownAfterTopTemp;

    /**
     * 倒后温度℃
     */
    @TableField(value = "turndown_after_temp")
    private BigDecimal turndownAfterTemp;

    /**
     * 倒炉后时间
     */
    @TableField(value = "turndown_after_end_time")
    private Date turndownAfterEndTime;

    /**
     * 持续时长（分钟）
     */
    @TableField(value = "turndown_after_period_time")
    private Integer turndownAfterPeriodTime;

    /**
     * 开始时间
     */
    @TableField(value = "hold_refine1_begin_time")
    private Date holdRefine1BeginTime;

    /**
     * 结束时间
     */
    @TableField(value = "hold_refine1_end_time")
    private Date holdRefine1EndTime;

    /**
     * 精炼时长
     */
    @TableField(value = "hold_refine1_duration")
    private Integer holdRefine1Duration;

    /**
     * 温度
     */
    @TableField(value = "hold_refine1_temp")
    private BigDecimal holdRefine1Temp;

    /**
     * 精炼剂#介质
     */
    @TableField(value = "hold_refine1_medium")
    private String holdRefine1Medium;

    /**
     * 精炼剂#用量
     */
    @TableField(value = "hold_refine1_dose")
    private BigDecimal holdRefine1Dose;

    /**
     * 冷材加入量
     */
    @TableField(value = "hold_refine1_cold_stuff_dose")
    private BigDecimal holdRefine1ColdStuffDose;

    /**
     * 班组ID
     */
    @TableField(value = "hold_refine1_group_id")
    private String holdRefine1GroupId;

    /**
     * 班组名称
     */
    @TableField(value = "hold_refine1_group_name")
    private String holdRefine1GroupName;

    /**
     * 轧机侧操作工ID
     */
    @TableField(value = "hold_refine1_caster_id")
    private String holdRefine1CasterId;

    /**
     * 轧机侧操作工名称
     */
    @TableField(value = "hold_refine1_caster_name")
    private String holdRefine1CasterName;

    /**
     * 熔炼侧操作工ID
     */
    @TableField(value = "hold_refine1_smelter_id")
    private String holdRefine1SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    @TableField(value = "hold_refine1_smelter_name")
    private String holdRefine1SmelterName;

    /**
     * 取样时间
     */
    @TableField(value = "hold_refine1_sampling_time")
    private Date holdRefine1SamplingTime;

    /**
     * 取样温度
     */
    @TableField(value = "hold_refine1_sampling_temp")
    private BigDecimal holdRefine1SamplingTemp;

    /**
     * 精炼间隔时间
     */
    @TableField(value = "hold_refine2_follow_time")
    private BigDecimal holdRefine2FollowTime;

    /**
     * 开始时间
     */
    @TableField(value = "hold_refine2_begin_time")
    private Date holdRefine2BeginTime;

    /**
     * 结束时间
     */
    @TableField(value = "hold_refine2_end_time")
    private Date holdRefine2EndTime;

    /**
     * 精炼时长
     */
    @TableField(value = "hold_refine2_duration")
    private Integer holdRefine2Duration;

    /**
     * 温度
     */
    @TableField(value = "hold_refine2_temp")
    private BigDecimal holdRefine2Temp;

    /**
     * 精炼剂#介质
     */
    @TableField(value = "hold_refine2_medium")
    private String holdRefine2Medium;

    /**
     * 精炼剂#用量
     */
    @TableField(value = "hold_refine2_dose")
    private BigDecimal holdRefine2Dose;

    /**
     * 冷材加入量
     */
    @TableField(value = "hold_refine2_cold_stuff_dose")
    private BigDecimal holdRefine2ColdStuffDose;

    /**
     * 班组ID
     */
    @TableField(value = "hold_refine2_group_id")
    private String holdRefine2GroupId;

    /**
     * 班组名称
     */
    @TableField(value = "hold_refine2_group_name")
    private String holdRefine2GroupName;

    /**
     * 轧机侧操作工ID
     */
    @TableField(value = "hold_refine2_caster_id")
    private String holdRefine2CasterId;

    /**
     * 轧机侧操作工名称
     */
    @TableField(value = "hold_refine2_caster_name")
    private String holdRefine2CasterName;

    /**
     * 熔炼侧操作工ID
     */
    @TableField(value = "hold_refine2_smelter_id")
    private String holdRefine2SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    @TableField(value = "hold_refine2_smelter_name")
    private String holdRefine2SmelterName;

    /**
     * 精炼间隔时间
     */
    @TableField(value = "hold_refine3_follow_time")
    private Integer holdRefine3FollowTime;

    /**
     * 开始时间
     */
    @TableField(value = "hold_refine3_begin_time")
    private Date holdRefine3BeginTime;

    /**
     * 结束时间
     */
    @TableField(value = "hold_refine3_end_time")
    private Date holdRefine3EndTime;

    /**
     * 精炼时长
     */
    @TableField(value = "hold_refine3_duration")
    private Integer holdRefine3Duration;

    /**
     * 温度
     */
    @TableField(value = "hold_refine3_temp")
    private BigDecimal holdRefine3Temp;

    /**
     * 精炼剂#介质
     */
    @TableField(value = "hold_refine3_medium")
    private String holdRefine3Medium;

    /**
     * 精炼剂#用量
     */
    @TableField(value = "hold_refine3_dose")
    private BigDecimal holdRefine3Dose;

    /**
     * 冷材加入量
     */
    @TableField(value = "hold_refine3_cold_stuff_dose")
    private BigDecimal holdRefine3ColdStuffDose;

    /**
     * 班组ID
     */
    @TableField(value = "hold_refine3_group_id")
    private String holdRefine3GroupId;

    /**
     * 班组名称
     */
    @TableField(value = "hold_refine3_group_name")
    private String holdRefine3GroupName;

    /**
     * 轧机侧操作工ID
     */
    @TableField(value = "hold_refine3_caster_id")
    private String holdRefine3CasterId;

    /**
     * 轧机侧操作工名称
     */
    @TableField(value = "hold_refine3_caster_name")
    private String holdRefine3CasterName;

    /**
     * 熔炼侧操作工ID
     */
    @TableField(value = "hold_refine3_smelter_id")
    private String holdRefine3SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    @TableField(value = "hold_refine3_smelter_name")
    private String holdRefine3SmelterName;

    /**
     * 精炼间隔时间
     */
    @TableField(value = "hold_refine4_follow_time")
    private Integer holdRefine4FollowTime;

    /**
     * 开始时间
     */
    @TableField(value = "hold_refine4_begin_time")
    private Date holdRefine4BeginTime;

    /**
     * 结束时间
     */
    @TableField(value = "hold_refine4_end_time")
    private Date holdRefine4EndTime;

    /**
     * 精炼时长
     */
    @TableField(value = "hold_refine4_duration")
    private Integer holdRefine4Duration;

    /**
     * 温度
     */
    @TableField(value = "hold_refine4_temp")
    private BigDecimal holdRefine4Temp;

    /**
     * 精炼剂#介质
     */
    @TableField(value = "hold_refine4_medium")
    private String holdRefine4Medium;

    /**
     * 精炼剂#用量
     */
    @TableField(value = "hold_refine4_dose")
    private BigDecimal holdRefine4Dose;

    /**
     * 冷材加入量
     */
    @TableField(value = "hold_refine4_cold_stuff_dose")
    private BigDecimal holdRefine4ColdStuffDose;

    /**
     * 班组ID
     */
    @TableField(value = "hold_refine4_group_id")
    private String holdRefine4GroupId;

    /**
     * 班组名称
     */
    @TableField(value = "hold_refine4_group_name")
    private String holdRefine4GroupName;

    /**
     * 轧机侧操作工ID
     */
    @TableField(value = "hold_refine4_caster_id")
    private String holdRefine4CasterId;

    /**
     * 轧机侧操作工名称
     */
    @TableField(value = "hold_refine4_caster_name")
    private String holdRefine4CasterName;

    /**
     * 熔炼侧操作工ID
     */
    @TableField(value = "hold_refine4_smelter_id")
    private String holdRefine4SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    @TableField(value = "hold_refine4_smelter_name")
    private String holdRefine4SmelterName;

    /**
     * 精炼间隔时间
     */
    @TableField(value = "hold_refine5_follow_time")
    private Integer holdRefine5FollowTime;

    /**
     * 开始时间
     */
    @TableField(value = "hold_refine5_begin_time")
    private Date holdRefine5BeginTime;

    /**
     * 结束时间
     */
    @TableField(value = "hold_refine5_end_time")
    private Date holdRefine5EndTime;

    /**
     * 精炼时长
     */
    @TableField(value = "hold_refine5_duration")
    private Integer holdRefine5Duration;

    /**
     * 温度
     */
    @TableField(value = "hold_refine5_temp")
    private BigDecimal holdRefine5Temp;

    /**
     * 精炼剂#介质
     */
    @TableField(value = "hold_refine5_medium")
    private String holdRefine5Medium;

    /**
     * 精炼剂#用量
     */
    @TableField(value = "hold_refine5_dose")
    private BigDecimal holdRefine5Dose;

    /**
     * 冷材加入量
     */
    @TableField(value = "hold_refine5_cold_stuff_dose")
    private BigDecimal holdRefine5ColdStuffDose;

    /**
     * 班组ID
     */
    @TableField(value = "hold_refine5_group_id")
    private String holdRefine5GroupId;

    /**
     * 班组名称
     */
    @TableField(value = "hold_refine5_group_name")
    private String holdRefine5GroupName;

    /**
     * 轧机侧操作工ID
     */
    @TableField(value = "hold_refine5_caster_id")
    private String holdRefine5CasterId;

    /**
     * 轧机侧操作工名称
     */
    @TableField(value = "hold_refine5_caster_name")
    private String holdRefine5CasterName;

    /**
     * 熔炼侧操作工ID
     */
    @TableField(value = "hold_refine5_smelter_id")
    private String holdRefine5SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    @TableField(value = "hold_refine5_smelter_name")
    private String holdRefine5SmelterName;

    /**
     * 保温工序备注
     */
    @TableField(value = "hold_remark")
    private String holdRemark;

    /**
     * 保温工序审核
     */
    @TableField(value = "hold_approve")
    private String holdApprove;

    /**
     * 逻辑删除
     */
    @TableField(value = "delete_flag")
    private Integer deleteFlag;

    /**
     * 创建人ID
     */
    @TableField(value = "creator_id")
    private String creatorId;

    /**
     * 创建人姓名
     */
    @TableField(value = "creator_name")
    private String creatorName;

    /**
     * 修改人ID
     */
    @TableField(value = "reviser_id")
    private String reviserId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     *
     */
    @TableField(value = "ts")
    private Date ts;

    /**
     * 硅碳棒检查#接班断的根数
     */
    @TableField(value = "inspection_broken")
    private Integer inspectionBroken;

    /**
     * 硅碳棒检查#接班未装的根数
     */
    @TableField(value = "inspection_not_installed")
    private Integer inspectionNotInstalled;

    /**
     * 硅碳棒检查#接班更换的根数
     */
    @TableField(value = "inspection_replace")
    private Integer inspectionReplace;

    /**
     * 倒炉过程操作
     */
    @TableField(value = "turndown_process_operation")
    private String turndownProcessOperation;

    /**
     * 倒炉类型
     */
    @TableField(value = "turndown_type")
    private String turndownType;

    /**
     * 生产线号
     */
    @TableField(value = "heat_num")
    private String heatNum;

    /**
     * 倒炉前保温炉参数-余量吨数
     */
    @TableField(value = "turndown_before_remaining_weight")
    private BigDecimal turndownBeforeRemainingWeight;

    /**
     * 生产进度
     */
    @TableField(value = "produce_status")
    private String produceStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
