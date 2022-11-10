package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpFourthConcise;
import com.szj.djk.service.LmdpFourthConciseService;
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
@RequestMapping("/system/fourthConcise")
public class LmdpFourthConciseController
{
    @Autowired
    private LmdpFourthConciseService lmdpFourthConciseService;


    @GetMapping("list")
    public R<List<LmdpFourthConcise>> list(LmdpFourthConcise lmdpFourthConcise){
        LambdaQueryWrapper<LmdpFourthConcise> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpFourthConcise);
        List<LmdpFourthConcise> list = lmdpFourthConciseService.list(queryWrapper);
        return R.success(list);
    }
}
