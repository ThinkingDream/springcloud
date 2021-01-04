package com.lk.springcloud.springcloud.springcloud.dao;

import com.lk.springcloud.springcloud.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author liukun
 * @date 2020/12/1 下午11:00
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
