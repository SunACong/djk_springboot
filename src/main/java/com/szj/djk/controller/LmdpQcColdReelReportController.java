package com.szj.djk.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.LmdpQcColdReelReport;
import com.szj.djk.service.LmdpQcColdReelReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2022-10-17
 */
//冷轧卷质检报告工序
@DS("slave")
@RestController
@RequestMapping("/lmdpQcColdReelReport")
public class LmdpQcColdReelReportController
{
    @Autowired
    private LmdpQcColdReelReportService lmdpQcColdReelReportService;

    @GetMapping("list")
    public R<List<LmdpQcColdReelReport>> list(LmdpQcColdReelReport lmdpQcColdReelReport){
        LambdaQueryWrapper<LmdpQcColdReelReport> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpQcColdReelReport);
        List<LmdpQcColdReelReport> list = lmdpQcColdReelReportService.list(queryWrapper);
        return R.success(list);
    }

    /**
     * 分页查询质量合格判定表格数据
     * @param pageNum 页码
     * @param pageSize 每页数量
     * @param lmdpQcColdReelReport 查询实体
     * @return
     */
    @GetMapping("pageList")
    public R<Page> list(int pageNum, int pageSize, LmdpQcColdReelReport lmdpQcColdReelReport){
        Page<LmdpQcColdReelReport> pageInfo = new Page<>(pageNum, pageSize);
        Page<LmdpQcColdReelReport> page = lmdpQcColdReelReportService.pageList(pageInfo, lmdpQcColdReelReport);
        return R.success(page);
    }

    /**
     * 统计一段时间内每天的合格率信息 用于生成折线图
     * @param startTime
     * @param endTime
     * @return
     */
    @GetMapping("everyDayInfo")
    public R<List<Map<String, Integer>>> getEveryDayInfo(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime){
        List<Map<String, Integer>> list = lmdpQcColdReelReportService.getEveryDayInfo(startTime, endTime);
        return R.success(list);
    }

    /**
     * 统计一段时间内的合格率信息 用于折线图上部的信息展示
     * @param startTime
     * @param endTime
     * @return
     */
    @GetMapping("rangeDayInfo")
    public R<List<Map<String, Integer>>> getRangeDayInfo(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime){
        List<Map<String, Integer>> list = lmdpQcColdReelReportService.getRangeDayInfo(startTime, endTime);
        return R.success(list);
    }

}
