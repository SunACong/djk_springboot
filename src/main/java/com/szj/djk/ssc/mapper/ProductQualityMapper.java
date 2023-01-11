package com.szj.djk.ssc.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.ssc.entity.ProductQuality;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @ClassName ProductQualityMapper
 * @Authoc 孙少聪
 * @Date 2022/9/25 10:17:40
 */

@Mapper
public interface ProductQualityMapper extends BaseMapper<ProductQuality> {

    public int batchInsertOrUpdate(List<ProductQuality> list);

    public Date selectMaxDate();

    public IPage<ProductQuality> selectProductQualityAndStandard(Page<ProductQuality> page, QueryWrapper<ProductQuality> queryWrapper,@Param("productQuality") ProductQuality productQuality);

    public List<ProductQuality> selectLqciAndLqcmrToProductQuality(Date startTime);
}
