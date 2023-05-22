package com.szj.djk.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.LmdpCastProduce;

/**
* @author Admin
* @description 针对表【lmdp_cast_produce(铸轧工序)】的数据库操作Service
* @createDate 2023-04-02 10:04:39
*/
public interface LmdpCastProduceService extends IService<LmdpCastProduce> {
    Page<LmdpCastProduce> pageList(Page<LmdpCastProduce> pageInfo, LambdaQueryWrapper<LmdpCastProduce> queryWrapper, Double zhuZha );
}
