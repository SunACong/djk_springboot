package com.szj.djk.controller;

import com.szj.djk.common.R;
import com.szj.djk.service.ProcessComputeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/processCompute")
public class ProcessComputeController {

    @Resource
    private ProcessComputeService processComputeService;
    @GetMapping("computeTime")
    public R<List<Map<String, BigDecimal>>> computeTime(){
        return R.success(processComputeService.getComputeTime());
    }
}
