package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.Rewinder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName RewinderMapper
 * @Author 张高义
 * @Create 2022/9/25 0025 下午 20:34
 */
@Mapper
public interface RewinderMapper extends BaseMapper<Rewinder> {
    /**查询前十条数据*/
    public List<Rewinder> selectRewinderTen(Rewinder rewinder);
}
