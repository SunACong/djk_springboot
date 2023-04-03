package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.Rewinder;
import com.szj.djk.entity.RollingMachine;
import com.szj.djk.mapper.RollingMachineMapper;
import com.szj.djk.service.RollingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    /**
     * 查询特定警告数据时间前后的数据
     * @param rollingMachine
     * @param before
     * @param after
     * @return
     */
    @Override
    public List<RollingMachine> selectSpecial(RollingMachine rollingMachine, Date before, Date after) {
        return rollingMachineMapper.selectSpecial(rollingMachine,before,after);
    }

    /**
     * 查询一段时间内的报警数据
     * @param rollingMachine
     * @param beginDate
     * @param endDate
     * @return
     */
    @Override
    public List<RollingMachine> selectDuringData(RollingMachine rollingMachine, Date beginDate, Date endDate) {
        return rollingMachineMapper.selectDuringData(rollingMachine,beginDate,endDate);
    }

    @Override
    public int saveData(RollingMachine rollingMachine) {
        return rollingMachineMapper.saveData(rollingMachine);
    }
}
