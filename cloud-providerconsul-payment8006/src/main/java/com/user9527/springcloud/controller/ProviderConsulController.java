package com.user9527.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @date 2020/3/14 - 17:45
 */
@RestController
public class ProviderConsulController
{
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/consul")
    public String getzk()
    {
        return "springcloud with consul " + port + "\t" + UUID.randomUUID().toString();
    }
}
