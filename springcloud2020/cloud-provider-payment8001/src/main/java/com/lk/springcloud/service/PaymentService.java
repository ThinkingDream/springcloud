package com.lk.springcloud.service;

import com.lk.springcloud.entities.Payment;

/**
 * @author liukun
 * @date 2020/12/1 下午11:20
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}