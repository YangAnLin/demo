package com.example.web.web;

import com.example.demo.redis.RedisClient;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisLockController {

    @Resource
    private RedisClient redisClient;


    private RedisTemplate redisTemplate;

    @RequestMapping("/redis/lock")
    public String readFile(){

        String key = "1";
        System.out.println(redisClient.setDistributedLock(key, key, 3));
        System.out.println(redisClient.setDistributedLock(key, key, 3));
        return "nice";
    }
}
