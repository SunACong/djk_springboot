package com.szj.djk.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.szj.djk.common.DataSourceNames;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
/**
 * @author 孙少聪
 * @Date 2023/3/3 17:00:11
 * @Description 动态数据源配置
 */

@Configuration
public class DynamicDataSourceConfig {

    /**
     * 创建 DataSource Bean
     * */

    @Bean
    @ConfigurationProperties("spring.datasource.druid.master")
    public DataSource oneDataSource(){
        DataSource dataSource = DruidDataSourceBuilder.create().build();
        return dataSource;
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.slave")
    public DataSource twoDataSource(){
        DataSource dataSource = DruidDataSourceBuilder.create().build();
        return dataSource;
    }

    /**
     * 将数据源信息载入targetDataSources
     * */

    @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource oneDataSource, DataSource twoDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>(2);
        targetDataSources.put(DataSourceNames.MASTER, oneDataSource);
        targetDataSources.put(DataSourceNames.SLAVE, twoDataSource);
        //DynamicDataSource（默认数据源,所有数据源） 第一个指定默认数据库
        return new DynamicDataSource(oneDataSource, targetDataSources);
    }
}
