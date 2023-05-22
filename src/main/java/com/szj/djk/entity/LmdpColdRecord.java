package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.szj.djk.common.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 冷轧生产原始记录
 * @TableName lmdp_cold_record
 */
@TableName(value ="lmdp_cold_record")
@Data
public class LmdpColdRecord extends BaseEntity implements Serializable {
    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 
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
     * 副操
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
     * 合金牌号
     */
    private String brand;

    /**
     * 冷轧卷号
     */
    private String batchNum;

    /**
     * 道次号
     */
    private Integer recordNum;

    /**
     * 尺寸规格#入口厚度
     */
    private BigDecimal thickIn;

    /**
     * 尺寸规格#出口厚度
     */
    private BigDecimal thickOut;

    /**
     * 尺寸规格#宽度
     */
    private BigDecimal width;

    /**
     * 轧制参数#轧制速度
     */
    private BigDecimal rollingSpeed;

    /**
     * 轧制参数#轧制力
     */
    private BigDecimal rollingForce;

    /**
     * 轧制参数#开卷张应力
     */
    private BigDecimal decoilTensileStress;

    /**
     * 轧制参数#卷取张应力
     */
    private BigDecimal reelingTensileStress;

    /**
     * 轧制参数#版型曲线
     */
    private BigDecimal curve;

    /**
     * 工艺油#油温
     */
    private BigDecimal oilTemperature;

    /**
     * 工艺油#油压
     */
    private BigDecimal oilPressure;

    /**
     * 工艺油#流量
     */
    private BigDecimal oilFlow;

    /**
     * 金属平衡#入口重量
     */
    private BigDecimal actioningWeight;

    /**
     * 金属平衡#出口重量
     */
    private BigDecimal producingWeight;

    /**
     * 金属平衡#废料重量
     */
    private BigDecimal wasteWeight;

    /**
     * 质量异常情况
     */
    private String quality;

    /**
     * 班组
     */
    private String workGroup;

    /**
     * 冷轧生产开始时间
     */
    private Date startTime;

    /**
     * 冷轧生产结束时间
     */
    private Date endTime;

    /**
     * 气源压力
     */
    private BigDecimal airSourcePress;

    /**
     * 坯料重量（t）
     */
    private BigDecimal blankWeight;

    /**
     * 订货单位
     */
    private String customer;

    /**
     * 生产顺序
     */
    private String produceOrder;

    /**
     * 压缩空气温度
     */
    private BigDecimal airTemperature;

    /**
     * 轧辊辊号
     */
    private String rollNum;

    /**
     * 主操手#第二道次
     */
    private String mainOperator2;

    /**
     * 班次#第二道次
     */
    private String workShift2;

    /**
     * 生产顺序#第二道次
     */
    private String produceOrder2;

    /**
     * 入口厚度（mm）#第二道次
     */
    private BigDecimal thickIn2;

    /**
     * 出口厚度（mm）#第二道次
     */
    private BigDecimal thickOut2;

    /**
     * 宽度（mm）#第二道次
     */
    private BigDecimal width2;

    /**
     * 开卷张力（kg/mm²）#第二道次
     */
    private BigDecimal decoilTensileStress2;

    /**
     * 卷取张力（kg/mm²）#第二道次
     */
    private BigDecimal reelingTensileStress2;

    /**
     * 轧制速度（m/min）#第二道次
     */
    private BigDecimal rollingSpeed2;

    /**
     * 轧制油温度（°C）#第二道次
     */
    private BigDecimal oilTemperature2;

    /**
     * 轧制油流量#第二道次
     */
    private BigDecimal oilFlow2;

    /**
     * 压缩空气温度（°C）#第二道次
     */
    private BigDecimal airTemperature2;

    /**
     * 气源压力#第二道次
     */
    private BigDecimal airSourcePress2;

    /**
     * AFC曲线#第二道次
     */
    private BigDecimal curve2;

