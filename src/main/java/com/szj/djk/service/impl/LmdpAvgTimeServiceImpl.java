package com.szj.djk.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpAvgTime;
import com.szj.djk.mapper.LmdpAvgTimeMapper;
import com.szj.djk.service.LmdpAvgTimeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 生产工序平均时间存储Service业务层处理
 *
 * @author jiahua
 * @date 2022-11-22
 */
@Service
public class LmdpAvgTimeServiceImpl extends ServiceImpl<LmdpAvgTimeMapper, LmdpAvgTime> implements LmdpAvgTimeService {
    @Resource
    private LmdpAvgTimeMapper lmdpAvgTime;
}
