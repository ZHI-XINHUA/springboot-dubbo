package com.zxh.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zxh.base.DoRequest;
import com.zxh.base.DoResponse;
import com.zxh.order.IOrderService;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh.zhi on 2018-11-16.
 */
@RestController
@RequestMapping("/")
public class RemoteOrderController {

    @Reference
    private IOrderService orderService;

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
}
