package com.szj.djk.mapper;

import com.szj.djk.entity.LmdpColdFurnaceRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author JH-Sparrow
* @description 针对表【lmdp_cold_furnace_record】的数据库操作Mapper
* @createDate 2022-10-18 16:19:08
* @Entity com.szj.djk.entity.LmdpColdFurnaceRecord
*/
@Mapper
public interface LmdpColdFurnaceRecordMapper extends BaseMapper<LmdpColdFurnaceRecord> {
    // 查询冷轧时间
    public List<Map<String, Object>> selectLenzhaTimeList();
}




