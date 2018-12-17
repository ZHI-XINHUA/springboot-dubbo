package com.annotation.service;

import com.alibaba.dubbo.config.annotation.Reference;

import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;
import com.annotation.order.IOrderService;

/**
 * 远程调用OrderService
 */


public class RemoteOrderService {

    @Reference
    public IOrderService orderService;

    public void doOrder(){
        System.out.println("tttttttttttttttttt");
        DoRequest request = new DoRequest();
        request.setName("romte server");
        DoResponse response = orderService.doOrder(request);
        System.out.println(response.toString());
    }
}
