package com.user9527.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @date 2020/3/14 - 17:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderConsulMain8006
{
    public static void main(String[] args) {
        SpringApplication.run(ProviderConsulMain8006.class,args);
    }
}
