package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdFurnaceRecord;
import com.szj.djk.service.LmdpColdFurnaceRecordService;
import com.szj.djk.service.ProcessCaculateService;
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
//退火工序
@DS("slave")
@RestController
@RequestMapping("/lmdpColdFurnaceRecord")
public class LmdpColdFurnaceRecordController
{
    @Resource
    private LmdpColdFurnaceRecordService lmdpColdFurnaceRecordService;
    @Resource
    private ProcessCaculateService processCaculateService;

    @GetMapping("list")
    public R<List<LmdpColdFurnaceRecord>> list(LmdpColdFurnaceRecord lmdpColdFurnaceRecord){
        LambdaQueryWrapper<LmdpColdFurnaceRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdFurnaceRecord);
        List<LmdpColdFurnaceRecord> list = lmdpColdFurnaceRecordService.list(queryWrapper);
        return R.success(list);
    }

    @GetMapping("pageList")
    public R<Page<LmdpColdFurnaceRecord>> pageList(int pageNum, int pageSize, String batchNum){

        DynamicDataSourceContextHolder.push("master");
        Double tuiHuo= processCaculateService.getById(1).getTuiHuo();
        DynamicDataSourceContextHolder.poll();

        Page<LmdpColdFurnaceRecord> pageInfo = new Page<>(pageNum, pageSize);

        LambdaQueryWrapper<LmdpColdFurnaceRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(batchNum != null, LmdpColdFurnaceRecord::getBatchNum, batchNum)
                .isNotNull(LmdpColdFurnaceRecord::getStartTime)
                .isNull(LmdpColdFurnaceRecord::getEndTime)
                .apply("TIMESTAMPDIFF(HOUR, start_time, SYSDATE()) > {0}", tuiHuo)
                .orderByAsc(LmdpColdFurnaceRecord::getStartTime);
        Page<LmdpColdFurnaceRecord> page = lmdpColdFurnaceRecordService.pageList(pageInfo, queryWrapper, tuiHuo);
        return R.success(page);
    }
}
