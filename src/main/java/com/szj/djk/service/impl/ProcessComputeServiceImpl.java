package com.szj.djk.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.szj.djk.mapper.ProcessComputeMapper;
import com.szj.djk.service.ProcessComputeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
@DS("slave")
public class ProcessComputeServiceImpl implements ProcessComputeService {

    @Resource
    ProcessComputeMapper processComputeMapper;

    @Override
    public List<Map<String, BigDecimal>> getComputeTime() {
        return processComputeMapper.getComputeTime();
    }
}
