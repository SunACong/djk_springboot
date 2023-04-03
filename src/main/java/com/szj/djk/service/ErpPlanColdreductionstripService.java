package com.szj.djk.service;

import com.szj.djk.entity.ErpPlanColdreductionstrip;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Admin
* @description 针对表【erp_plan_coldreductionstrip(冷轧生产计划表)】的数据库操作Service
* @createDate 2023-03-25 13:22:39
*/
public interface ErpPlanColdreductionstripService extends IService<ErpPlanColdreductionstrip> {
     ErpPlanColdreductionstrip getColdPlan(String reelNum);
}
