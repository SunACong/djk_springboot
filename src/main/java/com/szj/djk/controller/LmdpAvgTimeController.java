package com.szj.djk.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpAvgTime;
import com.szj.djk.entity.LmdpCastPlan;
import com.szj.djk.service.LmdpAvgTimeService;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 生产工序平均时间存储Controller
 *
 * @author jiahua
 * @date 2022-11-22
 */
@RestController
@RequestMapping("/system/time")
public class LmdpAvgTimeController
{
    @Autowired
    private LmdpAvgTimeService lmdpAvgTimeService;

    /**
     * 修改生产工序平均时间存储
     */
    @PutMapping
    public R<List<LmdpAvgTime>> list(LmdpAvgTime lmdpAvgTime){
        LambdaQueryWrapper<LmdpAvgTime> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpAvgTime);
        List<LmdpAvgTime> list = lmdpAvgTimeService.list(queryWrapper);
        return R.success(list);
    }


}
