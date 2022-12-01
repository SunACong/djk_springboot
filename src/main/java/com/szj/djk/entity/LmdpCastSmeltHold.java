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
 * @TableName lmdp_cast_smelt_hold
 */
@TableName(value ="lmdp_cast_smelt_hold")
@Data
public class LmdpCastSmeltHold implements Serializable {
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
     * 关联计划ID
     */
    private String planId;

    /**
     * 熔次号
     */
    private String smeltTimes;

    /**
     * 生产线号
     */
    private String heatNum;

    /**
     * 牌号
     */
    private String brand;

    /**
     * 装炉时间
     */
    private Date feedTime;

    /**
     * 装炉班组ID
     */
    private String feedGroupId;

    /**
     * 装炉班组名称
     */
    private String feedGroupName;

    /**
     * 燃气表显示值
     */
    private Double gasPrepValue;

    /**
     * 铝锭99.70％(kg)

     */
    private Double stuffAlPig;

    /**
     * 铸轧卷
     */
    private String stuffCastReel;

    /**
     * 大块料
     */
    private String stuffBig;

    /**
     * 冷轧厚料≥0.6mm
     */
    private String stuffColdThick;

    /**
     * 冷轧薄料＜0.6mm
     */
    private String stuffColdThin;

    /**
     * 样板板头料跑渣料
     */
    private String stuffAlSlag;

    /**
     * 样板板头料跑渣料
     */
    private Double stuffSampleSlag;

    /**
     * 切边料
     */
    private String stuffTrim;

    /**
     * 其他废料#名称
     */
    private String stuffOtherName;

    /**
     * 其他废料#重量
     */
    private String stuffOtherWeight;

    /**
     * 电解原铝#灌铝班组ID
     */
    private String stuffAlGroupId;

    /**
     * 电解原铝#灌铝班组名称
     */
    private String stuffAlGroupName;

    /**
     * 电解原铝#累计重量
     */
    private Double stuffAlWeight;

    /**
     * 总装炉量
     */
    private Double stuffTotalWeight;

    /**
     * 固液比
     */
    private Double stuffStlRatio;

    /**
     * 点火时间
     */
    private Date firingTime;

    /**
     * 叉车搅拌#refine1_wt_fe第1次时间
     */
    private Date forkliftStirTime1;

    /**
     * 叉车搅拌#第2次时间
     */
    private Date forkliftStirTime2;

    /**
     * 叉车搅拌#第3次时间
     */
    private Date forkliftStirTime3;

    /**
     * 叉车搅拌#班组ID
     */
    private String forkliftGroupId;

    /**
     * 叉车搅拌#班组名称
     */
    private String forkliftGroupName;

    /**
     * 叉车搅拌#叉车工ID
     */
    private String forkliftDriverId;

    /**
     * 叉车搅拌#叉车工名称
     */
    private String forkliftDriverName;

    /**
     * 预扒渣#时间
     */
    private Date drossingTime;

    /**
     * 预扒渣#温度
     */
    private Double drossingTemp;

    /**
     * 配比前取样#时间
     */
    private Date prepSamplingTime;

    /**
     * 配比前取样#温度
     */
    private Double prepSamplingTemp;

    /**
     * 合金添加时间
     */
    private Date alloyRefine1AddTime;

    /**
     * 铁剂
     */
    private String alloyRefine1Fe;

    /**
     * 速溶硅
     */
    private String alloyRefine1Si;

    /**
     * 铝硅合金
     */
    private String alloyRefine1AlSi;

    /**
     * 东盛铜剂
     */
    private String alloyRefine1Cu;

    /**
     * 东盛锰剂
     */
    private String alloyRefine1Mn;

    /**
     * 铝钛合金
     */
    private String alloyRefine1AlTi;

    /**
     * 其他合金名称#合金名称
     */
    private String alloyRefine1OtherName;

    /**
     * 其他合金名称#添加量
     */
    private String alloyRefine1OtherDose;

    /**
     * 添加量复核#班组ID
     */
    private String alloyRefine1SmeltGroupId;

    /**
     * 添加量复核#班组名称
     */
    private String alloyRefine1SmeltGroupName;

    /**
     * 添加量复核#熔炼工ID
     */
    private String alloyRefine1SmelterId;

    /**
     * 添加量复核#熔炼工名称
     */
    private String alloyRefine1SmelterName;

    /**
     * 喷粉精炼#开始时间
     */
    private Date mimRefine1BeginTime;

    /**
     * 喷粉精炼#结束时间
     */
    private Date mimRefine1EndTime;

    /**
     * 喷粉精炼#温度
     */
    private Double mimRefine1Temp;

    /**
     * 喷粉精炼#精炼剂#介质
     */
    private String mimRefine1Medium;

    /**
     * 喷粉精炼#精炼剂#用量
     */
    private Double mimRefine1Dose;

    /**
     * 喷粉精炼#班组ID
     */
    private String mimRefine1GroupId;

