package com.szj.djk.controller;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpCastProduce;
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
 * @author JH-Sparrow
 * @date 2022-10-17
 */
//铸轧工序
@DS("slave")
@RestController
@RequestMapping("/lmdpCastProduce")
public class LmdpCastProduceController{

    @Autowired
    private LmdpCastProduceService lmdpCastProduceService;
    @Resource
    private ProcessCaculateService processCaculateService;

    @GetMapping("list")
    public R<List<LmdpCastProduce>> list(LmdpCastProduce lmdpCastProduce){
        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpCastProduce);
        List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
        return R.success(list);
    }

    @GetMapping("pageList")
    public R<Page<LmdpCastProduce>> pageList(int pageNum, int pageSize, String id){
        DynamicDataSourceContextHolder.push("master");
        Double zhuZha= processCaculateService.getById(1).getZhuZha();
        DynamicDataSourceContextHolder.poll();

        Page<LmdpCastProduce> pageInfo = new Page<>(pageNum, pageSize);

        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(id != null, LmdpCastProduce::getReelNum,id)
                .isNotNull(LmdpCastProduce::getProcUpperTime)
                .isNull(LmdpCastProduce::getProcLowerRemoveTime)
                .apply("TIMESTAMPDIFF(HOUR, proc_upper_time, SYSDATE()) > {0}", zhuZha)
                .orderByAsc(LmdpCastProduce::getProcUpperTime);
        Page<LmdpCastProduce> page = lmdpCastProduceService.pageList(pageInfo, queryWrapper, zhuZha);
        return R.success(page);
    }
}
