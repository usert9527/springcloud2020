package com.user9527.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @date 2020/3/16 - 17:47
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerMain9001
{
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain9001.class,args);
    }

}
