package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.ProcessCaculate;
import com.szj.djk.mapper.ProcessCaculateMapper;
import com.szj.djk.mapper.ProcessComputeMapper;
import com.szj.djk.service.ProcessCaculateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* @author ACongSun
* @description 针对表【process_caculate】的数据库操作Service实现
* @createDate 2023-05-20 14:26:43
*/
@Service
public class ProcessCaculateServiceImpl extends ServiceImpl<ProcessCaculateMapper, ProcessCaculate>
    implements ProcessCaculateService{

    @Resource
    ProcessComputeMapper processComputeMapper;
    @Override
    public List<Map<String, Integer>> historyException() {
        return processComputeMapper.historyException();
    }
}




