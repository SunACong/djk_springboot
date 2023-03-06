package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpQcCastReel;
import com.szj.djk.service.LmdpQcCastReelService;
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
@RequestMapping("/system/reel")
public class LmdpQcCastReelController
{
    @Autowired
    private LmdpQcCastReelService lmdpQcCastReelService;


    @GetMapping("list")
    public R<List<LmdpQcCastReel>> list(LmdpQcCastReel lmdpQcCastReel){
        LambdaQueryWrapper<LmdpQcCastReel> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpQcCastReel);
        List<LmdpQcCastReel> list = lmdpQcCastReelService.list(queryWrapper);
        return R.success(list);
    }
}
