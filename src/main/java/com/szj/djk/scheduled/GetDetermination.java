package com.szj.djk.scheduled;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.entity.LmdpQcColdInspect;
import com.szj.djk.entity.SlaveErpPlanColdreductionstrip;
import com.szj.djk.service.LmdpQcColdInspectService;
import com.szj.djk.service.PlanAndInspectService;
import com.szj.djk.service.SlaveErpPlanColdreductionstripService;
import com.szj.djk.vo.PlanAndInspect;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    private static PlanAndInspect mergePlanAndInspect(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
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
    private static int doPlateTypeDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        // 巡检表中凸度
        BigDecimal singleMediumConvexity = lmdpQcColdInspect.getSingleMediumConvexity();
        // 巡检表平直度
        BigDecimal singleStraightness = lmdpQcColdInspect.getSingleStraightness();
        // 计划表平直度 暂时废弃
        String flatness = slaveErpPlanColdreductionstrip.getFlatness();

        return 2;
    }

    /**
     * 力学性能判定
     * @return
     */
    private static int doMechanicalPropertiesDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        // 判断singleExtensionRe是否为空
        if (lmdpQcColdInspect.getSingleExtensionRe() == null || lmdpQcColdInspect.getSingleStrengthRe() == null || lmdpQcColdInspect.getBendingPerformanceRe() == null){
            return 2;
        }
        // 巡检表延伸率 抗拉强度 弯折性能
        double singleExtensionRe = lmdpQcColdInspect.getSingleExtensionRe().doubleValue();
        double singleStrengthRe = lmdpQcColdInspect.getSingleStrengthRe().doubleValue();
        String bendingPerformanceRe = lmdpQcColdInspect.getBendingPerformanceRe();
        // 计划表延伸率 抗拉强度 弯折性能
        String elongation = slaveErpPlanColdreductionstrip.getElongation();
        double[] elongations = strToDouble(elongation);
        String tensileStrength = slaveErpPlanColdreductionstrip.getTensileStrength();
        double[] tensileStrengths = strToDouble(tensileStrength);
        String bendingPerformance = slaveErpPlanColdreductionstrip.getBendingPerformance();

        if (singleExtensionRe < elongations[0]){
            return 0;
        }
        if (singleStrengthRe < tensileStrengths[0] || singleStrengthRe > tensileStrengths[1]){
            return 0;
        }
        String str = "90°折弯有裂痕";
        if (str.equals(bendingPerformanceRe)){
            return 0;
        }
        return 1;
    }

    /**
     * 尺寸偏差判定
     * @return
     */
    private static int doDimensionalDeviationDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        if (lmdpQcColdInspect.getFinishedThickness() == null || lmdpQcColdInspect.getFinishedWidth() == null){
            return 2;
        }
        // 巡检表中厚度 宽度
        double finishedThickness = lmdpQcColdInspect.getFinishedThickness().doubleValue();
        double finishedWidth = lmdpQcColdInspect.getFinishedWidth().doubleValue();
        // 成品规格
        String model = lmdpQcColdInspect.getModel();
        // 0 厚度 1 宽度
        double[] doubles = strToDouble(model);

        // 计划表 宽度偏度范围±1 纵向厚度偏差范围≥2.5%
        String warpWidth = slaveErpPlanColdreductionstrip.getWarpWidth();
        double[] wrapWidths = strToDouble(warpWidth);
        String endwiseHeight = slaveErpPlanColdreductionstrip.getEndwiseHeight();
        double[] endwiseHeights = strToDouble(endwiseHeight);

        if(finishedWidth < doubles[1] - wrapWidths[0] || finishedWidth > doubles[1] + wrapWidths[0]){
            return 0;
        }
        if(finishedThickness < doubles[0]*(1-endwiseHeights[0]*0.01) || finishedThickness > doubles[0]*(1+endwiseHeights[0]*0.01)){
            return 0;
        }
        return 1;
    }

    /**
     * 表面质量判定
     * @return
     */
    private static int doSurfaceQualityDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        if (lmdpQcColdInspect.getSurfaceQuality() == null){
            return 2;
        }
        String str = "qualified";
        if(!str.equals(lmdpQcColdInspect.getSurfaceQuality())){
            return 0;
        }
        return 1;
    }

    /**
     * 外观质量判定
     * @return
     */
    private static int doAppearanceQualityDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        if (lmdpQcColdInspect.getAppearanceQuality() == null){
            return 2;
        }
        String str = "qualified";
        if(!str.equals(lmdpQcColdInspect.getAppearanceQuality())){
            return 0;
        }
        return 1;
    }

    /**
     * 总判定
     */
    public static PlanAndInspect doAllDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        PlanAndInspect planAndInspect = mergePlanAndInspect(slaveErpPlanColdreductionstrip, lmdpQcColdInspect);
        int one = doPlateTypeDetermination(slaveErpPlanColdreductionstrip, lmdpQcColdInspect);
        int two = doSurfaceQualityDetermination(slaveErpPlanColdreductionstrip, lmdpQcColdInspect);
        int three = doAppearanceQualityDetermination(slaveErpPlanColdreductionstrip, lmdpQcColdInspect);
        int four = doDimensionalDeviationDetermination(slaveErpPlanColdreductionstrip, lmdpQcColdInspect);
        int five = doMechanicalPropertiesDetermination(slaveErpPlanColdreductionstrip, lmdpQcColdInspect);
        planAndInspect.setPlateTypeDetermination(one);
        planAndInspect.setSurfaceQualityDetermination(two);
        planAndInspect.setAppearanceQualityDetermination(three);
        planAndInspect.setDimensionalDeviationDetermination(four);
        planAndInspect.setMechanicalPropertiesDetermination(five);
        if (one == 0 || two == 0 || three == 0 || four == 0 || five == 0){
            planAndInspect.setAllDetermination(0);
            return planAndInspect;
        }
        if (one == 2 || two == 2 || three == 2 || four == 2 || five == 2){
            planAndInspect.setAllDetermination(2);
            return planAndInspect;
        }
        planAndInspect.setAllDetermination(1);
        return planAndInspect;
    }

    /**
    * 正则匹配字符串中的数字转换成double类型的数组并且存入double数组中
    */
    private static double[] strToDouble(String str){
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        String[] str1 = m.replaceAll(" ").trim().split(" ");
        double[] d = new double[str1.length];
        for (int i = 0; i < str1.length; i++) {
            d[i] = Double.parseDouble(str1[i]);
        }
        return d;
    }

}
