package com.example.web.spring;//package com.example.demo.spring;
//
//import com.example.demo.redis.RedisClient;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
//
//public abstract class PayService{
//
//    @Resource
//    private RedisClient redisClient;
//
//    abstract void buikdPay();
//
//    public void pay(String str){
//        System.out.println(str+"调用结算了");
//        buikdPay();
//
//        redisClient.set("1", "2");
//        System.out.println(redisClient.get("1"));;
//    }
//
//
//
//}
//
