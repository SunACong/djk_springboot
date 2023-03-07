package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.Rewinder;
import com.szj.djk.service.RewinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
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
     * 查询铸轧机特定时间前后的警告数据
     */
    @GetMapping("listSpecial")
    public R<List<Rewinder>> listSpecial(Rewinder rewinder) throws ParseException {
        int amount = 10000;
        Date produceTime = rewinder.getProduceTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(produceTime.getTime());
        String beforeTime = sdf.format(produceTime.getTime() - amount);
        String afterTime = sdf.format(produceTime.getTime() + amount);
        Date before = sdf.parse(beforeTime);
        Date after = sdf.parse(afterTime);
        List<Rewinder> specialList = rewinderService.selectSpecial(rewinder,before,after);
        return R.success(specialList);
    }

    /**
     * 新增重卷机列表
     */
    @PostMapping
    public R<String> add(@RequestBody Rewinder rewinder){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(date));
        rewinder.setProduceTime(date);

        boolean save = rewinderService.save(rewinder);

        return R.success("新增成功");
    }
}
