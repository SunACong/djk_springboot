package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdProduce;
import com.szj.djk.service.LmdpColdProduceService;
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
//冷轧工序
@DS("slave")
@RestController
@RequestMapping("/lmdpColdProduce")
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

//    @GetMapping("getALlBatchNum")
//    public R<List<Map<String, String>>> getALlBatchNum(){
//        List<Map<String, String>> list = lmdpColdProduceService.getALlBatchNum();
//        return R.success(list);
//    }
}
