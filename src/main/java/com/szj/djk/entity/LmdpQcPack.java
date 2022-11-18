package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 *
 * @TableName lmdp_qc_pack
 */
@TableName(value ="lmdp_qc_pack")
@Data
public class LmdpQcPack implements Serializable {
    /**
     *
     */
    private String id;

    /**
     *
     */
    @JsonFormat(
            //pattern = "yyyy-MM-dd HH:mm:ss",
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Timestamp createTime;

    /**
     *
     */
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Timestamp ts;

    /**
     *
     */
    private String creatorId;

    /**
     *
     */
    private String batchNum;

    /**
     *
     */
    private String model;

    /**
     *
     */
    private String alloyStatus;

    /**
     *
     */
    private String rollDiameter;

    /**
     *
     */
    private String weight;

    /**
     *
     */
    private String sample;

    /**
     *
     */
    private String cert;

    /**
     *
     */
    private String productCcie;

    /**
     *
     */
    private String packageQc;

    /**
     *
     */
    private String outerLabel;

    /**
     *
     */
    @JsonFormat(
            //pattern = "yyyy-MM-dd HH:mm:ss",
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Timestamp packageTime;

    /**
     *
     */
    @JsonFormat(
            //pattern = "yyyy-MM-dd HH:mm:ss",
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private String inspectorId;

    /**
     *
     */
    @JsonFormat(
            //pattern = "yyyy-MM-dd HH:mm:ss",
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Timestamp reportTime;

    /**
     *
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