    /**
     * 轧制力（kg/mm²）#第二道次
     */
    private BigDecimal rollingForce2;

    /**
     * 入口重量(kg)#第二道次
     */
    private BigDecimal actioningWeight2;

    /**
     * 出口重量(kg)#第二道次
     */
    private BigDecimal producingWeight2;

    /**
     * 轧辊辊号#第二道次
     */
    private String rollNum2;

    /**
     * 主操手#第三道次
     */
    private String mainOperator3;

    /**
     * 班次#第三道次
     */
    private String workShift3;

    /**
     * 生产顺序#第三道次
     */
    private String produceOrder3;

    /**
     * 入口厚度（mm）#第三道次
     */
    private BigDecimal thickIn3;

    /**
     * 出口厚度（mm）#第三道次
     */
    private BigDecimal thickOut3;

    /**
     * 宽度（mm）#第三道次
     */
    private BigDecimal width3;

    /**
     * 开卷张力（kg/mm²）#第三道次
     */
    private BigDecimal decoilTensileStress3;

    /**
     * 卷取张力（kg/mm²）#第三道次
     */
    private BigDecimal reelingTensileStress3;

    /**
     * 轧制速度（m/min）#第三道次
     */
    private BigDecimal rollingSpeed3;

    /**
     * 轧制油温度（°C）#第三道次
     */
    private BigDecimal oilTemperature3;

    /**
     * 轧制油流量#第三道次
     */
    private BigDecimal oilFlow3;

    /**
     * 压缩空气温度（°C）#第三道次
     */
    private BigDecimal airTemperature3;

    /**
     * 气源压力#第三道次
     */
    private BigDecimal airSourcePress3;

    /**
     * AFC曲线#第三道次
     */
    private BigDecimal curve3;

    /**
     * 轧制力（kg/mm²）#第三道次
     */
    private BigDecimal rollingForce3;

    /**
     * 入口重量(kg)#第三道次
     */
    private BigDecimal actioningWeight3;

    /**
     * 出口重量(kg)#第三道次
     */
    private BigDecimal producingWeight3;

    /**
     * 轧辊辊号#第三道次
     */
    private String rollNum3;

    /**
     * 主操手#第四道次
     */
    private String mainOperator4;

    /**
     * 班次#第四道次
     */
    private String workShift4;

    /**
     * 生产顺序#第四道次
     */
    private String produceOrder4;

    /**
     * 入口厚度（mm）#第四道次
     */
    private BigDecimal thickIn4;

    /**
     * 出口厚度（mm）#第四道次
     */
    private BigDecimal thickOut4;

    /**
     * 宽度（mm）#第四道次
     */
    private BigDecimal width4;

    /**
     * 开卷张力（kg/mm²）#第四道次
     */
    private BigDecimal decoilTensileStress4;

    /**
     * 卷取张力（kg/mm²）#第四道次
     */
    private BigDecimal reelingTensileStress4;

    /**
     * 轧制速度（m/min）#第四道次
     */
    private BigDecimal rollingSpeed4;

    /**
     * 轧制油温度（°C）#第四道次
     */
    private BigDecimal oilTemperature4;

    /**
     * 轧制油流量#第四道次
     */
    private BigDecimal oilFlow4;

    /**
     * 压缩空气温度（°C）#第四道次
     */
    private BigDecimal airTemperature4;

    /**
     * 气源压力#第四道次
     */
    private BigDecimal airSourcePress4;

    /**
     * AFC曲线#第四道次
     */
    private BigDecimal curve4;

    /**
     * 轧制力（kg/mm²）#第四道次
     */
    private BigDecimal rollingForce4;

    /**
     * 入口重量(kg)#第四道次
     */
    private BigDecimal actioningWeight4;

    /**
     * 出口重量(kg)#第四道次
     */
    private BigDecimal producingWeight4;

    /**
     * 轧辊辊号#第四道次
     */
    private String rollNum4;

