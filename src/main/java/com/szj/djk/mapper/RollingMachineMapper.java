package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.RollingMachine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @ClassName roollingMachine
* @Author 张高义
* @Create 2022/10/20 0020 上午 11:07
*/

@Mapper
public interface RollingMachineMapper extends BaseMapper<RollingMachine> {
    /**
     * 查询前十条数据
     */
    public List<RollingMachine> selectrollingMachineTen(RollingMachine rollingMachine);

    /**
     * 查询报警的数据
     */
    public List<RollingMachine> selectWarnData(String rollingName,Integer maxValue);
}
