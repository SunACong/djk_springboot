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
 * @TableName lmdp_first_concise
 */
@TableName(value ="lmdp_first_concise")
@Data
public class LmdpFirstConcise implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 开始时间
     */
    private Date holdRefine1BeginTime;

    /**
     * 结束时间
     */
    private Date holdRefine1EndTime;

    /**
     * 精练时长
     */
    private String holdRefine1Duration;

    /**
     * 温度
     */
    private String holdRefine1Temp;

    /**
     * 精练质#介质
     */
    private String holdRefine1Medium;

    /**
     * 精练质#用量
     */
    private String holdRefine1Dose;

    /**
     * 冷材加入量
     */
    private String holdRefine1ColdStuffDose;

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
    private String holdRefine1SamplingTemp;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}