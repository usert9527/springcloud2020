package com.user9527.springcloud.controller;

import com.user9527.springcloud.entities.CommonResult;
import com.user9527.springcloud.entities.Payment;
import com.user9527.springcloud.service.ConsumerOpenFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @date 2020/3/15 - 10:59
 */
@RestController
public class ConsumerFeignController
{
    @Resource
    private ConsumerOpenFeignService feignService;

    @GetMapping(value = "/consumer/payment/{id}")
    public CommonResult<Payment> consumerOpenFeig(@PathVariable("id") Long id)
    {
        return this.feignService.getPaymentById(id);
    }
}
