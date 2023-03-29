package com.szj.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.LmdpColdProduce;

import java.util.List;
import java.util.Map;

/**
* @author JH-Sparrow
* @description 针对表【lmdp_cold_produce】的数据库操作Service
* @createDate 2022-10-18 16:19:09
*/
public interface LmdpColdProduceService extends IService<LmdpColdProduce> {
    List<Map<String, String>> getALlBatchNum();
}
