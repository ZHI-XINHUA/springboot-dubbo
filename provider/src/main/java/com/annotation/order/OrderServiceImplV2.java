package com.annotation.order;

import com.alibaba.dubbo.config.annotation.Service;
import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;

import java.util.concurrent.TimeUnit;

/**
 * 服务提供者实现类
 */
@Service(
        application = "dbapplication", //应用
        registry = "zkRegistry",  //注册中心
        protocol = "dubboProtocol", //协议
        monitor = "monitor",  //监控中心
        version = "2.0.0")  //dubbo的Service注解，暴露服务
public class OrderServiceImplV2 implements IOrderService {
    @Override
    public DoResponse doOrder(DoRequest requestParam) {
        try {
            //模拟超时
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("spring-boot-OrderServiceImpl> 请求已经来:"+requestParam.getName());
        DoResponse response = new DoResponse();
        response.setCode("200");
        response.setResult("测试成功！");
        response.setMemo("spring boot dubbo");
        return response;
    }
}


