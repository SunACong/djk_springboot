package com.szj.djk;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.szj.djk.service.PlanAndInspectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author 孙少聪
 * @Date 2023/3/14 21:46:46
 * @Description PlanAndInspect测试类
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlanAndInspectTest {

    @Resource
    private PlanAndInspectService planAndInspectService;

    @Test
    public void test(){
        DynamicDataSourceContextHolder.push("slave");
        String ts = planAndInspectService.getRecentTs();
        System.out.println(ts);
    }
}
