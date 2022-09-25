package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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

}
