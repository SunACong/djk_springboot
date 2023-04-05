package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.ReportDict;
import com.szj.djk.service.ReportDictService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 孙少聪
 * @Date 2023/4/5 10:58:57
 * @Description 获取所有字典数据
 */
@RestController
@RequestMapping("/reportDict")
public class ReportDictController {

    @Resource
    private ReportDictService reportDictService;

    @GetMapping("list")
    public R<List<ReportDict>> list(){
        LambdaQueryWrapper<ReportDict> queryWrapper = new LambdaQueryWrapper<>();
        List<ReportDict> list = reportDictService.list(queryWrapper);
        return R.success(list);
    }
}
