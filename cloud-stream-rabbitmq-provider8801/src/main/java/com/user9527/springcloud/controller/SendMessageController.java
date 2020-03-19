package com.user9527.springcloud.controller;

import com.user9527.springcloud.service.IMessageProvider;
import com.user9527.springcloud.service.impl.IMessageProviderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @date 2020/3/18 - 22:15
 */
@RestController
public class SendMessageController
{
    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return iMessageProvider.send();
    }
}
