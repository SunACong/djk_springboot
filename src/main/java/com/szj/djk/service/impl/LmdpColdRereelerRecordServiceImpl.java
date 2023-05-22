package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpColdRereelerRecord;
import com.szj.djk.mapper.LmdpColdRereelerRecordMapper;
import com.szj.djk.service.LmdpColdRereelerRecordService;
import com.szj.djk.utils.TimeStr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Admin
* @description 针对表【lmdp_cold_rereeler_record(重卷生产原始记录)】的数据库操作Service实现
* @createDate 2023-03-25 13:22:39
*/
@Service
public class LmdpColdRereelerRecordServiceImpl extends ServiceImpl<LmdpColdRereelerRecordMapper, LmdpColdRereelerRecord>
    implements LmdpColdRereelerRecordService{
    @Resource
    private LmdpColdRereelerRecordMapper lmdpColdRereelerRecordMapper;

    @Override
    public Page<LmdpColdRereelerRecord> pageList(Page<LmdpColdRereelerRecord> pageInfo, LambdaQueryWrapper<LmdpColdRereelerRecord> queryWrapper, Double chongJuan) {
        Page<LmdpColdRereelerRecord> page = lmdpColdRereelerRecordMapper.selectPage(pageInfo, queryWrapper);
        page.getRecords().forEach(lmdpColdRereelerRecord->{
            lmdpColdRereelerRecord.setNumberID(lmdpColdRereelerRecord.getBatchNum());
            lmdpColdRereelerRecord.setBeginTime(lmdpColdRereelerRecord.getTrimmingTime());
            Double gapTime = TimeStr.getGapTime(lmdpColdRereelerRecord.getTrimmingTime());
            lmdpColdRereelerRecord.setRunningTime(gapTime);
            lmdpColdRereelerRecord.setExceedTime(gapTime-chongJuan);
        });
        return page;
    }
}