    /**
     * 主操手#第五道次
     */
    private String mainOperator5;

    /**
     * 班次#第五道次
     */
    private String workShift5;

    /**
     * 生产顺序#第五道次
     */
    private String produceOrder5;

    /**
     * 入口厚度（mm）#第五道次
     */
    private BigDecimal thickIn5;

    /**
     * 出口厚度（mm）#第五道次
     */
    private BigDecimal thickOut5;

    /**
     * 宽度（mm）#第五道次
     */
    private BigDecimal width5;

    /**
     * 开卷张力（kg/mm²）#第五道次
     */
    private BigDecimal decoilTensileStress5;

    /**
     * 卷取张力（kg/mm²）#第五道次
     */
    private BigDecimal reelingTensileStress5;

    /**
     * 轧制速度（m/min）#第五道次
     */
    private BigDecimal rollingSpeed5;

    /**
     * 轧制油温度（°C）#第五道次
     */
    private BigDecimal oilTemperature5;

    /**
     * 轧制油流量#第五道次
     */
    private BigDecimal oilFlow5;

    /**
     * 压缩空气温度（°C）#第五道次
     */
    private BigDecimal airTemperature5;

    /**
     * 气源压力#第五道次
     */
    private BigDecimal airSourcePress5;

    /**
     * AFC曲线#第五道次
     */
    private BigDecimal curve5;

    /**
     * 轧制力（kg/mm²）#第五道次
     */
    private BigDecimal rollingForce5;

    /**
     * 入口重量(kg)#第五道次
     */
    private BigDecimal actioningWeight5;

    /**
     * 出口重量(kg)#第五道次
     */
    private BigDecimal producingWeight5;

    /**
     * 轧辊辊号#第五道次
     */
    private String rollNum5;

    /**
     * 主操手#第六道次
     */
    private String mainOperator6;

    /**
     * 班次#第六道次
     */
    private String workShift6;

    /**
     * 生产顺序#第六道次
     */
    private String produceOrder6;

    /**
     * 入口厚度（mm）#第六道次
     */
    private BigDecimal thickIn6;

    /**
     * 出口厚度（mm）#第六道次
     */
    private BigDecimal thickOut6;

    /**
     * 宽度（mm）#第六道次
     */
    private BigDecimal width6;

    /**
     * 开卷张力（kg/mm²）#第六道次
     */
    private BigDecimal decoilTensileStress6;

    /**
     * 卷取张力（kg/mm²）#第六道次
     */
    private BigDecimal reelingTensileStress6;

    /**
     * 轧制速度（m/min）#第六道次
     */
    private BigDecimal rollingSpeed6;

    /**
     * 轧制油温度（°C）#第六道次
     */
    private BigDecimal oilTemperature6;

    /**
     * 轧制油流量#第六道次
     */
    private BigDecimal oilFlow6;

    /**
     * 压缩空气温度（°C）#第六道次
     */
    private BigDecimal airTemperature6;

    /**
     * 气源压力#第六道次
     */
    private BigDecimal airSourcePress6;

    /**
     * AFC曲线#第六道次
     */
    private BigDecimal curve6;

    /**
     * 轧制力（kg/mm²）#第六道次
     */
    private BigDecimal rollingForce6;

    /**
     * 入口重量(kg)#第六道次
     */
    private BigDecimal actioningWeight6;

    /**
     * 出口重量(kg)#第六道次
     */
    private BigDecimal producingWeight6;

    /**
     * 轧辊辊号#第六道次
     */
    private String rollNum6;

    /**
     * 生产道次总数
     */
    private Integer produceNum;

    /**
     * 冷轧成品重量（t）
     */
    private BigDecimal coldFinishedWeight;

    /**
     * 班组#第二道次  字典：work_group_cn
     */
    private String workGroup2;

    /**
     * 班组#第三道次  字典：work_group_cn
     */
    private String workGroup3;

