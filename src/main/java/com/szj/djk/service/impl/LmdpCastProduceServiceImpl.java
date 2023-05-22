package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpCastProduce;
import com.szj.djk.mapper.LmdpCastProduceMapper;
import com.szj.djk.service.LmdpCastProduceService;
import com.szj.djk.utils.TimeStr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Admin
* @description 针对表【lmdp_cast_produce(铸轧工序)】的数据库操作Service实现
* @createDate 2023-04-02 10:04:39
*/
@Service
public class LmdpCastProduceServiceImpl extends ServiceImpl<LmdpCastProduceMapper, LmdpCastProduce>
    implements LmdpCastProduceService{

    @Resource
    private LmdpCastProduceMapper lmdpCastProduceMapper;

    @Override
    public Page<LmdpCastProduce> pageList(Page<LmdpCastProduce> pageInfo, LambdaQueryWrapper<LmdpCastProduce> queryWrapper, Double zhuZha) {
        Page<LmdpCastProduce> page = lmdpCastProduceMapper.selectPage(pageInfo, queryWrapper);
        page.getRecords().forEach(lmdpCastProduce->{
            lmdpCastProduce.setNumberID(lmdpCastProduce.getReelNum());
            lmdpCastProduce.setBeginTime(lmdpCastProduce.getProcUpperTime());
            Double gapTime = TimeStr.getGapTime(lmdpCastProduce.getProcUpperTime());
            lmdpCastProduce.setRunningTime(gapTime);
            lmdpCastProduce.setExceedTime(gapTime-zhuZha);
        });
        return page;
    }
}




