package com.szj.djk.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.PeriodCompute;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 周期计算Mapper接口
 *
 * @author jiahua
 * @date 2022-11-07
 */
@Mapper
public interface PeriodComputeMapper extends BaseMapper<PeriodCompute>{

    List<PeriodCompute> autAdd(String startTime);
}
