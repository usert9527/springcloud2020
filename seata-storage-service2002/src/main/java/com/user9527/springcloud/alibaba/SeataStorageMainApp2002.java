package com.user9527.springcloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @date 2020/3/27 - 16:50
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.user9527.springcloud.alibaba.dao")
public class SeataStorageMainApp2002
{
    public static void main(String[] args)
    {
        SpringApplication.run(SeataStorageMainApp2002.class,args);
    }
}
