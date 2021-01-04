package com.lk.springcloud.service.impl;

import com.lk.springcloud.dao.PaymentDao;
import com.lk.springcloud.service.PaymentService;
import com.lk.springcloud.entities.Payment;
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
