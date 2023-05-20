package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.ProcessCaculate;
import com.szj.djk.service.ProcessCaculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/processCaculate")
public class ProcessCaculateController {

    @Resource
    private ProcessCaculateService processCaculateService;

    @GetMapping("processCaculates")
    public R<ProcessCaculate> getList(ProcessCaculate processCaculate){
        LambdaQueryWrapper<ProcessCaculate> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(processCaculate);
        return R.success(processCaculateService.list(queryWrapper).get(0));
    }

    @PutMapping("update")
    public R<Boolean> update(ProcessCaculate processCaculate){
        return R.success(processCaculateService.updateById(processCaculate));
    }
}
