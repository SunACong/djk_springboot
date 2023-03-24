package com.szj.djk.controller;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.*;
import com.szj.djk.mapper.WarnTableMapper;
import com.szj.djk.service.AvaluateService;
import com.szj.djk.service.TwoCastrollService;
import com.szj.djk.service.WarnTableService;
import com.szj.djk.mapper.WarnTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;


/**
 * @ClassName TwoCastrollController
 * @Author 张高义,he
 * @Create 2022/10/21 0021 上午 11:03
 */
@Component
@RestController
@RequestMapping("/twoCastroll")
public class TwoCastrollController {
    @Autowired
    private  TwoCastrollService twoCastrollService;

    @Autowired
    private AvaluateService avaluateService;
    @Autowired
    private WarnTableMapper warnTableMapper;
    @Autowired
    private WarnTableService warnTableService;

    /**
     * 查询铸轧机最新数据
     */
    @GetMapping("/listNewData")
    public R<List<TwoCastroll>> ListNewData(){
        List<TwoCastroll> rollingMachines = twoCastrollService.selectRollingNewData();
        return  R.success(rollingMachines);
    }
    /**
     * 查询铸轧机特定时间前后的警告数据
     */
    @GetMapping("listSpecial")
    public R<List<WarnTable>> listSpecial(TwoCastroll twoCastroll, String rollingName)  {
        int amount = 10000;
        LocalDateTime createTime = twoCastroll.getCreateTime();
        long beforeTime = Timestamp.valueOf(createTime).getTime()-amount;
        long afterTime = Timestamp.valueOf(createTime).getTime()+amount;
        LocalDateTime before = new Date(beforeTime).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
        LocalDateTime after = new Date(afterTime).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
        List<WarnTable> specialList = twoCastrollService.selectSpecial(before,after,rollingName);
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
                    break;
                case "下辊电机电流" :
                    valueRange.setXiaDD(i.getMaxValue());
                    break;
                case "上辊电机速度":
                    valueRange.setShangDS(i.getMaxValue());
                    break;
                case "下辊电机速度":
                    valueRange.setXiaDS(i.getMaxValue());
                    break;
                case "主水泵电机电流" :
                    valueRange.setZhuDD(i.getMaxValue());
                    break;
                case "备用水泵电机电流" :
                    valueRange.setBeiDD(i.getMaxValue());
                    break;
                case "卷取电机电流" :
                    valueRange.setJuanDD(i.getMaxValue());
                    break;
                case "卷取电机速度" :
                    valueRange.setJuanDS(i.getMaxValue());
                    break;
                case "上辊水压" :
                    valueRange.setShangSY(i.getMaxValue());
                    break;
                case "下辊水压" :
                    valueRange.setXiaSY(i.getMaxValue());
                    break;
                case "上辊水温" :
                    valueRange.setShangSW(i.getMaxValue());
                    break;
                case "下辊水温" :
                    valueRange.setXiaSW(i.getMaxValue());
                    break;
                case "上辊流量" :
                    valueRange.setShangLL(i.getMaxValue());
                    break;
                case "下辊流量" :
                    valueRange.setXiaLL(i.getMaxValue());
                    break;
                case "操作侧预载力" :
                    valueRange.setCaoZuoY(i.getMaxValue());
                    break;
                case "传动侧预载力" :
                    valueRange.setDsDongY(i.getMaxValue());
                    break;
            }
        });
        WarnTable warnTable = new WarnTable();
        TwoCastroll twoCastroll = new TwoCastroll();
        LambdaQueryWrapper<TwoCastroll> queryWrapperR = new LambdaQueryWrapper<>();
        queryWrapperR.setEntity(twoCastroll);
        List<TwoCastroll> newlist = twoCastrollService.selectRollingNewData();
        newlist.forEach(i->{
            if(i.getUpRollMontorA()>valueRange.getShangDD()){
                warnTable.setRollingName("上辊电机电流");
                warnTable.setRollingValue(i.getUpRollMontorA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollMontorA()>valueRange.getXiaDD()){
                warnTable.setRollingName("下辊电机电流");
                warnTable.setRollingValue(i.getDownRollMontorA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getRollA()>valueRange.getJuanDD()){
                warnTable.setRollingName("卷取电机电流");
                warnTable.setRollingValue(i.getRollA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getUpRollWaterFn()>valueRange.getShangSY()){
                warnTable.setRollingName("上辊水压");
                warnTable.setRollingValue(i.getUpRollWaterFn());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getUpRollWaterT()>valueRange.getShangSW()){
                warnTable.setRollingName("上辊水温");
                warnTable.setRollingValue(i.getUpRollWaterT());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getUpRollFlow()>valueRange.getShangLL()){
                warnTable.setRollingName("上辊流量");
                warnTable.setRollingValue(i.getUpRollFlow());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollMontorA()>valueRange.getXiaSY()){
                warnTable.setRollingName("下辊水压");
                warnTable.setRollingValue(i.getDownRollMontorA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollWaterT()>valueRange.getXiaSW()){
                warnTable.setRollingName("下辊水温");
                warnTable.setRollingValue(i.getDownRollWaterT());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollFlow()>valueRange.getXiaLL()){
                warnTable.setRollingName("下辊流量");
                warnTable.setRollingValue(i.getDownRollFlow());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getOperationPreloadForce()>valueRange.getCaoZuoY()){
                warnTable.setRollingName("操作侧预测力");
                warnTable.setRollingValue(i.getOperationPreloadForce());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getTransPreloadForce()>valueRange.getDsDongY()){
                warnTable.setRollingName("传动侧预测力");
                warnTable.setRollingValue(i.getTransPreloadForce());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }

            if(i.getUpRollMontorLineV()>valueRange.getShangDS()){
                warnTable.setRollingName("上辊电机速度");
                warnTable.setRollingValue(i.getUpRollMontorLineV());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getDownRollMontorLineV()>valueRange.getXiaDS()){
                warnTable.setRollingName("下辊电机速度");
                warnTable.setRollingValue(i.getDownRollMontorLineV());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
            if(i.getRollV()>valueRange.getJuanDS()){
                warnTable.setRollingName("卷取电机速度");
                warnTable.setRollingValue(i.getRollA());
                warnTable.setRollingProduceTime(i.getTs());
                warnTable.setRollingDeviceNumber("铸轧机2#");
                warnTableService.save(warnTable);
            }
        });
        return  R.success(valueRange);
    }
}
