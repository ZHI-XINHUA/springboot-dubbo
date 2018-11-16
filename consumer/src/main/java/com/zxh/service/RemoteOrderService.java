package com.zxh.service;

import com.alibaba.dubbo.config.annotation.Reference;

import com.zxh.base.DoRequest;
import com.zxh.base.DoResponse;
import com.zxh.order.IOrderService;

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