    /**
     * 班组#第四道次  字典：work_group_cn
     */
    private String workGroup4;

    /**
     * 班组#第五道次  字典：work_group_cn
     */
    private String workGroup5;

    /**
     * 班组#第六道次  字典：work_group_cn
     */
    private String workGroup6;

    /**
     * 冷轧道次工艺卡编号
     */
    private String coldCardNumber;

    /**
     * 第1道次#焊接人
     */
    private String welder1;

    /**
     * 第2道次#焊接人
     */
    private String welder2;

    /**
     * 第3道次#焊接人
     */
    private String welder3;

    /**
     * 第4道次#焊接人
     */
    private String welder4;

    /**
     * 第5道次#焊接人
     */
    private String welder5;

    /**
     * 第6道次#焊接人
     */
    private String welder6;

    /**
     * 第1道次#是否焊接，字典：是否焊接
     */
    private String isWeld1;

    /**
     * 第2道次#是否焊接，字典：是否焊接
     */
    private String isWeld2;

    /**
     * 第3道次#是否焊接，字典：是否焊接
     */
    private String isWeld3;

    /**
     * 第4道次#是否焊接，字典：是否焊接
     */
    private String isWeld4;

    /**
     * 第5道次#是否焊接，字典：是否焊接
     */
    private String isWeld5;

    /**
     * 第6道次#是否焊接，字典：是否焊接
     */
    private String isWeld6;

    /**
     * 第1道次#生产时间
     */
    private Date produceDate1;

    /**
     * 第2道次#生产时间
     */
    private Date produceDate2;

    /**
     * 第3道次#生产时间
     */
    private Date produceDate3;

    /**
     * 第4道次#生产时间
     */
    private Date produceDate4;

    /**
     * 第5道次#生产时间
     */
    private Date produceDate5;

    /**
     * 第6道次#生产时间
     */
    private Date produceDate6;

    /**
     * 批次号
     */
    private String numOrder;

    /**
     * 第七道次#生产时间
     */
    private Date produceDate7;

    /**
     * 第八道次#生产时间
     */
    private Date produceDate8;

    /**
     * 主操手#第七道次
     */
    private String mainOperator7;

    /**
     * 主操手#第八道次
     */
    private String mainOperator8;

    /**
     * 第七道次#是否焊接
     */
    private String isWeld7;

    /**
     * 第八道次#是否焊接
     */
    private String isWeld8;

    /**
     * 第七道次#焊接人
     */
    private String welder7;

    /**
     * 第八道次#焊接人
     */
    private String welder8;

    /**
     * 第七道次#班次
     */
    private String workShift7;

    /**
     * 第八道次#班次
     */
    private String workShift8;

    /**
     * 第七道次#班组
     */
    private String workGroup7;

    /**
     * 第八道次#班组
     */
    private String workGroup8;

    /**
     * 第七道次#生产顺序
     */
    private String produceOrder7;

    /**
     * 第八道次#生产顺序
     */
    private String produceOrder8;

    /**
     * 第七道次#入口厚度（mm）
     */
    private BigDecimal thickIn7;

    /**
     * 第八道次#入口厚度（mm）
     */
    private BigDecimal thickIn8;

    /**
     * 第七道次#出口厚度（mm）
     */
    private BigDecimal thickOut7;

    /**
     * 第八道次#出口厚度（mm）
     */
    private BigDecimal thickOut8;

    /**
     * 第七道次#宽度（mm）
     */
    private BigDecimal width7;

    /**
     * 第八道次#宽度（mm）
     */
    private BigDecimal width8;

    /**
     * 第七道次#开卷张力（kg/mm²）
     */
    private BigDecimal decoilTensileStress7;

    /**
     * 第八道次#开卷张力（kg/mm²）
     */
    private BigDecimal decoilTensileStress8;

    /**
     * 第七道次#卷曲张力（kg/mm²）
     */
    private BigDecimal reelingTensileStress7;

