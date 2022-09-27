package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.Rewinder;
import com.szj.djk.service.RewinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName RewinderController
 * @Author 张高义
 * @Create 2022/9/25 0025 下午 20:57
 */
@RestController
@RequestMapping("/rewinder")
public class RewinderController {


    @Autowired
    private RewinderService rewinderService;

    @GetMapping("list")
    public R<List<Rewinder>> list(){
        LambdaQueryWrapper<Rewinder> queryWrapper = new LambdaQueryWrapper<>();
        List<Rewinder> list = rewinderService.list(queryWrapper);
        return R.success(list);
    }
    
    @PostMapping
    public R<String> add(@RequestBody Rewinder rewinder){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        System.out.println(dateFormat.format(date));
        rewinder.setProduceTime(date);

        boolean save = rewinderService.save(rewinder);

        return R.success("新增成功");
    }
}
