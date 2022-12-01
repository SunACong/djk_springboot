package com.szj.djk.controller;

import java.util.List;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdStoreRecord;
import com.szj.djk.service.LmdpColdStoreRecordService;
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
@RequestMapping("/system/coldRecord")
public class LmdpColdStoreRecordController
{
    @Autowired
    private LmdpColdStoreRecordService lmdpColdStoreRecordService;

    @GetMapping("list")
    public R<List<LmdpColdStoreRecord>> list(LmdpColdStoreRecord lmdpColdStoreRecord){
        LambdaQueryWrapper<LmdpColdStoreRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdStoreRecord);
        List<LmdpColdStoreRecord> list = lmdpColdStoreRecordService.list(queryWrapper);
        return R.success(list);
    }
}
