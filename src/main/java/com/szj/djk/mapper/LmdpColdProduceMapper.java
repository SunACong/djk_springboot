package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.LmdpColdProduce;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author JH-Sparrow
* @description 针对表【lmdp_cold_produce】的数据库操作Mapper
* @createDate 2022-10-18 16:19:09
* @Entity com.szj.djk.entity.LmdpColdProduce
*/
@Mapper
public interface LmdpColdProduceMapper extends BaseMapper<LmdpColdProduce> {
    List<Map<String, String>> getALlBatchNum();
}




