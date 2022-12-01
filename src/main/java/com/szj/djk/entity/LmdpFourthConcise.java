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
 * @TableName lmdp_fourth_concise
 */
@TableName(value ="lmdp_fourth_concise")
@Data
public class LmdpFourthConcise implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 精炼间隔时间
     */
    private String holdRefine4FollowTime;

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
    private String holdRefine4Duration;

    /**
     * 温度
     */
    private String holdRefine4Temp;

    /**
     * 精炼剂#介质
     */
    private String holdRefine4Medium;

    /**
     * 精炼剂#用量
     */
    private String holdRefine4Dose;

    /**
     * 冷材加入量
     */
    private String holdRefine4ColdStuffDose;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}