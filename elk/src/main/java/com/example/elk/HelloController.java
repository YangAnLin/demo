package com.example.elk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/test1")
    public void test1(){

        while (true) {
            log.info("=============info");
            log.error("============error");
        }

    }

    @GetMapping("/test2")
    public void test2(){

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            log.error("hello树哥", e);
        }

    }
}
