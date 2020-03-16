package com.user9527.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @date 2020/3/15 - 23:23
 */
@FeignClient(value = "CLOUD-PAYMENT-HYSTRIX",fallback = ConsumerServiceFallback.class)
public interface ConsumerService {

    @GetMapping(value = "payment/no/{id}")
    public String no(@PathVariable("id") Long id );

}
