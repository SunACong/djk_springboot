package com.szj.djk.service;

import com.szj.djk.entity.LmdpCastProduce;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author JH-Sparrow
* @description 针对表【lmdp_cast_produce】的数据库操作Service
* @createDate 2022-10-18 16:19:08
*/
public interface LmdpCastProduceService extends IService<LmdpCastProduce> {
    /**
     * 查询铸轧生产时间
     * @return
     */
    public  List<Map<String, Object>> selectZhuzhaTimeList();

}
