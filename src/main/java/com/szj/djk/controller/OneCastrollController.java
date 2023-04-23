package com.szj.djk.controller;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.Avaluate;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.ValueRange;
import com.szj.djk.entity.WarnTable;
import com.szj.djk.mapper.WarnTableMapper;
import com.szj.djk.service.AvaluateService;
import com.szj.djk.service.OneCastrollService;
import com.szj.djk.service.WarnTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName OneCastrollController
 * @Author 张高义
 * @Create 2022/10/21 0021 上午 11:03
 */
@Slf4j
@RestController
@RequestMapping("/oneCastroll")
public class OneCastrollController {
    @Autowired
    private  OneCastrollService oneCastrollService;
    @Autowired
    private  AvaluateService avaluateService;
    @Autowired
    private WarnTableMapper warnTableMapper;
    @Autowired
    private WarnTableService warnTableService;

    /**
     * 查询铸轧机最新数据
     */
    @GetMapping("/listNewData")
    public R<List<OneCastroll>> ListNewData(){
        List<OneCastroll> rollingMachines = oneCastrollService.selectRollingNewData();
        return  R.success(rollingMachines);
    }
    /**
     * 查询铸轧机特定时间前后的警告数据
     */
    @GetMapping("/listSpecial")

    public R<List<WarnTable>> listSpecial(OneCastroll oneCastroll, String rollingName)  {
        int amount = 10000;
        LocalDateTime ts = oneCastroll.getTs();
        LocalDateTime before = ts.minusMinutes(15);
        LocalDateTime after = ts;
        List<WarnTable> specialList = oneCastrollService.selectSpecial(before,after,rollingName);
        return R.success(specialList);
    }

