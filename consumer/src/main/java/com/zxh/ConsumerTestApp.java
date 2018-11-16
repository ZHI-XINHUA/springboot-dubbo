package com.zxh;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.zxh.service.RemoteOrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xh.zhi on 2018-11-16.
 */

@SpringBootApplication
@DubboComponentScan(basePackages ="com.zxh.service")
public class ConsumerTestApp {



    public static void main(String[] args) throws Exception{
        SpringApplication.run(ConsumerTestApp.class,args);


    }
}
