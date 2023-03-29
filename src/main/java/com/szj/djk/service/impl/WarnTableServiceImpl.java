package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.RollingMachine;
import com.szj.djk.entity.WarnTable;
import com.szj.djk.mapper.RollingMachineMapper;
import com.szj.djk.mapper.WarnTableMapper;
import com.szj.djk.service.RollingMachineService;
import com.szj.djk.service.WarnTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName WarnTableServiceImpl
 * @Author 张高义
 * @Create 2023/2/22 0022 下午 17:19
 */
@Service
public class WarnTableServiceImpl extends ServiceImpl<WarnTableMapper, WarnTable> implements WarnTableService {
    @Autowired
    private WarnTableMapper warnTableMapper;
    @Override
    public List<WarnTable> selectWarnTableNewData(String rollingDeviceNumber) {
        return warnTableMapper.selectWarnTableNewData(rollingDeviceNumber);
    }

    @Override
    public List<WarnTable> selectWarnTableHistoryData(String rollingDeviceNumber) {
        return warnTableMapper.selectWarnTableHistoryData(rollingDeviceNumber);
    }

    @Override
    public List<WarnTable> selectDuringWarnData(WarnTable warnTable, Date beginDate, Date endDate) {
        return warnTableMapper.selectDuringWarnData(warnTable,beginDate,endDate);
    }

    /**
     * 修改报警记录增删改查
     *
     * @param warnTable 报警记录增删改查
     * @return 结果
     */
    @Override
    public int updateWarnTableCopy1(WarnTable warnTable)
    {
        return warnTableMapper.updateWarnTableCopy1(warnTable);
    }

}
