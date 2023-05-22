package com.szj.djk.common;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName BaseEntity
 * @Authoc 孙少聪
 * @Date 2023/1/11 10:44:01
 */
@Data
public class BaseEntity implements Serializable {

    @TableField(exist = false)
    private String startDateTime;

    @TableField(exist = false)
    private String endDateTime;

    @TableField(exist = false)
    private Double exceedTime;

    @TableField(exist = false)
    private Double runningTime;

    @TableField(exist = false)
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date beginTime;

    @TableField(exist = false)
    private String numberID;

}
