package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpColdRecord;
import com.szj.djk.mapper.LmdpColdRecordMapper;
import com.szj.djk.service.LmdpColdRecordService;
import com.szj.djk.utils.TimeStr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Admin
* @description 针对表【lmdp_cold_record(冷轧生产原始记录)】的数据库操作Service实现
* @createDate 2023-03-25 13:22:39
*/
@Service
public class LmdpColdRecordServiceImpl extends ServiceImpl<LmdpColdRecordMapper, LmdpColdRecord>
    implements LmdpColdRecordService{

    @Resource
    private LmdpColdRecordMapper lmdpColdRecordMapper;

    @Override
    public Page<LmdpColdRecord> pageList(Page<LmdpColdRecord> pageInfo, LambdaQueryWrapper<LmdpColdRecord> queryWrapper, Double lengZha) {
        Page<LmdpColdRecord> page = lmdpColdRecordMapper.selectPage(pageInfo, queryWrapper);
        page.getRecords().forEach(lmdpColdRecord->{
            lmdpColdRecord.setNumberID(lmdpColdRecord.getBatchNum());
            lmdpColdRecord.setBeginTime(lmdpColdRecord.getProduceDate1());
            Double gapTime = TimeStr.getGapTime(lmdpColdRecord.getProduceDate1());
            lmdpColdRecord.setRunningTime(gapTime);
            lmdpColdRecord.setExceedTime(gapTime-lengZha);
        });
        return page;
    }
}




