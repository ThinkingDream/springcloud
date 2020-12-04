package com.lk.springcloud.controller;

import com.lk.springcloud.entities.CommonResult;
import com.lk.springcloud.entities.Payment;
import com.lk.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author liukun
 * @date 2020/12/1 下午11:23
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(Payment payment){
        int result = paymentService.create(payment);
        log.info(payment.toString());
        return new CommonResult<Integer>(200,"success",result);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info(payment.toString());
        return new CommonResult<Payment>(200,"success",payment);
    }


}
