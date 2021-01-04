package com.lk.springcloud.springcloud.springcloud.service.impl;

import com.lk.springcloud.springcloud.springcloud.dao.PaymentDao;
import com.lk.springcloud.springcloud.springcloud.entities.Payment;
import com.lk.springcloud.springcloud.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liukun
 * @date 2020/12/1 下午11:21
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}