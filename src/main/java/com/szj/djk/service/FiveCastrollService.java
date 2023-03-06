package com.szj.djk.service;

import com.szj.djk.entity.FiveCastroll;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.FourCastroll;
import com.szj.djk.entity.WarnTable;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author Administrator
* @description 针对表【five_castroll】的数据库操作Service
* @createDate 2023-03-04 16:59:58
*/
public interface FiveCastrollService extends IService<FiveCastroll> {
    /**
     * 查询最新数据
     */
    public List<FiveCastroll> selectRollingNewData();

    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<WarnTable> selectSpecial(LocalDateTime before, LocalDateTime after, String rollingName);

}
