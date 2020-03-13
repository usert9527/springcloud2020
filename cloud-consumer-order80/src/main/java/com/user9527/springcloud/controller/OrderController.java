package com.user9527.springcloud.controller;

import com.user9527.springcloud.entities.CommonResult;
import com.user9527.springcloud.entities.Payment;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @date 2020/3/13 - 8:49
 */
@RestController
public class OrderController
{

    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment)
    {
        return this.restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id)
    {
        return this.restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/discovery")
    public Object getDiscovery()
    {
       return this.restTemplate.getForObject(PAYMENT_URL+"/payment/discovery",Object.class);
    }
}
