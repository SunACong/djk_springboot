package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.FourAnneaFur;
import com.szj.djk.entity.OneAnneaFur;
import com.szj.djk.entity.WarnTable;
import com.szj.djk.mapper.OneAnneaFurMapper;
import com.szj.djk.service.FourAnneaFurService;
import com.szj.djk.mapper.FourAnneaFurMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
* @author JIAJIA
* @description 针对表【four_annea_fur】的数据库操作Service实现
* @createDate 2023-03-23 17:16:01
*/
@Service
public class FourAnneaFurServiceImpl extends ServiceImpl<FourAnneaFurMapper, FourAnneaFur>
    implements FourAnneaFurService{
    @Autowired
    private FourAnneaFurMapper fourAnneaFurMapper;

    @Override
    public List<WarnTable> selectSpecial(LocalDateTime before, LocalDateTime after, String rollingName) {
        List<FourAnneaFur> fourAnneaFurs = fourAnneaFurMapper.selectSpecial(before,after);
        ArrayList<WarnTable> warnTables = new ArrayList<>();
        fourAnneaFurs.forEach(i ->{
            WarnTable warnTable = new WarnTable();
            switch (rollingName){
                case "炉冷却水":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getCoolWaterUpLimit());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }

            switch (rollingName){
                case "炉压缩空气":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getCompressedAirOneLowPressure());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }

            switch (rollingName){
                case "金属料温温度曲线":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getMeterialT());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }
            switch (rollingName){
                case "一区炉气温度曲线":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getZoneOneT());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }
            switch (rollingName){
                case "二区炉气温度曲线":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getZoneTwoT());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }
            switch (rollingName){
                case "三区炉气温度曲线":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getZoneThreeT());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }

            switch (rollingName){
                case "炉气设定温度":
                    warnTable.setRollingName(rollingName);
                    warnTable.setRollingValue(i.getSetT());
                    warnTable.setRollingProduceTime(i.getTs());
                    warnTables.add(warnTable);
                    break;
            }
        });
//        System.out.println("这是警告数据"+warnTables);
        return warnTables;
    }


}



