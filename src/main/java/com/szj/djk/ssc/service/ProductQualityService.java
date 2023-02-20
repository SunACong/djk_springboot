package com.szj.djk.ssc.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.ssc.entity.ProductQuality;

import java.util.Date;

public interface ProductQualityService extends IService<ProductQuality> {
    IPage<ProductQuality> selectProductQualityAndStandard(Page<ProductQuality> page, QueryWrapper<ProductQuality> queryWrapper, ProductQuality productQuality);

    Date selectMaxDate();
}
