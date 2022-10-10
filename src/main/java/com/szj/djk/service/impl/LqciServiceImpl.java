package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.Lqci;
import com.szj.djk.service.LqciService;
import com.szj.djk.mapper.LqciMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
* @author Admin
* @description 针对表【lqci】的数据库操作Service实现
* @createDate 2022-10-10 16:48:20
*/
@Service
public class LqciServiceImpl extends ServiceImpl<LqciMapper, Lqci> implements LqciService{

    @Autowired
    private LqciMapper lqciMapper;

    @Override
    public List<Lqci> selectLqciAndLqcmr(Date startTIme) {
        List<Lqci> list = lqciMapper.selectLqciAndLqcmr(startTIme);
        return list;
    }

    //
    //@Override
    //public List<Lqci> selectLqciAndLqcmr() {
    //    List<Lqci> list =  lqciMapper.selectLqciAndLqcmr(Date startTIme, Date endTime);
    //    return list;
    //}
}




