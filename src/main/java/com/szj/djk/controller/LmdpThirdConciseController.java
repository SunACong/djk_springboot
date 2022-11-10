package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpThirdConcise;
import com.szj.djk.service.LmdpThirdConciseService;
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
@RequestMapping("/system/thirdConcise")
public class LmdpThirdConciseController
{
    @Autowired
    private LmdpThirdConciseService lmdpThirdConciseService;

    @GetMapping("list")
    public R<List<LmdpThirdConcise>> list(LmdpThirdConcise lmdpThirdConcise){
        LambdaQueryWrapper<LmdpThirdConcise> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpThirdConcise);
        List<LmdpThirdConcise> list = lmdpThirdConciseService.list(queryWrapper);
        return R.success(list);
    }

}
