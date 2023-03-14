package com.szj.djk;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.szj.djk.entity.LmdpQcColdInspect;
import com.szj.djk.service.LmdpQcColdInspectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 孙少聪
 * @Date 2023/3/3 17:20:16
 * @Description 动态数据源测试
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class LmdpQcColdInspectTest {

    @Autowired
    private LmdpQcColdInspectService lmdpQcColdInspectService;

    @Test
    public void test(){
        DynamicDataSourceContextHolder.push("master");
        List<LmdpQcColdInspect> list = lmdpQcColdInspectService.test();
        DynamicDataSourceContextHolder.poll();
        DynamicDataSourceContextHolder.push("slave");
        List<LmdpQcColdInspect> list1 = lmdpQcColdInspectService.test();
        DynamicDataSourceContextHolder.poll();
        System.out.println("list:"+list.size());
        System.out.println("list1:"+list1.size());
    }

}

