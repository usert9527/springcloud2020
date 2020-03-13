package com.user9527.springcloud.service;

import com.user9527.springcloud.entities.Payment;

/**
 * @date 2020/3/12 - 22:17
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
