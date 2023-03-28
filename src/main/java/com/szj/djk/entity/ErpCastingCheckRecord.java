package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 铸轧成品质检记录
 * @TableName erp_casting_check_record
 */
@TableName(value ="erp_casting_check_record")
@Data
public class ErpCastingCheckRecord implements Serializable {
    /**
     * 数据ID
     */
    @TableId(value = "data_id")
    private String dataId;

    /**
     * 数据类型
     */
    @TableField(value = "datatype")
    private String datatype;

    /**
     * 入库时间
     */
    @TableField(value = "enter_time")
    private Date enterTime;

    /**
     * 数据时间
     */
    @TableField(value = "datatime")
    private Date datatime;

    /**
     * 数据导入批次号
     */
    @TableField(value = "_import_task_id")
    private String importTaskId;

    /**
     * 不合格原因
     */
    @TableField(value = "reason")
    private String reason;

    /**
     * Grain
     */
    @TableField(value = "Grain")
    private String grain;

    /**
     * 外观质量
     */
    @TableField(value = "exterior")
    private String exterior;

    /**
     * H
     */
    @TableField(value = "H")
    private String h;

    /**
     * 卷径
     */
    @TableField(value = "reel_path")
    private Double reelPath;

    /**
     * tissue
     */
    @TableField(value = "tissue")
    private String tissue;

    /**
     * 检查码
     */
    @TableField(value = "check_number")
    private String checkNumber;

    /**
     * 客户姓名
     */
    @TableField(value = "custom_name")
    private String customName;

    /**
     * 产品卷号
     */
    @TableField(value = "goods_reel")
    private String goodsReel;

    /**
     * 尺寸偏差
     */
    @TableField(value = "sizi_bias")
    private String siziBias;

    /**
     * 化学成分
     */
    @TableField(value = "ingredients")
    private String ingredients;

    /**
     * 晶粒度等级
     */
    @TableField(value = "grain_rank")
    private String grainRank;

    /**
     * 判定
     */
    @TableField(value = "judge")
    private String judge;

    /**
     * 状态
     */
    @TableField(value = "state")
    private String state;

    /**
     * 软删除标识
     */
    @TableField(value = "delete_flag")
    private String deleteFlag;

    /**
     * 规格宽
     */
    @TableField(value = "height")
    private Double height;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 版型
     */
    @TableField(value = "version_type")
    private String versionType;

    /**
     * 合同
     */
    @TableField(value = "contract")
    private String contract;

    /**
     * 牌号
     */
    @TableField(value = "trademark_number")
    private String trademarkNumber;

    /**
     * 铸轧成品检测id
     */
    @TableField(value = "check_id")
    private Long checkId;

    /**
     * H1
     */
    @TableField(value = "H1")
    private String h1;

    /**
     * 签收日期
     */
    @TableField(value = "sign_date")
    private Date signDate;

    /**
     * 重量
     */
    @TableField(value = "weight")
    private String weight;

    /**
     * 产品名称
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 生产随行卡id
     */
    @TableField(value = "card_id")
    private Long cardId;

    /**
     * 最后修改人
     */
    @TableField(value = "lastmodify_user")
    private String lastmodifyUser;

    /**
     * 表面及外观质量
     */
    @TableField(value = "appearance")
    private String appearance;

    /**
     * 最后修改时间
     */
    @TableField(value = "lastmodify_time")
    private Date lastmodifyTime;

    /**
     * 规格长
     */
    @TableField(value = "width")
    private Double width;

    /**
     * 质检人
     */
    @TableField(value = "check_user")
    private String checkUser;

    /**
     * 创建人
     */
    @TableField(value = "create_user")
    private String createUser;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}