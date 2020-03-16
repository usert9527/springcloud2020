package com.user9527.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @date 2020/3/16 - 17:02
 */
@Component
public class ConsumerServiceFallback implements ConsumerService
{

    @Override
    public String no(Long id) {
        return "这是===FeignFallback方法";
    }
}
