package com.szj.djk.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.vo.PlanAndInspect;

import java.util.List;
import java.util.Map;

/**
* @author Admin
* @description 针对表【plan_and_inspect】的数据库操作Service
* @createDate 2023-03-14 15:20:29
*/
public interface PlanAndInspectService extends IService<PlanAndInspect> {
    String getRecentTs();

    Boolean saveBatchOrUpdate();

    Page<PlanAndInspect> pageList(Page<PlanAndInspect> pageInfo, PlanAndInspect planAndInspect);

    List<Map<String, Integer>> getEveryDayInfo(String startTime, String endTime);


    List<Map<String, Integer>> getRangeDayInfo(String startTime, String endTime);
}
