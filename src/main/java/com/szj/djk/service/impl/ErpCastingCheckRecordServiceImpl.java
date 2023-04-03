package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.ErpCastingCheckRecord;
import com.szj.djk.service.ErpCastingCheckRecordService;
import com.szj.djk.mapper.ErpCastingCheckRecordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Admin
* @description 针对表【erp_casting_check_record(铸轧成品质检记录)】的数据库操作Service实现
* @createDate 2023-03-25 15:23:36
*/
@Service
public class ErpCastingCheckRecordServiceImpl extends ServiceImpl<ErpCastingCheckRecordMapper, ErpCastingCheckRecord>
    implements ErpCastingCheckRecordService{
    @Resource
    private ErpCastingCheckRecordMapper erpCastingCheckRecordMapper;

    @Override
    public String getReelNum(String batchNum) {
        String reelNum = erpCastingCheckRecordMapper.getReelNum(batchNum);
        return reelNum;
    }
}




