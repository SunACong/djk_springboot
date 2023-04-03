package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.Lqci;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
* @author Admin
* @description 针对表【lqci】的数据库操作Mapper
* @createDate 2022-10-10 16:48:20
* @Entity com.szj.djk.entity.Lqci
*/
@Mapper
public interface LqciMapper extends BaseMapper<Lqci> {

    public List<Lqci> selectLqciAndLqcmr(Date startTIme);
}




