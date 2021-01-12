package com.example.web.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {

//    @Resource
//    private YourBot yourBot;

    /**
     * 所有异常报错
     * @param exception
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value= Exception.class)
    public String exceptionHandler(Exception exception, HttpServletRequest request) {
        log.error("异常", exception);
        String url = request.getRequestURL().toString();
        log.info("请求开始===地址:"+url);
//        yourBot.sendDummyMessage(exception.getMessage());
        return exception.getMessage();
    }

}
