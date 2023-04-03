package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.RollingMachine;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
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
     * 查询对应设备的报警的数据
     */
    public List<RollingMachine> selectWarnData(String rollingName,Integer maxValue);

    /**查询特定警告数据时间前后的数据*/
    public List<RollingMachine> selectSpecial(RollingMachine rollingMachine, Date before, Date after);

    /**
     *  查询一段时间内的报警数据
     */
    public List<RollingMachine> selectDuringData(RollingMachine rollingMachine,Date beginDate,Date endDate);
    /**
     * 查询所有报警数据
     */
    public List<RollingMachine> selectAllWarnData();
    /**
     * 插入数据（去重复）
     * @return
     */
    public int saveData(RollingMachine rollingMachine);
}
