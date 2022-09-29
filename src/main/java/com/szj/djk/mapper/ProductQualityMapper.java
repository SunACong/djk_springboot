package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.ProductQuality;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName ProductQualityMapper
 * @Authoc 孙少聪
 * @Date 2022/9/25 10:17:40
 */

@Mapper
public interface ProductQualityMapper extends BaseMapper<ProductQuality> {

    public int batchInsertOrUpdate(List<ProductQuality> list);

    public String selectMaxDate();
}
