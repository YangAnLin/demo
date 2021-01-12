package com.redisspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class ClusterTests {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void set() {
        for (int i = 9999; i < 110000; i++) {
            stringRedisTemplate.opsForValue().set(i+"", i+"");
        }
    }

    @Test
    void get() {
        while (true) {
            System.out.println(stringRedisTemplate.opsForValue().get(1 + ""));
        }
    }
}
