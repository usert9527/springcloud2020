package com.user9527.springcloud.alibaba.service.impl;

import com.user9527.springcloud.alibaba.dao.OrderDao;
import com.user9527.springcloud.alibaba.domain.Order;
import com.user9527.springcloud.alibaba.service.AccountService;
import com.user9527.springcloud.alibaba.service.OrderService;
import com.user9527.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @date 2020/3/28 - 15:39
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService
{
    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order)
    {
        log.info("开始创建订单********");
        this.orderDao.create(order);
        log.info("创建订单结束********");

        log.info("减库存**************");
        this.storageService.totalDecrease(order.getProductId(),order.getCount());
        log.info("减库存完成**********");

        log.info("减账号余额**********");
        this.accountService.accountDecrease(order.getUserId(),order.getMoney());
        log.info("减账号余额完成******");

        log.info("订单状态改为1*******");
        this.orderDao.update(order.getUserId(),0);
        log.info("订单创建完成********");
    }
}
