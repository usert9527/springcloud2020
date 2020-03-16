package com.user9527.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.user9527.springcloud.service.ConsumerService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @date 2020/3/15 - 23:24
 */
@RestController
@DefaultProperties(defaultFallback = "consumer_all")  // 全局的
public class ConsumerController
{
    @Resource
    private ConsumerService consumerService;


    @GetMapping(value = "/consumer/payment/no/{id}")
//    @HystrixCommand(fallbackMethod = "consumer_no")
    @HystrixCommand
    public String consumer_No(@PathVariable("id") Long id)
    {

        return consumerService.no(id);
    }

    //=====================================================
    public String consumer_no(@PathVariable("id") Long id)
    {
        return "客服端80系统繁忙，请过会在试";
    }

    public String consumer_all()
    {
        return "客服端80系统繁忙，请过会在试" + "\t" + "这是全局的";
    }
}
