package com.szj.djk.scheduled;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.szj.djk.entity.LmdpQcPack;
import com.szj.djk.service.LmdpQcPackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @ClassName GetProcessMonitor
 * @Authoc 孙少聪
 * @Date 2022/11/11 11:03:13
 */

@Slf4j
//@Component
public class GetProcessMonitor {
    @Autowired
    private LmdpQcPackService lmdpQcPackService;
    /**
     * 这里是每2小时执行一次，更新token缓存
     * 可以根据token有效时长进行更新
     * @return
     */
    @Scheduled(cron = "0/10 * * * * ? ")
    public void start() {
        init();
    }

    public void init() {
        LambdaQueryWrapper<LmdpQcPack> lmdpQcPackQueryWrapper = new LambdaQueryWrapper<>();
        lmdpQcPackQueryWrapper.ge(LmdpQcPack::getPackageTime, "2022-02-04");
        List<LmdpQcPack> lmdpQcPackList = lmdpQcPackService.list(lmdpQcPackQueryWrapper);
    }
}
