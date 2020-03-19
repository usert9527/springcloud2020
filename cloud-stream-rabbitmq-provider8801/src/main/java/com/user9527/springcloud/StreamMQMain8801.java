package com.user9527.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @date 2020/3/18 - 22:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StreamMQMain8801
{
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8801.class,args);
    }
}
