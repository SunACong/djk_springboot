package com.szj.djk.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.PeriodCompute;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 周期计算Mapper接口
 *
 * @author jiahua
 * @date 2022-11-07
 */
@Mapper
public interface PeriodComputeMapper extends BaseMapper<PeriodCompute>{

    // 查询总体平均时间
    public List<Map<String, Object>> selectAVGTimeList();

    // 查询最近平均时间
    public List<Map<String, Object>> selectNewAVGTimeList();

}
