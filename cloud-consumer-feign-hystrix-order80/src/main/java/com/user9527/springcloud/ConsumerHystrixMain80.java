package com.user9527.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @date 2020/3/15 - 23:21
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix //开启 Hystrix
public class ConsumerHystrixMain80
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerHystrixMain80.class,args);
    }
}
