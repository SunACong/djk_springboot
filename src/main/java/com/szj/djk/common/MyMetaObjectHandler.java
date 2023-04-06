package com.szj.djk.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * 自定义元数据对象处理器
 * @ClassName MyMetaObjectHandler
 * @Authoc 孙少聪
 * @Date 2022/8/22 08:41:38
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 插入操作自动填充
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("createTime自动填充");
        Date nowTime = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        // MetaObject类获取拦截类型
        metaObject.setValue("createTime", LocalDateTime.now());
        metaObject.setValue("updateTime", LocalDateTime.now());
    }

    /**
     * 更新操作自动填充
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("updateTime自动更新");
        Date nowTime = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        metaObject.setValue("updateTime", LocalDateTime.now());
    }



/*    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("公共字段自动填充");
        log.info("{}",metaObject.toString());
        Date nowTime = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        // MetaObject类获取拦截类型
        if(metaObject.getOriginalObject().getClass() == Lqci.class){
            metaObject.setValue("lqciTs", nowTime);
        }else if(metaObject.getOriginalObject().getClass() == Lqcmr.class){
            metaObject.setValue("lqcmrTs", nowTime);
        }else{
            metaObject.setValue("createTime", LocalDateTime.now());
            metaObject.setValue("updateTime", LocalDateTime.now());
        }

    }*/

/*    *//**
     * 更新操作自动填充
     *//*
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("公共字段自动更新");
        log.info("{}",metaObject.toString());
        Date nowTime = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        // MetaObject类获取拦截类型
        if(metaObject.getOriginalObject().getClass() == Lqci.class){
            metaObject.setValue("lqciTs", nowTime);
        }else if(metaObject.getOriginalObject().getClass() == Lqcmr.class){
            metaObject.setValue("lqcmrTs", nowTime);
        }else{
            metaObject.setValue("updateTime", LocalDateTime.now());
        }
    }*/
}
