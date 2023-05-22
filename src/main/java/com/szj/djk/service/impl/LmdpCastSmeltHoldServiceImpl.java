package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpCastSmeltHold;
import com.szj.djk.mapper.LmdpCastSmeltHoldMapper;
import com.szj.djk.service.LmdpCastSmeltHoldService;
import com.szj.djk.utils.TimeStr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Admin
* @description 针对表【lmdp_cast_smelt_hold(熔炼工序)】的数据库操作Service实现
* @createDate 2023-03-25 13:22:39
*/
@Service
public class LmdpCastSmeltHoldServiceImpl extends ServiceImpl<LmdpCastSmeltHoldMapper, LmdpCastSmeltHold>
    implements LmdpCastSmeltHoldService{

    @Resource
    LmdpCastSmeltHoldMapper lmdpCastSmeltHoldMapper;

    @Override
    public Page<LmdpCastSmeltHold> pageList(Page<LmdpCastSmeltHold> pageInfo, LambdaQueryWrapper<LmdpCastSmeltHold> queryWrapper, Double rongLian) {
        Page<LmdpCastSmeltHold> page = lmdpCastSmeltHoldMapper.selectPage(pageInfo, queryWrapper);
        page.getRecords().forEach(lmdpCastSmeltHold->{
            lmdpCastSmeltHold.setNumberID(lmdpCastSmeltHold.getSmeltTimes());
            lmdpCastSmeltHold.setBeginTime(lmdpCastSmeltHold.getFeedTime());
            Double gapTime = TimeStr.getGapTime(lmdpCastSmeltHold.getFeedTime());
            lmdpCastSmeltHold.setRunningTime(gapTime);
            lmdpCastSmeltHold.setExceedTime(gapTime-rongLian);
        });
        return page;
    }
}




