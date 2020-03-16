package com.user9527.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.commons.util.IdUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @date 2020/3/15 - 22:38
 */
@Service
public class PaymentService
{

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //开启熔断
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), //十次请求
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 十秒内
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")  //  失败比例 60%
    })
    public String paymentCircuitBreaker(Long id)
    {
        if(id < 0)
        {
            throw new RuntimeException("************ id 不能为负数");
        }
        String string = UUID.randomUUID().toString();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + string;
    }

    public String paymentCircuitBreaker_fallback(Long id)
    {
        return "id 不能为负数，请稍后再试 ~~~~  id: " + id;
    }





    public String payment_Ok(Long id)
    {
        return "线程池：" + Thread.currentThread().getName()+"\t"+ id +"成功O(∩_∩)O";
    }

    @HystrixCommand(fallbackMethod = "no_hystrix",commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000") // 3秒之内走正常的 否则降级
    })
    public String payment_No(Long id)
    {

        int i = 3;
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName()+ id + "⊙﹏⊙∥" + "\t" + "耗时(秒)：" + i;
    }

    public String no_hystrix(Long id)
    {
        return "当前支付系统8001繁忙，请十秒后再试 (●ˇ∀ˇ●)";
    }
}
