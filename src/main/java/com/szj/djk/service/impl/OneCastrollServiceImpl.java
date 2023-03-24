package com.szj.djk.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.WarnTable;
import com.szj.djk.mapper.OneCastrollMapper;
import com.szj.djk.service.OneCastrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* @author 张高义
* @description 针对表【one_castroll】的数据库操作Service实现
* @createDate 2023-02-23 14:51:15
*/
@Service
public class OneCastrollServiceImpl extends ServiceImpl<OneCastrollMapper, OneCastroll> implements OneCastrollService {
    @Autowired
    private OneCastrollMapper oneCastrollMapper;
    @Override
    public List<OneCastroll> selectRollingNewData() {
        return oneCastrollMapper.selectRollingNewData();
    }

    @Override
    public List<WarnTable> selectSpecial(LocalDateTime before, LocalDateTime after,String rollingName) {
        List<OneCastroll> oneCastrolls = oneCastrollMapper.selectSpecial(before, after);
//        System.out.println("这是拿到的special数据"+oneCastrolls);
        ArrayList<WarnTable> warnTables = new ArrayList<>();
        oneCastrolls.forEach(item ->{
            WarnTable warnTable = new WarnTable();
            System.out.println("这是拿到的special数据"+item);
            switch (rollingName){
                case "上辊电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getUpRollMontorA());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    System.out.println("这是一条报警数据"+warnTable);
                    warnTables.add(warnTable);
                    System.out.println("这是拿到的列表"+warnTables);
                    break;
                case "下辊电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollMontorA());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "主水泵电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollMontorA());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                case "备用水泵电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollMontorA());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "卷取电机电流":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getRollA());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "上辊水压":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getUpRollWaterFn());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "下辊水压":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollWaterFn());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "上辊水温":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getUpRollWaterT());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "下辊水温":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollWaterT());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "上辊流量":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getUpRollFlow());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "下辊流量":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getDownRollFlow());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "操作侧预载力":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getOperationPreloadForce());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
                case "传动侧预载力":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(item.getTransPreloadForce());
                    warnTable.setRollingProduceTime(item.getCreateTime());
                    warnTables.add(warnTable);
                    break;
            }
        });
        System.out.println("这是警告数据"+warnTables);
        return warnTables;
    }


}
