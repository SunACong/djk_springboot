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
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* @author Admin
* @description 针对表【lmdp_qc_cold_reel_report(冷轧卷质检报告)】的数据库操作Service实现
* @createDate 2023-03-25 13:22:39
*/
@Service
public class LmdpQcColdReelReportServiceImpl extends ServiceImpl<LmdpQcColdReelReportMapper, LmdpQcColdReelReport>
    implements LmdpQcColdReelReportService{

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
        queryWrapper.setEntity(lmdpQcColdReelReport)
                .between(lmdpQcColdReelReport.getStartDateTime()!=null && lmdpQcColdReelReport.getEndDateTime()!=null, LmdpQcColdReelReport::getReportTime, lmdpQcColdReelReport.getStartDateTime(), lmdpQcColdReelReport.getEndDateTime())
                .orderByDesc(LmdpQcColdReelReport::getReportTime);
        Page<LmdpQcColdReelReport> page = lmdpQcColdReelReportMapper.selectPage(pageInfo, queryWrapper);
        page.getRecords().forEach(item->{

            LambdaQueryWrapper<LmdpQcColdInspect> queryWrapper1 = new LambdaQueryWrapper<>();
            queryWrapper1.eq(LmdpQcColdInspect::getBatchNum, item.getBatchNum());
            LmdpQcColdInspect lmdpQcColdInspect = lmdpQcColdInspectMapper.selectOne(queryWrapper1);
            if (lmdpQcColdInspect == null){
                LmdpQcColdInspect lmdpQcColdInspect1 = new LmdpQcColdInspect();
                item.setLmdpQcColdInspect(lmdpQcColdInspect1);
                SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip1 = new SlaveErpPlanColdreductionstrip();
                item.setSlaveErpPlanColdreductionstrip(slaveErpPlanColdreductionstrip1);
                return;
            }else{
                item.setLmdpQcColdInspect(lmdpQcColdInspect);
            }


            LambdaQueryWrapper<SlaveErpPlanColdreductionstrip> queryWrapper2 = new LambdaQueryWrapper<>();
            queryWrapper2.eq(SlaveErpPlanColdreductionstrip::getColdreductionstripNum, lmdpQcColdInspect.getPlanNum());
            SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip = slaveErpPlanColdreductionstripMapper.selectOne(queryWrapper2);
            if (slaveErpPlanColdreductionstrip == null) {
                SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip1 = new SlaveErpPlanColdreductionstrip();
                item.setSlaveErpPlanColdreductionstrip(slaveErpPlanColdreductionstrip1);
            }else {
                item.setSlaveErpPlanColdreductionstrip(slaveErpPlanColdreductionstrip);
            }
        });
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
}




