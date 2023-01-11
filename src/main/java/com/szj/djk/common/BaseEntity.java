package com.szj.djk.common;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BaseEntity
 * @Authoc 孙少聪
 * @Date 2023/1/11 10:44:01
 */
@Data
public class BaseEntity implements Serializable {
    private Integer id;

    @TableField(exist = false)
    private String startDateTime;

    @TableField(exist = false)
    private String endDateTime;
}
