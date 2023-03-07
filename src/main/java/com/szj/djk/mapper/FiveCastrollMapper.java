package com.szj.djk.mapper;

import com.szj.djk.entity.FiveCastroll;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.OneCastroll;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author Administrator
* @description 针对表【five_castroll】的数据库操作Mapper
* @createDate 2023-03-04 16:59:58
* @Entity com.szj.djk.entity.FiveCastroll
*/
@Mapper
public interface FiveCastrollMapper extends BaseMapper<FiveCastroll> {
    /**
     * 查询最新20条数据
     */
    public List<FiveCastroll> selectRollingNewData();
    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<FiveCastroll> selectSpecial(LocalDateTime before, LocalDateTime after);
}




