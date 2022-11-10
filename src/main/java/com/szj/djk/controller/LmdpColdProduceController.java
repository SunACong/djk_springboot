package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdProduce;
import com.szj.djk.service.LmdpColdProduceService;
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
@RequestMapping("/system/coldProduce")
public class LmdpColdProduceController
{
    @Autowired
    private LmdpColdProduceService lmdpColdProduceService;

    @GetMapping("list")
    public R<List<LmdpColdProduce>> list(LmdpColdProduce lmdpColdProduce){
        LambdaQueryWrapper<LmdpColdProduce> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdProduce);
        List<LmdpColdProduce> list = lmdpColdProduceService.list(queryWrapper);
        return R.success(list);
    }
}
