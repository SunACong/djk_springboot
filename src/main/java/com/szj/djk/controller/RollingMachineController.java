package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.RollingMachine;
import com.szj.djk.service.RollingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
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
        rollingMachine.setRollingProduceTime(date);
        boolean save = rollingMachineService.save(rollingMachine);
        return R.success("新增成功");
    }

    /**
     * 查询铸轧机最新十条数据
     */
    @GetMapping("/listInfo")
    public R<List<RollingMachine>> listInfo(RollingMachine rollingMachine){
        List<RollingMachine> rollingMachines = rollingMachineService.selectRollingMachineTen(rollingMachine);
        return  R.success(rollingMachineService.selectRollingMachineTen(rollingMachine));
    }

    /**
     * 查询铸轧机特定时间前后的警告数据
     */
    @GetMapping("listSpecial")
    public R<List<RollingMachine>> listSpecial(RollingMachine rollingMachine) throws ParseException {
        int amount = 10000;
        Date rollingProduceTime = rollingMachine.getRollingProduceTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String beforeTime = sdf.format(rollingProduceTime.getTime() - amount);
        String afterTime = sdf.format(rollingProduceTime.getTime() + amount);
        Date before = sdf.parse(beforeTime);
        Date after = sdf.parse(afterTime);
        List<RollingMachine> specialList = rollingMachineService.selectSpecial(rollingMachine,before,after);
        return R.success(specialList);
    }


    @GetMapping("/listWarnData")
    public R<List<RollingMachine>> listWarnData(String rollingName, Integer maxValue){
        return R.success(rollingMachineService.selectWarnData(rollingName,maxValue));
    }

    @GetMapping("/getHistoryList")
    public R<List<RollingMachine>> list(String deviceId, String startDateTime, String endDateTime){
        LambdaQueryWrapper<RollingMachine> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RollingMachine::getRollingDeviceId, deviceId);
        queryWrapper.between(RollingMachine::getRollingProduceTime, startDateTime, endDateTime);
        queryWrapper.orderByDesc(RollingMachine::getRollingName);
        List<RollingMachine> list = rollingMachineService.list(queryWrapper);
        return R.success(list);
    }

    /**
     * 查询铸轧机一段时间内的警告数据
     */
    @GetMapping("listDuringData")
    public R<List<RollingMachine>> listDuringData(RollingMachine rollingMachine,String begin,String end) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date beginDate = sdf.parse(begin);
        Date endDate = sdf.parse(end);
        List<RollingMachine> DuringDataList = rollingMachineService.selectDuringData(rollingMachine,beginDate,endDate);
        return R.success(DuringDataList);
    }
}
