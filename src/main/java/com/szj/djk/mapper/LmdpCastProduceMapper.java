package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.LmdpCastProduce;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author Admin
* @description 针对表【lmdp_cast_produce(铸轧工序)】的数据库操作Mapper
* @createDate 2023-03-28 15:52:41
* @Entity com.szj.djk.entity.LmdpCastProduce
*/
@Mapper
public interface LmdpCastProduceMapper extends BaseMapper<LmdpCastProduce> {

    List<Map<String, String>> getALlReelNum();
}




