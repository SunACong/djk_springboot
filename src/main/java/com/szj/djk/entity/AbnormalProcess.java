package com.szj.djk.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


/**
 * 异常流程显示对象 abnormal_process
 *
 * @author jiahua
 * @date 2022-11-08
 */
@TableName(value = "abnormal_process")
@Data
public class AbnormalProcess implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 序号 */

    private Long number;

    /** 产品编号 */

    private Long productNum;

    /** 当前流程 */

    private String nowProduce;

    /** 停滞时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date stopTime;

    /** 备注 */

    private String note;


}
