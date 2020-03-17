package com.user9527.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @date 2020/3/17 - 14:52
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayMain9527
{
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class,args);
    }
}
