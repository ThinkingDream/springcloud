package com.lk.springcloud.springcloud.springcloud.service.impl;

import com.lk.springcloud.springcloud.springcloud.dao.PaymentDao;
import com.lk.springcloud.springcloud.springcloud.entities.Payment;
import com.lk.springcloud.springcloud.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
