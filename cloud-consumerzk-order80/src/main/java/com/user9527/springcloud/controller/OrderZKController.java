package com.user9527.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @date 2020/3/14 - 15:43
 */
@RestController
public class OrderZKController
{
    private static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/zk")
    public String getZk()
    {
        return this.restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
    }
}
