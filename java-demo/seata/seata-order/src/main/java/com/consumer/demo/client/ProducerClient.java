package com.consumer.demo.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("seata-producer")
public class ProducerClient {
}
