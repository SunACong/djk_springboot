package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpFirstConcise;
import com.szj.djk.service.LmdpFirstConciseService;
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
@RequestMapping("/system/firstConcise")
public class LmdpFirstConciseController
{
    @Autowired
    private LmdpFirstConciseService lmdpFirstConciseService;


    @GetMapping("list")
    public R<List<LmdpFirstConcise>> list(LmdpFirstConcise lmdpFirstConcise){
        LambdaQueryWrapper<LmdpFirstConcise> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpFirstConcise);
        List<LmdpFirstConcise> list = lmdpFirstConciseService.list(queryWrapper);
        return R.success(list);
    }
}
