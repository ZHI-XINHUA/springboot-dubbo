package com.xml.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;
import com.annotation.order.IOrderService;
import org.springframework.stereotype.Component;

/**
 * 服务提供方 service
 */
public class DefaultOrderService implements IOrderService {
    @Override
    public DoResponse doOrder(DoRequest requestParam) {
        System.out.println("springboot-dubbo defaultOrderService> 请求已经来:"+requestParam.getName());
        DoResponse response = new DoResponse();
        response.setCode("200");
        response.setResult("测试成功！");
        response.setMemo(requestParam.toString());
        return response;
    }
}
