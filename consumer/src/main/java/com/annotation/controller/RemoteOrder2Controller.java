package com.annotation.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;
import com.annotation.order.IOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh.zhi on 2018-11-16.
 */
@RestController
@RequestMapping("/")
public class RemoteOrder2Controller {

    @Reference(application = "application", //应用
            registry = "zkregistry", //注册中心
            monitor = "monitor", //监控中心
            version = "1.0.0",timeout = 500)  //dubbo的注解，引用配置，用于创建一个远程服务代理，一个引用可以指向多个注册中心
    private IOrderService orderService;


    @GetMapping("order")
    public String doOrder(){
        DoRequest request = new DoRequest();
        request.setName("romte server");
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
