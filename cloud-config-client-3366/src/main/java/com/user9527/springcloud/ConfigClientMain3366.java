package com.user9527.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @date 2020/3/18 - 15:09
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366
{
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3366.class,args);
    }
}
