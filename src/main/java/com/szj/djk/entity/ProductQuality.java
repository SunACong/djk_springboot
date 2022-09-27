package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

/**
 * @ClassName ProductQuality
 * @Authoc 孙少聪
 * @Date 2022/9/25 10:12:58
        */

@Data
public class ProductQuality {

    private Integer id;
    private String batchNum;

    @JsonFormat(
            //pattern = "yyyy-MM-dd HH:mm:ss",
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Timestamp ts;

    private String consumer;

    private Double singleStraightness;

    private Double singleMediumConvexity;

    private Double finishedThickness;

    private Double finishedWidth;

    private Double finishedRollDiameter;

    private Double finishedWeight;

    private String surfaceQualityRemark;

    private String correctStrength;

    private String correctExtension;

    private Integer plateType;

    private Integer sizeDeviation;

    private Integer mechanicalProperties;

    private Integer surfaceQuality;

    private Integer appearanceQuality;

    private Integer qualityJudgment;

    private String remark;

    /** 查询开始时间 */
    @TableField(exist = false)
    private String startDateTime;

    /** 查询截止时间 */
    @TableField(exist = false)
    private String endDateTime;
}
