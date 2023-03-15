package com.szj.djk.vo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.szj.djk.entity.LmdpQcColdInspect;
import com.szj.djk.entity.SlaveErpPlanColdreductionstrip;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
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
    @TableField(condition = SqlCondition.LIKE)
    private String batchNum;

    /**
     * 计划编号
     */
    @TableField(condition = SqlCondition.LIKE)
    private String planNum;

    /**
     * 巡检表创建时间
     */
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date inspectCreateTime;

    /**
     * 巡检表更新时间
     */
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
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
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private LocalDateTime createTime;

    /**
     * 更新判定日期
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private LocalDateTime updateTime;

    /**
     * 计划表
     */
    @TableField(exist = false)
    private SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip;

    /**
     * 巡检表
     */
    @TableField(exist = false)
    private LmdpQcColdInspect lmdpQcColdInspect;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
