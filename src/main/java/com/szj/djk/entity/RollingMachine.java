package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName roollingMachine
 * @Author 张高义
 * @Create 2022/10/20 0020 上午 11:07
 */
@Data
public class RollingMachine {
    /**id*/
    @TableId(type = IdType.AUTO)
    private Long rollingId;
    /**指标名称*/
    private String rollingName;
    /**数值*/
    private Integer rollingValue;
    /**数值产生时间*/
    @JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd kk:mm:ss")
    private Date rollingProduceTime;
    /**设备号*/
    private Long rollingDeviceId;

}
