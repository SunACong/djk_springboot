package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.ssc.entity.LmdpQcColdInspect;
import com.szj.djk.ssc.service.LmdpQcColdInspectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/lmdpQcColdInspect")
public class LmdpQcColdInspectController {

    @Resource
    private LmdpQcColdInspectService lmdpQcColdInspectService;

    @GetMapping("list")
    public R<List<LmdpQcColdInspect>> list(LmdpQcColdInspect lmdpQcColdInspect){
        LambdaQueryWrapper<LmdpQcColdInspect> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(lmdpQcColdInspect);
        List<LmdpQcColdInspect> list = lmdpQcColdInspectService.list(queryWrapper);
        return R.success(list);
    }
}
