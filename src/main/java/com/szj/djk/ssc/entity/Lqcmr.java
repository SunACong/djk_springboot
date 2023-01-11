package com.szj.djk.ssc.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.szj.djk.common.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 *
 * @TableName lqcmr
 */
@TableName(value ="lqcmr")
@Data
public class Lqcmr extends BaseEntity {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 卷号
     */
    @TableField(value = "batch_num", condition = SqlCondition.LIKE)
    private String batchNum;

    /**
     * 更新时间
     */
    @TableField(value = "lqcmr_ts", fill = FieldFill.INSERT_UPDATE)
    private Date lqcmrTs;

    /**
     * 抗拉强度
     */
    private Double correctStrength;

    /**
     * 伸长率
     */
    private Double correctExtension;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
