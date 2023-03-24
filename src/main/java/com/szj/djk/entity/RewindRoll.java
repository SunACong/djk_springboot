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
 * @TableName rewind_roll
 */
@TableName(value ="rewind_roll")
@Data
public class RewindRoll implements Serializable {
    /**
     * ts
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    @TableId
    private LocalDateTime ts;

    /**
     * 机列速度
     */
    private Integer machineColsV;

    /**
     * 开卷卷径
     */
    private Integer openScrollD;

    /**
     * 卷取卷径
     */
    private Integer rollWindD;

    /**
     * 单位张力
     */
    private Integer unitTension;

    /**
     * 实际张力
     */
    private Integer actualTension;

    /**
     * 开卷机电流
     */
    private Integer openRollA;

    /**
     * 卷取机电流
     */
    private Integer rollWindA;

    /**
     * 带材长度
     */
    private Integer stripL;

    /**
     * 带材重量
     */
    private Double stripW;

    /**
     * 液压站温度
     */
    private Double pressureStatonT;

    /**
     * 来料宽度
     */
    private Double materialWidth;

    /**
     * 来料厚度
     */
    private Double meteriaThicness;

    /**
     * 圆盘剪操作侧电流
     */
    private Double discShearOperatingSideA;

    /**
     * 圆盘剪传动侧电流
     */
    private Double discShearDriveSideA;

    /**
     * 破碎机操作侧电流
     */
    private Double crusherOperatingSideA;

    /**
     * 破碎机传动侧电流
     */
    private Double driveSideCrusherA;

    /**
     * 开卷稀油温度
     */
    private Double openRollThinOilT;

    /**
     * 卷取稀油温度
     */
    private Double rollOutThinOilT;

