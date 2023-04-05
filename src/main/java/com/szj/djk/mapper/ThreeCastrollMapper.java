package com.szj.djk.mapper;

import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.ThreeCastroll;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author Administrator
* @description 针对表【three_castroll】的数据库操作Mapper
* @createDate 2023-03-04 16:55:12
* @Entity com.szj.djk.entity.ThreeCastroll
*/
@Mapper
public interface ThreeCastrollMapper extends BaseMapper<ThreeCastroll> {
    /**
     * 查询最新20条数据
     */
    public List<ThreeCastroll> selectRollingNewData();
    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<ThreeCastroll> selectSpecial(LocalDateTime before, LocalDateTime after);

}




