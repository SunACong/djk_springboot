package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpColdProduce;
import com.szj.djk.mapper.LmdpColdProduceMapper;
import com.szj.djk.service.LmdpColdProduceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* @author JH-Sparrow
* @description 针对表【lmdp_cold_produce】的数据库操作Service实现
* @createDate 2022-10-18 16:19:09
*/
@Service
@Transactional
public class LmdpColdProduceServiceImpl extends ServiceImpl<LmdpColdProduceMapper, LmdpColdProduce>
    implements LmdpColdProduceService{

    @Resource
    private LmdpColdProduceMapper lmdpColdProduceMapper;

    @Override
    public List<Map<String, String>> getALlBatchNum() {
        List<Map<String, String>> allReelNum = lmdpColdProduceMapper.getALlBatchNum();
        return allReelNum;
    }
}




