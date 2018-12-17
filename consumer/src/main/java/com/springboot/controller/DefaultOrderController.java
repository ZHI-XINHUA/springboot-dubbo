package com.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;
import com.annotation.order.IOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh.zhi on 2018-11-27.
 */
@RestController
public class DefaultOrderController {

    @Reference(application = "${dubbo.application.id}",  //应用
                registry = "${dubbo.registry.id}",   //注册中心
                version = "${dubbo.orderService.version}", //版本
                timeout = 500)  //超时 等..
    IOrderService orderService;

    @RequestMapping("/order")
    public String remoteOrderService(){
        DoRequest request = new DoRequest();
        request.setName("spring boot》romte server");
        //调用远程接口
        DoResponse response = orderService.doOrder(request);
        System.out.println(response.toString());
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(response);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "seccess";
    }
}
