package com.lk.springcloud.service;

import com.lk.springcloud.entities.CommonResult;
import com.lk.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author lk
 * @version 1.0
 * @date 2021/1/15 16:13
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}