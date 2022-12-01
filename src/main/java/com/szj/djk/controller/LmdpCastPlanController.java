package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpCastPlan;
import com.szj.djk.entity.LmdpCastProduce;
import com.szj.djk.service.LmdpCastPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2022-10-17
 */
@RestController
@RequestMapping("/system/plan")
public class LmdpCastPlanController
{
    @Autowired
    private LmdpCastPlanService lmdpCastPlanService;

    @GetMapping("list")
    public R<List<LmdpCastPlan>> list(LmdpCastPlan lmdpCastPlan){
        LambdaQueryWrapper<LmdpCastPlan> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpCastPlan);
        List<LmdpCastPlan> list = lmdpCastPlanService.list(queryWrapper);
        return R.success(list);
    }
}
