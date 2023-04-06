package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.ErpPlanColdreductionstrip;
import com.szj.djk.service.ErpPlanColdreductionstripService;
import com.szj.djk.mapper.ErpPlanColdreductionstripMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Admin
* @description 针对表【erp_plan_coldreductionstrip(冷轧生产计划表)】的数据库操作Service实现
* @createDate 2023-03-25 13:22:39
*/
@Service
public class ErpPlanColdreductionstripServiceImpl extends ServiceImpl<ErpPlanColdreductionstripMapper, ErpPlanColdreductionstrip>
    implements ErpPlanColdreductionstripService{

    @Resource
    private ErpPlanColdreductionstripMapper erpPlanColdreductionstripMapper;

    @Override
    public ErpPlanColdreductionstrip getColdPlan(String reelNum) {
        return erpPlanColdreductionstripMapper.getColdPlan(reelNum);
    }
}




