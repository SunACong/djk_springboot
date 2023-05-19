package com.szj.djk.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface ProcessComputeMapper {
    List<Map<String, BigDecimal>> getComputeTime();
}
