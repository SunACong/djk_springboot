package com.szj.djk.utils;

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
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 孙少聪
 * @Date 2023/3/14 11:28:19
 * @Description 质量判定流程，里面包含了所有质量判定流程的步骤，但是真正的判定是在PlanAndInspectServiceImpl中实现的
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
     * @return 最后一次更新时间
     */
    private String getRecentTsFromPlanAndInspect(){
        return planAndInspectService.getRecentTs();
    }

    /**
     * 查询迅巡检记录表中上一次到现在为止更新过的卷号 从库 lmdp_qc_cold_inspect
     * @param ts 上一次更新时间
     * @return 返回冷轧巡检的列表
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
     * @return  0 不合格  1 合格 2 暂未判定
     */
    private static int doPlateTypeDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        if (lmdpQcColdInspect.getSingleMediumConvexity() == null || lmdpQcColdInspect.getSingleStraightness() == null){
            return 2;
        }
        // 巡检表中凸度
        double singleMediumConvexity = lmdpQcColdInspect.getSingleMediumConvexity().doubleValue();
        // 巡检表平直度
        double singleStraightness = lmdpQcColdInspect.getSingleStraightness().doubleValue();
        // 计划表平直度 暂时废弃
        String flatness = slaveErpPlanColdreductionstrip.getFlatness();
        // 计划表凸面率
        String convexRate = slaveErpPlanColdreductionstrip.getConvexRate();
        double[] doubles = strToDouble(convexRate);
        // 暂时只判断凸度
        if (singleMediumConvexity >= doubles[0] && singleMediumConvexity <= doubles[1]){
            return 1;
        }
        return 0;
    }

    /**
     * 力学性能判定
     * @return 0 不合格  1 合格 2 暂未判定
     */
    private static int doMechanicalPropertiesDetermination(SlaveErpPlanColdreductionstrip slaveErpPlanColdreductionstrip, LmdpQcColdInspect lmdpQcColdInspect){
        // 判断singleExtensionRe是否为空
        if (lmdpQcColdInspect.getSingleExtension() == null || lmdpQcColdInspect.getSingleStrength() == null || lmdpQcColdInspect.getBendingPerformanceRequirements() == null){
            return 2;
        }
        // 巡检表延伸率 抗拉强度 弯折性能————————第一次检测
        double singleExtension = lmdpQcColdInspect.getSingleExtension().doubleValue();
        double singleStrength = lmdpQcColdInspect.getSingleStrength().doubleValue();
        String bendingPerformance = lmdpQcColdInspect.getBendingPerformanceRequirements();
        // 计划表延伸率 抗拉强度 弯折性能————————标准
        String elongation = slaveErpPlanColdreductionstrip.getElongation();
        double[] elongations = strToDouble(elongation);
        String tensileStrength = slaveErpPlanColdreductionstrip.getTensileStrength();
        double[] tensileStrengths = strToDouble(tensileStrength);
        String bendingPerformanceS = slaveErpPlanColdreductionstrip.getBendingPerformance();
        int flag = 0;
        if (singleExtension < elongations[0]){
            flag++;
        }
        if (singleStrength < tensileStrengths[0] || singleStrength > tensileStrengths[1]){
            flag++;
        }
        String str = "cracked";
        if (str.equals(bendingPerformance)){
            flag++;
        }
        if (flag != 0){
            if (lmdpQcColdInspect.getSingleExtensionRe() == null || lmdpQcColdInspect.getSingleStrengthRe() == null || lmdpQcColdInspect.getBendingPerformanceRe() == null){
                return 2;
            }
            // 巡检表延伸率 抗拉强度 弯折性能————————复检
            double singleExtensionRe = lmdpQcColdInspect.getSingleExtensionRe().doubleValue();
            double singleStrengthRe = lmdpQcColdInspect.getSingleStrengthRe().doubleValue();
            String bendingPerformanceRe = lmdpQcColdInspect.getBendingPerformanceRe();
            if (singleExtensionRe < elongations[0]){
                return 0;
            }
            if (singleStrengthRe < tensileStrengths[0] || singleStrengthRe > tensileStrengths[1]){
                return 0;
            }
            str = "cracked";
            if (str.equals(bendingPerformanceRe)){
                return 0;
            }
        }
        return 1;
    }

    /**
     * 尺寸偏差判定
     * @return 0 不合格  1 合格 2 暂未判定
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
     * @return 0 不合格  1 合格 2 暂未判定
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
     * @return  0 不合格  1 合格 2 暂未判定
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
     * 总判定  0 不合格  1 合格 2 暂未判定
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
// 帮我写一个函数正则匹配字符串中的double类型的数字
    public static double[] strToDouble(String str){
        double[] doubles = new double[2];
        String regex = "\\d+(\\.\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find()){
            doubles[i] = Double.parseDouble(matcher.group());
            i++;
        }
        return doubles;
    }

}
