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
 * @TableName lmdp_cold_furnace_record
 */
@TableName(value ="lmdp_cold_furnace_record")
@Data
public class LmdpColdFurnaceRecord implements Serializable {
    /**
     * id
     */
    @TableId
    private Integer id;

    /**
     * 数据来源
     */
    private String datasourceOrgcode;

    /**
     * 数据时间
     */
    private Date datatime;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 数据ID
     */
    private Integer dataId;

    /**
     * 入库时间
     */
    private Date enterTime;

    /**
     * 上传区域
     */
    private String uploadAreacode;

    /**
     * 时间戳
     */
    private Date ts;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 冷轧卷号
     */
    private String batchNum;

    /**
     * 退火日期
     */
    private String recordDate;

    /**
     * 退火炉号
     */
    private String furnaceNum;

    /**
     * 退火开始时间
     */
    private Date startTime;

    /**
     * 退火结束时间
     */
    private Date endTime;

    /**
     * 记录日期
     */
    private Date recordTime;

    /**
     * 炉气温度(℃)Ⅰ区
     */
    private Double gasTemperature1;

    /**
     * 炉气温度(℃)Ⅱ区
     */
    private Double gasTemperature2;

    /**
     * 炉气温度(℃)Ⅲ区
     */
    private Double gasTemperature3;

    /**
     * 料温(℃)1
     */
    private Double materialTemperature1;

    /**
     * 料温(℃)2
     */
    private Double materialTemperature2;

    /**
     * 水压MPa
     */
    private Double hydraulicPressure;

    /**
     * 气压MPa
     */
    private Double gasPressure;

    /**
     * 进风风机轴承温度℃
     */
    private Double intakeFanTemperature;

    /**
     * 排烟风机轴承温度℃
     */
    private Double exhaustFanTemperature;

    /**
     * 循环风机轴承温度(℃)Ⅰ区
     */
    private Double cycleFanTemperature1;

    /**
     * 循环风机轴承温度(℃)Ⅱ区
     */
    private Double cycleFanTemperature2;

    /**
     * 循环风机轴承温度(℃)Ⅲ区
     */
    private Double cycleFanTemperature3;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作手
     */
    private String operator;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}