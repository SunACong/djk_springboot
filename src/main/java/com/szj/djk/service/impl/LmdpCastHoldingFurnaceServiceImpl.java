package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpCastHoldingFurnace;
import com.szj.djk.mapper.LmdpCastHoldingFurnaceMapper;
import com.szj.djk.service.LmdpCastHoldingFurnaceService;
import com.szj.djk.utils.TimeStr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Admin
* @description 针对表【lmdp_cast_holding_furnace(保温工序)】的数据库操作Service实现
* @createDate 2023-03-25 13:22:39
*/
@Service
public class LmdpCastHoldingFurnaceServiceImpl extends ServiceImpl<LmdpCastHoldingFurnaceMapper, LmdpCastHoldingFurnace>
    implements LmdpCastHoldingFurnaceService{

    @Resource
    private LmdpCastHoldingFurnaceMapper lmdpCastHoldingFurnaceMapper;

    @Override
    public Page<LmdpCastHoldingFurnace> pageList(Page<LmdpCastHoldingFurnace> pageInfo, LambdaQueryWrapper<LmdpCastHoldingFurnace> queryWrapper, Double baoWen) {
        Page<LmdpCastHoldingFurnace> page = lmdpCastHoldingFurnaceMapper.selectPage(pageInfo, queryWrapper);
        page.getRecords().forEach(lmdpCastHoldingFurnace -> {
            lmdpCastHoldingFurnace.setBeginTime(lmdpCastHoldingFurnace.getTurndownAfterEndTime());
            Double gapTime = TimeStr.getGapTime(lmdpCastHoldingFurnace.getTurndownAfterEndTime());
            lmdpCastHoldingFurnace.setRunningTime(gapTime);
            lmdpCastHoldingFurnace.setExceedTime(Math.abs(gapTime - baoWen));
        });
        return page;
    }
}




