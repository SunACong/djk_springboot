package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.RollingMachine;
import com.szj.djk.mapper.RollingMachineMapper;
import com.szj.djk.service.RollingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName rollingMachineServiceImpl
 * @Author 张高义
 * @Create 2022/10/20 0020 上午 11:21
 */
@Service
public class RollingMachineServiceImpl extends ServiceImpl<RollingMachineMapper, RollingMachine> implements RollingMachineService {
   @Autowired
   private RollingMachineMapper rollingMachineMapper;

    /**
     * 查询前十条数据
     * @param rollingMachine
     * @return
     */
    @Override
    public List<RollingMachine> selectRollingMachineTen(RollingMachine rollingMachine) {
        return rollingMachineMapper.selectrollingMachineTen(rollingMachine);
    }

    /**
     * 查询大于定义最大值的数据
     * @param rollingName
     * @param maxValue
     * @return
     */
    @Override
    public List<RollingMachine> selectWarnData(String rollingName,Integer maxValue) {
        return rollingMachineMapper.selectWarnData(rollingName,maxValue);
    }
}
