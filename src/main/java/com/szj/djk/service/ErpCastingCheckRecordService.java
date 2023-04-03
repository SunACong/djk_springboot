package com.szj.djk.service;

import com.szj.djk.entity.ErpCastingCheckRecord;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Admin
* @description 针对表【erp_casting_check_record(铸轧成品质检记录)】的数据库操作Service
* @createDate 2023-03-25 15:23:36
*/
public interface ErpCastingCheckRecordService extends IService<ErpCastingCheckRecord> {
    String getReelNum(String batchNum);
}
