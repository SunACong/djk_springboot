package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.Avaluate;
import com.szj.djk.entity.ProductQuality;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AvaluateMapper extends BaseMapper<Avaluate> {
    public IPage<Avaluate> selectAvaluateAndStandard(Page<Avaluate> page, QueryWrapper<Avaluate> queryWrapper, @Param("avaluate") Avaluate avaluate);
}
