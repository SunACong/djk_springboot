package com.szj.djk.valobj;

/**
 * @Author SunACong @SunByte
 * @Description 质量判定分项枚举
 * @Date 2024/5/27 17:36
 * @Version 1.0
 */
public enum JudgeResultEnum {

    QUALIFIED("合格"),
    NULL("暂未判定"),
    UNQUALIFIED("异常");

    private final String description;

    JudgeResultEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
