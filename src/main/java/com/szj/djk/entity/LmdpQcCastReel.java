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
 * @TableName lmdp_qc_cast_reel
 */
@TableName(value ="lmdp_qc_cast_reel")
@Data
public class LmdpQcCastReel implements Serializable {
    /**
     * ID
     */
    @TableId
    private String id;

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
    private String dataId;

    /**
     * 入库时间
     */
    private Date enterTime;

    /**
     * 上传区域
     */
    private String uploadAreacode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date ts;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 批号(铸轧卷号)
     */
    private String reelNum;

    /**
     * 规格
     */
    private String model;

    /**
     * 牌号
     */
    private String brand;

    /**
     * 重量
     */
    private String weight;

    /**
     * 化学成份
     */
    private String wt;

    /**
     * 铝熔体氢含量
     */
    private String hdaf;

    /**
     * 低倍组织
     */
    private String lpsSize;

    /**
     * 晶粒度
     */
    private String sampleLevel;

    /**
     * 高倍组织
     */
    private String hpsSize;

    /**
     * 高倍组织图片
     */
    private String hpsPicture;

    /**
     * 板形质量
     */
    private String shapeQc;

    /**
     * 厚度(mm)
     */
    private Double thickness;

    /**
     * 宽度(mm)
     */
    private Double width;

    /**
     * 表面质量
     */
    private String surfaceQc;

    /**
     * 外观质量
     */
    private String facadeQc;

    /**
     * 铸轧卷质量判定
     */
    private String judgeResult;

    /**
     * 铸轧卷质量缺陷描述
     */
    private String judgeReamrk;

    /**
     * 主机速度
     */
    private Double hostSpeed;

    /**
     * 钛丝品牌
     */
    private String tiWireBrand;

    /**
     * 钛丝速度
     */
    private String tiWireSpeed;

    /**
     * 下卷时间
     */
    private Date nextReelTime;

    /**
     * 处理意见
     */
    private String advise;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}