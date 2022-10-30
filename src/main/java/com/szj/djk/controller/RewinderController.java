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
    /**
     * 查询重卷机列表
     */
    @GetMapping("list")
    public R<List<Rewinder>> list(){
        LambdaQueryWrapper<Rewinder> queryWrapper = new LambdaQueryWrapper<>();
        List<Rewinder> list = rewinderService.list(queryWrapper);
        return R.success(list);
    }
    /**
     * 查询重卷机前十条列表
     */
    @GetMapping("listTen")
    public R<List<Rewinder>> listTen(Rewinder rewinder){
        List<Rewinder> listten = rewinderService.selectRewinderTen(rewinder);
        return R.success(listten);
    }

    /**
     * 新增重卷机列表
     */
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
