package com.user9527.springcloud.controller;

import com.user9527.springcloud.entities.CommonResult;
import com.user9527.springcloud.entities.Payment;
import com.user9527.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @date 2020/3/12 - 22:22
 */
@RestController
@Slf4j
public class PaymentController
{
    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = this.paymentService.create(payment);
        log.info("*******插入结果："+result+"/t"+"哈哈");

        if(result > 0)
        {
            return new CommonResult(200,"插入数据成功："+port,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id)
    {
        Payment paymentById = this.paymentService.getPaymentById(id);
        log.info("*******查询结果："+paymentById+"哈哈--你大爷0001111");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(paymentById != null)
        {
            return new CommonResult(200,"查询成功："+port,paymentById);
        }else{
            return new CommonResult(444,"没有对应记录，查询ID："+id + "端口：" + port,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object getDiscovery()
    {
        // eureka里面注册的微服务
        List<String> services = this.discoveryClient.getServices();
        services.forEach(element ->{
            log.info("**************************"+element);
        });

        List<ServiceInstance> instances = this.discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(instance ->{
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        });
        return discoveryClient;
    }

    @GetMapping(value = "/payment/bl")
    public String getPaymentBl()
    {
        return port;
    }
}
