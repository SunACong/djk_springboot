package com.szj.djk.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.szj.djk.entity.LmdpColdPlan;
import com.szj.djk.entity.LmdpQcColdInspect;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @TableName plan_and_inspect
 */
@TableName(value ="plan_and_inspect")
@Data
public class PlanAndInspect implements Serializable {
    /**
     * 冷轧卷号
     */
    @TableId
    private String batchNum;

    /**
     * 计划编号
     */
    private String planNum;

    /**
     * 巡检表创建时间
     */
    private Date createTime;

    /**
     * 巡检表更新时间
     */
    private Date ts;

    /**
     * 板型判定
     */
    private Integer plateTypeDetermination;

    /**
     * 力学性能判定
     */
    private Integer mechanicalPropertiesDetermination;

    /**
     * 尺寸偏差判定
     */
    private Integer dimensionalDeviationDetermination;

    /**
     * 表面质量判定
     */
    private Integer surfaceQualityDetermination;

    /**
     * 外观质量判定
     */
    private Integer appearanceQualityDetermination;

    /**
     * 开始判定日期
     */
    private Date determinationCreateTime;

    /**
     * 更新判定日期
     */
    private Date determinationUpdateTime;

    /**
     * 计划表
     */
    private LmdpColdPlan lmdpColdPlan;

    /**
     * 巡检表
     */
    private LmdpQcColdInspect lmdpQcColdInspect;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
