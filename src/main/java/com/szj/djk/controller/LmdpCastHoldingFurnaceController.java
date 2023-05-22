package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpCastHoldingFurnace;
import com.szj.djk.entity.LmdpCastProduce;
import com.szj.djk.service.LmdpCastHoldingFurnaceService;
import com.szj.djk.service.LmdpCastProduceService;
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
@DS("slave")
@RestController
@RequestMapping("/lmdpCastHoldingFurnace")
public class LmdpCastHoldingFurnaceController
{
    @Autowired
    private LmdpCastHoldingFurnaceService lmdpCastHoldingFurnaceService;
    @Resource
    private LmdpCastProduceService lmdpCastProduceService;
    @Resource
    private ProcessCaculateService processCaculateService;


    @GetMapping("list")
    public R<List<LmdpCastHoldingFurnace>> list(LmdpCastHoldingFurnace lmdpCastHoldingFurnace){
        LambdaQueryWrapper<LmdpCastHoldingFurnace> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpCastHoldingFurnace);
        List<LmdpCastHoldingFurnace> list = lmdpCastHoldingFurnaceService.list(queryWrapper);
        return R.success(list);
    }

    @GetMapping("pageList")
    public R<Page<LmdpCastHoldingFurnace>> pageList(int pageNum, int pageSize, String smeltTimes){

        DynamicDataSourceContextHolder.push("master");
        Double baoWen = processCaculateService.getById(1).getBaoWen();
        DynamicDataSourceContextHolder.poll();

        LambdaQueryWrapper<LmdpCastProduce> queryWrapper1 = new LambdaQueryWrapper<>();
        queryWrapper1.eq(smeltTimes!=null, LmdpCastProduce::getSmeltTimes, smeltTimes);
        List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper1);

        Page<LmdpCastHoldingFurnace> pageInfo = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<LmdpCastHoldingFurnace> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(smeltTimes != null && list.size() == 0, LmdpCastHoldingFurnace::getSmeltTimes,smeltTimes)
                .isNotNull(LmdpCastHoldingFurnace::getTurndownAfterEndTime)
                .apply("TIMESTAMPDIFF(HOUR, turndown_after_end_time, SYSDATE()) > {0}", baoWen)
                .orderByAsc(LmdpCastHoldingFurnace::getTurndownAfterEndTime);
        Page<LmdpCastHoldingFurnace> page = lmdpCastHoldingFurnaceService.pageList(pageInfo, queryWrapper, baoWen);
        return R.success(page);
    }
}
