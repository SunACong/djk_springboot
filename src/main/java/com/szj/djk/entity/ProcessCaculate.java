package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName process_caculate
 */
@TableName(value ="process_caculate")
@Data
public class ProcessCaculate implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private Double rongLian;

    /**
     * 
     */
    private Double baoWen;

    /**
     * 
     */
    private Double zhuZha;

    /**
     * 
     */
    private Double lengZha;

    /**
     * 
     */
    private Double tuiHuo;

    /**
     * 
     */
    private Double chongJuan;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}