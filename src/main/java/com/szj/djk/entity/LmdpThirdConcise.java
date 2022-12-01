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
 * @TableName lmdp_third_concise
 */
@TableName(value ="lmdp_third_concise")
@Data
public class LmdpThirdConcise implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 精炼间隔时间
     */
    private String holdRefine3FollowTime;

    /**
     * 开始时间
     */
    private Date holdRefine3BeginTime;

    /**
     * 结束时间
     */
    private Date holdRefine3EndTime;

    /**
     * 精练时长
     */
    private String holdRefine3Duration;

    /**
     * 温度
     */
    private String holdRefine3Temp;

    /**
     * 精炼剂#介质
     */
    private String holdRefine3Medium;

    /**
     * 精炼剂#用量
     */
    private String holdRefine3Dose;

    /**
     * 冷材加入量
     */
    private String holdRefine3ColdStuffDose;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}