package com.szj.djk.controller;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpColdFurnaceRecord;
import com.szj.djk.service.LmdpColdFurnaceRecordService;
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
@RequestMapping("/system/furnaceRecord")
public class LmdpColdFurnaceRecordController
{
    @Autowired
    private LmdpColdFurnaceRecordService lmdpColdFurnaceRecordService;

    @GetMapping("list")
    public R<List<LmdpColdFurnaceRecord>> list(LmdpColdFurnaceRecord lmdpColdFurnaceRecord){
        LambdaQueryWrapper<LmdpColdFurnaceRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpColdFurnaceRecord);
        List<LmdpColdFurnaceRecord> list = lmdpColdFurnaceRecordService.list(queryWrapper);
        return R.success(list);
    }

    /**
     * 查询冷轧生产时间
     * @return
     */
    @GetMapping(value = "selectLenzhaTimeList")
    public R<List<Map<String, Object>>> selectLenzhaTimeList(){
        List<Map<String, Object>> maps = lmdpColdFurnaceRecordService.selectLenzhaTimeList();
        return R.success(maps);
    }
}
