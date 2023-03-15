package com.szj.djk.scheduled;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.entity.LmdpColdPlan;
import com.szj.djk.entity.LmdpQcColdInspect;
import com.szj.djk.entity.SlaveErpPlanColdreductionstrip;
import com.szj.djk.service.LmdpQcColdInspectService;
import com.szj.djk.service.PlanAndInspectService;
import com.szj.djk.service.SlaveErpPlanColdreductionstripService;
import com.szj.djk.vo.PlanAndInspect;
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
    private SlaveErpPlanColdreductionstripService slaveErpPlanColdreductionstripService;

    @Resource
    private PlanAndInspectService planAndInspectService;

    /**
     * 质量判定流程
     * @return
     */
    //@Scheduled(cron = "*/1 * * * * ?")
    @DS("master")
    public List<PlanAndInspect> doDetermination(){
        String ts = getRecentTsFromPlanAndInspect();
        List<LmdpQcColdInspect> list = getLmdpQcColdInspectList(ts);
        System.out.println(ts);
        List<PlanAndInspect> list1 = new ArrayList<>();
        list.forEach(lmdpQcColdInspect ->{
            SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip = getSlaveErpPlanColdreductionstripByPlanNum(lmdpQcColdInspect.getPlanNum());
            PlanAndInspect planAndInspect = mergePlanAndInspect(slaveErpPlanColdreductionstrip, lmdpQcColdInspect);
            list1.add(planAndInspect);
        });
        list1.forEach(
                item ->{
                    System.out.println(item.getBatchNum());
                }
        );
        return list1;
    }

    /**
     * 获取最近一次巡检表更新时间 主库 planandinspect
     * @return
     */
    private String getRecentTsFromPlanAndInspect(){
        String ts = planAndInspectService.getRecentTs();
        return ts;
    }

    /**
     * 查询迅巡检记录表中上一次到现在为止更新过的卷号 从库 lmdp_qc_cold_inspect
     * @param ts
     * @return
     */
    private List<LmdpQcColdInspect> getLmdpQcColdInspectList(String ts){
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
    private SlaveErpPlanColdreductionstrip getSlaveErpPlanColdreductionstripByPlanNum(String coldreductionstripNum){
        DynamicDataSourceContextHolder.push("slave");
        LambdaQueryWrapper<SlaveErpPlanColdreductionstrip> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(SlaveErpPlanColdreductionstrip::getColdreductionstripNum, coldreductionstripNum);
        SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip = slaveErpPlanColdreductionstripService.getOne(wrapper);
        DynamicDataSourceContextHolder.poll();
        return slaveErpPlanColdreductionstrip;
    }

    public static PlanAndInspect mergePlanAndInspect(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        PlanAndInspect planAndInspect = new PlanAndInspect();
        planAndInspect.setBatchNum(lmdpQcColdInspect.getBatchNum());
        planAndInspect.setPlanNum(lmdpQcColdInspect.getPlanNum());
        planAndInspect.setInspectCreateTime(lmdpQcColdInspect.getCreateTime());
        planAndInspect.setTs(lmdpQcColdInspect.getTs());
        planAndInspect.setSlaveErpPlanColdreductionstrip(slaveErpPlanColdreductionstrip);
        planAndInspect.setLmdpQcColdInspect(lmdpQcColdInspect);
        return planAndInspect;
    }

    /**
     * 板型判定
     * @return
     */
    public static int doPlateTypeDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){

        return 1;
    }

    /**
     * 力学性能判定
     * @return
     */
    public static int doMechanicalPropertiesDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        return 1;
    }

    /**
     * 尺寸偏差判定
     * @return
     */
    public static int doDimensionalDeviationDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        return 1;
    }

    /**
     * 表面质量判定
     * @return
     */
    public static int doSurfaceQualityDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        return 1;
    }

    /**
     * 外观质量判定
     * @return
     */
    public static int doAppearanceQualityDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        return 1;
    }
}
