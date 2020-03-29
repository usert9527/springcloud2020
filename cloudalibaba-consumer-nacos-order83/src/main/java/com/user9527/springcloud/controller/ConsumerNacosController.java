package com.user9527.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @date 2020/3/20 - 9:53
 */
@RestController
public class ConsumerNacosController
{
    @Value("${service-url.http}")
    private String http;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/getNacos/payment/{id}")
    public String getNacos(@PathVariable("id") Long id)
    {
        return this.restTemplate.getForObject(http + "/payment/nacos/" + id,String.class);
    }
}
