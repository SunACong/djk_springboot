package com.szj.djk.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.szj.djk.entity.SlaveErpPlanColdreductionstrip;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Admin
* @description 针对表【erp_plan_coldreductionstrip(冷轧生产计划表)】的数据库操作Mapper
* @createDate 2023-03-15 15:01:36
* @Entity com.szj.djk.entity.SlaveErpPlanColdreductionstrip
*/
@Mapper
@DS("slave")
public interface SlaveErpPlanColdreductionstripMapper extends BaseMapper<SlaveErpPlanColdreductionstrip> {

}