    /**
     * 喷粉精炼#班组名称
     */
    private String mimRefine1GroupName;

    /**
     * 喷粉精炼#熔炼工ID
     */
    private String mimRefine1SmelterId;

    /**
     * 喷粉精炼#熔炼工名称
     */
    private String mimRefine1SmelterName;

    /**
     * 取样时间
     */
    private Date refine1SamplingTime;

    /**
     * 取样温度
     */
    private Double refine1SamplingTemp;

    /**
     * 配比班组id
     */
    private String refine1RatioGroupId;

    /**
     * 配比班组名称
     */
    private String refine1RatioGroupName;

    /**
     * 合金添加时间
     */
    private Date alloyRefine2AddTime;

    /**
     * 铁剂
     */
    private String alloyRefine2Fe;

    /**
     * 速溶硅
     */
    private String alloyRefine2Si;

    /**
     * 铝硅合金
     */
    private String alloyRefine2AlSi;

    /**
     * 东盛铜剂
     */
    private String alloyRefine2Cu;

    /**
     * 东盛锰剂
     */
    private String alloyRefine2Mn;

    /**
     * 铝钛合金
     */
    private String alloyRefine2AlTi;

    /**
     * 其他合金名称#合金名称
     */
    private String alloyRefine2OtherName;

    /**
     * 其他合金名称#添加量
     */
    private Double alloyRefine2OtherDose;

    /**
     * 添加量复核#班组ID
     */
    private String alloyRefine2GroupId;

    /**
     * 添加量复核#班组名称
     */
    private String alloyRefine2GroupName;

    /**
     * 添加量复核#熔炼工ID
     */
    private String alloyRefine2SmelterId;

    /**
     * 添加量复核#熔炼工名称
     */
    private String alloyRefine2SmelterName;

    /**
     * 开始时间
     */
    private Date grainRefine1BeginTime;

    /**
     * 结束时间
     */
    private Date grainRefine1EndTime;

    /**
     * 温度
     */
    private String grainRefine1Temp;

    /**
     * 精炼剂#介质
     */
    private String grainRefine1Medium;

    /**
     * 精炼剂#用量
     */
    private String grainRefine1Dose;

    /**
     * 班组ID
     */
    private String grainRefine1SmeltGroupId;

    /**
     * 班组名称
     */
    private String grainRefine1SmeltGroupName;

    /**
     * 熔炼工ID
     */
    private String grainRefine1SmelterId;

    /**
     * 熔炼工名称
     */
    private String grainRefine1SmelterName;

    /**
     * 操作工ID
     */
    private String grainRefine1OperatorId;

    /**
     * 操作工名称
     */
    private String grainRefine1OperatorName;

    /**
     * 扒渣工组ID
     */
    private String grainRefine1DrossingGroupId;

    /**
     * 扒渣班组名称
     */
    private String grainRefine1DrossingGroupName;

    /**
     * 开始时间
     */
    private Date grainRefine2BeginTime;

    /**
     * 结束时间
     */
    private Date grainRefine2EndTime;

    /**
     * 温度
     */
    private String grainRefine2Temp;

    /**
     * 精炼剂#介质
     */
    private String grainRefine2Medium;

    /**
     * 精炼剂#用量
     */
    private String grainRefine2Dose;

    /**
     * 班组ID
     */
    private String grainRefine2SmeltGroupId;

    /**
     * 班组名称
     */
    private String grainRefine2SmeltGroupName;

    /**
     * 熔炼工ID
     */
    private String grainRefine2SmelterId;

    /**
     * 熔炼工名称
     */
    private String grainRefine2SmelterName;

    /**
     * 操作工ID
     */
    private String grainRefine2OperatorId;

    /**
     * 操作工名称
     */
    private String grainRefine2OperatorName;

    /**
     * 扒渣班组ID
     */
    private String grainRefine2DrossingGroupId;

    /**
     * 扒渣班组名称(字段不对应grain_refine2_drossing_group )
     */
    private String grainRefine2DrossingGroupName;

    /**
     * 取样时间
     */
    private String prepTurndownSamplingTime;

    /**
     * 取样温度
     */
    private String prepTurndownSamplingTemp;

    /**
     * 倒炉班组
     */
    private String turndownGroupId;

    /**
     * 熔炼工
     */
    private String turndownSmelterId;

    /**
     * 熔炼炉#温度
     */
    private String turndownTemp;

    /**
     * 倒炉作业#开始时间
     */
    private Date turndownBeginTime;

    /**
     * 倒炉作业#结束时间
     */
    private Date turndownEndTime;

    /**
     * 倒炉作业#燃气抄表
     */
    private String gasPostValue;

    /**
     * 清炉工ID
     */
    private String turndownCleanerId;

    /**
     * 清炉工名称
     */
    private String turndownCleanerName;

    /**
     * 熔炼工序备注
     */
    private String smeltRemark;

    /**
     * 熔炼工序审核
     */
    private String smeltApprove;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 修改人ID
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