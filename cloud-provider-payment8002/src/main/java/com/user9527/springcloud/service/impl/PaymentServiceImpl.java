package com.user9527.springcloud.service.impl;

import com.user9527.springcloud.dao.PaymentDao;
import com.user9527.springcloud.entities.Payment;
import com.user9527.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @date 2020/3/12 - 22:18
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return this.paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return this.paymentDao.getPaymentById(id);
    }
}
