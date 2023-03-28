package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName seven_annea_fur
 */
@TableName(value ="seven_annea_fur")
@Data
public class SevenAnneaFur implements Serializable {
    /**
     * 采集时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    @TableId
    private LocalDateTime ts;

    /**
     * 一区温度
     */
    private Integer zoneOneT;

    /**
     * 二区温度
     */
    private Integer zoneTwoT;

    /**
     * 三区温度
     */
    private Integer zoneThreeT;

    /**
     * 料温
     */
    private Integer meterialT;

    /**
     * 一区加热输出
     */
    private Double zoneOneHotOutput;

    /**
     * 二区加热输出
     */
    private Double zoneTwoHotOutput;

    /**
     * 三区加热输出
     */
    private Double zoneThreeHotOutput;

    /**
     * 设定温度
     */
    private Integer setT;

    /**
     * 期望温度
     */
    private Double desiredT;

    /**
     * 排烟风扇频率设定值
     */
    private Double exhaustFanSetF;

    /**
     * 进风风机频率设定值
     */
    private Double inFanSetF;
    /**
     * 控制类型
     */
    private Double controlType;

    /**
     * 料温控制
     */
    private Double materialControlT;

    /**
     * 报警温度设定值
     */
    private Double warnSetT;

    /**
     * 破碎机操作侧电流
     */
    private Double crusherOperatingSideA;

    /**
     * 炉门冷却水断流
     */
    private Integer furnaceDoorCoolWater;

    /**
     * 风机冷却水断流
     */
    private Integer funCoolWater;

    /**
     * 回水温度高
     */
    private Integer returnWaterHighT;

    /**
     * 冷却水压力上限
     */
    private Integer coolWaterUpLimit;

    /**
     * 压缩空气1压力低
     */
    private Integer compressedAirOneLowPressure;

    /**
     * 压缩空气2压力低
     */
    private Integer compressedAirTwoLowPressure;

    /**
     * 升温
     */
    private Integer upT;

    /**
     * 保温
     */
    private Integer maintainT;

    /**
     * 降温
     */
    private Integer downT;

    /**
     * 退货结束
     */
    private Integer annealingEnd;

    /**
     * 吹扫冷却阀
     */
    private Integer purgeCoolValue;

    /**
     * 排烟输出阀
     */
    private Integer smokeExhaustOutputValue;

