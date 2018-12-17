package com.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;
import com.annotation.order.IOrderService;

import java.util.concurrent.TimeUnit;

/**
 * 服务提供方 service
 */
@Service(version = "1.0.0", //版本
        application = "${dubbo.application.id}", //应用服务
        registry = "${dubbo.registry.id}",  //注册后中心
        protocol = "${dubbo.protocol.id}",  //dubbo协议
        monitor = "${dubbo.monitor.id}", //监控中心
        retries = 5, //重试次数
        timeout = 1000)    //超时 ..等等
public class DefaultOrderServiceV2 implements IOrderService {
    @Override
    public DoResponse doOrder(DoRequest requestParam) {
        try {
            //模拟超时
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("springboot-dubbo defaultOrderService> 请求已经来:"+requestParam.getName());
        DoResponse response = new DoResponse();
        response.setCode("200");
        response.setResult("旧版本1.0.0 测试成功！");
        response.setMemo(requestParam.toString());
        return response;
    }
}
