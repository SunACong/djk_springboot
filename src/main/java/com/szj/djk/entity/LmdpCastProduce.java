package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 铸轧对象 lmdp_cast_produce
 *
 * @author jiahua
 * @date 2022-10-24
 */
@TableName(value = "lmdp_cast_produce")
@Data
public class LmdpCastProduce implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** $column.columnComment */
    private String planId;

    /** $column.columnComment */
    private String smeltTimes;

    /** $column.columnComment */
    private String reelNum;

    /** $column.columnComment */

    private String brand;

    /** $column.columnComment */

    private String customer;

    /** $column.columnComment */

    private String thick;

    /** $column.columnComment */

    private String width;

    /** $column.columnComment */

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            //pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Timestamp procUpperTime;

    /** $column.columnComment */

    private String procUpperShiftTthick;

    /** $column.columnComment */

    private String procUpperShiftTweight;

    /** $column.columnComment */

    private String procLowerLocationNum;

    /** $column.columnComment */

    private String procLowerDutyWeight;

    /** $column.columnComment */

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            //pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Timestamp procLowerRemoveTime;

    /** $column.columnComment */

    private String procLowerRollDiameter;

    /** $column.columnComment */

    private String qtfhTurndownTime;

    /** $column.columnComment */

    private String qtfhTurndownSmeltNum;

    /** $column.columnComment */

    private String ts;

    /** 查询开始时间 */
    @TableField(exist = false)
    private String startDateTime;

    /** 查询截止时间 */
    @TableField(exist = false)
    private String endDateTime;

}
