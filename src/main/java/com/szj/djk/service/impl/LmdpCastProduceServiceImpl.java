package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpCastProduce;
import com.szj.djk.service.LmdpCastProduceService;
import com.szj.djk.mapper.LmdpCastProduceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
* @author JH-Sparrow
* @description 针对表【lmdp_cast_produce】的数据库操作Service实现
* @createDate 2022-10-18 16:19:08
*/
@Service
@Transactional
public class LmdpCastProduceServiceImpl extends ServiceImpl<LmdpCastProduceMapper, LmdpCastProduce>    implements LmdpCastProduceService{

    @Autowired
    private LmdpCastProduceMapper lmdpCastProduceMapper;
    /**
     * 查询铸轧生产时间
     * @return
     */
    @Override
    public List<Map<String, Object>> selectZhuzhaTimeList(){ return lmdpCastProduceMapper.selectZhuzhaTimeList();   }

}




