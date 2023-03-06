package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.WarnTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface WarnTableMapper extends BaseMapper<WarnTable> {
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
    public List<WarnTable> selectDuringWarnData(WarnTable warnTable,Date beginDate, Date endDate);

}
