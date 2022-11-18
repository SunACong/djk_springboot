package com.szj.djk.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.PeriodCompute;

import java.util.List;


/**
 * 周期计算Service接口
 *
 * @author jiahua
 * @date 2022-11-07
 */
public interface PeriodComputeService extends IService<PeriodCompute>{

    List<PeriodCompute> autoAdd(String startTime);
}