    /**
     * 插入时间
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SevenAnneaFur other = (SevenAnneaFur) that;
        return (this.getTs() == null ? other.getTs() == null : this.getTs().equals(other.getTs()))
            && (this.getZoneOneT() == null ? other.getZoneOneT() == null : this.getZoneOneT().equals(other.getZoneOneT()))
            && (this.getZoneTwoT() == null ? other.getZoneTwoT() == null : this.getZoneTwoT().equals(other.getZoneTwoT()))
            && (this.getZoneThreeT() == null ? other.getZoneThreeT() == null : this.getZoneThreeT().equals(other.getZoneThreeT()))
            && (this.getMeterialT() == null ? other.getMeterialT() == null : this.getMeterialT().equals(other.getMeterialT()))
            && (this.getZoneOneHotOutput() == null ? other.getZoneOneHotOutput() == null : this.getZoneOneHotOutput().equals(other.getZoneOneHotOutput()))
            && (this.getZoneTwoHotOutput() == null ? other.getZoneTwoHotOutput() == null : this.getZoneTwoHotOutput().equals(other.getZoneTwoHotOutput()))
            && (this.getZoneThreeHotOutput() == null ? other.getZoneThreeHotOutput() == null : this.getZoneThreeHotOutput().equals(other.getZoneThreeHotOutput()))
            && (this.getSetT() == null ? other.getSetT() == null : this.getSetT().equals(other.getSetT()))
            && (this.getDesiredT() == null ? other.getDesiredT() == null : this.getDesiredT().equals(other.getDesiredT()))
            && (this.getExhaustFanSetF() == null ? other.getExhaustFanSetF() == null : this.getExhaustFanSetF().equals(other.getExhaustFanSetF()))
            && (this.getInFanSetF() == null ? other.getInFanSetF() == null : this.getInFanSetF().equals(other.getInFanSetF()))
            && (this.getControlType() == null ? other.getControlType() == null : this.getControlType().equals(other.getControlType()))
            && (this.getMaterialControlT() == null ? other.getMaterialControlT() == null : this.getMaterialControlT().equals(other.getMaterialControlT()))
            && (this.getWarnSetT() == null ? other.getWarnSetT() == null : this.getWarnSetT().equals(other.getWarnSetT()))
            && (this.getCrusherOperatingSideA() == null ? other.getCrusherOperatingSideA() == null : this.getCrusherOperatingSideA().equals(other.getCrusherOperatingSideA()))
            && (this.getFurnaceDoorCoolWater() == null ? other.getFurnaceDoorCoolWater() == null : this.getFurnaceDoorCoolWater().equals(other.getFurnaceDoorCoolWater()))
            && (this.getFunCoolWater() == null ? other.getFunCoolWater() == null : this.getFunCoolWater().equals(other.getFunCoolWater()))
            && (this.getReturnWaterHighT() == null ? other.getReturnWaterHighT() == null : this.getReturnWaterHighT().equals(other.getReturnWaterHighT()))
            && (this.getCoolWaterUpLimit() == null ? other.getCoolWaterUpLimit() == null : this.getCoolWaterUpLimit().equals(other.getCoolWaterUpLimit()))
            && (this.getCompressedAirOneLowPressure() == null ? other.getCompressedAirOneLowPressure() == null : this.getCompressedAirOneLowPressure().equals(other.getCompressedAirOneLowPressure()))
            && (this.getCompressedAirTwoLowPressure() == null ? other.getCompressedAirTwoLowPressure() == null : this.getCompressedAirTwoLowPressure().equals(other.getCompressedAirTwoLowPressure()))
            && (this.getUpT() == null ? other.getUpT() == null : this.getUpT().equals(other.getUpT()))
            && (this.getMaintainT() == null ? other.getMaintainT() == null : this.getMaintainT().equals(other.getMaintainT()))
            && (this.getDownT() == null ? other.getDownT() == null : this.getDownT().equals(other.getDownT()))
            && (this.getAnnealingEnd() == null ? other.getAnnealingEnd() == null : this.getAnnealingEnd().equals(other.getAnnealingEnd()))
            && (this.getPurgeCoolValue() == null ? other.getPurgeCoolValue() == null : this.getPurgeCoolValue().equals(other.getPurgeCoolValue()))
            && (this.getSmokeExhaustOutputValue() == null ? other.getSmokeExhaustOutputValue() == null : this.getSmokeExhaustOutputValue().equals(other.getSmokeExhaustOutputValue()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTs() == null) ? 0 : getTs().hashCode());
        result = prime * result + ((getZoneOneT() == null) ? 0 : getZoneOneT().hashCode());
        result = prime * result + ((getZoneTwoT() == null) ? 0 : getZoneTwoT().hashCode());
        result = prime * result + ((getZoneThreeT() == null) ? 0 : getZoneThreeT().hashCode());
        result = prime * result + ((getMeterialT() == null) ? 0 : getMeterialT().hashCode());
        result = prime * result + ((getZoneOneHotOutput() == null) ? 0 : getZoneOneHotOutput().hashCode());
        result = prime * result + ((getZoneTwoHotOutput() == null) ? 0 : getZoneTwoHotOutput().hashCode());
        result = prime * result + ((getZoneThreeHotOutput() == null) ? 0 : getZoneThreeHotOutput().hashCode());
        result = prime * result + ((getSetT() == null) ? 0 : getSetT().hashCode());
        result = prime * result + ((getDesiredT() == null) ? 0 : getDesiredT().hashCode());
        result = prime * result + ((getExhaustFanSetF() == null) ? 0 : getExhaustFanSetF().hashCode());
        result = prime * result + ((getInFanSetF() == null) ? 0 : getInFanSetF().hashCode());
        result = prime * result + ((getControlType() == null) ? 0 : getControlType().hashCode());
        result = prime * result + ((getMaterialControlT() == null) ? 0 : getMaterialControlT().hashCode());
        result = prime * result + ((getWarnSetT() == null) ? 0 : getWarnSetT().hashCode());
        result = prime * result + ((getCrusherOperatingSideA() == null) ? 0 : getCrusherOperatingSideA().hashCode());
        result = prime * result + ((getFurnaceDoorCoolWater() == null) ? 0 : getFurnaceDoorCoolWater().hashCode());
        result = prime * result + ((getFunCoolWater() == null) ? 0 : getFunCoolWater().hashCode());
        result = prime * result + ((getReturnWaterHighT() == null) ? 0 : getReturnWaterHighT().hashCode());
        result = prime * result + ((getCoolWaterUpLimit() == null) ? 0 : getCoolWaterUpLimit().hashCode());
        result = prime * result + ((getCompressedAirOneLowPressure() == null) ? 0 : getCompressedAirOneLowPressure().hashCode());
        result = prime * result + ((getCompressedAirTwoLowPressure() == null) ? 0 : getCompressedAirTwoLowPressure().hashCode());
        result = prime * result + ((getUpT() == null) ? 0 : getUpT().hashCode());
        result = prime * result + ((getMaintainT() == null) ? 0 : getMaintainT().hashCode());
        result = prime * result + ((getDownT() == null) ? 0 : getDownT().hashCode());
        result = prime * result + ((getAnnealingEnd() == null) ? 0 : getAnnealingEnd().hashCode());
        result = prime * result + ((getPurgeCoolValue() == null) ? 0 : getPurgeCoolValue().hashCode());
        result = prime * result + ((getSmokeExhaustOutputValue() == null) ? 0 : getSmokeExhaustOutputValue().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ts=").append(ts);
        sb.append(", zoneOneT=").append(zoneOneT);
        sb.append(", zoneTwoT=").append(zoneTwoT);
        sb.append(", zoneThreeT=").append(zoneThreeT);
        sb.append(", meterialT=").append(meterialT);
        sb.append(", zoneOneHotOutput=").append(zoneOneHotOutput);
        sb.append(", zoneTwoHotOutput=").append(zoneTwoHotOutput);
        sb.append(", zoneThreeHotOutput=").append(zoneThreeHotOutput);
        sb.append(", setT=").append(setT);
        sb.append(", desiredT=").append(desiredT);
        sb.append(", exhaustFanSetF=").append(exhaustFanSetF);
        sb.append(", inFanSetF=").append(inFanSetF);
        sb.append(", controlType=").append(controlType);
        sb.append(", materialControlT=").append(materialControlT);
        sb.append(", warnSetT=").append(warnSetT);
        sb.append(", crusherOperatingSideA=").append(crusherOperatingSideA);
        sb.append(", furnaceDoorCoolWater=").append(furnaceDoorCoolWater);
        sb.append(", funCoolWater=").append(funCoolWater);
        sb.append(", returnWaterHighT=").append(returnWaterHighT);
        sb.append(", coolWaterUpLimit=").append(coolWaterUpLimit);
        sb.append(", compressedAirOneLowPressure=").append(compressedAirOneLowPressure);
        sb.append(", compressedAirTwoLowPressure=").append(compressedAirTwoLowPressure);
        sb.append(", upT=").append(upT);
        sb.append(", maintainT=").append(maintainT);
        sb.append(", downT=").append(downT);
        sb.append(", annealingEnd=").append(annealingEnd);
        sb.append(", purgeCoolValue=").append(purgeCoolValue);
        sb.append(", smokeExhaustOutputValue=").append(smokeExhaustOutputValue);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}