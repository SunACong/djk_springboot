package com.szj.djk.service;

import com.szj.djk.entity.RewindRoll;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.WarnTable;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author JIAJIA
* @description 针对表【rewind_roll】的数据库操作Service
* @createDate 2023-03-21 17:51:57
*/
public interface RewindRollService extends IService<RewindRoll> {

    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<WarnTable> selectSpecial(LocalDateTime before, LocalDateTime after, String rollingName);


}
