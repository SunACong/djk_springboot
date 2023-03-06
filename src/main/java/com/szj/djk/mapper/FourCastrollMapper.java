package com.szj.djk.mapper;

import com.szj.djk.entity.FourCastroll;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.OneCastroll;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author Administrator
* @description 针对表【four_castroll】的数据库操作Mapper
* @createDate 2023-03-04 16:56:28
* @Entity com.szj.djk.entity.FourCastroll
*/
@Mapper
public interface FourCastrollMapper extends BaseMapper<FourCastroll> {
    /**
     * 查询最新20条数据
     */
    public List<FourCastroll> selectRollingNewData();
    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<FourCastroll> selectSpecial(LocalDateTime before, LocalDateTime after);
}




