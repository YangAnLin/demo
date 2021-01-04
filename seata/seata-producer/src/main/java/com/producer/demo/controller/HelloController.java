package com.producer.demo.controller;

import com.producer.demo.client.ConsumerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class HelloController {

    @Resource
    private ConsumerClient consumerClient;

    @GetMapping("/test1")
    public String method(@RequestParam("name") String name) {
        return consumerClient.test1(name);
    }
}
