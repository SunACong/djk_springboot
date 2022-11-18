package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.PeriodCompute;
import com.szj.djk.service.PeriodComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 周期计算Controller
 *
 * @author jiahua
 * @date 2022-11-07
 */
@RestController
@RequestMapping("/system/compute")
public class PeriodComputeController
{
    @Autowired
    private PeriodComputeService periodComputeService;

    @GetMapping("list")
    public R<List<PeriodCompute>> list(PeriodCompute periodCompute){
        LambdaQueryWrapper<PeriodCompute> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(periodCompute);
        List<PeriodCompute> list = periodComputeService.list(queryWrapper);
        return R.success(list);
    }

    @GetMapping("autoAdd")
    public R<List<PeriodCompute>> autoAdd(String startTime){
        List<PeriodCompute> list = periodComputeService.autoAdd(startTime);
        return R.success(list);
    }
}
