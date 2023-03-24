package com.szj.djk.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.*;
import com.szj.djk.mapper.WarnTableMapper;
import com.szj.djk.service.WarnTableService;
import com.szj.djk.service.AvaluateService;
import com.szj.djk.service.RewindRollService;
import com.szj.djk.service.RewinderService;
import com.szj.djk.service.WarnTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
@Component
@RestController
@RequestMapping("/rewindRoll")
public class RewindRollController {

    @Resource
    private RewindRollService rewindRollService;
    @Autowired
    private AvaluateService avaluateService;
    @Autowired
    private WarnTableMapper warnTableMapper;
    @Autowired
    private WarnTableService warnTableService;

    //查询重卷机最近的20条数据
    @GetMapping("list")
    public R<List<RewindRoll>> list(RewindRoll rewindRoll){
        LambdaQueryWrapper<RewindRoll> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(rewindRoll)
//               .orderByDesc(true, false, RewindRoll::getTs)
                .orderByDesc(true,RewindRoll::getTs)
                .last("limit 20");
        List<RewindRoll> list = rewindRollService.list(queryWrapper);
        return R.success(list);
    }

    /**
     * 查询重卷机特定时间前后的警告数据
     */
    @GetMapping("listSpecial")
    public R<List<WarnTable>> listSpecial(RewindRoll rewindRoll, String rollingName)  {
//        System.out.println("触发了+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int amount = 10000;
        LocalDateTime ts = rewindRoll.getTs();
        long beforeTime = Timestamp.valueOf(ts).getTime()-amount;
        long afterTime = Timestamp.valueOf(ts).getTime()+amount;
        LocalDateTime before = new Date(beforeTime).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
        LocalDateTime after = new Date(afterTime).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
        List<WarnTable> specialList = rewindRollService.selectSpecial(before,after,rollingName);
        return R.success(specialList);
    }

    /**
     * 实时存入重卷机异常数据
     */
//        @GetMapping("listone")
    @Scheduled(fixedRate = 20000)
        public R<ValueRange> addwarndata(){
        Avaluate avaluate = new Avaluate();
        ValueRange valueRange = new ValueRange();
        LambdaQueryWrapper<Avaluate> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(avaluate);
        avaluateService.list(queryWrapper).forEach(i ->{
            switch (i.getName()){
                case "开卷机电流曲线":
                    valueRange.setShangDD(i.getMaxValue());
                    break;
                case "卷取机电流曲线":
                    valueRange.setXiaDD(i.getMaxValue());
                    break;
                case "机列速度":
                    valueRange.setShangDS(i.getMaxValue());
                    break;
                case "卷取卷径":
                    valueRange.setXiaDS(i.getMaxValue());
                    break;
                case "实际张力":
                    valueRange.setZhuDD(i.getMaxValue());
                    break;
                case "带材长度":
                    valueRange.setBeiDD(i.getMaxValue());
                    break;
            }
        });
//        System.out.println("打印++++" + valueRange);
        WarnTable warnTable = new WarnTable();
        RewindRoll rewindRoll = new RewindRoll();
        LambdaQueryWrapper<RewindRoll> queryWrapperR = new LambdaQueryWrapper<>();
        queryWrapperR.setEntity(rewindRoll)
                .orderByDesc(true,RewindRoll::getTs)
                .last("limit 20");
        List<RewindRoll> newlist = rewindRollService.list(queryWrapperR);
//            System.out.println("新的数据"+ newlist.size());
/**
 * 开卷机电流曲线:setShangDD  卷取机电流曲线:setXiaDD    机列速度:setShangDS 卷取卷径:setXiaDS
 * 实际张力:setZhuDD   带材长度:setBeiDD
  */
    newlist.forEach(i->{
            if(i.getOpenRollA()>valueRange.getShangDD()){
                warnTable.setRollingName("开卷机电流曲线");
                warnTable.setRollingValue(i.getOpenRollA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("重卷机1#");
                warnTableService.save(warnTable);
            }
            if(i.getRollWindA()>valueRange.getXiaDD()){
                warnTable.setRollingName("卷取机电流曲线");
                warnTable.setRollingValue(i.getRollWindA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("重卷机1#");
                warnTableService.save(warnTable);
            }
        if(i.getMachineColsV()>valueRange.getShangDS()){
            warnTable.setRollingName("机列速度");
            warnTable.setRollingValue(i.getMachineColsV());
            warnTable.setRollingProduceTime(i.getTs());
            warnTable.setRollingDeviceNumber("重卷机1#");
            warnTableService.save(warnTable);
        }

        if(i.getRollWindD()>valueRange.getXiaDS()){
            warnTable.setRollingName("卷取卷径");
            warnTable.setRollingValue(i.getRollWindD());
            warnTable.setRollingProduceTime(i.getTs());
            warnTable.setRollingDeviceNumber("重卷机1#");
            warnTableService.save(warnTable);
        }

        if(i.getActualTension()>valueRange.getZhuDD()){
            warnTable.setRollingName("实际张力");
            warnTable.setRollingValue(i.getActualTension());
            warnTable.setRollingProduceTime(i.getTs());
            warnTable.setRollingDeviceNumber("重卷机1#");
            warnTableService.save(warnTable);
        }

        if(i.getStripL()>valueRange.getBeiDD()){
            warnTable.setRollingName("带材长度");
            warnTable.setRollingValue(i.getStripL());
            warnTable.setRollingProduceTime(i.getTs());
            warnTable.setRollingDeviceNumber("重卷机1#");
            warnTableService.save(warnTable);
        }
        });
        return  R.success(valueRange);
    }


}
