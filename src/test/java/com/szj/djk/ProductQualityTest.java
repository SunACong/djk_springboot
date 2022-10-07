package com.szj.djk;

import com.szj.djk.entity.ProductQuality;
import com.szj.djk.mapper.ProductQualityMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProductQualityTest
 * @Authoc 孙少聪
 * @Date 2022/9/25 10:36:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductQualityTest {

    @Autowired
    private ProductQualityMapper productQualityMapper;

    @Test
    public void batchInsertOrUpdateTest(){
        List<ProductQuality> productQualities = new ArrayList<>();
        ProductQuality productQuality1 = new ProductQuality();
        productQuality1.setBatchNum("2549B2201215");
        productQuality1.setSingleStraightness(3.000);
        ProductQuality productQuality2 = new ProductQuality();
        productQuality2.setBatchNum("123456");
        productQuality2.setSingleStraightness(1.000);
        productQualities.add(productQuality1);
        productQualities.add(productQuality2);
        int i = productQualityMapper.batchInsertOrUpdate(productQualities);
        System.out.println(i);
    }

    @Test
    public void selectMaxDateTest(){
        String s = productQualityMapper.selectMaxDate();
        System.out.println(s);
    }


}
