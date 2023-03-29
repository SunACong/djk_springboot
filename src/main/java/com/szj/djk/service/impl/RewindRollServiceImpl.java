package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.RewindRoll;
import com.szj.djk.entity.WarnTable;
import com.szj.djk.mapper.OneCastrollMapper;
import com.szj.djk.service.RewindRollService;
import com.szj.djk.mapper.RewindRollMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
* @author JIAJIA
* @description 针对表【rewind_roll】的数据库操作Service实现
* @createDate 2023-03-21 17:51:57
*/
@Service
public class RewindRollServiceImpl extends ServiceImpl<RewindRollMapper, RewindRoll>
    implements RewindRollService{
    @Autowired
    private RewindRollMapper rewindRollMapper;

    @Override
    public List<WarnTable> selectSpecial(LocalDateTime before, LocalDateTime after, String rollingName) {
        List<RewindRoll> rewindRolls = rewindRollMapper.selectSpecial(before,after);
        ArrayList<WarnTable> warnTables = new ArrayList<>();
        rewindRolls.forEach(i ->{
            WarnTable warnTable = new WarnTable();
            switch (rollingName){
                case "开卷机电流曲线":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getOpenRollA());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }

            switch (rollingName){
                case "卷取机电流曲线":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getRollWindA());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }

            switch (rollingName){
                case "机列速度":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getMachineColsV());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }
            switch (rollingName){
                case "卷取卷径":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getRollWindD());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }
            switch (rollingName){
                case "实际张力":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getActualTension());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }
            switch (rollingName){
                case "带材长度":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getStripL());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }
        });
        return warnTables;
    }

}




