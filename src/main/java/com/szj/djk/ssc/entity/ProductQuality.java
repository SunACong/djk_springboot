package com.szj.djk.ssc.entity;

import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.szj.djk.common.BaseEntity;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @ClassName ProductQuality
 * @Authoc 孙少聪
 * @Date 2022/9/25 10:12:58
        */

@Data
public class ProductQuality extends BaseEntity {

    @TableField(value = "batch_num" , condition = SqlCondition.LIKE)
    private String batchNum;

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            //pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Timestamp lqciTs;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            //pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Timestamp lqcmrTs;

    private String consumer;

    private Double singleStraightness;

    private Double singleMediumConvexity;

    private Double finishedThickness;

    private Double finishedWidth;

    private Double finishedRollDiameter;

    private Double finishedWeight;

    private String surfaceQualityRemark;

    private Double correctStrength;

    private Double correctExtension;

    private Integer plateType;

    private Integer sizeDeviation;

    private Integer mechanicalProperties;

    private Integer surfaceQuality;

    private Integer appearanceQuality;

    private Integer qualityJudgment;

    private String remark;

    @TableField(exist = false)
    private ProcessStandard processStandard;

    /** 是否立马判定*/
    @TableField(exist = false)
    private Integer isDecision;
}
