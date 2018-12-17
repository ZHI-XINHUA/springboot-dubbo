package com.annotation.order;

import com.alibaba.dubbo.config.annotation.Service;
import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;

/**
 * 服务提供者实现类,multcast作为注册中心
 */
@Service(version = "1.0.0",registry = "multRegistry",protocol = "rmiProtocol")  //dubbo的Service注解，暴露服务
public class OrderServiceImpl3 implements IOrderService {
    @Override
    public DoResponse doOrder(DoRequest requestParam) {
        System.out.println("spring-boot-OrderServiceImpl3> 请求已经来:"+requestParam.getName());
        DoResponse response = new DoResponse();
        response.setCode("200");
        response.setResult("测试成功！");
        response.setMemo("spring boot dubbo");
        return response;
    }
}
