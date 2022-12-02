package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName roollingMachine
 * @Author 张高义
 * @Create 2022/10/20 0020 上午 11:07
 */
@Data
public class RollingMachine {
    /**id*/
    private Long rollingId;
    /**指标名称*/
    private String rollingName;
    /**数值*/
    private Integer rollingValue;
    /**数值产生时间*/
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date rollingProduceTime;
    /**设备号*/
    private Long rollingDeviceId;

    /** 查询开始时间 */
    @TableField(exist = false)
    private String startDateTime;

    /** 查询截止时间 */
    @TableField(exist = false)
    private String endDateTime;
}
