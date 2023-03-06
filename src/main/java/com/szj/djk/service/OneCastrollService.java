package com.szj.djk.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.WarnTable;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
* @author 张高义
* @description 针对表【one_castroll】的数据库操作Service
* @createDate 2023-02-23 14:51:15
*/
public interface OneCastrollService extends IService<OneCastroll> {
    /**
     * 查询最新数据
     */
    public List<OneCastroll> selectRollingNewData();

    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<WarnTable> selectSpecial(LocalDateTime before, LocalDateTime after, String rollingName);

}
