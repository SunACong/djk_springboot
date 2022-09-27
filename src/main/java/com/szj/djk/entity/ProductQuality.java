package com.szj.djk.entity;

import lombok.Data;


/**
 * @ClassName ProductQuality
 * @Authoc 孙少聪
 * @Date 2022/9/25 10:12:58
 */

@Data
public class ProductQuality {

    private Integer id;

    private String batchNum;

    private Double singleStraightness;

    private Boolean isQuality;
}
