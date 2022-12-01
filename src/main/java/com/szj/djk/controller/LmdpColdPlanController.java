package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdPlan;
import com.szj.djk.service.LmdpColdPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2022-10-17
 */
@RestController
@RequestMapping("/system/coldPlan")
public class LmdpColdPlanController
{
    @Autowired
    private LmdpColdPlanService lmdpColdPlanService;

    @GetMapping("list")
    public R<List<LmdpColdPlan>> list(LmdpColdPlan lmdpColdPlan){
        LambdaQueryWrapper<LmdpColdPlan> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdPlan);
        List<LmdpColdPlan> list = lmdpColdPlanService.list(queryWrapper);
        return R.success(list);
    }

}
