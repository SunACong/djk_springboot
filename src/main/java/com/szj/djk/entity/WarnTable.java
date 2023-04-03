package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName warnTable
 * @Author 张高义
 * @Create 2022/11/8 0008 上午 11:16
 */
@Data
public class WarnTable {
    /**id*/
    @TableId(value="id_number",type = IdType.AUTO )
    private Long idNumber;

    /**指标名称*/
    private String rollingName;

    /**时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private LocalDateTime rollingProduceTime;

    /**数值*/
    private Integer rollingValue;

    /**设备号*/
    private String rollingDeviceNumber;

    /**
     * 是否已读
     */
    private String yd;

    /**
     * 判断是设备参数还是工艺参数
     */
    private  String para;

}
