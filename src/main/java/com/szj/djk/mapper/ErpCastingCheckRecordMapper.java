package com.szj.djk.mapper;

import com.szj.djk.entity.ErpCastingCheckRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Admin
* @description 针对表【erp_casting_check_record(铸轧成品质检记录)】的数据库操作Mapper
* @createDate 2023-03-25 15:23:36
* @Entity com.szj.djk.entity.ErpCastingCheckRecord
*/

@Mapper
public interface ErpCastingCheckRecordMapper extends BaseMapper<ErpCastingCheckRecord> {

    String getReelNum(String batchNum);
}




