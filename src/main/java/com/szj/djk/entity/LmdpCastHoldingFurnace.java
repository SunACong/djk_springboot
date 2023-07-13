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
 * 保温工序
 * @TableName lmdp_cast_holding_furnace
 */
@TableName(value ="lmdp_cast_holding_furnace")
@Data
public class LmdpCastHoldingFurnace implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 熔次号
     */
    private String smeltTimes;

    /**
     * 牌号
     */
    private String brand;

    /**
     * 倒炉前保温炉参数-倒炉开始时间
     */
    private Date turndownBeforeBeginTime;

    /**
     * 倒炉前保温炉参数-倒炉班组
     */
    private String turndownBeforeGroupId;

    /**
     * 倒炉前保温炉参数-温度℃
     */
    private BigDecimal turndownBeforeTemp;

    /**
     * 倒炉前保温炉参数-余量高度
     */
    private BigDecimal turndownBeforeRemainingHeight;

    /**
     * 倒炉后参数-峰值温度℃
     */
    private BigDecimal turndownAfterTopTemp;

    /**
     * 倒后温度℃
     */
    private BigDecimal turndownAfterTemp;

    /**
     * 倒炉后时间
     */
    private Date turndownAfterEndTime;

    /**
     * 持续时长（分钟）
     */
    private Integer turndownAfterPeriodTime;

    /**
     * 开始时间
     */
    private Date holdRefine1BeginTime;

    /**
     * 结束时间
     */
    private Date holdRefine1EndTime;

    /**
     * 精炼时长
     */
    private Integer holdRefine1Duration;

    /**
     * 温度
     */
    private BigDecimal holdRefine1Temp;

    /**
     * 精炼剂#介质
     */
    private String holdRefine1Medium;

    /**
     * 精炼剂#用量
     */
    private BigDecimal holdRefine1Dose;

    /**
     * 冷材加入量
     */
    private BigDecimal holdRefine1ColdStuffDose;

    /**
     * 班组ID
     */
    private String holdRefine1GroupId;

    /**
     * 班组名称
     */
    private String holdRefine1GroupName;

    /**
     * 轧机侧操作工ID
     */
    private String holdRefine1CasterId;

    /**
     * 轧机侧操作工名称
     */
    private String holdRefine1CasterName;

    /**
     * 熔炼侧操作工ID
     */
    private String holdRefine1SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    private String holdRefine1SmelterName;

    /**
     * 取样时间
     */
    private Date holdRefine1SamplingTime;

    /**
     * 取样温度
     */
    private BigDecimal holdRefine1SamplingTemp;

    /**
     * 精炼间隔时间
     */
    private BigDecimal holdRefine2FollowTime;

    /**
     * 开始时间
     */
    private Date holdRefine2BeginTime;

    /**
     * 结束时间
     */
    private Date holdRefine2EndTime;

    /**
     * 精炼时长
     */
    private Integer holdRefine2Duration;

    /**
     * 温度
     */
    private BigDecimal holdRefine2Temp;

    /**
     * 精炼剂#介质
     */
    private String holdRefine2Medium;

    /**
     * 精炼剂#用量
     */
    private BigDecimal holdRefine2Dose;

    /**
     * 冷材加入量
     */
    private BigDecimal holdRefine2ColdStuffDose;

    /**
     * 班组ID
     */
    private String holdRefine2GroupId;

    /**
     * 班组名称
     */
    private String holdRefine2GroupName;

    /**
     * 轧机侧操作工ID
     */
    private String holdRefine2CasterId;

    /**
     * 轧机侧操作工名称
     */
    private String holdRefine2CasterName;

    /**
     * 熔炼侧操作工ID
     */
    private String holdRefine2SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    private String holdRefine2SmelterName;

    /**
     * 精炼间隔时间
     */
    private Integer holdRefine3FollowTime;

    /**
     * 开始时间
     */
    private Date holdRefine3BeginTime;

    /**
     * 结束时间
     */
    private Date holdRefine3EndTime;

    /**
     * 精炼时长
     */
    private Integer holdRefine3Duration;

    /**
     * 温度
     */
    private BigDecimal holdRefine3Temp;

    /**
     * 精炼剂#介质
     */
    private String holdRefine3Medium;

    /**
     * 精炼剂#用量
     */
    private BigDecimal holdRefine3Dose;

    /**
     * 冷材加入量
     */
    private BigDecimal holdRefine3ColdStuffDose;

    /**
     * 班组ID
     */
    private String holdRefine3GroupId;

    /**
     * 班组名称
     */
    private String holdRefine3GroupName;

    /**
     * 轧机侧操作工ID
     */
    private String holdRefine3CasterId;

    /**
     * 轧机侧操作工名称
     */
    private String holdRefine3CasterName;

    /**
     * 熔炼侧操作工ID
     */
    private String holdRefine3SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    private String holdRefine3SmelterName;

    /**
     * 精炼间隔时间
     */
    private Integer holdRefine4FollowTime;

    /**
     * 开始时间
     */
    private Date holdRefine4BeginTime;

    /**
     * 结束时间
     */
    private Date holdRefine4EndTime;

    /**
     * 精炼时长
     */
    private Integer holdRefine4Duration;

    /**
     * 温度
     */
    private BigDecimal holdRefine4Temp;

    /**
     * 精炼剂#介质
     */
    private String holdRefine4Medium;

    /**
     * 精炼剂#用量
     */
    private BigDecimal holdRefine4Dose;

    /**
     * 冷材加入量
     */
    private BigDecimal holdRefine4ColdStuffDose;

    /**
     * 班组ID
     */
    private String holdRefine4GroupId;

    /**
     * 班组名称
     */
    private String holdRefine4GroupName;

    /**
     * 轧机侧操作工ID
     */
    private String holdRefine4CasterId;

    /**
     * 轧机侧操作工名称
     */
    private String holdRefine4CasterName;

    /**
     * 熔炼侧操作工ID
     */
    private String holdRefine4SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    private String holdRefine4SmelterName;

    /**
     * 精炼间隔时间
     */
    private Integer holdRefine5FollowTime;

    /**
     * 开始时间
     */
    private Date holdRefine5BeginTime;

    /**
     * 结束时间
     */
    private Date holdRefine5EndTime;

    /**
     * 精炼时长
     */
    private Integer holdRefine5Duration;

    /**
     * 温度
     */
    private BigDecimal holdRefine5Temp;

    /**
     * 精炼剂#介质
     */
    private String holdRefine5Medium;

    /**
     * 精炼剂#用量
     */
    private BigDecimal holdRefine5Dose;

    /**
     * 冷材加入量
     */
    private BigDecimal holdRefine5ColdStuffDose;

    /**
     * 班组ID
     */
    private String holdRefine5GroupId;

    /**
     * 班组名称
     */
    private String holdRefine5GroupName;

    /**
     * 轧机侧操作工ID
     */
    private String holdRefine5CasterId;

    /**
     * 轧机侧操作工名称
     */
    private String holdRefine5CasterName;

    /**
     * 熔炼侧操作工ID
     */
    private String holdRefine5SmelterId;

    /**
     * 熔炼侧操作工名称
     */
    private String holdRefine5SmelterName;

    /**
     * 保温工序备注
     */
    private String holdRemark;

    /**
     * 保温工序审核
     */
    private String holdApprove;

    /**
     * 逻辑删除
     */
    private Integer deleteFlag;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 创建人姓名
     */
    private String creatorName;

    /**
     * 修改人ID
     */
    private String reviserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 
     */
    private Date ts;

    /**
     * 硅碳棒检查#接班断的根数
     */
    private Integer inspectionBroken;

    /**
     * 硅碳棒检查#接班未装的根数
     */
    private Integer inspectionNotInstalled;

    /**
     * 硅碳棒检查#接班更换的根数
     */
    private Integer inspectionReplace;

    /**
     * 倒炉过程操作
     */
    private String turndownProcessOperation;

    /**
     * 倒炉类型
     */
    private String turndownType;

    /**
     * 生产线号
     */
    private String heatNum;

    /**
     * 倒炉前保温炉参数-余量吨数
     */
    private BigDecimal turndownBeforeRemainingWeight;

    /**
     * 生产进度
     */
    private String produceStatus;

    /**
     * 硅碳棒检查#交班的根数
     */
    private Integer inspectionChange;

    /**
     * 保温开始#电度（kw·h）
     */
    private BigDecimal startPower;

    /**
     * 保温结束#电度（kw·h）
     */
    private BigDecimal endPower;

    /**
     * 第6次精炼#开始时间
     */
    private Date holdRefine6BeginTime;

    /**
     * 第6次精炼#结束时间
     */
    private Date holdRefine6EndTime;

    /**
     * 第6次精炼#精炼时长
     */
    private BigDecimal holdRefine6Duration;

    /**
     * 第6次精炼#温度
     */
    private BigDecimal holdRefine6Temp;

    /**
     * 第6次精炼#精炼剂#介质
     */
    private String holdRefine6Medium;

    /**
     * 第6次精炼#精炼剂#用量
     */
    private BigDecimal holdRefine6Dose;

    /**
     * 第6次精炼#冷材加入量
     */
    private BigDecimal holdRefine6ColdStuffDose;

    /**
     * 第6次精炼#班组ID
     */
    private String holdRefine6GroupId;

    /**
     * 第6次精炼#轧机侧操作工ID
     */
    private String holdRefine6CasterId;

    /**
     * 第6次精炼#熔炼侧操作工ID
     */
    private String holdRefine6SmelterId;

    /**
     * 第6次精炼#精炼时间间隔
     */
    private BigDecimal holdRefine6FollowTime;

    /**
     * 第7次精炼#开始时间
     */
    private Date holdRefine7BeginTime;

    /**
     * 第7次精炼#结束时间
     */
    private Date holdRefine7EndTime;

    /**
     * 第7次精炼#精炼时长
     */
    private BigDecimal holdRefine7Duration;

    /**
     * 第7次精炼#温度
     */
    private BigDecimal holdRefine7Temp;

    /**
     * 第7次精炼#精炼剂#介质
     */
    private String holdRefine7Medium;

    /**
     * 第7次精炼#精炼剂#用量
     */
    private BigDecimal holdRefine7Dose;

    /**
     * 第7次精炼#冷材加入量
     */
    private BigDecimal holdRefine7ColdStuffDose;

    /**
     * 第7次精炼#班组ID
     */
    private String holdRefine7GroupId;

    /**
     * 第7次精炼#轧机侧操作工ID
     */
    private String holdRefine7CasterId;

    /**
     * 第7次精炼#熔炼侧操作工ID
     */
    private String holdRefine7SmelterId;

    /**
     * 第7次精炼#精炼时间间隔
     */
    private BigDecimal holdRefine7FollowTime;

    /**
     * 判断熔次号年份
     */
    private String yearFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}