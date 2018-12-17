package com.annotation.order;

import com.alibaba.dubbo.config.annotation.Service;
import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;

/**
 * 服务提供者实现类
 */
@Service(version = "2.0.0",timeout = 1)  //dubbo的Service注解，暴露服务
public class OrderServiceImpl2 implements IOrderService {
    @Override
    public DoResponse doOrder(DoRequest requestParam) {
        System.out.println("spring-boot-OrderServiceImpl2> 请求已经来:"+requestParam.getName());
        DoResponse response = new DoResponse();
        response.setCode("200");
        response.setResult("测试成功！");
        response.setMemo("spring boot dubbo");
        return response;
    }
}
