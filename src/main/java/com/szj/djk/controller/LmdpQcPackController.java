package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpQcPack;
import com.szj.djk.service.LmdpQcPackService;
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
@RequestMapping("/system/pack")
public class LmdpQcPackController
{
    @Autowired
    private LmdpQcPackService lmdpQcPackService;

    @GetMapping("list")
    public R<List<LmdpQcPack>> list(LmdpQcPack lmdpQcPack){
        LambdaQueryWrapper<LmdpQcPack> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpQcPack);
        List<LmdpQcPack> list = lmdpQcPackService.list(queryWrapper);
        return R.success(list);
    }

}
