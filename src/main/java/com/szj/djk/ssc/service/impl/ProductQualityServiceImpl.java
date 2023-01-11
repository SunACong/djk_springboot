package com.szj.djk.ssc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.ssc.entity.ProductQuality;
import com.szj.djk.ssc.mapper.ProductQualityMapper;
import com.szj.djk.ssc.service.ProductQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class ProductQualityServiceImpl extends ServiceImpl<ProductQualityMapper, ProductQuality> implements ProductQualityService {

    @Autowired
    private ProductQualityMapper productQualityMapper;

    @Override
    public IPage<ProductQuality> selectProductQualityAndStandard(Page<ProductQuality> page, QueryWrapper<ProductQuality> queryWrapper,ProductQuality productQuality) {
        IPage<ProductQuality> productQualityIPage = productQualityMapper.selectProductQualityAndStandard(page, queryWrapper, productQuality);
        return productQualityIPage;
    }

    @Override
    public Date selectMaxDate() {
        return productQualityMapper.selectMaxDate();
    }
}
