package com.szj.djk.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.Avaluate;
import com.szj.djk.entity.ProductQuality;
import org.springframework.stereotype.Service;

@Service
public interface AvaluateService extends IService<Avaluate> {
    IPage<Avaluate> selectAvaluateAndStandard(Page<Avaluate> page, QueryWrapper<Avaluate> queryWrapper, Avaluate avaluate);
}
