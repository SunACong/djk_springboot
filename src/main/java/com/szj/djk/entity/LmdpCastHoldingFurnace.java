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
 * @TableName lmdp_cast_holding_furnace
 */
@TableName(value ="lmdp_cast_holding_furnace")
@Data
public class LmdpCastHoldingFurnace implements Serializable {
    /**
     * id
     */
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
     * 熔次号
     */
    private String smeltTimes;

    /**
     * 牌号
     */
    private String brand;

    /**
     * 倒炉前保温炉参数-倒炉开始时间
     */
    private Date turndownBeforeBeginTime;

    /**
     * 倒炉前保温炉参数-倒炉班组
     */
    private String turndownBeforeGroupId;

    /**
     * 倒炉前保温炉参数-温度℃
     */
    private String turndownBeforeTemp;

    /**
     * 倒炉前保温炉参数-余量高度
     */
    private String turndownBeforeRemainingHeight;

    /**
     * 倒炉后参数-峰值温度℃
     */
    private String turndownAfterTopTemp;

    /**
     * 倒后温度℃
     */
    private String turndownAfterTemp;

    /**
     * 倒炉后时间
     */
    private Date turndownAfterEndTime;

    /**
     * 持续时长（分钟）
     */
    private Date turndownAfterPeriodTime;

    /**
     * 保温工序备注
     */
    private String holdRemark;

    /**
     * 保温工序审核
     */
    private String holdApprove;

    /**
     * 逻辑删除
     */
    private String deleteFlag;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 创建人姓名
     */
    private String creatorName;

    /**
     * 修改人ID
     */
    private String reviserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date ts;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}