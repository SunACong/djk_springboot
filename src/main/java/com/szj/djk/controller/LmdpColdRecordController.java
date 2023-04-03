package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdRecord;
import com.szj.djk.service.LmdpColdRecordService;
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

    @GetMapping("list")
    public R<List<LmdpColdRecord>> list(LmdpColdRecord lmdpColdRecord){
        LambdaQueryWrapper<LmdpColdRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdRecord);
        List<LmdpColdRecord> list = lmdpColdRecordService.list(queryWrapper);
        return R.success(list);
    }
}

