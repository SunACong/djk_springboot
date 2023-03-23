package com.szj.djk;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.szj.djk.entity.*;
import com.szj.djk.mapper.*;
import com.szj.djk.service.AvaluateService;
import com.szj.djk.service.FiveCastrollService;
import com.szj.djk.service.RollingMachineService;
import com.szj.djk.service.WarnTableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName RollingMachineTest
 * @Author 张高义
 * @Create 2023/2/22 0022 下午 15:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RollingMachineTest {
    @Autowired
    private RollingMachineMapper rollingMachineMapper;
    @Autowired
    private RollingMachineService rollingMachineService;
    @Autowired
    private AvaluateService avaluateService;
    @Autowired
    private AvaluateMapper avaluateMapper;
    @Autowired
    private WarnTableService warnTableService;
    @Autowired
    private WarnTableMapper warnTableMapper;
    @Autowired
    private FiveCastrollService fiveCastrollService;
    @Autowired
    private FiveCastrollMapper fiveCastrollMapper;

    @Test
    public void selectFiveList(){
        List<FiveCastroll> fiveCastrolls = fiveCastrollMapper.selectRollingNewData();
        System.out.println("获取到的铸轧机数据"+fiveCastrolls);

    }
    @Test
    public void selectDataList(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("上辊电机电流");
        List<RollingMachine> rollingMachines = rollingMachineMapper.selectrollingMachineTen(rollingMachine);
        System.out.println("这是铸扎机数据");
        System.out.println(rollingMachines);

    }
    @Test
    public void saveRollingData() throws ParseException {
        /**
         * 主水泵电机速度 446	2023-02-10 13:27:28	5*/
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("主水泵电机速度");
        rollingMachine.setRollingValue(446);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date rollingProduceTime = sdf.parse("2023-02-10 13:27:28");
        rollingMachine.setRollingProduceTime(rollingProduceTime);
        rollingMachine.setRollingDeviceId(5L);
        rollingMachineService.saveData(rollingMachine);
//        rollingMachineMapper.insert(rollingMachine);


    }
    @Test
    public void selectRollingData(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("下辊电机电流");
        List<RollingMachine> rollingMachines = rollingMachineService.selectRollingMachineTen(rollingMachine);
        System.out.println("这是十条铸扎机数据");
        System.out.println(rollingMachines);
    }
//获取铸轧机报警记录并存入
    @Test
    public void saveWarnTableData(){
        WarnTable warnTable = new WarnTable();
        Avaluate avaluate = new Avaluate();
        ValueRange valueRange = new ValueRange();
        LambdaQueryWrapper<Avaluate> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(avaluate);
        avaluateService.list(queryWrapper).forEach(item ->{
            switch (item.getName()){
                case "上辊电机电流":
                    valueRange.setShangDD(item.getMaxValue());
                    break;
                case "下辊电机电流" :
                    valueRange.setXiaDD(item.getMaxValue());
                    break;
                case "上辊电机速度":
                    valueRange.setShangDS(item.getMaxValue());
                    break;
                case "下辊电机速度":
                    valueRange.setXiaDS(item.getMaxValue());
                    break;
                case "主水泵电机电流" :
                    valueRange.setZhuDD(item.getMaxValue());
                    break;
                case "备用水泵电机电流" :
                    valueRange.setBeiDD(item.getMaxValue());
                    break;
                case "卷取电机电流" :
                    valueRange.setJuanDD(item.getMaxValue());
                    break;
                case "卷取电机速度" :
                    valueRange.setJuanDS(item.getMaxValue());
                    break;
                case "上辊水压" :
                    valueRange.setShangSY(item.getMaxValue());
                    break;
                case "下辊水压" :
                    valueRange.setXiaSY(item.getMaxValue());
                    break;
                case "上辊水温" :
                    valueRange.setShangSW(item.getMaxValue());
                    break;
                case "下辊水温" :
                    valueRange.setXiaSW(item.getMaxValue());
                    break;
                case "上辊流量" :
                    valueRange.setShangLL(item.getMaxValue());
                    break;
                case "下辊流量" :
                    valueRange.setXiaLL(item.getMaxValue());
                    break;
                case "操作侧预载力" :
                    valueRange.setCaoZuoY(item.getMaxValue());
                    break;
                case "传动侧预载力" :
                    valueRange.setDsDongY(item.getMaxValue());
                    break;

            }
        });
        System.out.println("阈值数据"+valueRange);

        FiveCastroll fiveCastroll = new FiveCastroll();
        LambdaQueryWrapper<FiveCastroll> queryWrapperR = new LambdaQueryWrapper<>();
        queryWrapperR.setEntity(fiveCastroll);
        fiveCastrollService.list(queryWrapperR).forEach(item->{
            System.out.println(item);
            if(item.getUpRollMontorA()>valueRange.getShangDD()){
                warnTable.setRollingName("上辊电机电流");
                warnTable.setRollingValue(item.getUpRollMontorA());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getUpRollMontorLineV()>valueRange.getShangDS()){
                warnTable.setRollingName("上辊电机速度");
                warnTable.setRollingValue(item.getUpRollMontorLineV());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getDownRollMontorA()>valueRange.getXiaDD()){
                warnTable.setRollingName("下辊电机电流");
                warnTable.setRollingValue(item.getDownRollMontorA());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getDownRollMontorLineV()>valueRange.getXiaDS()){
                warnTable.setRollingName("下辊电机速度");
                warnTable.setRollingValue(item.getDownRollMontorLineV());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getRollA()>valueRange.getJuanDD()){
                warnTable.setRollingName("卷取电机电流");
                warnTable.setRollingValue(item.getRollA());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getRollV()>valueRange.getJuanDS()){
                warnTable.setRollingName("卷取电机速度");
                warnTable.setRollingValue(item.getRollV());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getUpRollWaterFn()>valueRange.getShangSY()){
                warnTable.setRollingName("上辊水压");
                warnTable.setRollingValue(item.getUpRollWaterFn());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getUpRollWaterT()>valueRange.getShangSW()){
                warnTable.setRollingName("上辊水温");
                warnTable.setRollingValue(item.getUpRollWaterT());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getUpRollFlow()>valueRange.getShangLL()){
                warnTable.setRollingName("上辊流量");
                warnTable.setRollingValue(item.getUpRollFlow());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getDownRollMontorA()>valueRange.getXiaSY()){
                warnTable.setRollingName("下辊水压");
                warnTable.setRollingValue(item.getDownRollMontorA());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getDownRollWaterT()>valueRange.getXiaSW()){
                warnTable.setRollingName("下辊水温");
                warnTable.setRollingValue(item.getDownRollWaterT());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getDownRollFlow()>valueRange.getXiaLL()){
                warnTable.setRollingName("下辊流量");
                warnTable.setRollingValue(item.getDownRollFlow());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getOperationPreloadForce()>valueRange.getCaoZuoY()){
                warnTable.setRollingName("操作侧预测力");
                warnTable.setRollingValue(item.getOperationPreloadForce());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
            if(item.getTransPreloadForce()>valueRange.getDsDongY()){
                warnTable.setRollingName("传动侧预测力");
                warnTable.setRollingValue(item.getTransPreloadForce());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTable.setRollingDeviceNumber("铸轧机5#");
                warnTableService.save(warnTable);
            }
        });
    }




    @Test
    public void selectFiveCastrollData(){
        WarnTable warnTable = new WarnTable();
        FiveCastroll fiveCastroll = new FiveCastroll();
        LambdaQueryWrapper<FiveCastroll> queryWrapperR = new LambdaQueryWrapper<>();
        queryWrapperR.setEntity(fiveCastroll);
        fiveCastrollService.list(queryWrapperR).forEach(item->{
            System.out.println(item);
            if(item.getUpRollMontorA()>60){
                warnTable.setRollingName("上辊电机电流");
                warnTable.setRollingValue(item.getUpRollMontorA());
                warnTable.setRollingProduceTime(item.getCreateTime());
                QueryWrapper<WarnTable> queryWrapper = new QueryWrapper<>();
                queryWrapper.select("rolling_name", "rolling_value","rolling_produce_time").eq("rolling_produce_time",item.getCreateTime()).eq("rolling_name","上辊电机电流").eq("rolling_value",item.getUpRollMontorA());
                List<WarnTable> warnTables = warnTableMapper.selectList(queryWrapper);
                if (warnTables.size()==0) {
                    warnTableService.save(warnTable);
                }else{
                    System.out.println("已存在数据");
                }
            }
            if(item.getDownRollMontorA()>60){
                warnTable.setRollingName("下辊电机电流");
                warnTable.setRollingValue(item.getDownRollMontorA());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
            if(item.getRollA()>60){
                warnTable.setRollingName("卷取电机电流");
                warnTable.setRollingValue(item.getRollA());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
            if(item.getUpRollWaterFn()>60){
                warnTable.setRollingName("上辊水压");
                warnTable.setRollingValue(item.getUpRollWaterFn());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
            if(item.getUpRollWaterT()>60){
                warnTable.setRollingName("上辊水温");
                warnTable.setRollingValue(item.getUpRollWaterT());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
            if(item.getUpRollFlow()>60){
                warnTable.setRollingName("上辊流量");
                warnTable.setRollingValue(item.getUpRollFlow());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
            if(item.getDownRollMontorA()>60){
                warnTable.setRollingName("下辊水压");
                warnTable.setRollingValue(item.getDownRollMontorA());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
            if(item.getDownRollWaterT()>60){
                warnTable.setRollingName("下辊水温");
                warnTable.setRollingValue(item.getDownRollWaterT());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
            if(item.getDownRollFlow()>60){
                warnTable.setRollingName("下辊流量");
                warnTable.setRollingValue(item.getDownRollFlow());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
            if(item.getOperationPreloadForce()>60){
                warnTable.setRollingName("操作侧预测力");
                warnTable.setRollingValue(item.getOperationPreloadForce());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
            if(item.getTransPreloadForce()>60){
                warnTable.setRollingName("传动侧预测力");
                warnTable.setRollingValue(item.getTransPreloadForce());
                warnTable.setRollingProduceTime(item.getCreateTime());
                warnTableService.save(warnTable);
            }
//            if(item.getDownRollMontorA()>60){
//                warnTable.setRollingName("主水泵电机电流");
//                warnTable.setRollingValue(item.getDownRollMontorA());
//                warnTable.setRollingProduceTime(item.getCreateTime());
//                warnTableService.save(warnTable);
//            }
//            if(item.getDownRollMontorA()>60){
//                warnTable.setRollingName("备用水泵电机电流");
//                warnTable.setRollingValue(item.getDownRollMontorA());
//                warnTable.setRollingProduceTime(item.getCreateTime());
//                warnTableService.save(warnTable);
//            }
        });

    }

    public FiveCastrollMapper getFiveCastrollMapper() {
        return fiveCastrollMapper;
    }

    public void setFiveCastrollMapper(FiveCastrollMapper fiveCastrollMapper) {
        this.fiveCastrollMapper = fiveCastrollMapper;
    }
}
