package com.szj.djk.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


/**
 * 交期风险预判对象 delivery_risk_predict
 *
 * @author jiahua
 * @date 2022-11-08
 */
@TableName(value = "delivery_risk_predict")
@Data
public class DeliveryRiskPredict implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 订单号 */

    private Long orderNumber;

    /** 进度 */

    private String progress;

    /** 剩下时间 */

    private String leftTime;


}
