package com.lk.springcloud.controller;

import com.lk.springcloud.entities.CommonResult;
import com.lk.springcloud.entities.Payment;
import com.lk.springcloud.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liukun
 * @date 2020/12/1 下午11:23
 */
@RestController
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(Payment payment){
        int result = paymentService.create(payment);
        return new CommonResult<Payment>(200,"success");
    }

    @GetMapping(value = "/payment/get")
    public CommonResult<Payment> get(Integer id){
        return new CommonResult<Payment>(200,"success",paymentService.getPaymentById(id));
    }


}
