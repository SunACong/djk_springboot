package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.LmdpQcColdReelReport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author Admin
* @description 针对表【lmdp_qc_cold_reel_report(冷轧卷质检报告)】的数据库操作Mapper
* @createDate 2023-03-25 13:22:39
* @Entity com.szj.djk.entity.LmdpQcColdReelReport
*/
@Mapper
public interface LmdpQcColdReelReportMapper extends BaseMapper<LmdpQcColdReelReport> {

    List<Map<String, Integer>> getEveryDayInfo(String startTime, String endTime);

    List<Map<String, Integer>> getRangeDayInfo(String startTime, String endTime);
}




