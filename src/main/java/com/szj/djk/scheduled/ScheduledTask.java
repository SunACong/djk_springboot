package com.szj.djk.scheduled;

import com.szj.djk.entity.Rewinder;
import com.szj.djk.entity.RollingMachine;
import com.szj.djk.service.RewinderService;
import com.szj.djk.service.RollingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
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
    private RollingMachineService rollingMachineService;
   /**
    * 模拟重卷机随机数定时插入数据库
    * */
    @Scheduled(cron = "0/2 * * * * ?")
    public void addKaiSpeed(){
        Rewinder rewinder = new Rewinder();
        rewinder.setIndicatorName("开卷机速度");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(dateFormat.format(date));
        rewinder.setProduceTime(date);
        rewinder.setDeviceId(1L);
        int value = (int) (Math.random() * (260-10)+10);
        rewinder.setValue(value);
        rewinderService.save(rewinder);
//        System.out.println(rewinder);

    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void addKaiA(){
        Rewinder a = new Rewinder();
        a.setIndicatorName("开卷机电流");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(dateFormat.format(date));
        a.setProduceTime(date);
        a.setDeviceId(1L);
        int value = (int) (Math.random() * (830-100)+100);
        a.setValue(value);
        rewinderService.save(a);
//        System.out.println(a);

    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void addJuanSpeed(){
        Rewinder c = new Rewinder();
        c.setIndicatorName("卷取机速度");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(dateFormat.format(date));
        c.setProduceTime(date);
        c.setDeviceId(1L);
        int value = (int) (Math.random() * (260-10)+10);
        c.setValue(value);
        rewinderService.save(c);
//        System.out.println(c);

    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void addJuanA(){
        Rewinder c = new Rewinder();
        c.setIndicatorName("卷取机电流");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(dateFormat.format(date));
        c.setProduceTime(date);
        c.setDeviceId(1L);
        int value = (int) (Math.random() * (950-200)+200);
        c.setValue(value);
        rewinderService.save(c);
//        System.out.println(c);

    }

    /**
     * 模拟铸轧机随机数定时插入数据库
     * */
    @Scheduled(cron = "0/2 * * * * ?")
    public void addSA(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("上辊电机电流");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (85-1)+1);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);
    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void addXA(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("下辊电机电流");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (85-1)+1);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);

    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void addZA(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("主水泵电机电流");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (95-1)+1);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);
    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void addBA(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("备用水泵电机电流");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (95-1)+1);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);
    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void addJD(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("卷取电机电流");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (60-1)+1);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);

    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void addSS(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("上辊水压");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (85-1)+1);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);

    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void addXS(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("下辊水压");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (80-1)+1);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);
    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void addSW(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("上辊水温");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (65-8)+8);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);

    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void addXW(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("下辊水温");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (65-8)+8);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);

    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void addSL(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("上辊流量");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (3500-1000)+1000);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);

    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void addXL(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("下辊流量");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (3500-1000)+1000);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);

    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void addCY(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("操作侧预载力");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (890-300)+300);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);

    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void addCL(){
        RollingMachine rollingMachine = new RollingMachine();
        rollingMachine.setRollingName("传动侧预载力");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        rollingMachine.setRollingProduceTime(date);
        rollingMachine.setRollingDeviceId(2L);
        int value = (int) (Math.random() * (890-300)+300);
        rollingMachine.setRollingValue(value);
        rollingMachineService.save(rollingMachine);

    }

}
