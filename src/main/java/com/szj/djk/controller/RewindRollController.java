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
import com.szj.djk.utils.TimeStr.*;
import com.szj.djk.utils.TimeStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
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
    @GetMapping("/list")
    public R<List<RewindRoll>> list(RewindRoll rewindRoll){
        LambdaQueryWrapper<RewindRoll> queryWrapper = new LambdaQueryWrapper<>();
        String timeStr1=LocalDateTime.now().minusSeconds(20).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String timeStr2=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        queryWrapper.setEntity(rewindRoll)
                .between(RewindRoll::getTs,timeStr1,timeStr2)
                .orderByDesc(true,RewindRoll::getTs);
        List<RewindRoll> list = rewindRollService.list(queryWrapper);
        return R.success(list);
    }

    /**
     * 查询重卷机特定时间前后的警告数据
     */
    @GetMapping("/listSpecial")
    public R<List<WarnTable>> listSpecial(RewindRoll rewindRoll, String rollingName)  {
        LocalDateTime ts = rewindRoll.getTs();
        LocalDateTime before = ts.minusMinutes(15);
        LocalDateTime after = ts;
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
                    valueRange.setShangDD1(i.getMinValue());
                    break;
                case "卷取机电流曲线":
                    valueRange.setXiaDD(i.getMaxValue());
                    valueRange.setXiaDD1(i.getMinValue());
                    break;
                case "机列速度":
                    valueRange.setShangDS(i.getMaxValue());
                    valueRange.setShangDS1(i.getMinValue());
                    break;
                case "卷取卷径":
                    valueRange.setXiaDS(i.getMaxValue());
                    valueRange.setXiaDS1(i.getMinValue());
                    break;
                case "实际张力":
                    valueRange.setZhuDD(i.getMaxValue());
                    valueRange.setZhuDD1(i.getMinValue());
                    break;
                case "带材长度":
                    valueRange.setBeiDD(i.getMaxValue());
                    valueRange.setBeiDD1(i.getMinValue());
                    break;
            }
        });
        WarnTable warnTable = new WarnTable();
        RewindRoll rewindRoll = new RewindRoll();

        LambdaQueryWrapper<RewindRoll> queryWrapperR = new LambdaQueryWrapper<>();
        queryWrapperR.setEntity(rewindRoll)
                .between(RewindRoll::getTs,TimeStr.getTimeStr1(),TimeStr.getTimeStr2());
        List<RewindRoll> newlist = rewindRollService.list(queryWrapperR);
//        System.out.println("长度"+newlist.size());
/**
 * 开卷机电流曲线:setShangDD  卷取机电流曲线:setXiaDD    机列速度:setShangDS 卷取卷径:setXiaDS
 * 实际张力:setZhuDD   带材长度:setBeiDD
  */
    newlist.forEach(i->{
        if(i.getMachineColsV() > 10){
            if(i.getOpenRollA()>valueRange.getShangDD() || i.getOpenRollA()<valueRange.getShangDD1()){
                warnTable.setRollingName("开卷机电流曲线");
                warnTable.setRollingValue(i.getOpenRollA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("重卷机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getRollWindA()>valueRange.getXiaDD() || i.getOpenRollA()<valueRange.getShangDD1()){
                warnTable.setRollingName("卷取机电流曲线");
                warnTable.setRollingValue(i.getRollWindA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("重卷机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getMachineColsV()>valueRange.getShangDS() || i.getOpenRollA()<valueRange.getShangDD1()){
                warnTable.setRollingName("机列速度");
                warnTable.setRollingValue(i.getMachineColsV());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("重卷机1#");
                warnTable.setPara("工艺参数");
                warnTableService.save(warnTable);
            }

            if(i.getRollWindD()>valueRange.getXiaDS() || i.getRollWindD()<valueRange.getXiaDS1()){
                warnTable.setRollingName("卷取卷径");
                warnTable.setRollingValue(i.getRollWindD());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("重卷机1#");
                warnTable.setPara("工艺参数");
                warnTableService.save(warnTable);
            }

            if(i.getActualTension()>valueRange.getZhuDD() || i.getActualTension()<valueRange.getZhuDD1()){
                warnTable.setRollingName("实际张力");
                warnTable.setRollingValue(i.getActualTension());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("重卷机1#");
                warnTable.setPara("工艺参数");
                warnTableService.save(warnTable);
            }

            if(i.getStripL()>valueRange.getBeiDD() || i.getStripL()<valueRange.getBeiDD1()){
                warnTable.setRollingName("带材长度");
                warnTable.setRollingValue(i.getStripL());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("重卷机1#");
                warnTable.setPara("工艺参数");
                warnTableService.save(warnTable);
            }
        }

        });
        return  R.success(valueRange);
    }


}
