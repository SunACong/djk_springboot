package com.szj.djk.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpCastProduce;
import com.szj.djk.service.LmdpCastProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 【请填写功能名称】Controller
 *
 * @author JH-Sparrow
 * @date 2022-10-17
 */
@RestController
@RequestMapping("/system/castProduce")
public class LmdpCastProduceController{
    @Autowired
    private LmdpCastProduceService lmdpCastProduceService;

    @GetMapping("list")
    public R<List<LmdpCastProduce>> list(LmdpCastProduce lmdpCastProduce){
        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpCastProduce);
        List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
        return R.success(list);
    }

    /**
     * 查询铸轧生产时间
     * @return
     */
    @GetMapping(value = "selectZhuzhaTimeList")
    public R<List<Map<String, Object>>> selectZhuzhaTimeList(){
        List<Map<String, Object>> maps = lmdpCastProduceService.selectZhuzhaTimeList();
        return R.success(maps);
    }

}
