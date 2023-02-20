package com.szj.djk.ssc.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.ssc.entity.ProcessStandard;
import com.szj.djk.ssc.service.ProcessStandardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @ClassName ProcessStandardController
 * @Authoc 孙少聪
 * @Date 2022/9/29 20:29:18
 */
@Slf4j
@RestController
@RequestMapping("/processStandard")
public class ProcessStandardController {

    @Autowired
    private ProcessStandardService processStandardService;

    @GetMapping("list")
    public R<List<ProcessStandard>> list(ProcessStandard processStandard){
        LambdaQueryWrapper<ProcessStandard> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(processStandard);
        List<ProcessStandard> list = processStandardService.list(queryWrapper);
        return R.success(list);
    }

    @GetMapping("pageList")
    public R<Page> pageList(int pageNum, int pageSize, ProcessStandard processStandard){
        Page<ProcessStandard> pageInfo = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<ProcessStandard> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(processStandard);
        Page<ProcessStandard> page = processStandardService.page(pageInfo, queryWrapper);
        return R.success(page);
    }

    @GetMapping("{id}")
    public R<ProcessStandard> getStandardbyId(@PathVariable("id") int id){
        ProcessStandard processStandard = processStandardService.getById(id);
        return R.success(processStandard);
    }

    @PutMapping
    public R<String> edit(@RequestBody ProcessStandard processStandard){
        boolean b = processStandardService.updateById(processStandard);
        return b? R.success("修改成功"):R.success("修改失败");
    }

}
