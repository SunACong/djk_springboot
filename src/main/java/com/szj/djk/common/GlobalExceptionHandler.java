package com.szj.djk.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * @ClassName GlobalExceptionHandler 全局异常处理
 * @Authoc 孙少聪
 * @Date 2022/8/21 14:57:34
 */

@ControllerAdvice(annotations = {RestController.class, Controller.class})
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {

    /**
     * SQL参数异常处理方法
     * @return
     */
    @ExceptionHandler(BadSqlGrammarException.class)
    public R<String> sqlGrammarExceptionHandler(Exception exception){
        log.error(exception.getMessage());
        return R.error("SQL参数异常");
    }

    /**
     * SQL异常处理方法
     * @return
     */
    @ExceptionHandler(SQLException.class)
    public R<String> sqlExceptionHandler(Exception exception){
        log.error(exception.getMessage());
        return R.error("SQL异常:====================="+exception.getMessage());
    }

    /**
     * 处理通用异常
     * @param exception
     * @return
     */
    @ExceptionHandler()
    public R<String> allExceptionHandler(Exception exception){
        log.error("未知异常:",exception);
        return R.error("其他异常:====================="+exception.getMessage());
    }

    /**
     * 捕获自定义异常
     * @param exception
     * @return
     */
    @ExceptionHandler(CustomException.class)
    public R<String> exceptionHandler(CustomException exception){
        log.error(exception.getMessage());
        return R.error(exception.getMessage());
    }
}
