package com.szj.djk.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.ProductQuality;

public interface ProductQualityService extends IService<ProductQuality> {
    IPage<ProductQuality> selectProductQualityAndStandard(Page<ProductQuality> page, QueryWrapper<ProductQuality> queryWrapper, ProductQuality productQuality);
}
