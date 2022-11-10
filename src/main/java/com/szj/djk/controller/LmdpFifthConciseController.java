package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpFifthConcise;
import com.szj.djk.service.LmdpFifthConciseService;
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
@RequestMapping("/system/fifthConcise")
public class LmdpFifthConciseController
{
    @Autowired
    private LmdpFifthConciseService lmdpFifthConciseService;

    @GetMapping("list")
    public R<List<LmdpFifthConcise>> list(LmdpFifthConcise lmdpFifthConcise){
        LambdaQueryWrapper<LmdpFifthConcise> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpFifthConcise);
        List<LmdpFifthConcise> list = lmdpFifthConciseService.list(queryWrapper);
        return R.success(list);
    }

}
