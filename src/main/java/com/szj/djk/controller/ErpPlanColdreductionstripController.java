package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.ErpPlanColdreductionstrip;
import com.szj.djk.service.ErpPlanColdreductionstripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//冷轧生产计划表
@DS("slave")
@RestController
@RequestMapping("/erpPlanColdreductionstrip")
public class ErpPlanColdreductionstripController {
    @Autowired
    private ErpPlanColdreductionstripService erpPlanColdreductionstripService;

    @GetMapping("list")
    public R<List<ErpPlanColdreductionstrip>> list(ErpPlanColdreductionstrip erpPlanColdreductionstrip){
        LambdaQueryWrapper<ErpPlanColdreductionstrip> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(erpPlanColdreductionstrip);
        List<ErpPlanColdreductionstrip> list = erpPlanColdreductionstripService.list(queryWrapper);
        return R.success(list);
    }
}
