package com.szj.djk.mapper;

import com.szj.djk.entity.FourAnneaFur;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.OneAnneaFur;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author JIAJIA
* @description 针对表【four_annea_fur】的数据库操作Mapper
* @createDate 2023-03-23 17:16:01
* @Entity com.szj.djk.entity.FourAnneaFur
*/
@Mapper
public interface FourAnneaFurMapper extends BaseMapper<FourAnneaFur> {
    /**
     * 查询退火炉一数据时间前后的数据
     */
    public List<FourAnneaFur> selectSpecial(LocalDateTime before, LocalDateTime after);

}




