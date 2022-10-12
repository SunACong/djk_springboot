package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.Avaluate;
import com.szj.djk.service.AvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName AvaluateController
 * @Author 张高义
 * @Create 2022/10/8 0008 下午 17:10
 */
@RestController
@RequestMapping("/avaluate")
public class AvaluateController {
    @Autowired
    private AvaluateService avaluateService;
    @GetMapping("list")
    public R<List<Avaluate>> list(){
        LambdaQueryWrapper<Avaluate> queryWrapper = new LambdaQueryWrapper<>();
        List<Avaluate> list = avaluateService.list();
        return R.success(list);
    }
}
