package com.user9527.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @date 2020/3/14 - 11:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
