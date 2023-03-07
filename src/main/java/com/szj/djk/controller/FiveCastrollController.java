package com.szj.djk.controller;
import com.szj.djk.common.R;
import com.szj.djk.entity.FiveCastroll;
import com.szj.djk.entity.WarnTable;
import com.szj.djk.service.FiveCastrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

/**
 * @ClassName FiveCastrollController
 * @Author 张高义
 * @Create 2022/10/21 0021 上午 11:03
 */
@RestController
@RequestMapping("/fiveCastroll")
public class FiveCastrollController {
    @Autowired
    private  FiveCastrollService fiveCastrollService;

    /**
     * 查询铸轧机最新数据
     */
    @GetMapping("/listNewData")
    public R<List<FiveCastroll>> ListNewData(){
        List<FiveCastroll> rollingMachines = fiveCastrollService.selectRollingNewData();
//        System.out.println("这是铸轧机最新数据"+rollingMachines);
        return  R.success(rollingMachines);
    }
    /**
     * 查询铸轧机特定时间前后的警告数据
     */
    @GetMapping("listSpecial")
    public R<List<WarnTable>> listSpecial(FiveCastroll fiveCastroll, String rollingName)  {
        int amount = 10000;
        LocalDateTime createTime = fiveCastroll.getCreateTime();
        long beforeTime = Timestamp.valueOf(createTime).getTime()-amount;
        long afterTime = Timestamp.valueOf(createTime).getTime()+amount;
        LocalDateTime before = new Date(beforeTime).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
        LocalDateTime after = new Date(afterTime).toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
        List<WarnTable> specialList = fiveCastrollService.selectSpecial(before,after,rollingName);

        return R.success(specialList);
    }

}
