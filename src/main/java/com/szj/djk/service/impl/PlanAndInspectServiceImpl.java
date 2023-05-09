package com.szj.djk.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpQcColdInspect;
import com.szj.djk.entity.SlaveErpPlanColdreductionstrip;
import com.szj.djk.mapper.PlanAndInspectMapper;
import com.szj.djk.service.LmdpQcColdInspectService;
import com.szj.djk.service.PlanAndInspectService;
import com.szj.djk.service.SlaveErpPlanColdreductionstripService;
import com.szj.djk.utils.GetDetermination;
import com.szj.djk.vo.PlanAndInspect;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* @author Admin
* @description 针对表【plan_and_inspect】的数据库操作Service实现
* @createDate 2023-03-14 15:20:29
*/
@Slf4j
@Service
@EnableScheduling
public class PlanAndInspectServiceImpl extends ServiceImpl<PlanAndInspectMapper, PlanAndInspect>
    implements PlanAndInspectService{

    @Resource
    private PlanAndInspectMapper planAndInspectMapper;

    @Resource
    private SlaveErpPlanColdreductionstripService slaveErpPlanColdreductionstripService;

    @Resource
    private LmdpQcColdInspectService lmdpQcColdInspectService;

    @Override
    public String getRecentTs() {
        String ts = "1970-01-01 00:00:00";
        if (planAndInspectMapper.getRecentTs() != null) {
            return planAndInspectMapper.getRecentTs();
        }
        return ts;
    }

    @Override
    @Scheduled(cron = "0/5 * * * * ?")
    @DS("master")
    public String saveBatchOrUpdate() {
        // 获取主数据库plan_and_inspect最近一次的时间戳
        String ts = getRecentTs();
        // 切换数据源
        DynamicDataSourceContextHolder.push("slave");
        // 获取从数据库lmdp_qc_cold_inspect中时间戳大于plan_and_inspect中的时间戳的数据
        LambdaQueryWrapper<LmdpQcColdInspect> wrapper = new LambdaQueryWrapper<>();
        wrapper.gt(LmdpQcColdInspect::getTs, ts);
        List<LmdpQcColdInspect> list = lmdpQcColdInspectService.list(wrapper);
        if (list.size() == 0) {
            return "没有需要更新的数据";
        }
        List<PlanAndInspect> list1 = new ArrayList<>();
        // 合并数据并判断是否需要更新
        list.forEach(lmdpQcColdInspect ->{
            LambdaQueryWrapper<SlaveErpPlanColdreductionstrip> wrapper1 = new LambdaQueryWrapper<>();
            wrapper1.eq(SlaveErpPlanColdreductionstrip::getColdreductionstripNum, lmdpQcColdInspect.getPlanNum());
            SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip = slaveErpPlanColdreductionstripService.getOne(wrapper1);
            if (slaveErpPlanColdreductionstrip == null) {
                return;
            }
            // 判定
            PlanAndInspect planAndInspect = GetDetermination.doAllDetermination(slaveErpPlanColdreductionstrip, lmdpQcColdInspect);
            list1.add(planAndInspect);
        });
        DynamicDataSourceContextHolder.poll();
        Boolean isSucc = planAndInspectMapper.saveBatchOrUpdate(list1);
        if (isSucc) {
            log.info("判定成功");
            return "判定成功";
        }
        log.info("判定失败");
        return "判定失败";
    }

    @Override
    @DS("master")
    public Page<PlanAndInspect> pageList(Page<PlanAndInspect> pageInfo, PlanAndInspect planAndInspect) {
        LambdaQueryWrapper<PlanAndInspect> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(planAndInspect)
                .between(planAndInspect.getStartDateTime()!=null && planAndInspect.getEndDateTime()!=null, PlanAndInspect::getInspectCreateTime, planAndInspect.getStartDateTime(), planAndInspect.getEndDateTime())
                .orderByDesc(PlanAndInspect::getInspectCreateTime);
        Page<PlanAndInspect> page = planAndInspectMapper.selectPage(pageInfo, queryWrapper);
        DynamicDataSourceContextHolder.push("slave");
        page.getRecords().forEach( item -> {
            // 根据planNum从计划表中获取数据
            LambdaQueryWrapper<SlaveErpPlanColdreductionstrip> wrapper1 = new LambdaQueryWrapper<>();
            wrapper1.eq(SlaveErpPlanColdreductionstrip::getColdreductionstripNum, item.getPlanNum());
                SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip = slaveErpPlanColdreductionstripService.getOne(wrapper1);
            // 根据batchNum从巡检表中获取数据
            LambdaQueryWrapper<LmdpQcColdInspect> wrapper2 = new LambdaQueryWrapper<>();
            wrapper2.eq(LmdpQcColdInspect::getBatchNum, item.getBatchNum());
            LmdpQcColdInspect lmdpQcColdInspect = lmdpQcColdInspectService.getOne(wrapper2);
            // 塞进record中
            item.setSlaveErpPlanColdreductionstrip(slaveErpPlanColdreductionstrip);
            item.setLmdpQcColdInspect(lmdpQcColdInspect);
        });
        DynamicDataSourceContextHolder.poll();
        return page;
    }

    @Override
    public List<Map<String, Integer>> getEveryDayInfo(String startTime, String endTime) {
        return planAndInspectMapper.getEveryDayInfo(startTime, endTime);
    }

    @Override
    public List<Map<String, Integer>> getRangeDayInfo(String startTime, String endTime) {
        return planAndInspectMapper.getRangeDayInfo(startTime, endTime);
    }
}




