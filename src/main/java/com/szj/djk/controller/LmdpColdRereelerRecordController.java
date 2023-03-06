package com.szj.djk.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdRereelerRecord;
import com.szj.djk.service.LmdpColdRereelerRecordService;

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
@RequestMapping("/system/rerRecord")
public class LmdpColdRereelerRecordController
{
    @Autowired
    private LmdpColdRereelerRecordService lmdpColdRereelerRecordService;

    @GetMapping("list")
    public R<List<LmdpColdRereelerRecord>> list(LmdpColdRereelerRecord lmdpColdRereelerRecord){
        LambdaQueryWrapper<LmdpColdRereelerRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdRereelerRecord);
        List<LmdpColdRereelerRecord> list = lmdpColdRereelerRecordService.list(queryWrapper);
        return R.success(list);
    }

}
