package com.szj.djk.controller;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.ErpPlanRollcasting;
import com.szj.djk.service.ErpPlanRollcastingService;
import com.szj.djk.vo.ProcessMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//铸轧生产计划表
@DS("slave")
@RestController
@RequestMapping("/erpPlanRollcasting")
public class ErpPlanRollcastingController {

    @Autowired
    private ErpPlanRollcastingService erpPlanRollcastingService;

    @GetMapping("list")
    public R<List<ErpPlanRollcasting>> list(ErpPlanRollcasting erpPlanRollcasting){
        LambdaQueryWrapper<ErpPlanRollcasting> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(erpPlanRollcasting);
        List<ErpPlanRollcasting> list = erpPlanRollcastingService.list(queryWrapper);
        return R.success(list);
    }

    @GetMapping("processMonitor")
    public R<ProcessMonitor> processMonitor(String number, Integer type){
        ProcessMonitor processMonitor = erpPlanRollcastingService.getProcessMonitor(number, type);
        return R.success(processMonitor);
    }
}
