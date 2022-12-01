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
 * @TableName lmdp_second_concise
 */
@TableName(value ="lmdp_second_concise")
@Data
public class LmdpSecondConcise implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 精炼间隔时间
     */
    private String holdRefine2FollowTime;

    /**
     * 开始时间
     */
    private Date holdRefine2BeginTime;

    /**
     * 结束时间
     */
    private Date holdRefine2EndTime;

    /**
     * 精练时长
     */
    private String holdRefine2Duration;

    /**
     * 温度
     */
    private String holdRefine2Temp;

    /**
     * 精炼剂#介质

     */
    private String holdRefine2Medium;

    /**
     * 精炼剂#用量
     */
    private String holdRefine2Dose;

    /**
     * 冷材加入量
     */
    private String holdRefine2ColdStuffDose;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}