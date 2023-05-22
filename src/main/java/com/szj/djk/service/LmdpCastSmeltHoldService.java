package com.szj.djk.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.LmdpCastSmeltHold;

/**
* @author Admin
* @description 针对表【lmdp_cast_smelt_hold(熔炼工序)】的数据库操作Service
* @createDate 2023-03-25 13:22:39
*/
public interface LmdpCastSmeltHoldService extends IService<LmdpCastSmeltHold> {
    Page<LmdpCastSmeltHold> pageList(Page<LmdpCastSmeltHold> pageInfo, LambdaQueryWrapper<LmdpCastSmeltHold> queryWrapper, Double rongLian );
}
