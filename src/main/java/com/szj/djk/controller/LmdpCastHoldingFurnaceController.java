package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpCastHoldingFurnace;
import com.szj.djk.service.LmdpCastHoldingFurnaceService;
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
@DS("slave")
@RestController
@RequestMapping("/lmdpCastHoldingFurnace")
public class LmdpCastHoldingFurnaceController
{
    @Autowired
    private LmdpCastHoldingFurnaceService lmdpCastHoldingFurnaceService;

    @GetMapping("list")
    public R<List<LmdpCastHoldingFurnace>> list(LmdpCastHoldingFurnace lmdpCastHoldingFurnace){
        LambdaQueryWrapper<LmdpCastHoldingFurnace> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpCastHoldingFurnace);
        List<LmdpCastHoldingFurnace> list = lmdpCastHoldingFurnaceService.list(queryWrapper);
        return R.success(list);
    }
}
