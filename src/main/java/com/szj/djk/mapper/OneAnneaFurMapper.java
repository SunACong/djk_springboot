package com.szj.djk.mapper;

import com.szj.djk.entity.OneAnneaFur;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.RewindRoll;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author JIAJIA
* @description 针对表【one_annea_fur】的数据库操作Mapper
* @createDate 2023-03-23 17:16:01
* @Entity com.szj.djk.entity.OneAnneaFur
*/
@Mapper
public interface OneAnneaFurMapper extends BaseMapper<OneAnneaFur> {
    /**
     * 查询退火炉一数据时间前后的数据
     */
    public List<OneAnneaFur> selectSpecial(LocalDateTime before, LocalDateTime after);

}




