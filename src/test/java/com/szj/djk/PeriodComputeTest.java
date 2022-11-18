package com.szj.djk;

import com.szj.djk.entity.PeriodCompute;
import com.szj.djk.service.PeriodComputeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName PeriodComputeTest
 * @Authoc 孙少聪
 * @Date 2022/11/14 10:34:48
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class PeriodComputeTest {

    @Autowired
    private PeriodComputeService periodComputeService;

    @Test
    public void autoAddTest(){
        List<PeriodCompute> list = periodComputeService.autoAdd("2022-02-05");
        System.out.println(list);
    }
}
