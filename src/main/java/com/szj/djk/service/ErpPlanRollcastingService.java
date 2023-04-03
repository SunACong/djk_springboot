package com.szj.djk.service;

import com.szj.djk.entity.ErpPlanRollcasting;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.vo.ProcessMonitor;

/**
* @author Admin
* @description 针对表【erp_plan_rollcasting(铸轧生产计划表)】的数据库操作Service
* @createDate 2023-03-25 13:22:39
*/
public interface ErpPlanRollcastingService extends IService<ErpPlanRollcasting> {
    ProcessMonitor getProcessMonitor(String number, String type);
}
