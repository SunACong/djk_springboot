package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 可视化字典
 * @TableName report_dict
 */
@TableName(value ="report_dict_1")
@Data
public class ReportDict implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "ts")
    private Date ts;

    /**
     * 
     */
    @TableField(value = "type_name")
    private String typeName;

    /**
     * 
     */
    @TableField(value = "type")
    private String type;

    /**
     * 
     */
    @TableField(value = "value")
    private String value;

    /**
     * 
     */
    @TableField(value = "chdesc")
    private String chdesc;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 
     */
//    @TableField(value = "sort_order")
    @TableField(exist = false)
    private Integer sortOrder;


    /**
     * 
     */
//    @TableField(value = "modify_flag")
    @TableField(exist = false)
    private Integer modifyFlag;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}