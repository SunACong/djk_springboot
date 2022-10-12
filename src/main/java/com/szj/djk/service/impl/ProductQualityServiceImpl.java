package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.ProductQuality;
import com.szj.djk.mapper.ProductQualityMapper;
import com.szj.djk.service.ProductQualityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ProductQualityServiceImpl
 * @Authoc 孙少聪
 * @Date 2022/9/25 10:16:14
 */

@Service
public class ProductQualityServiceImpl extends ServiceImpl<ProductQualityMapper, ProductQuality> implements ProductQualityService {

    @Autowired
    private ProductQualityMapper productQualityMapper;

    @Override
    public IPage<ProductQuality> selectProductQualityAndStandard(Page<ProductQuality> page, QueryWrapper<ProductQuality> queryWrapper,ProductQuality productQuality) {
        IPage<ProductQuality> productQualityIPage = productQualityMapper.selectProductQualityAndStandard(page, queryWrapper, productQuality);
        return productQualityIPage;
    }
}
