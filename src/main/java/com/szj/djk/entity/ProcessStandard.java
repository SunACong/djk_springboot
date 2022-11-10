package com.szj.djk.entity;

import lombok.Data;

/**
 * @ClassName ProcessStandard
 * @Authoc 孙少聪
 * @Date 2022/9/29 20:22:46
 */
@Data
public class ProcessStandard {
    private Integer id;
    private String  processName;
    private Double thicknessDiff;
    private Double widthDiff;
    private Double straightness;
    private Double mediumConvexityLow;
    private Double mediumConvexityHigh;
    private Double rollDiameterLow;
    private Double rollDiameterHigh;
    private Double rollWeightLow;
    private Double rollWeightHigh;
    private Double tensileStrengthLow;
    private Double tensileStrengthHigh;
    private Double elongation;
    private String surface;
}
