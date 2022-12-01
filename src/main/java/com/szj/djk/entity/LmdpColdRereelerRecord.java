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
 * @TableName lmdp_cold_rereeler_record
 */
@TableName(value ="lmdp_cold_rereeler_record")
@Data
public class LmdpColdRereelerRecord implements Serializable {
    /**
     * id
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
     * 时间戳
     */
    private Date ts;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 主操手
     */
    private String mainOperator;

    /**
     * 辅助工
     */
    private String assistantOperator;

    /**
     * 班次
     */
    private String workShift;

    /**
     * 日期
     */
    private Date recordDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 合金状态
     */
    private String brand;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 来料卷号(铸轧卷号)
     */
    private String reelNum;

    /**
     * 来料规格mm
     */
    private String originRegular;

    /**
     * 加工后冷轧卷号
     */
    private String batchNum;

    /**
     * 加工后规格mm
     */
    private String processedRegular;

    /**
     * 运行参数#机列速度m/min
     */
    private Double machineSpeed;

    /**
     * 运行参数#卷取张应力N/M2
     */
    private Double reelingTensileStress;

    /**
     * 运行参数#刀缝间隙MM
     */
    private Double knifeGap;

    /**
     * 金属平衡#投料量Kg
     */
    private Double originWeight;

    /**
     * 金属平衡#成品量Kg
     */
    private Double processedWeight;

    /**
     * 金属平衡#废料量#头料M(kg)
     */
    private Double wasteMaterialHead;

    /**
     * 金属平衡#废料量#尾料M(kg)
     */
    private Double wasteMaterialTail;

    /**
     * 金属平衡#废料量#其它Kg
     */
    private Double wasteMaterialElse;

    /**
     * 质量状况#质量情况
     */
    private String quality;

    /**
     * 质量状况#判定结果
     */
    private String result;

    /**
     * 质量状况#确认人
     */
    private String confirmer;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}