    /**
     * 插入时间
     */
    private LocalDateTime createTime;

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
        RewindRoll other = (RewindRoll) that;
        return (this.getTs() == null ? other.getTs() == null : this.getTs().equals(other.getTs()))
            && (this.getMachineColsV() == null ? other.getMachineColsV() == null : this.getMachineColsV().equals(other.getMachineColsV()))
            && (this.getOpenScrollD() == null ? other.getOpenScrollD() == null : this.getOpenScrollD().equals(other.getOpenScrollD()))
            && (this.getRollWindD() == null ? other.getRollWindD() == null : this.getRollWindD().equals(other.getRollWindD()))
            && (this.getUnitTension() == null ? other.getUnitTension() == null : this.getUnitTension().equals(other.getUnitTension()))
            && (this.getActualTension() == null ? other.getActualTension() == null : this.getActualTension().equals(other.getActualTension()))
            && (this.getOpenRollA() == null ? other.getOpenRollA() == null : this.getOpenRollA().equals(other.getOpenRollA()))
            && (this.getRollWindA() == null ? other.getRollWindA() == null : this.getRollWindA().equals(other.getRollWindA()))
            && (this.getStripL() == null ? other.getStripL() == null : this.getStripL().equals(other.getStripL()))
            && (this.getStripW() == null ? other.getStripW() == null : this.getStripW().equals(other.getStripW()))
            && (this.getPressureStatonT() == null ? other.getPressureStatonT() == null : this.getPressureStatonT().equals(other.getPressureStatonT()))
            && (this.getMaterialWidth() == null ? other.getMaterialWidth() == null : this.getMaterialWidth().equals(other.getMaterialWidth()))
            && (this.getMeteriaThicness() == null ? other.getMeteriaThicness() == null : this.getMeteriaThicness().equals(other.getMeteriaThicness()))
            && (this.getDiscShearOperatingSideA() == null ? other.getDiscShearOperatingSideA() == null : this.getDiscShearOperatingSideA().equals(other.getDiscShearOperatingSideA()))
            && (this.getDiscShearDriveSideA() == null ? other.getDiscShearDriveSideA() == null : this.getDiscShearDriveSideA().equals(other.getDiscShearDriveSideA()))
            && (this.getCrusherOperatingSideA() == null ? other.getCrusherOperatingSideA() == null : this.getCrusherOperatingSideA().equals(other.getCrusherOperatingSideA()))
            && (this.getDriveSideCrusherA() == null ? other.getDriveSideCrusherA() == null : this.getDriveSideCrusherA().equals(other.getDriveSideCrusherA()))
            && (this.getOpenRollThinOilT() == null ? other.getOpenRollThinOilT() == null : this.getOpenRollThinOilT().equals(other.getOpenRollThinOilT()))
            && (this.getRollOutThinOilT() == null ? other.getRollOutThinOilT() == null : this.getRollOutThinOilT().equals(other.getRollOutThinOilT()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTs() == null) ? 0 : getTs().hashCode());
        result = prime * result + ((getMachineColsV() == null) ? 0 : getMachineColsV().hashCode());
        result = prime * result + ((getOpenScrollD() == null) ? 0 : getOpenScrollD().hashCode());
        result = prime * result + ((getRollWindD() == null) ? 0 : getRollWindD().hashCode());
        result = prime * result + ((getUnitTension() == null) ? 0 : getUnitTension().hashCode());
        result = prime * result + ((getActualTension() == null) ? 0 : getActualTension().hashCode());
        result = prime * result + ((getOpenRollA() == null) ? 0 : getOpenRollA().hashCode());
        result = prime * result + ((getRollWindA() == null) ? 0 : getRollWindA().hashCode());
        result = prime * result + ((getStripL() == null) ? 0 : getStripL().hashCode());
        result = prime * result + ((getStripW() == null) ? 0 : getStripW().hashCode());
        result = prime * result + ((getPressureStatonT() == null) ? 0 : getPressureStatonT().hashCode());
        result = prime * result + ((getMaterialWidth() == null) ? 0 : getMaterialWidth().hashCode());
        result = prime * result + ((getMeteriaThicness() == null) ? 0 : getMeteriaThicness().hashCode());
        result = prime * result + ((getDiscShearOperatingSideA() == null) ? 0 : getDiscShearOperatingSideA().hashCode());
        result = prime * result + ((getDiscShearDriveSideA() == null) ? 0 : getDiscShearDriveSideA().hashCode());
        result = prime * result + ((getCrusherOperatingSideA() == null) ? 0 : getCrusherOperatingSideA().hashCode());
        result = prime * result + ((getDriveSideCrusherA() == null) ? 0 : getDriveSideCrusherA().hashCode());
        result = prime * result + ((getOpenRollThinOilT() == null) ? 0 : getOpenRollThinOilT().hashCode());
        result = prime * result + ((getRollOutThinOilT() == null) ? 0 : getRollOutThinOilT().hashCode());
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
        sb.append(", machineColsV=").append(machineColsV);
        sb.append(", openScrollD=").append(openScrollD);
        sb.append(", rollWindD=").append(rollWindD);
        sb.append(", unitTension=").append(unitTension);
        sb.append(", actualTension=").append(actualTension);
        sb.append(", openRollA=").append(openRollA);
        sb.append(", rollWindA=").append(rollWindA);
        sb.append(", stripL=").append(stripL);
        sb.append(", stripW=").append(stripW);
        sb.append(", pressureStatonT=").append(pressureStatonT);
        sb.append(", materialWidth=").append(materialWidth);
        sb.append(", meteriaThicness=").append(meteriaThicness);
        sb.append(", discShearOperatingSideA=").append(discShearOperatingSideA);
        sb.append(", discShearDriveSideA=").append(discShearDriveSideA);
        sb.append(", crusherOperatingSideA=").append(crusherOperatingSideA);
        sb.append(", driveSideCrusherA=").append(driveSideCrusherA);
        sb.append(", openRollThinOilT=").append(openRollThinOilT);
        sb.append(", rollOutThinOilT=").append(rollOutThinOilT);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}