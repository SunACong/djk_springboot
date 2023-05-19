package com.szj.djk.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.*;
import com.szj.djk.mapper.WarnTableMapper;
import com.szj.djk.service.AvaluateService;
import com.szj.djk.service.FourAnneaFurService;
import com.szj.djk.service.ThreeAnneaFurService;
import com.szj.djk.service.WarnTableService;
import com.szj.djk.utils.TimeStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

@Component
@RestController
@RequestMapping("/anneaf4")
public class FourAnneaFurController {
    @Autowired
    FourAnneaFurService fourAnneaFurService;
    @Autowired
    private AvaluateService avaluateService;
    @Autowired
    private WarnTableMapper warnTableMapper;
    @Autowired
    private WarnTableService warnTableService;


    @GetMapping("/list")
    public R<List<FourAnneaFur>> list(FourAnneaFur fourAnneaFur){
        LambdaQueryWrapper<FourAnneaFur> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(fourAnneaFur)
                .between(FourAnneaFur::getTs, TimeStr.getTimeStr1(),TimeStr.getTimeStr2())
                .orderByDesc(true,FourAnneaFur::getTs);
        List<FourAnneaFur> list = fourAnneaFurService.list(queryWrapper);
        return R.success(list);
    }

    /**
     * 实时存入退火炉1的异常数据
     */
//    @GetMapping("listone")
    @Scheduled(fixedRate = 20000)
    public R<ValueRange> addwarndata(){
        Avaluate avaluate = new Avaluate();
        ValueRange valueRange = new ValueRange();
        LambdaQueryWrapper<Avaluate> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(avaluate);
        avaluateService.list(queryWrapper).forEach(i ->{
            switch (i.getName()){
                case "炉冷却水":
                    valueRange.setShangDD(i.getMaxValue());
                    valueRange.setShangDD1(i.getMinValue());
                    break;
                case "炉压缩空气":
                    valueRange.setXiaDD(i.getMaxValue());
                    valueRange.setXiaDD1(i.getMinValue());
                    break;
                case "金属料温温度曲线":
                    valueRange.setShangDS(i.getMaxValue());
                    valueRange.setShangDS1(i.getMinValue());
                    break;
                case "一区炉气温度曲线":
                    valueRange.setXiaDS(i.getMaxValue());
                    valueRange.setXiaDS1(i.getMinValue());
                    break;
                case "二区炉气温度曲线":
                    valueRange.setZhuDD(i.getMaxValue());
                    valueRange.setZhuDD1(i.getMinValue());
                    break;
                case "三区炉气温度曲线":
                    valueRange.setBeiDD(i.getMaxValue());
                    valueRange.setBeiDD1(i.getMinValue());
                    break;
                case "炉气设定温度":
                    valueRange.setBeiDS(i.getMaxValue());
                    valueRange.setBeiDS1(i.getMinValue());
                    break;
            }
        });
//        System.out.println("打印++++" + valueRange.getXiaDD());
        WarnTable warnTable = new WarnTable();
        FourAnneaFur fourAnneaFur = new FourAnneaFur();
        LambdaQueryWrapper<FourAnneaFur> queryWrapperR = new LambdaQueryWrapper<>();
                queryWrapperR.setEntity(fourAnneaFur)
                        .between(FourAnneaFur::getTs, TimeStr.getTimeStr1(),TimeStr.getTimeStr2())
                .orderByDesc(true,FourAnneaFur::getTs);

                List<FourAnneaFur> newlist = fourAnneaFurService.list(queryWrapperR);
//            System.out.println("新的数据"+ newlist);
        /**
         * 炉冷却水:ShangDD  炉压缩空气:XiaDD    金属料温温度曲线:ShangDS 一区炉气温度曲线:XiaDS
         * 二区炉气温度曲线:ZhuDD   三区炉气温度曲线:BeiDD  炉气设定温度:BeiDS
         */
        newlist.forEach(i->{
                    if(i.getZoneOneT() > 100) {
                        if (i.getCoolWaterUpLimit() > valueRange.getShangDD() || i.getCoolWaterUpLimit() < valueRange.getShangDD1()) {
                            warnTable.setRollingName("炉冷却水");
                            warnTable.setRollingValue(i.getCoolWaterUpLimit());
                            warnTable.setRollingProduceTime(i.getTs());
                            warnTable.setRollingDeviceNumber("退火炉4#");
                            warnTableService.save(warnTable);
                        }
//            if(i.getCompressedAirOneLowPressure()>valueRange.getXiaDD()){
//                warnTable.setRollingName("炉压缩空气");
//                warnTable.setRollingValue(i.getCompressedAirOneLowPressure());
//                warnTable.setRollingProduceTime(i.getTs());
//                warnTable.setRollingDeviceNumber("退火炉4#");
//                warnTableService.save(warnTable);
//            }
                        if (i.getMeterialT() > valueRange.getShangDS() || i.getMeterialT() < valueRange.getShangDS1()) {
                            warnTable.setRollingName("金属料温温度曲线");
                            warnTable.setRollingValue(i.getMeterialT());
                            warnTable.setRollingProduceTime(i.getTs());
                            warnTable.setRollingDeviceNumber("退火炉4#");
                            warnTableService.save(warnTable);
                        }

                        if (i.getZoneOneT() > valueRange.getXiaDS() || i.getZoneOneT() < valueRange.getXiaDS1()) {
                            warnTable.setRollingName("一区炉气温度曲线");
                            warnTable.setRollingValue(i.getZoneOneT());
                            warnTable.setRollingProduceTime(i.getTs());
                            warnTable.setRollingDeviceNumber("退火炉4#");
                            warnTableService.save(warnTable);
                        }

                        if (i.getZoneTwoT() > valueRange.getZhuDD() || i.getZoneTwoT() < valueRange.getZhuDD1()) {
                            warnTable.setRollingName("二区炉气温度曲线");
                            warnTable.setRollingValue(i.getZoneTwoT());
                            warnTable.setRollingProduceTime(i.getTs());
                            warnTable.setRollingDeviceNumber("退火炉4#");
                            warnTableService.save(warnTable);
                        }

                        if (i.getZoneThreeT() > valueRange.getBeiDD() || i.getZoneThreeT() < valueRange.getBeiDD1()) {
                            warnTable.setRollingName("三区炉气温度曲线");
                            warnTable.setRollingValue(i.getZoneThreeT());
                            warnTable.setRollingProduceTime(i.getTs());
                            warnTable.setRollingDeviceNumber("退火炉4#");
                            warnTableService.save(warnTable);
                        }
                        if (i.getSetT() > valueRange.getBeiDD() || i.getSetT() < valueRange.getBeiDD1()) {
                            warnTable.setRollingName("炉气设定温度");
                            warnTable.setRollingValue(i.getSetT());
                            warnTable.setRollingProduceTime(i.getTs());
                            warnTable.setRollingDeviceNumber("退火炉4#");
                            warnTableService.save(warnTable);
                        }
                    }
        });
        return  R.success(valueRange);
    }

    /**
     * 查询重卷机特定时间前后的警告数据
     */
    @GetMapping("listSpecial")
    public R<List<WarnTable>> listSpecial(FourAnneaFur fourAnneaFur, String rollingName)  {
//        System.out.println("触发了+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        int amount = 10000;
//        LocalDateTime ts = fourAnneaFur.getTs();
//        long beforeTime = Timestamp.valueOf(ts).getTime()-amount;
//        long afterTime = Timestamp.valueOf(ts).getTime()+amount;
//        LocalDateTime before = new Date(beforeTime).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
//        LocalDateTime after = new Date(afterTime).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
//        List<WarnTable> specialList = fourAnneaFurService.selectSpecial(before,after,rollingName);
//        return R.success(specialList);

        LocalDateTime ts = fourAnneaFur.getTs();
        LocalDateTime before = ts.minusMinutes(15);
        LocalDateTime after = ts;
        List<WarnTable> specialList = fourAnneaFurService.selectSpecial(before,after,rollingName);
        return R.success(specialList);
    }

}
