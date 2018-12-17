package com.xml.service;


import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;
import com.annotation.order.IOrderService;

/**
 * 本地存根
 */
public class DefaultOrderServiceStub implements IOrderService {
    private final  IOrderService orderService;

    public DefaultOrderServiceStub(IOrderService orderService){
        this.orderService = orderService;
    }
    @Override
    public DoResponse doOrder(DoRequest requestParam) {
        System.out.println("本地存根test DefaultOrderServiceStub>>>>>>");
        // 此代码在客户端执行, 你可以在客户端做ThreadLocal本地缓存，或预先验证参数是否合法，等等
        try {
            return orderService.doOrder(requestParam);
        } catch (Exception e) {
            // 你可以容错，可以做任何AOP拦截事项
           // return "容错数据";
            return null;
        }
    }
}
