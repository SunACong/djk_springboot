package com.szj.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.WarnTable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface WarnTableService extends IService<WarnTable> {
    /**
     * 查询最新20条数据
     */
    public List<WarnTable> selectWarnTableNewData(String rollingDeviceNumber);
    /**
     * 查询历史50条数据
     */
    public List<WarnTable> selectWarnTableHistoryData(String rollingDeviceNumber);
    /**
     * 查询特定时间段内的报警数据
     */
    public List<WarnTable> selectDuringWarnData(WarnTable warnTable, Date beginDate, Date endDate);


}
