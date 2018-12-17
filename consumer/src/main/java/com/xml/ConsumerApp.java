package com.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by xh.zhi on 2018-11-27.
 */
@ImportResource(locations = "classpath:dubbo.xml")  //加载dubbo配置
@SpringBootApplication(scanBasePackages = "com.xml.controller") //扫描包
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }
}
