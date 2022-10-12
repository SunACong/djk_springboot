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
 * @TableName lqci
 */
@TableName(value ="lqci")
@Data
public class Lqci implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 卷号
     */
    private String batchNum;

    /**
     * 更新时间
     */
    private Date lqciTs;

    /**
     * 客户
     */
    private String consumer;

    /**
     * 平直度
     */
    private Double singleStraightness;

    /**
     * 中凸度
     */
    private Double singleMediumConvexity;

    /**
     * 厚度
     */
    private Double finishedThickness;

    /**
     * 宽度
     */
    private Double finishedWidth;

    /**
     * 卷径
     */
    private Double finishedRollDiameter;

    /**
     * 卷重
     */
    private Double finishedWeight;

    /**
     * 表面质量
     */
    private String surfaceQualityRemark;

    /**
     * 力学性能
     */
    private Lqcmr lqcmr;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
