package com.szj.djk.timedTask;

import com.szj.djk.controller.RewinderController;
import com.szj.djk.entity.OneCastroll;
import com.szj.djk.entity.Rewinder;
import com.szj.djk.entity.RollingMachine;
import com.szj.djk.service.OneCastrollService;
import com.szj.djk.service.RewinderService;
import com.szj.djk.service.RollingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

/**
 * @ClassName ScheduledTask
 * @Author 张高义
 * @Create 2022/11/8 0008 下午 14:53
 */
//@Component
public class ScheduledTask {
    @Autowired
    private RewinderService rewinderService;
    @Autowired
    private OneCastrollService oneCastrollService;

    @Autowired
    private RollingMachineService rollingMachineService;

    /**
     * 模拟1号铸轧机随机数定时插入数据
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void addRollingMachine1(){
        OneCastroll oneCastroll = new OneCastroll();
        Date date = new Date();
        oneCastroll.setTs(date);
        int shangDD = (int) (Math.random() * (80-30)+30);//70
        oneCastroll.setUpRollMontorA(shangDD);
        int xiaDD = (int) (Math.random() * (80-30)+30);//70
        oneCastroll.setDownRollMontorA(xiaDD);
        int shangDS = (int) (Math.random() * (730-500)+500);//700
        oneCastroll.setUpRollMontorLineV(shangDS);
        int xiaDS = (int) (Math.random() * (750-300)+300);//700
        oneCastroll.setDownRollMontorLineV(xiaDS);
        int shuiDL = (int) (Math.random() * (80-20)+20);//70
        oneCastroll.setPumpA(shuiDL);
        int pumpF = (int) (Math.random() * (50-20)+20);//45
        oneCastroll.setPumpF(pumpF);
        int rollA = (int) (Math.random() * (55-20)+20);//50
        oneCastroll.setRollA(rollA);
        int rollV = (int) (Math.random() * (450-200)+200);//400
        oneCastroll.setRollV(rollV);
        int inWaterT = (int) (Math.random() * (45-10)+10);//40
        oneCastroll.setInWaterT(inWaterT);
        int inWaterFn= (int) (Math.random() * (60-20)+20);//50
        oneCastroll.setInWaterFn(inWaterFn);
        int upRollWaterFn = (int) (Math.random() * (80-20)+20);//70
        oneCastroll.setUpRollWaterFn(upRollWaterFn);
        int upRollWaterT = (int) (Math.random() * (70-20)+20);//60
        oneCastroll.setUpRollWaterT(upRollWaterT);
        int upRollFlow = (int) (Math.random() * (3300-500)+500);//500-3000
        oneCastroll.setUpRollFlow(upRollFlow);
        int downRollWaterFn = (int) (Math.random() * (80-20)+20);//70
        oneCastroll.setDownRollWaterFn(downRollWaterFn);
        int downRollWaterT = (int) (Math.random() * (70-20)+20);//60
        oneCastroll.setDownRollWaterT(downRollWaterT);
        int downRollFlow = (int) (Math.random() * (3300-500)+500);//500-3000
        oneCastroll.setDownRollFlow(downRollFlow);
        int operationPreload = (int) (Math.random() * (900-300)+300);//850
        oneCastroll.setOperationPreloadForce(operationPreload);
        int transPreload = (int) (Math.random() * (900-300)+300);//850
        oneCastroll.setTransPreloadForce(transPreload);
        int rollTension = (int) (Math.random() * (90-70)+70);//85
        oneCastroll.setRollTension(rollTension);
        int rollDiameter = (int) (Math.random() * (1300-850)+850);//1200
        oneCastroll.setRollDiameter(rollDiameter);
        int tiWireSpeed = (int) (Math.random() * (190-130)+130);//170
        oneCastroll.setTiWireSpeed(tiWireSpeed);
        int withMaterial = (int) (Math.random() * (830-600)+600);//800
        oneCastroll.setWithMaterialSpeed(withMaterial);
        LocalDateTime dateTime = LocalDateTime.now();
        oneCastroll.setCreateTime(dateTime);
        oneCastrollService.save(oneCastroll);
        System.out.println("插入成功");

    }

    /**
    * 模拟重卷机随机数定时插入数据库
    * */
//   @Scheduled(cron = "0/2 * * * * ?")
//   public void addKaiZhang(){
//       Rewinder rewinder = new Rewinder();
//       rewinder.setIndicatorName("卷取张力");
//       Date date = new Date();
//       SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//       rewinder.setProduceTime(date);
//       rewinder.setDeviceId(1L);
//       int value = (int) (Math.random() * (630-10)+10);
//       rewinder.setValue(value);
//       rewinderService.save(rewinder);
//   }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addKaiCe(){
//        Rewinder rewinder = new Rewinder();
//        rewinder.setIndicatorName("卷取侧卷径");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rewinder.setProduceTime(date);
//        rewinder.setDeviceId(1L);
//        int value = (int) (Math.random() * (630-10)+10);
//        rewinder.setValue(value);
//        rewinderService.save(rewinder);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addKaiZhong(){
//        Rewinder rewinder = new Rewinder();
//        rewinder.setIndicatorName("卷取侧重量");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rewinder.setProduceTime(date);
//        rewinder.setDeviceId(1L);
//        int value = (int) (Math.random() * (630-10)+10);
//        rewinder.setValue(value);
//        rewinderService.save(rewinder);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addKaiChang(){
//        Rewinder rewinder = new Rewinder();
//        rewinder.setIndicatorName("带材长度");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rewinder.setProduceTime(date);
//        rewinder.setDeviceId(1L);
//        int value = (int) (Math.random() * (630-10)+10);
//        rewinder.setValue(value);
//        rewinderService.save(rewinder);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addKaiSu(){
//        Rewinder rewinder = new Rewinder();
//        rewinder.setIndicatorName("剪切速度");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rewinder.setProduceTime(date);
//        rewinder.setDeviceId(1L);
//        int value = (int) (Math.random() * (630-10)+10);
//        rewinder.setValue(value);
//        rewinderService.save(rewinder);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addKaiQu(){
//        Rewinder rewinder = new Rewinder();
//        rewinder.setIndicatorName("张力曲线");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rewinder.setProduceTime(date);
//        rewinder.setDeviceId(1L);
//        int value = (int) (Math.random() * (630-10)+10);
//        rewinder.setValue(value);
//        rewinderService.save(rewinder);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addKaiSuD(){
//        Rewinder rewinder = new Rewinder();
//        rewinder.setIndicatorName("速度曲线");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rewinder.setProduceTime(date);
//        rewinder.setDeviceId(1L);
//        int value = (int) (Math.random() * (630-10)+10);
//        rewinder.setValue(value);
//        rewinderService.save(rewinder);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addKaiSpeed(){
//        Rewinder rewinder = new Rewinder();
//        rewinder.setIndicatorName("开卷机速度");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rewinder.setProduceTime(date);
//        rewinder.setDeviceId(1L);
//        int value = (int) (Math.random() * (260-10)+10);
//        rewinder.setValue(value);
//        rewinderService.save(rewinder);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addKaiA(){
//        Rewinder a = new Rewinder();
//        a.setIndicatorName("开卷机电流");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
////        System.out.println(dateFormat.format(date));
//        a.setProduceTime(date);
//        a.setDeviceId(1L);
//        int value = (int) (Math.random() * (830-100)+100);
//        a.setValue(value);
//        rewinderService.save(a);
////        System.out.println(a);
//
//    }
//
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addJuanSpeed(){
//        Rewinder c = new Rewinder();
//        c.setIndicatorName("卷取机速度");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
////        System.out.println(dateFormat.format(date));
//        c.setProduceTime(date);
//        c.setDeviceId(1L);
//        int value = (int) (Math.random() * (260-10)+10);
//        c.setValue(value);
//        rewinderService.save(c);
////        System.out.println(c);
//
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addJuanA(){
//        Rewinder c = new Rewinder();
//        c.setIndicatorName("卷取机电流");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
////        System.out.println(dateFormat.format(date));
//        c.setProduceTime(date);
//        c.setDeviceId(1L);
//        int value = (int) (Math.random() * (950-200)+200);
//        c.setValue(value);
//        rewinderService.save(c);
////        System.out.println(c);
//
//    }
//
//    /**
//     * 模拟铸轧机随机数定时插入数据库
//     * */
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addSA(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("上辊电机电流");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (85-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addSSD(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("上辊电机速度");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (300-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addXA(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("下辊电机电流");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (85-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }
//
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addXSD(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("下辊电机速度");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (380-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//    }
//
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addZA(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("主水泵电机电流");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (95-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addZSD(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("主水泵电机速度");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (550-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addBA(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("备用水泵电机电流");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (95-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addBSD(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("备用水泵电机速度");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (230-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//    }
//
//
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addJD(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("卷取电机电流");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (60-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addJSD(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("卷取电机速度");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (430-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addSS(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("上辊水压");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (85-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }
//
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addXS(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("下辊水压");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (80-1)+1);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addSW(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("上辊水温");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (65-8)+8);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }
//
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addXW(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("下辊水温");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (65-8)+8);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addSL(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("上辊流量");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (3500-1000)+1000);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }
//
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addXL(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("下辊流量");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (3500-1000)+1000);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addCY(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("操作侧预载力");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (890-300)+300);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }
//    @Scheduled(cron = "0/2 * * * * ?")
//    public void addCL(){
//        RollingMachine rollingMachine = new RollingMachine();
//        rollingMachine.setRollingName("传动侧预载力");
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        rollingMachine.setRollingProduceTime(date);
//        rollingMachine.setRollingDeviceId(1L);
//        int value = (int) (Math.random() * (890-300)+300);
//        rollingMachine.setRollingValue(value);
//        rollingMachineService.save(rollingMachine);
//
//    }

}
