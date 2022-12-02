package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.Avaluate;
import com.szj.djk.entity.ProductQuality;
import com.szj.djk.mapper.AvaluateMapper;
import com.szj.djk.service.AvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AvaluateServiceImpl
 * @Author Administrator
 * @Create 2022/10/8 0008 下午 17:05
 */
@Service
public class AvaluateServiceImpl extends ServiceImpl<AvaluateMapper, Avaluate> implements AvaluateService {
    @Autowired
    public AvaluateMapper avaluateMapper;
    @Override
    public IPage<Avaluate> selectAvaluateAndStandard(Page<Avaluate> page, QueryWrapper<Avaluate> queryWrapper, Avaluate avaluate) {
        IPage<Avaluate> avaluateIPage = avaluateMapper.selectAvaluateAndStandard(page, queryWrapper, avaluate);
        return avaluateIPage;
    }
}
