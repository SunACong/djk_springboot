package com.szj.djk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 查询总体平均时间
     * @return
     */
   @GetMapping(value = "selectAVGTimeList")
    public R<List<Map<String, Object>>> selectAVGTimeList(){
       List<Map<String, Object>> maps = periodComputeService.selectAVGTimeList();
       return R.success(maps);

   } /**
     * 查询最近平均时间
     * @return
     */
   @GetMapping(value = "selectNewAVGTimeList")
    public R<List<Map<String, Object>>> selectNewAVGTimeList(){
       List<Map<String, Object>> maps = periodComputeService.selectNewAVGTimeList();
       return R.success(maps);
   }
}
