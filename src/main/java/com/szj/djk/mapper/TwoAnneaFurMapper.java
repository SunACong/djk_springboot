package com.szj.djk.mapper;

import com.szj.djk.entity.OneAnneaFur;
import com.szj.djk.entity.TwoAnneaFur;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author JIAJIA
* @description 针对表【two_annea_fur】的数据库操作Mapper
* @createDate 2023-03-23 17:16:01
* @Entity com.szj.djk.entity.TwoAnneaFur
*/
@Mapper
public interface TwoAnneaFurMapper extends BaseMapper<TwoAnneaFur> {
    /**
     * 查询退火炉一数据时间前后的数据
     */
    public List<TwoAnneaFur> selectSpecial(LocalDateTime before, LocalDateTime after);

}




