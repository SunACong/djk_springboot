package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdFurnaceRecord;
import com.szj.djk.service.LmdpColdFurnaceRecordService;
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

    @GetMapping("list")
    public R<List<LmdpColdFurnaceRecord>> list(LmdpColdFurnaceRecord lmdpColdFurnaceRecord){
        LambdaQueryWrapper<LmdpColdFurnaceRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdFurnaceRecord);
        List<LmdpColdFurnaceRecord> list = lmdpColdFurnaceRecordService.list(queryWrapper);
        return R.success(list);
    }
}
