package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdRecord;
import com.szj.djk.service.LmdpColdFurnaceRecordService;
import com.szj.djk.service.LmdpColdRecordService;
import com.szj.djk.service.ProcessCaculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 孙少聪
 * @Date 2023/3/23 17:34:01
 * @Description 冷轧生产原始记录控制层
 */

@DS("slave")
@RestController
@RequestMapping("/lmdpColdRecord")
public class LmdpColdRecordController {

    @Resource
    private LmdpColdRecordService lmdpColdRecordService;
    @Resource
    private ProcessCaculateService processCaculateService;
    @Resource
    private LmdpColdFurnaceRecordService lmdpColdFurnaceRecordService;

    @GetMapping("list")
    public R<List<LmdpColdRecord>> list(LmdpColdRecord lmdpColdRecord){
        LambdaQueryWrapper<LmdpColdRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdRecord);
        List<LmdpColdRecord> list = lmdpColdRecordService.list(queryWrapper);
        return R.success(list);
    }


    @GetMapping("pageList")
    public R<Page<LmdpColdRecord>> pageList(int pageNum, int pageSize, String id){

        DynamicDataSourceContextHolder.push("master");
        Double lengZha = processCaculateService.getById(1).getLengZha();
        DynamicDataSourceContextHolder.poll();

        Page<LmdpColdRecord> pageInfo = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<LmdpColdRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(id != null, LmdpColdRecord::getBatchNum, id)
                .isNotNull(LmdpColdRecord::getProduceDate1)
                .apply("TIMESTAMPDIFF(HOUR, produce_date1, SYSDATE()) > {0} AND NOT EXISTS (SELECT batch_num FROM lmdp_cold_furnace_record lcfr\n" +
                        "  WHERE FIND_IN_SET(lmdp_cold_record.batch_num,lcfr.batch_num))", lengZha)
                .orderByAsc(LmdpColdRecord::getProduceDate1);
        Page<LmdpColdRecord> page = lmdpColdRecordService.pageList(pageInfo, queryWrapper, lengZha);
        return R.success(page);
    }
}

