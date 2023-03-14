package com.szj.djk.service;

import com.szj.djk.vo.PlanAndInspect;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Admin
* @description 针对表【plan_and_inspect】的数据库操作Service
* @createDate 2023-03-14 15:20:29
*/
public interface PlanAndInspectService extends IService<PlanAndInspect> {
    String getRecentTs();
}
