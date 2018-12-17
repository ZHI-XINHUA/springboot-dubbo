package com.annotation.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;
import com.annotation.order.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh.zhi on 2018-11-16.
 */
@RestController
@RequestMapping("/")
public class RemoteOrderController {

    @Reference(application = "application",
            registry = "zkregistry",
            monitor = "monitor",
            version = "1.0.0",timeout = 500)  //dubbo的注解，引用配置，用于创建一个远程服务代理，一个引用可以指向多个注册中心
    private IOrderService orderService;


    //指定注册中心 bean
    //@Reference(version = "1.0.0",registry = "multRegistry")
    //private IOrderService orderService3;

    //直接指定注册中心的地址
    @Reference(version = "1.0.0",registry = "multicast://224.5.6.7:1234")
    private IOrderService orderService3;








    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("doOrder")
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

    @GetMapping("doOrder3")
    public String doOrder3(){
        DoRequest request = new DoRequest();
        request.setName("romte server multcast registry");
        DoResponse response = orderService3.doOrder(request);
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
