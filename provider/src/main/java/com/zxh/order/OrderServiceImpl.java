package com.zxh.order;

import com.alibaba.dubbo.config.annotation.Service;
import com.zxh.base.DoRequest;
import com.zxh.base.DoResponse;

/**
 * 服务提供者实现类
 */
@Service(timeout = 50000)
public class OrderServiceImpl implements IOrderService {
    @Override
    public DoResponse doOrder(DoRequest requestParam) {
        System.out.println("spring-boot-> 请求已经来:"+requestParam.getName());
        DoResponse response = new DoResponse();
        response.setCode("200");
        response.setResult("测试成功！");
        response.setMemo("spring boot dubbo");
        return response;
    }
}
