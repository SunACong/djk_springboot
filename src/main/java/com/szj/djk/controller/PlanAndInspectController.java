package com.szj.djk.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.service.PlanAndInspectService;
import com.szj.djk.vo.PlanAndInspect;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 孙少聪
 * @Date 2023/3/15 08:52:45
 * @Description 计划表和巡检表的控制器
 */
@RestController
@RequestMapping("/planAndInspect")
public class PlanAndInspectController {

    @Resource
    private PlanAndInspectService planAndInspectService;

    @GetMapping("saveBatchOrUpdate")
    public R<String> saveBatchOrUpdate(){
        String str = planAndInspectService.saveBatchOrUpdate();
        return R.success(str);
    }

    @GetMapping("list")
    public R<Page> list(int pageNum, int pageSize, PlanAndInspect planAndInspect){
        Page<PlanAndInspect> pageInfo = new Page<>(pageNum, pageSize);
        Page<PlanAndInspect> page = planAndInspectService.pageList(pageInfo, planAndInspect);
        return R.success(page);
    }

    @GetMapping("everyDayInfo")
    public R<List<Map<String, Integer>>> getEveryDayInfo(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime){
        List<Map<String, Integer>> list = planAndInspectService.getEveryDayInfo(startTime, endTime);
        return R.success(list);
    }

    @GetMapping("rangeDayInfo")
    public R<List<Map<String, Integer>>> getRangeDayInfo(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime){
        List<Map<String, Integer>> list = planAndInspectService.getRangeDayInfo(startTime, endTime);
        return R.success(list);
    }
}

