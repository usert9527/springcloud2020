package com.user9527.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.user9527.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @date 2020/3/15 - 22:37
 */
@RestController
@Slf4j
public class PaymentController
{
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "payment/ok/{id}")
    public String ok(@PathVariable("id") Long id )
    {
        String payment_ok = this.paymentService.payment_Ok(id);

        log.info(payment_ok);
        return payment_ok;
    }


    @GetMapping(value = "payment/no/{id}")
    public String no(@PathVariable("id") Long id )
    {
        String payment_ok = this.paymentService.payment_No(id);

        log.info(payment_ok);
        return payment_ok;
    }


    //=============服务熔断
    @GetMapping(value = "payment/circuit/{id}")
    public String paymentCircuit(@PathVariable("id") Long id)
    {
        return paymentService.paymentCircuitBreaker(id);
    }
}
