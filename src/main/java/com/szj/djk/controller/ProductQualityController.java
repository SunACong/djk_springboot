package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.ProductQuality;
import com.szj.djk.service.ProductQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ProductQualityController
 * @Authoc 孙少聪
 * @Date 2022/9/25 10:18:40
 */

@RestController
@RequestMapping("/productQuality")
public class ProductQualityController {

    @Autowired
    private ProductQualityService productQualityService;

    @GetMapping("list")
    public R<List<ProductQuality>> list(){
        LambdaQueryWrapper<ProductQuality> queryWrapper = new LambdaQueryWrapper<>();
        List<ProductQuality> list = productQualityService.list(queryWrapper);
        return R.success(list);
    }

    @GetMapping("pageList")
    public R<Page> pageList(int currentPage, int pageSize, ProductQuality productQuality){
        System.out.println(productQuality.getBatchNum());
        Page<ProductQuality> pageInfo = new Page<>(currentPage, pageSize);

        LambdaQueryWrapper<ProductQuality> queryWrapper = new LambdaQueryWrapper<>();
        if (productQuality.getBatchNum() != null && !"".equals(productQuality.getBatchNum())){
            queryWrapper.eq(ProductQuality::getBatchNum, productQuality.getBatchNum());
        }
        //if(productQuality.getStartDateTime() != null && productQuality.getEndDateTime() != null){
        //    queryWrapper.between(ProductQuality::getTs, productQuality.getStartDateTime(), productQuality.getEndDateTime());
        //}
        Page<ProductQuality> page = productQualityService.page(pageInfo, queryWrapper);
        return R.success(page);
    }

    @GetMapping("pageVOList")
    public R<IPage> test(int currentPage, int pageSize, ProductQuality productQuality) {
        QueryWrapper<ProductQuality> queryWrapper = new QueryWrapper<>();
        Page<ProductQuality> page = new Page<ProductQuality>(currentPage, pageSize);
        IPage<ProductQuality> productQualityIPage = productQualityService.selectProductQualityAndStandard(page, queryWrapper, productQuality);
        return R.success(productQualityIPage);
    }
}
