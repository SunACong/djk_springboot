package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.ProcessStandard;
import com.szj.djk.service.ProcessStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProcessStandardController
 * @Authoc 孙少聪
 * @Date 2022/9/29 20:29:18
 */

@RestController
@RequestMapping("/processStandard")
public class ProcessStandardController {

    @Autowired
    private ProcessStandardService processStandardService;

    @GetMapping("{id}")
    public R<ProcessStandard> getStandardbyId(@PathVariable("id") int id){
        ProcessStandard processStandard = processStandardService.getById(id);
        return R.success(processStandard);
    }
}
