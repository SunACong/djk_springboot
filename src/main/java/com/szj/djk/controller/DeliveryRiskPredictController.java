package com.szj.djk.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;

import com.szj.djk.entity.DeliveryRiskPredict;
import com.szj.djk.service.DeliveryRiskPredictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 交期风险预判Controller
 *
 * @author jiahua
 * @date 2022-11-08
 */
@RestController
@RequestMapping("/system/predict")
public class DeliveryRiskPredictController
{
    @Autowired
    private DeliveryRiskPredictService deliveryRiskPredictService;

    @GetMapping("list")
    public R<List<DeliveryRiskPredict>> list(DeliveryRiskPredict deliveryRiskPredict){
        LambdaQueryWrapper<DeliveryRiskPredict> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(deliveryRiskPredict);
        List<DeliveryRiskPredict> list = deliveryRiskPredictService.list(queryWrapper);
        return R.success(list);
    }
}
