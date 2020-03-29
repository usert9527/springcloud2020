package com.user9527.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @date 2020/3/20 - 9:50
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerNacos
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerNacos.class,args);
    }
}
