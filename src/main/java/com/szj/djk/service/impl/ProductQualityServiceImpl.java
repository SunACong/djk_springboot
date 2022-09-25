package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.ProductQuality;
import com.szj.djk.mapper.ProductQualityMapper;
import com.szj.djk.service.ProductQualityService;
import org.springframework.stereotype.Service;

/**
 * @ClassName ProductQualityServiceImpl
 * @Authoc 孙少聪
 * @Date 2022/9/25 10:16:14
 */

@Service
public class ProductQualityServiceImpl extends ServiceImpl<ProductQualityMapper, ProductQuality> implements ProductQualityService {
}
