package com.szj.djk.mapper;

import com.szj.djk.entity.RewindRoll;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.WarnTable;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author JIAJIA
* @description 针对表【rewind_roll】的数据库操作Mapper
* @createDate 2023-03-21 17:51:57
* @Entity com.szj.djk.entity.RewindRoll
*/
@Mapper
public interface RewindRollMapper extends BaseMapper<RewindRoll> {

    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<RewindRoll> selectSpecial(LocalDateTime before, LocalDateTime after);


}




