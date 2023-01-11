package com.szj.djk.ssc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.ssc.entity.Lqci;
import com.szj.djk.ssc.mapper.LqciMapper;
import com.szj.djk.ssc.service.LqciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class LqciServiceImpl extends ServiceImpl<LqciMapper, Lqci> implements LqciService {

    @Autowired
    private LqciMapper lqciMapper;

    @Override
    public List<Lqci> selectLqciAndLqcmr(Date startTIme) {
        List<Lqci> list = lqciMapper.selectLqciAndLqcmr(startTIme);
        return list;
    }

}




