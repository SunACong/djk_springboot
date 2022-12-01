package com.szj.djk;


import com.szj.djk.service.PeriodComputeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PeriodComputeTest {

    @Autowired
    private PeriodComputeService periodComputeService;

    /**
     * 查询平均时间测试
     * @return
     */
    @Test
    public void test(){
        List<Map<String, Object>> maps = periodComputeService.selectAVGTimeList();
        System.out.println(maps);
    }
}