    /**
     * 第八道次#卷曲张力（kg/mm²）
     */
    private BigDecimal reelingTensileStress8;

    /**
     * 第七道次#轧制速度（m/min）
     */
    private BigDecimal rollingSpeed7;

    /**
     * 第八道次#轧制速度（m/min）
     */
    private BigDecimal rollingSpeed8;

    /**
     * 第七道次#轧制油温度（°C）
     */
    private BigDecimal oilTemperature7;

    /**
     * 第八道次#轧制油温度（°C）
     */
    private BigDecimal oilTemperature8;

    /**
     * 第七道次#轧制油流量
     */
    private BigDecimal oilFlow7;

    /**
     * 第八道次#轧制油流量
     */
    private BigDecimal oilFlow8;

    /**
     * 第七道次#压缩空气温度（°C）
     */
    private BigDecimal airTemperature7;

    /**
     * 第八道次#压缩空气温度（°C）
     */
    private BigDecimal airTemperature8;

    /**
     * 第七道次#气源压力
     */
    private BigDecimal airSourcePress7;

    /**
     * 第八道次#气源压力
     */
    private BigDecimal airSourcePress8;

    /**
     * 第七道次#AFC曲线
     */
    private BigDecimal curve7;

    /**
     * 第八道次#AFC曲线
     */
    private BigDecimal curve8;

    /**
     * 第七道次#轧制力（kg/mm²）
     */
    private BigDecimal rollingForce7;

    /**
     * 第八道次#轧制力（kg/mm²）
     */
    private BigDecimal rollingForce8;

    /**
     * 第七道次#入口重量（kg）
     */
    private BigDecimal actioningWeight7;

    /**
     * 第八道次#入口重量（kg）
     */
    private BigDecimal actioningWeight8;

    /**
     * 第八道次#出口重量（kg）
     */
    private BigDecimal producingWeight7;

    /**
     * 第八道次#出口重量（kg）
     */
    private BigDecimal producingWeight8;

    /**
     * 第七道次#轧辊辊号
     */
    private String rollNum7;

    /**
     * 第八道次#轧辊辊号
     */
    private String rollNum8;

    /**
     * 冷轧开始#电度（kw·h）
     */
    private BigDecimal startPower;

    /**
     * 冷轧结束#电度（kw·h）
     */
    private BigDecimal endPower;

    /**
     * 配对辊号#第一道次
     */
    private String pairRoll1;

    /**
     * 配对辊号#第二道次
     */
    private String pairRoll2;

    /**
     * 配对辊号#第三道次
     */
    private String pairRoll3;

    /**
     * 配对辊号#第四道次
     */
    private String pairRoll4;

    /**
     * 配对辊号#第五道次
     */
    private String pairRoll5;

    /**
     * 配对辊号#第六道次
     */
    private String pairRoll6;

    /**
     * 配对辊号#第七道次
     */
    private String pairRoll7;

    /**
     * 配对辊号#第八道次
     */
    private String pairRoll8;

    /**
     * 废料重量#第一道次
     */
    private BigDecimal wasteWeight1;

    /**
     * 废料重量#第二道次
     */
    private BigDecimal wasteWeight2;

    /**
     * 废料重量#第三道次
     */
    private BigDecimal wasteWeight3;

    /**
     * 废料重量#第四道次
     */
    private BigDecimal wasteWeight4;

    /**
     * 废料重量#第五道次
     */
    private BigDecimal wasteWeight5;

    /**
     * 废料重量#第六道次
     */
    private BigDecimal wasteWeight6;

    /**
     * 废料重量#第七道次
     */
    private BigDecimal wasteWeight7;

    /**
     * 废料重量#第八道次
     */
    private BigDecimal wasteWeight8;

    /**
     * 冷轧开始#辅助变电量
     */
    private BigDecimal assistStartPower;

    /**
     * 冷轧结束#辅助变电量
     */
    private BigDecimal assistEndPower;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}