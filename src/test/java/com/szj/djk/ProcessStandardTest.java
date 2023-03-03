package com.szj.djk;

import com.szj.djk.entity.ProcessStandard;
import com.szj.djk.service.ProcessStandardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName ProcessStandardTest
 * @Authoc 孙少聪
 * @Date 2022/9/30 10:19:57
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProcessStandardTest {

    @Autowired
    private ProcessStandardService processStandardService;

    @Test
    public void getStandardById(){
        int id = 1;
        ProcessStandard processStandard = processStandardService.getById(id);
        System.out.println(processStandard);
    }
}
