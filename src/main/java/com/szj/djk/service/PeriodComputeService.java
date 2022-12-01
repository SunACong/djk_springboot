package com.szj.djk.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.PeriodCompute;

import java.util.List;
import java.util.Map;


/**
 * 周期计算Service接口
 *
 * @author jiahua
 * @date 2022-11-07
 */
public interface PeriodComputeService extends IService<PeriodCompute>{

    /**
     * 查询平均时间
     * @return
     */
    public List<Map<String, Object>> selectAVGTimeList();

}


