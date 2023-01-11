package com.szj.djk.ssc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.ssc.entity.Lqci;

import java.util.Date;
import java.util.List;

/**
* @author Admin
* @description 针对表【lqci】的数据库操作Service
* @createDate 2022-10-10 16:48:20
*/
public interface LqciService extends IService<Lqci> {
    public List<Lqci> selectLqciAndLqcmr(Date startTIme);
}
