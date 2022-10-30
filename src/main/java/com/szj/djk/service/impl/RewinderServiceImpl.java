package com.szj.djk.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.Rewinder;
import com.szj.djk.mapper.RewinderMapper;;
import com.szj.djk.service.RewinderService;
import lombok.experimental.Accessors;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RewinderServiceImpl
 * @Author 张高义
 * @Create 2022/9/25 0025 下午 20:31
 */
@Service
public class RewinderServiceImpl extends ServiceImpl<RewinderMapper, Rewinder> implements RewinderService {
    @Autowired
    private RewinderMapper rewinderMapper;

    // 查询前十条数据
    @Override
    public List<Rewinder> selectRewinderTen(Rewinder rewinder) {
        return rewinderMapper.selectRewinderTen(rewinder);
    }
}
