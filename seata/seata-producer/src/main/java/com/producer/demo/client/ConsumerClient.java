package com.producer.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("seata-consumer")
public interface ConsumerClient {

    @GetMapping("/test1")
    String test1(@RequestParam("name") String name);

}
