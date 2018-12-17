package com.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;
import com.annotation.order.IOrderService;

/**
 * 服务提供方 service
 */
@Service(version = "${dubbo.orderService.version}", //版本
        application = "${dubbo.application.id}", //应用服务
        registry = "${dubbo.registry.id}",  //注册后中心
        protocol = "${dubbo.protocols.dubbo.id}",  //dubbo协议
        monitor = "${dubbo.monitor.id}", //监控中心
        timeout = 500)    //超时 ..等等
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
