package com.user9527.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2020/3/14 - 11:34
 */
@RestController
public class PaymentController
{

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/zk")
    public String getzk()
    {
        return "hello zookeeper "+port;
    }

}
