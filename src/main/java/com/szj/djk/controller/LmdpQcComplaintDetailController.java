package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpCastPlan;
import com.szj.djk.entity.LmdpQcComplaintDetail;
import com.szj.djk.service.LmdpCastPlanService;
import com.szj.djk.service.LmdpQcComplaintDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 【请填写功能名称】Controller
 *
 * @author JH-Sparrow
 * @date 2022-10-17
 */
@RestController
@RequestMapping("/qcComplaintDetail")
public class LmdpQcComplaintDetailController
{
    @Autowired
    private LmdpQcComplaintDetailService lmdpQcComplaintDetailService;

    @GetMapping("list")
    public R<List<LmdpQcComplaintDetail>> list(LmdpQcComplaintDetail lmdpQcComplaintDetail){
        LambdaQueryWrapper<LmdpQcComplaintDetail> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpQcComplaintDetail);
        List<LmdpQcComplaintDetail> list = lmdpQcComplaintDetailService.list(queryWrapper);
        return R.success(list);
    }
}
