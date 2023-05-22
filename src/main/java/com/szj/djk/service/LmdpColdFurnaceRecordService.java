package com.szj.djk.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.LmdpColdFurnaceRecord;

/**
* @author Admin
* @description 针对表【lmdp_cold_furnace_record(退火生产原始记录)】的数据库操作Service
* @createDate 2023-03-25 13:22:39
*/
public interface LmdpColdFurnaceRecordService extends IService<LmdpColdFurnaceRecord> {
    Page<LmdpColdFurnaceRecord> pageList(Page<LmdpColdFurnaceRecord> pageInfo, LambdaQueryWrapper<LmdpColdFurnaceRecord> queryWrapper, Double tuiHuo );
}
