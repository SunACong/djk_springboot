package com.szj.djk.controller;

import com.szj.djk.common.R;
import com.szj.djk.entity.RollingMachine;
import com.szj.djk.service.RollingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName RollingMachineController
 * @Author 张高义
 * @Create 2022/10/21 0021 上午 11:03
 */
@RestController
@RequestMapping("/rollingMachine")
public class RollingMachineController {

    @Autowired
    private RollingMachineService rollingMachineService;

    /**
     * 新增铸轧机列表
     */
    @PostMapping
    public R<String> addRollingMachine(@RequestBody RollingMachine rollingMachine){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        System.out.println(dateFormat.format(date));
        rollingMachine.setRollingProduceTime(date);
        boolean save = rollingMachineService.save(rollingMachine);
        return R.success("新增成功");
    }

    /**
     * 查询铸轧机最新十条数据
     */
    @GetMapping("/listInfo")
    public R<List<RollingMachine>> listInfo(RollingMachine rollingMachine){
        return  R.success(rollingMachineService.selectRollingMachineTen(rollingMachine));
    }

    @GetMapping("/listWarnData")
    public R<List<RollingMachine>> listWarnData(String rollingName, Integer maxValue){
        return R.success(rollingMachineService.selectWarnData(rollingName,maxValue));
    }
}
