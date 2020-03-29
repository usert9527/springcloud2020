package com.user9527.springcloud.alibaba.controller;

import com.user9527.springcloud.alibaba.domain.CommonResult;
import com.user9527.springcloud.alibaba.domain.Order;
import com.user9527.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @date 2020/3/28 - 15:59
 */
@RequestMapping("order")
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;

    @GetMapping("creat")
    public CommonResult creat(Order order)
    {
        this.orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
