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
 * @TableName lqcmr
 */
@TableName(value ="lqcmr")
@Data
public class Lqcmr implements Serializable {
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
