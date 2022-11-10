package com.szj.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.Rewinder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface RewinderService extends IService<Rewinder> {
    /**查询前十条数据*/
    public List<Rewinder> selectRewinderTen(Rewinder rewinder);

    /**查询特定警告数据时间前后的数据*/
    public List<Rewinder> selectSpecial(Rewinder rewinder, Date before, Date after);
}
