package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpCastProduce;
import com.szj.djk.mapper.LmdpCastProduceMapper;
import com.szj.djk.service.LmdpCastProduceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* @author Admin
* @description 针对表【lmdp_cast_produce(铸轧工序)】的数据库操作Service实现
* @createDate 2023-03-28 15:52:41
*/
@Service
public class LmdpCastProduceServiceImpl extends ServiceImpl<LmdpCastProduceMapper, LmdpCastProduce>
    implements LmdpCastProduceService{
    @Resource
    private LmdpCastProduceMapper lmdpCastProduceMapper;

    @Override
    public List<Map<String, String>> getALlReelNum() {
        List<Map<String, String>> aLlReelNum = lmdpCastProduceMapper.getALlReelNum();
        return aLlReelNum;
    }
}




