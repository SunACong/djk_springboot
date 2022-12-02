package com.szj.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.RollingMachine;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @ClassName roollingMachine
* @Author 张高义
* @Create 2022/10/20 0020 上午 11:07
*/

@Service
public interface RollingMachineService extends IService<RollingMachine> {
    /**
     * 查询相应指标的十条最新数据
     * @param rollingMachine
     * @return
     */
    public List<RollingMachine> selectRollingMachineTen(RollingMachine rollingMachine);

    /**
     * 查询大于定义最大值的数据
     * @param rollingName
     * @param maxValue
     * @return
     */
   public List<RollingMachine> selectWarnData(String rollingName,Integer maxValue);

}
