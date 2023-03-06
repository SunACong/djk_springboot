package com.szj.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.TwoCastroll;
import com.szj.djk.entity.WarnTable;
import java.time.LocalDateTime;
import java.util.List;

/**
* @author Administrator
* @description 针对表【two_castroll】的数据库操作Service
* @createDate 2023-03-04 16:47:15
*/
public interface TwoCastrollService extends IService<TwoCastroll> {
    /**
     * 查询最新数据
     */
    public List<TwoCastroll> selectRollingNewData();

    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<WarnTable> selectSpecial(LocalDateTime before, LocalDateTime after, String rollingName);

}
