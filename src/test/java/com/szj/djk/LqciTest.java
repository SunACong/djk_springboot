package com.szj.djk;

import com.szj.djk.entity.Lqci;
import com.szj.djk.service.LqciService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName LqciTest
 * @Authoc 孙少聪
 * @Date 2022/10/10 18:54:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LqciTest {

    @Autowired
    private LqciService lqciService;

    @Test
    public void testSelectLqciAndLqcmr(){
        String time = "1970-01-01 18:30:34";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = null;
        try {
            parse = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Lqci> lqcis = lqciService.selectLqciAndLqcmr(parse);
        System.out.println(lqcis.get(1));
    }
}
