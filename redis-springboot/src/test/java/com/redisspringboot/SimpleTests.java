package com.redisspringboot;

import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

/**
 * 简单测试使用springboot集成redis设置值
 * 1.如果只是用字符串类型,可以直接使用StringRedisTemplate,这个是框架已经定义好的了
 * 2.如果使用RedisTemplate,需要自定义Config
 */
@SpringBootTest
class SimpleTests {

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void set() {
        redisTemplate.opsForValue().set("k1", "v1");
    }

    @Test
    void setObj() {
        User user = new User();
        user.setAge(11);
        user.setName("anthony");
        redisTemplate.opsForValue().set("user123", JSONUtil.parse(user).toString());
    }

    @Test
    void setStringRedisTemplate() {
        stringRedisTemplate.opsForValue().set("k1", "v1");
    }

    @Test
    void setObjStringredistemplate() {
        User user = new User();
        user.setAge(11);
        user.setName("anthony");
        redisTemplate.opsForValue().set("user1234", JSONUtil.parse(user).toString());
    }

}
