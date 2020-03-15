package com.user9527.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @date 2020/3/14 - 17:59
 */
@RestController
public class ConsumerConsulController
{
    @Resource
    private RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://consul-provider-servic";

    @GetMapping(value = "/consumer/consul")
    public String consul()
    {
        return this.restTemplate.getForObject(PAYMENT_URL+"/payment/consul",String.class);
    }
}
