package com.szj.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.LmdpCastProduce;

import java.util.List;
import java.util.Map;

/**
* @author Admin
* @description 针对表【lmdp_cast_produce(铸轧工序)】的数据库操作Service
* @createDate 2023-03-28 15:52:41
*/
public interface LmdpCastProduceService extends IService<LmdpCastProduce> {
    List<Map<String, String>> getALlReelNum();
}
