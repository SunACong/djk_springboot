package com.szj.djk.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.LmdpColdRecord;

/**
* @author Admin
* @description 针对表【lmdp_cold_record(冷轧生产原始记录)】的数据库操作Service
* @createDate 2023-03-25 13:22:39
*/
public interface LmdpColdRecordService extends IService<LmdpColdRecord> {
    Page<LmdpColdRecord> pageList(Page<LmdpColdRecord> pageInfo, LambdaQueryWrapper<LmdpColdRecord> queryWrapper, Double lengZha );
}
