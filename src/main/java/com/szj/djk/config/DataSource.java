package com.szj.djk.config;

import com.szj.djk.common.DataSourceNames;

import java.lang.annotation.*;

/**
 * @author 孙少聪
 * @description 数据源注解
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    String value() default DataSourceNames.MASTER; //默认值为MASTER
}
