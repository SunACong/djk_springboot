package com.szj.djk.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.LmdpAvgTime;
import org.apache.ibatis.annotations.Mapper;


/**
 * 生产工序平均时间存储Mapper接口
 *
 * @author jiahua
 * @date 2022-11-22
 */
@Mapper
public interface LmdpAvgTimeMapper extends BaseMapper<LmdpAvgTime>{
    //更新
    int updateLmdpAvgTime(LmdpAvgTime lmdpAvgTime);

}
