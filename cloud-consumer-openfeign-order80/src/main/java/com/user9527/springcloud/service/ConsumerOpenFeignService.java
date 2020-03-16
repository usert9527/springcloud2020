package com.user9527.springcloud.service;

import com.user9527.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @date 2020/3/15 - 10:55
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface ConsumerOpenFeignService
{
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

}
