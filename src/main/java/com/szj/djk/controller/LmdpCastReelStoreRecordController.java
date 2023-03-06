package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpCastPlan;
import com.szj.djk.entity.LmdpCastReelStoreRecord;
import com.szj.djk.service.LmdpCastPlanService;
import com.szj.djk.service.LmdpCastReelStoreRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2022-10-17
 */
@RestController
@RequestMapping("/system/castReelStoreRecord")
public class LmdpCastReelStoreRecordController
{
    @Autowired
   private LmdpCastReelStoreRecordService lmdpCastReelStoreRecordService;

    @GetMapping("list")
    public R<List<LmdpCastReelStoreRecord>> list(LmdpCastReelStoreRecord lmdpCastReelStoreRecord){
        LambdaQueryWrapper<LmdpCastReelStoreRecord> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpCastReelStoreRecord);
        List<LmdpCastReelStoreRecord> list = lmdpCastReelStoreRecordService.list(queryWrapper);
        return R.success(list);
    }
}
