package com.szj.djk.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.ErpPlanColdreductionstrip;
import com.szj.djk.entity.LmdpQcColdInspect;
import com.szj.djk.entity.LmdpQcColdReelReport;
import com.szj.djk.mapper.ErpPlanColdreductionstripMapper;
import com.szj.djk.mapper.LmdpQcColdInspectMapper;
import com.szj.djk.mapper.LmdpQcColdMechanicsReportMapper;
import com.szj.djk.mapper.LmdpQcColdReelReportMapper;
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
        implements LmdpQcColdReelReportService {

    private final Logger logger = LoggerFactory.getLogger(LmdpQcColdReelReportServiceImpl.class);

    @Resource
    private LmdpQcColdReelReportMapper lmdpQcColdReelReportMapper;
    @Resource
    private LmdpQcColdInspectMapper lmdpQcColdInspectMapper;
    @Resource
    private ErpPlanColdreductionstripMapper erpPlanColdreductionstripMapper;
    @Resource
    private LmdpQcColdMechanicsReportMapper lmdpQcColdMechanicsReportMapper;

    @Override
    @DS("slave")
    public Page<LmdpQcColdReelReport> pageList(Page<LmdpQcColdReelReport> pageInfo, LmdpQcColdReelReport lmdpQcColdReelReport) {

        LambdaQueryWrapper<LmdpQcColdReelReport> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(lmdpQcColdReelReport.getBatchNum() != null, LmdpQcColdReelReport::getBatchNum, lmdpQcColdReelReport.getBatchNum())
                .between(lmdpQcColdReelReport.getStartDateTime() != null && lmdpQcColdReelReport.getEndDateTime() != null, LmdpQcColdReelReport::getReportTime, lmdpQcColdReelReport.getStartDateTime(), lmdpQcColdReelReport.getEndDateTime())
                .orderByDesc(LmdpQcColdReelReport::getReportTime);
        Page<LmdpQcColdReelReport> page = lmdpQcColdReelReportMapper.selectPage(pageInfo, queryWrapper);

        List<LmdpQcColdReelReport> qcColdReelReports = page.getRecords();

        for (LmdpQcColdReelReport qcColdReelReport : qcColdReelReports) {

            assessColdRolledCoilQuality(qcColdReelReport);

            convertDbFieldToText(qcColdReelReport);

            LambdaQueryWrapper<LmdpQcColdInspect> queryWrapper1 = new LambdaQueryWrapper<>();
            queryWrapper1.eq(LmdpQcColdInspect::getBatchNum, qcColdReelReport.getBatchNum());
            LmdpQcColdInspect lmdpQcColdInspect = lmdpQcColdInspectMapper.selectOne(queryWrapper1);
            if (null == lmdpQcColdInspect) {
                qcColdReelReport.setLmdpQcColdInspect(null);
                qcColdReelReport.setErpPlanColdreductionstrip(null);
                continue;
            }
            qcColdReelReport.setLmdpQcColdInspect(lmdpQcColdInspect);

            LambdaQueryWrapper<ErpPlanColdreductionstrip> queryWrapper2 = new LambdaQueryWrapper<>();
            queryWrapper2.eq(ErpPlanColdreductionstrip::getColdreductionstripNum, lmdpQcColdInspect.getPlanNum());
            ErpPlanColdreductionstrip erpPlanColdreductionstrip =  erpPlanColdreductionstripMapper.selectOne(queryWrapper2);
            qcColdReelReport.setErpPlanColdreductionstrip(erpPlanColdreductionstrip);
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


    /**
     * 将数据库字段转换为文本描述。
     *
     * @param lmdpQcColdReelReport 冷卷报告对象，包含需要转换的质量控制字段。
     */
    private void convertDbFieldToText(LmdpQcColdReelReport lmdpQcColdReelReport) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qualified", "合格");
        map.put("unqualified", "异常");
        map.put(null, "暂未判定");
        lmdpQcColdReelReport.setShapeQc(map.get(lmdpQcColdReelReport.getShapeQc()));
        lmdpQcColdReelReport.setDimensionalDeviation(map.get(lmdpQcColdReelReport.getDimensionalDeviation()));
        lmdpQcColdReelReport.setSurfaceQc(map.get(lmdpQcColdReelReport.getSurfaceQc()));
        lmdpQcColdReelReport.setFacadeQc(map.get(lmdpQcColdReelReport.getFacadeQc()));
        lmdpQcColdReelReport.setMechanicalProperty(map.get(lmdpQcColdReelReport.getMechanicalProperty()));
    }

    private void assessColdRolledCoilQuality(LmdpQcColdReelReport lmdpQcColdReelReport) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qualifieda", "合格A");
        map.put("release", "合格B");
        map.put("reform", "改制");
        map.put("reload", "待确定");
        map.put("scrap", "报废");
        if (null != lmdpQcColdReelReport.getJudgeResult()) {
            lmdpQcColdReelReport.setJudgeResult(map.get(lmdpQcColdReelReport.getJudgeResult()));
            return;
        }

        if (null != lmdpQcColdReelReport.getComprehensiveJudge() && "qualified".equals(lmdpQcColdReelReport.getComprehensiveJudge()) ) {
            lmdpQcColdReelReport.setJudgeResult("合格A");
            return;
        }

        lmdpQcColdReelReport.setJudgeResult(checkQualityByFive(lmdpQcColdReelReport));


    }

    /**
     * 根据五个方面的质量检查结果来判断冷卷的质量等级。
     *
     * @param lmdpQcColdReelReport 包含五个质量检查方面（形状、表面、尺寸偏差、机械性能、表面）的报告对象。
     * @return 返回冷卷的质量等级，可能的返回值包括："合格A"、"待确定"、"合格B"、"改制"。
     */
    private String checkQualityByFive(LmdpQcColdReelReport lmdpQcColdReelReport) {
        int qualifiedCount = 0;
        int unqualifiedCount = 0;

        // 检查每个字段的状态，将null视为qualified
        if ("qualified".equals(lmdpQcColdReelReport.getShapeQc())) {
            qualifiedCount++;
        } else if ("unqualified".equals(lmdpQcColdReelReport.getShapeQc())) {
            unqualifiedCount++;
        }

        if ("qualified".equals(lmdpQcColdReelReport.getSurfaceQc())) {
            qualifiedCount++;
        } else if ("unqualified".equals(lmdpQcColdReelReport.getSurfaceQc())) {
            unqualifiedCount++;
        }

        if ("qualified".equals(lmdpQcColdReelReport.getDimensionalDeviation())) {
            qualifiedCount++;
        } else if ("unqualified".equals(lmdpQcColdReelReport.getDimensionalDeviation())) {
            unqualifiedCount++;
        }

        if ("qualified".equals(lmdpQcColdReelReport.getMechanicalProperty())) {
            qualifiedCount++;
        } else if ("unqualified".equals(lmdpQcColdReelReport.getMechanicalProperty())) {
            unqualifiedCount++;
        }

        if ("qualified".equals(lmdpQcColdReelReport.getFacadeQc())) {
            qualifiedCount++;
        } else if ("unqualified".equals(lmdpQcColdReelReport.getFacadeQc())) {
            unqualifiedCount++;
        }

        // 根据合格和不合格的数量判断最终质量
        if (qualifiedCount == 5) {
            return "合格A";
        } else if (unqualifiedCount == 0) {
            return "待确定";
        } else if (unqualifiedCount == 1 || unqualifiedCount == 2) {
            return "合格B";
        } else {
            return "改制";
        }
    }

}




