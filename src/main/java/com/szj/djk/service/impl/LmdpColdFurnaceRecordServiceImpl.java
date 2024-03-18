package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpColdFurnaceRecord;
import com.szj.djk.mapper.LmdpColdFurnaceRecordMapper;
import com.szj.djk.service.LmdpColdFurnaceRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Admin
* @description 针对表【lmdp_cold_furnace_record(退火生产原始记录)】的数据库操作Service实现
* @createDate 2023-03-25 13:22:39
*/
@Service
public class LmdpColdFurnaceRecordServiceImpl extends ServiceImpl<LmdpColdFurnaceRecordMapper, LmdpColdFurnaceRecord>
    implements LmdpColdFurnaceRecordService{

    @Resource
    private LmdpColdFurnaceRecordMapper lmdpColdFurnaceRecordMapper;

    @Override
    public Page<LmdpColdFurnaceRecord> pageList(Page<LmdpColdFurnaceRecord> pageInfo, LambdaQueryWrapper<LmdpColdFurnaceRecord> queryWrapper, Double tuiHuo) {
        Page<LmdpColdFurnaceRecord> page = lmdpColdFurnaceRecordMapper.selectPage(pageInfo, queryWrapper);
//        page.getRecords().forEach(lmdpColdFurnaceRecord->{
//            lmdpColdFurnaceRecord.setNumberID(lmdpColdFurnaceRecord.getBatchNum());
//            lmdpColdFurnaceRecord.setBeginTime(lmdpColdFurnaceRecord.getStartTime());
//            Double gapTime = TimeStr.getGapTime(lmdpColdFurnaceRecord.getStartTime());
//            lmdpColdFurnaceRecord.setRunningTime(gapTime);
//            lmdpColdFurnaceRecord.setExceedTime(gapTime-tuiHuo);
//        });
        return page;
    }
}




