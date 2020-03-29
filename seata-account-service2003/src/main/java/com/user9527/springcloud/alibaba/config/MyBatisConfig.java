package com.user9527.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.user9527.springcloud.alibaba.dao")
public class MyBatisConfig {
}
