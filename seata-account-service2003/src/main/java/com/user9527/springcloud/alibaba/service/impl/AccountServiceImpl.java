package com.user9527.springcloud.alibaba.service.impl;

import com.user9527.springcloud.alibaba.dao.AccountDao;
import com.user9527.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @date 2020/3/28 - 16:49
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService
{

    @Resource
    private AccountDao storageDao;


    @Override
    public void decrease(Long userId, BigDecimal money)
    {
        log.info("开始减余额");
        //模拟超时异常 全局事务回滚
        //暂停几秒钟线程
//        try {
//            TimeUnit.SECONDS.sleep(20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        int i = 10 / 0;
        this.storageDao.decrease(userId,money);
        log.info("完成减余额");
    }
}
