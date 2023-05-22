package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpCastSmeltHold;
import com.szj.djk.service.LmdpCastSmeltHoldService;
import com.szj.djk.service.ProcessCaculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2022-10-17
 */
//熔炼工序
@DS("slave")
@RestController
@RequestMapping("/lmdpCastSmeltHold")
public class LmdpCastSmeltHoldController
{
    @Autowired
    private LmdpCastSmeltHoldService lmdpCastSmeltHoldService;
    @Resource
    private ProcessCaculateService processCaculateService;

    @GetMapping("list")
    public R<List<LmdpCastSmeltHold>> list(LmdpCastSmeltHold lmdpCastSmeltHold){
        LambdaQueryWrapper<LmdpCastSmeltHold> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpCastSmeltHold);
        List<LmdpCastSmeltHold> list = lmdpCastSmeltHoldService.list(queryWrapper);
        return R.success(list);
    }

    @GetMapping("pageList")
    public R<Page<LmdpCastSmeltHold>> pageList(int pageNum, int pageSize, String smeltTimes){
        DynamicDataSourceContextHolder.push("master");
        Double rongLian = processCaculateService.getById(1).getRongLian();
        DynamicDataSourceContextHolder.poll();

        Page<LmdpCastSmeltHold> pageInfo = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<LmdpCastSmeltHold> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(smeltTimes != null, LmdpCastSmeltHold::getSmeltTimes,smeltTimes)
                .isNotNull(LmdpCastSmeltHold::getFeedTime)
                .isNull(LmdpCastSmeltHold::getTurndownEndTime)
                .apply("TIMESTAMPDIFF(HOUR, feed_time, SYSDATE()) > {0}", rongLian)
                .orderByAsc(LmdpCastSmeltHold::getFeedTime);
        Page<LmdpCastSmeltHold> page = lmdpCastSmeltHoldService.pageList(pageInfo, queryWrapper, rongLian);
        return R.success(page);
    }
}
