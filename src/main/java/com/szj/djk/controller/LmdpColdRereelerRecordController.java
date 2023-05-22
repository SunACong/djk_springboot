package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdRereelerRecord;
import com.szj.djk.service.LmdpColdRereelerRecordService;
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
//重卷工序
@DS("slave")
@RestController
@RequestMapping("/lmdpColdRereelerRecord")
public class LmdpColdRereelerRecordController
{
    @Autowired
    private LmdpColdRereelerRecordService lmdpColdRereelerRecordService;
    @Resource
    private ProcessCaculateService processCaculateService;

    @GetMapping("list")
    public R<List<LmdpColdRereelerRecord>> list(LmdpColdRereelerRecord lmdpColdRereelerRecord){
        LambdaQueryWrapper<LmdpColdRereelerRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdRereelerRecord);
        List<LmdpColdRereelerRecord> list = lmdpColdRereelerRecordService.list(queryWrapper);
        return R.success(list);
    }

    @GetMapping("pageList")
    public R<Page<LmdpColdRereelerRecord>> pageList(int pageNum, int pageSize, String batchNum){
        DynamicDataSourceContextHolder.push("master");
        Double chongJuan = processCaculateService.getById(1).getChongJuan();
        DynamicDataSourceContextHolder.poll();

        Page<LmdpColdRereelerRecord> pageInfo = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<LmdpColdRereelerRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(batchNum != null, LmdpColdRereelerRecord::getBatchNum,batchNum)
                .isNotNull(LmdpColdRereelerRecord::getTrimmingTime)
                .isNull(LmdpColdRereelerRecord::getSleeveEndDate)
                .apply("TIMESTAMPDIFF(HOUR, trimming_time, SYSDATE()) > {0}", chongJuan)
                .orderByAsc(LmdpColdRereelerRecord::getTrimmingTime);
        Page<LmdpColdRereelerRecord> page = lmdpColdRereelerRecordService.pageList(pageInfo, queryWrapper, chongJuan);
        return R.success(page);
    }

}
