package com.szj.djk.mapper;

import com.szj.djk.vo.PlanAndInspect;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author Admin
* @description 针对表【plan_and_inspect】的数据库操作Mapper
* @createDate 2023-03-14 15:20:29
* @Entity com.szj.djk.vo.PlanAndInspect
*/
@Mapper
public interface PlanAndInspectMapper extends BaseMapper<PlanAndInspect> {
    String getRecentTs();

    Boolean saveBatchOrUpdate(List<PlanAndInspect> list);

    @MapKey("inspectCreteTime")
    List<Map<String, Integer>> getEveryDayInfo(String startTime, String endTime);

    @MapKey("inspectCreteTime")
    List<Map<String, Integer>> getRangeDayInfo(String startTime, String endTime);
}




