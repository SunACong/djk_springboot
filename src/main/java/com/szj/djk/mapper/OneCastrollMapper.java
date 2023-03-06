package com.szj.djk.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.RollingMachine;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
* @author 张高义
* @description 针对表【one_castroll】的数据库操作Mapper
* @createDate 2023-02-23 14:51:15
* @Entity generator.domain.OneCastroll
*/
@Mapper
public interface OneCastrollMapper extends BaseMapper<OneCastroll> {
    /**
     * 查询最新20条数据
     */
    public List<OneCastroll> selectRollingNewData();
    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<OneCastroll> selectSpecial(LocalDateTime before, LocalDateTime after);

}
