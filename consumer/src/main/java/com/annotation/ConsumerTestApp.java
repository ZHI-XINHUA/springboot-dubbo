package com.annotation;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xh.zhi on 2018-11-16.
 */

@SpringBootApplication
@DubboComponentScan(basePackages ="com.annotation")
public class ConsumerTestApp {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(ConsumerTestApp.class,args);
    }
}
