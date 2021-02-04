package com.lk.springcloud.service;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lk.springcloud.entities.CommonResult;

/**
 * @author lk
 * @version 1.0
 * @date 2021/1/15 15:37
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
