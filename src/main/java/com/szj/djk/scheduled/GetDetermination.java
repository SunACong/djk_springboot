package com.szj.djk.scheduled;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.entity.LmdpColdPlan;
import com.szj.djk.entity.LmdpQcColdInspect;
import com.szj.djk.service.LmdpColdPlanService;
import com.szj.djk.service.LmdpQcColdInspectService;
import com.szj.djk.service.PlanAndInspectService;
import com.szj.djk.vo.PlanAndInspect;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 孙少聪
 * @Date 2023/3/14 11:28:19
 * @Description 质量判定流程
 */
@Component
public class GetDetermination {

    @Resource
    private LmdpQcColdInspectService lmdpQcColdInspectService;

    @Resource
    private LmdpColdPlanService lmdpColdPlanService;

    @Resource
    private PlanAndInspectService planAndInspectService;

    /**
     * 质量判定流程
     * @return
     */
    @Scheduled(cron = "*/1 * * * * ?")
    @DS("master")
    public Boolean doDetermination(){
        String ts = getRecentTsFromPlanAndInspect();
        List<LmdpQcColdInspect> list = getLmdpQcColdInspectList(ts);
        List<PlanAndInspect> list1 = new ArrayList<>();
        list.forEach(lmdpQcColdInspect ->{
            LmdpColdPlan lmdpColdPlan = getLmdpColdPlanByBatchNum(lmdpQcColdInspect.getPlanNum());
            PlanAndInspect planAndInspect = mergePlanAndInspect(lmdpColdPlan, lmdpQcColdInspect);
            list1.add(planAndInspect);
        });
        System.out.println(list1.size());
        return false;
    }

    /**
     * 获取最近一次巡检表更新时间 主库 planandinspect
     * @return
     */
    public String getRecentTsFromPlanAndInspect(){
        String ts = planAndInspectService.getRecentTs();
        DynamicDataSourceContextHolder.poll();
        return ts;
    }

    /**
     * 查询迅巡检记录表中上一次到现在为止更新过的卷号 从库 lmdp_qc_cold_inspect
     * @param ts
     * @return
     */
    public List<LmdpQcColdInspect> getLmdpQcColdInspectList(String ts){
        DynamicDataSourceContextHolder.push("slave");
        LambdaQueryWrapper<LmdpQcColdInspect> wrapper = new LambdaQueryWrapper<>();
        wrapper.gt(LmdpQcColdInspect::getTs, ts);
        List<LmdpQcColdInspect> list = lmdpQcColdInspectService.list(wrapper);
        DynamicDataSourceContextHolder.poll();
        return list;
    }

    /**
     * 通过冷轧计划查询冷轧计划表  从库 lmdb_cold_plan
     * @param coldreductionstripNum
     * @return
     */
    public LmdpColdPlan getLmdpColdPlanByBatchNum(String coldreductionstripNum){
        DynamicDataSourceContextHolder.push("slave");
        LambdaQueryWrapper<LmdpColdPlan> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(LmdpColdPlan::getColdreductionstripNum, coldreductionstripNum);
        LmdpColdPlan lmdpColdPlan = lmdpColdPlanService.getOne(wrapper);
        DynamicDataSourceContextHolder.poll();
        return lmdpColdPlan;
    }

    public static PlanAndInspect mergePlanAndInspect(LmdpColdPlan lmdpColdPlan, LmdpQcColdInspect lmdpQcColdInspect){
        PlanAndInspect planAndInspect = new PlanAndInspect();
        planAndInspect.setBatchNum(lmdpQcColdInspect.getBatchNum());
        planAndInspect.setPlanNum(lmdpQcColdInspect.getPlanNum());
        planAndInspect.setCreateTime(lmdpQcColdInspect.getCreateTime());
        planAndInspect.setTs(lmdpQcColdInspect.getTs());
        planAndInspect.setLmdpColdPlan(lmdpColdPlan);
        planAndInspect.setLmdpQcColdInspect(lmdpQcColdInspect);
        return planAndInspect;
    }
}