    /**
     * 实时存入铸轧机数据
     */
    @Scheduled(fixedRate = 20000)
    public R<ValueRange> addwarndata(){
        Avaluate avaluate = new Avaluate();
        ValueRange valueRange = new ValueRange();
        LambdaQueryWrapper<Avaluate> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(avaluate);
        avaluateService.list(queryWrapper).forEach(i ->{
            switch (i.getName()){
                case "上辊电机电流":
                    valueRange.setShangDD(i.getMaxValue());
                    valueRange.setShangDD1(i.getMinValue());
                    break;
                case "下辊电机电流" :
                    valueRange.setXiaDD(i.getMaxValue());
                    valueRange.setXiaDD1(i.getMinValue());
                    break;
                case "上辊电机速度":
                    valueRange.setShangDS(i.getMaxValue());
                    valueRange.setShangDS1(i.getMinValue());
                    break;
                case "下辊电机速度":
                    valueRange.setXiaDS(i.getMaxValue());
                    valueRange.setXiaDS1(i.getMinValue());
                    break;
                case "主水泵电机电流" :
                    valueRange.setZhuDD(i.getMaxValue());
                    valueRange.setZhuDD1(i.getMinValue());
                    break;
                case "备用水泵电机电流" :
                    valueRange.setBeiDD(i.getMaxValue());
                    valueRange.setBeiDD1(i.getMinValue());
                    break;
                case "卷取电机电流" :
                    valueRange.setJuanDD(i.getMaxValue());
                    valueRange.setJuanDD1(i.getMinValue());
                    break;
                case "卷取电机速度" :
                    valueRange.setJuanDS(i.getMaxValue());
                    valueRange.setJuanDS1(i.getMinValue());
                    break;
                case "上辊水压" :
                    valueRange.setShangSY(i.getMaxValue());
                    valueRange.setShangSY1(i.getMinValue());
                    break;
                case "下辊水压" :
                    valueRange.setXiaSY(i.getMaxValue());
                    valueRange.setXiaSY1(i.getMinValue());
                    break;
                case "上辊水温" :
                    valueRange.setShangSW(i.getMaxValue());
                    valueRange.setShangSW1(i.getMinValue());
                    break;
                case "下辊水温" :
                    valueRange.setXiaSW(i.getMaxValue());
                    valueRange.setXiaSW1(i.getMinValue());
                    break;
                case "上辊流量" :
                    valueRange.setShangLL(i.getMaxValue());
                    valueRange.setShangLL1(i.getMinValue());
                    break;
                case "下辊流量" :
                    valueRange.setXiaLL(i.getMaxValue());
                    valueRange.setXiaLL1(i.getMinValue());
                    break;
                case "操作侧预载力" :
                    valueRange.setCaoZuoY(i.getMaxValue());
                    valueRange.setCaoZuoY1(i.getMinValue());
                    break;
                case "传动侧预载力" :
                    valueRange.setDsDongY(i.getMaxValue());
                    valueRange.setDsDongY1(i.getMinValue());
                    break;

            }
        });
        WarnTable warnTable = new WarnTable();
        OneCastroll oneCastroll = new OneCastroll();
        LambdaQueryWrapper<OneCastroll> queryWrapperR = new LambdaQueryWrapper<>();
        queryWrapperR.setEntity(oneCastroll);
        List<OneCastroll> newlist = oneCastrollService.selectRollingNewData();
        newlist.forEach(i->{
            //  valueRange.setZhuDD(i.getMaxValue());
            //     valueRange.setZhuDD1(i.getMinValue());
            if(i.getPumpA()>valueRange.getZhuDD() || i.getPumpA()<valueRange.getZhuDD1()){
                warnTable.setRollingName("主水泵电机电流");
                warnTable.setRollingValue(i.getPumpA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }


            if(i.getUpRollMontorA()>valueRange.getShangDD() || i.getUpRollMontorA()<valueRange.getShangDD1()){
                warnTable.setRollingName("上辊电机电流");
                warnTable.setRollingValue(i.getUpRollMontorA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollMontorA()>valueRange.getXiaDD() || i.getDownRollMontorA()<valueRange.getXiaDD1()){
                warnTable.setRollingName("下辊电机电流");
                warnTable.setRollingValue(i.getDownRollMontorA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }

            if(i.getRollA()>valueRange.getJuanDD() || i.getRollA()<valueRange.getJuanDD1()){
                warnTable.setRollingName("卷取电机电流");
                warnTable.setRollingValue(i.getRollA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }


            if(i.getUpRollWaterFn()>valueRange.getShangSY()|| i.getUpRollWaterFn()<valueRange.getShangSY1()){
                warnTable.setRollingName("上辊水压");
                warnTable.setRollingValue(i.getUpRollWaterFn());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getUpRollWaterT()>valueRange.getShangSW() || i.getUpRollWaterT()<valueRange.getShangSW1() ){
                warnTable.setRollingName("上辊水温");
                warnTable.setRollingValue(i.getUpRollWaterT());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getUpRollFlow()>valueRange.getShangLL() || i.getUpRollFlow()<valueRange.getShangLL1()){
                warnTable.setRollingName("上辊流量");
                warnTable.setRollingValue(i.getUpRollFlow());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollMontorA()>valueRange.getXiaSY() || i.getDownRollMontorA()<valueRange.getXiaSY1()){
                warnTable.setRollingName("下辊水压");
                warnTable.setRollingValue(i.getDownRollMontorA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollWaterT()>valueRange.getXiaSW() || i.getDownRollWaterT()<valueRange.getXiaSW1()){
                warnTable.setRollingName("下辊水温");
                warnTable.setRollingValue(i.getDownRollWaterT());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollFlow()>valueRange.getXiaLL() || i.getDownRollFlow()<valueRange.getXiaLL1()){
                warnTable.setRollingName("下辊流量");
                warnTable.setRollingValue(i.getDownRollFlow());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getOperationPreloadForce()>valueRange.getCaoZuoY() || i.getOperationPreloadForce()<valueRange.getCaoZuoY1()){
                warnTable.setRollingName("操作侧预载力");
                warnTable.setRollingValue(i.getOperationPreloadForce());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }
            if(i.getTransPreloadForce()>valueRange.getDsDongY() || i.getTransPreloadForce()<valueRange.getDsDongY1()){
                warnTable.setRollingName("传动侧预载力");
                warnTable.setRollingValue(i.getTransPreloadForce());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("设备参数");
                warnTableService.save(warnTable);
            }

            if(i.getUpRollMontorLineV()>valueRange.getShangDS() || i.getUpRollMontorLineV()<valueRange.getShangDS1() ){
                warnTable.setRollingName("上辊电机速度");
                warnTable.setRollingValue(i.getUpRollMontorLineV());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("工艺参数");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollMontorLineV()>valueRange.getXiaDS() || i.getUpRollMontorLineV()<valueRange.getShangDS1()){
                warnTable.setRollingName("下辊电机速度");
                warnTable.setRollingValue(i.getDownRollMontorLineV());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("工艺参数");
                warnTableService.save(warnTable);
            }
            if(i.getRollV()>valueRange.getJuanDS() || i.getRollV()<valueRange.getJuanDS1()){
                warnTable.setRollingName("卷取电机速度");
                warnTable.setRollingValue(i.getRollA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机1#");
                warnTable.setPara("工艺参数");
                warnTableService.save(warnTable);
            }
        });
        return  R.success(valueRange);
    }
}
