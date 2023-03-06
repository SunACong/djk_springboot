package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.TwoCastroll;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;


/**
* @author Administrator
* @description 针对表【two_castroll】的数据库操作Mapper
* @createDate 2023-03-04 16:47:15
* @Entity com.szj.djk.entiy.TwoCastroll
*/
@Mapper
public interface TwoCastrollMapper extends BaseMapper<TwoCastroll> {
    /**
     * 查询最新20条数据
     */
    public List<TwoCastroll> selectRollingNewData();
    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<TwoCastroll> selectSpecial(LocalDateTime before, LocalDateTime after);

}
