package com.szj.djk.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.LmdpCastHoldingFurnace;

/**
* @author Admin
* @description 针对表【lmdp_cast_holding_furnace(保温工序)】的数据库操作Service
* @createDate 2023-03-25 13:22:39
*/
public interface LmdpCastHoldingFurnaceService extends IService<LmdpCastHoldingFurnace> {
    Page<LmdpCastHoldingFurnace> pageList(Page<LmdpCastHoldingFurnace> pageInfo, LambdaQueryWrapper<LmdpCastHoldingFurnace> queryWrapper, Double baoWen );
}
