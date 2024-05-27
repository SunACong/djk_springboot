package com.szj.djk.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpQcColdInspect;
import com.szj.djk.entity.LmdpQcColdReelReport;
import com.szj.djk.entity.SlaveErpPlanColdreductionstrip;
import com.szj.djk.mapper.LmdpQcColdInspectMapper;
import com.szj.djk.mapper.LmdpQcColdReelReportMapper;
import com.szj.djk.mapper.SlaveErpPlanColdreductionstripMapper;
import com.szj.djk.service.LmdpQcColdReelReportService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @description 冷轧卷质检报告 服务层
* @createDate 2023-03-25 13:22:39
*/

@Slf4j
@DS("slave")
@Service
public class LmdpQcColdReelReportServiceImpl extends ServiceImpl<LmdpQcColdReelReportMapper, LmdpQcColdReelReport>
    implements LmdpQcColdReelReportService{

    private final Logger logger = LoggerFactory.getLogger(LmdpQcColdReelReportServiceImpl.class);

    @Resource
    private LmdpQcColdReelReportMapper lmdpQcColdReelReportMapper;
    @Resource
    private LmdpQcColdInspectMapper lmdpQcColdInspectMapper;
    @Resource
    private SlaveErpPlanColdreductionstripMapper slaveErpPlanColdreductionstripMapper;

    @Override
    @DS("slave")
    public Page<LmdpQcColdReelReport> pageList(Page<LmdpQcColdReelReport> pageInfo, LmdpQcColdReelReport lmdpQcColdReelReport) {

        LambdaQueryWrapper<LmdpQcColdReelReport> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(lmdpQcColdReelReport.getBatchNum() != null, LmdpQcColdReelReport::getBatchNum, lmdpQcColdReelReport.getBatchNum())
                .between(lmdpQcColdReelReport.getStartDateTime()!=null && lmdpQcColdReelReport.getEndDateTime()!=null, LmdpQcColdReelReport::getReportTime, lmdpQcColdReelReport.getStartDateTime(), lmdpQcColdReelReport.getEndDateTime())
                .orderByDesc(LmdpQcColdReelReport::getReportTime);
        Page<LmdpQcColdReelReport> page = lmdpQcColdReelReportMapper.selectPage(pageInfo, queryWrapper);

        List<LmdpQcColdReelReport> qcColdReelReports = page.getRecords();

        for (LmdpQcColdReelReport qcColdReelReport : qcColdReelReports) {

            convertDbFieldToText(qcColdReelReport);

            LambdaQueryWrapper<LmdpQcColdInspect> queryWrapper1 = new LambdaQueryWrapper<>();
            queryWrapper1.eq(LmdpQcColdInspect::getBatchNum, qcColdReelReport.getBatchNum());
            LmdpQcColdInspect lmdpQcColdInspect = lmdpQcColdInspectMapper.selectOne(queryWrapper1);
            if (null == lmdpQcColdInspect) {
                qcColdReelReport.setLmdpQcColdInspect(null);
                qcColdReelReport.setSlaveErpPlanColdreductionstrip(null);
                continue;
            }
            qcColdReelReport.setLmdpQcColdInspect(lmdpQcColdInspect);

            LambdaQueryWrapper<SlaveErpPlanColdreductionstrip> queryWrapper2 = new LambdaQueryWrapper<>();
            queryWrapper2.eq(SlaveErpPlanColdreductionstrip::getColdreductionstripNum, lmdpQcColdInspect.getPlanNum());
            SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip = slaveErpPlanColdreductionstripMapper.selectOne(queryWrapper2);
            qcColdReelReport.setSlaveErpPlanColdreductionstrip(slaveErpPlanColdreductionstrip);
        }
        return page;
    }

    @Override
    @DS("slave")
    public List<Map<String, Integer>> getEveryDayInfo(String startTime, String endTime) {

        return lmdpQcColdReelReportMapper.getEveryDayInfo(startTime, endTime);
    }

    @Override
    @DS("slave")
    public List<Map<String, Integer>> getRangeDayInfo(String startTime, String endTime) {
        return lmdpQcColdReelReportMapper.getRangeDayInfo(startTime, endTime);
    }


    private LmdpQcColdReelReport convertDbFieldToText(LmdpQcColdReelReport lmdpQcColdReelReport) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qualified", "合格");
        map.put("unqualified", "异常");
        map.put(null, "暂未判定");
        lmdpQcColdReelReport.setShapeQc(map.get(lmdpQcColdReelReport.getShapeQc()));
        lmdpQcColdReelReport.setDimensionalDeviation(map.get(lmdpQcColdReelReport.getDimensionalDeviation()));
        lmdpQcColdReelReport.setSurfaceQc(map.get(lmdpQcColdReelReport.getSurfaceQc()));
        lmdpQcColdReelReport.setFacadeQc(map.get(lmdpQcColdReelReport.getFacadeQc()));
        lmdpQcColdReelReport.setMechanicalProperty(map.get(lmdpQcColdReelReport.getMechanicalProperty()));
        return lmdpQcColdReelReport;
    }

    private String assessColdRolledCoilQuality(LmdpQcColdReelReport lmdpQcColdReelReport) {
        return "";
    }
}




