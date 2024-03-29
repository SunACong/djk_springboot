package com.szj.djk.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.LmdpColdRereelerRecord;

/**
* @author Admin
* @description 针对表【lmdp_cold_rereeler_record(重卷生产原始记录)】的数据库操作Service
* @createDate 2023-03-25 13:22:39
*/
public interface LmdpColdRereelerRecordService extends IService<LmdpColdRereelerRecord> {
    Page<LmdpColdRereelerRecord> pageList(Page<LmdpColdRereelerRecord> pageInfo, LambdaQueryWrapper<LmdpColdRereelerRecord> queryWrapper, Double chongJuan );
}
