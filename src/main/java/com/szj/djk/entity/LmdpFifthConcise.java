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
 * @TableName lmdp_fifth_concise
 */
@TableName(value ="lmdp_fifth_concise")
@Data
public class LmdpFifthConcise implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 精炼间隔时间
     */
    private String holdRefine5FollowTime;

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
    private String holdRefine5Duration;

    /**
     * 温度
     */
    private String holdRefine5Temp;

    /**
     * 精炼剂#介质
     */
    private String holdRefine5Medium;

    /**
     * 精炼剂#用量
     */
    private String holdRefine5Dose;

    /**
     * 冷材加入量
     */
    private String holdRefine5ColdStuffDose;

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
    private String deleteFlag;

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
    private String createTime;

    /**
     * 修改时间
     */
    private String ts;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}