package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.ThreeCastroll;
import com.szj.djk.entity.ThreeCastroll;
import com.szj.djk.entity.WarnTable;
import com.szj.djk.mapper.ThreeCastrollMapper;
import com.szj.djk.service.ThreeCastrollService;
import com.szj.djk.mapper.ThreeCastrollMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
* @author Administrator
* @description 针对表【three_castroll】的数据库操作Service实现
* @createDate 2023-03-04 16:55:12
*/
@Service
public class ThreeCastrollServiceImpl extends ServiceImpl<ThreeCastrollMapper, ThreeCastroll> implements ThreeCastrollService{
    @Autowired
    private ThreeCastrollMapper threeCastrollMapper;
    @Override
    public List<ThreeCastroll> selectRollingNewData() {
        return threeCastrollMapper.selectRollingNewData();
    }

    @Override
    public List<WarnTable> selectSpecial(LocalDateTime before, LocalDateTime after, String rollingName) {
        List<ThreeCastroll> threeCastrolls = threeCastrollMapper.selectSpecial(before, after);
//        System.out.println("这是拿到的special数据"+threeCastrolls);
        ArrayList<WarnTable> warnTables = new ArrayList<>();
        threeCastrolls.forEach(item ->{
            WarnTable warnTable = new WarnTable();
            switch (rollingName){
                case "上辊电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getUpRollMontorA());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "下辊电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollMontorA());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "主水泵电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollMontorA());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                case "备用水泵电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollMontorA());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "卷取电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getRollA());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "上辊水压":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getUpRollWaterFn());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "下辊水压":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollWaterFn());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "上辊水温":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getUpRollWaterT());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "下辊水温":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollWaterT());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "上辊流量":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getUpRollFlow());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "下辊流量":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollFlow());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "操作侧预载力":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getOperationPreloadForce());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "传动侧预载力":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getTransPreloadForce());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "上辊电机速度":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getUpRollMontorLineV());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "下辊电机速度":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollMontorLineV());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
                case "卷取电机速度":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getRollV());
                    warnTable.setRollingProduceTime(item.getTs());
                    warnTables.add(warnTable);
                    break;
            }
        });
//        System.out.println("这是警告数据"+WarnTables);
        return warnTables;
    }
}




