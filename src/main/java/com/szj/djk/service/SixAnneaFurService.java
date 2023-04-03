package com.szj.djk.service;

import com.szj.djk.entity.SixAnneaFur;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.WarnTable;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author JIAJIA
* @description 针对表【six_annea_fur】的数据库操作Service
* @createDate 2023-03-23 17:16:01
*/
public interface SixAnneaFurService extends IService<SixAnneaFur> {

    /**
     * 查询特定警告数据时间前后的数据
     */
    public List<WarnTable> selectSpecial(LocalDateTime before, LocalDateTime after, String rollingName);

}
