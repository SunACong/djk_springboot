package com.szj.djk.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 周期计算对象 period_compute
 *
 * @author jiahua
 * @date 2022-11-07
 */
@TableName(value = "period_compute")
@Data
public class PeriodCompute
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 生产关联的号（冷轧卷号） */
    private String reelNum;

    /** 生产计划创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date jihuaCreateTime;

    /** 装炉时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date feedTime;

    /** 倒炉作业#结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date turndownEndTime;

    /** 开始时间1 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date holdRefine1BeginTime;

    /** 结束时间1 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date holdRefine1EndTime;

    /** 开始时间2 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date holdRefine2BeginTime;

    /** 结束时间2 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date holdRefine2EndTime;

    /** 开始时间3 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date holdRefine3BeginTime;

    /** 结束时间3 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date holdRefine3EndTime;

    /** 开始时间4 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date holdRefine4BeginTime;

    /** 结束时间4 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date holdRefine4EndTime;

    /** 开始时间5 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date holdRefine5BeginTime;

    /** 结束时间5 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date holdRefine5EndTime;

    /** 铸轧创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date zhuzhaCreateTime;

    /** 上卷信息#上卷时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date procUpperTime;

    /** 下卷信息#卸卷时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date procLowerRemoveTime;

    /** 质检创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date zhijianCreateTime;

    /** 质检下卷时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date nextReelTime;

    /** 冷轧计划创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lzjihuaCreateTime;

    /** 冷轧工序创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lenzhaCreateTime;

    /** 退火开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    /** 退火结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /** 冷轧卷成品质检创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lzzhijianCreateTime;

    /** 重卷创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date chongjuanCreateTime;

    /** 冷轧成品入库时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date storageTime;

    /** 包装创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date packageCreateTime;

    /** 包装日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date packageTime;

    /** 备注 */
    private String note;



}
