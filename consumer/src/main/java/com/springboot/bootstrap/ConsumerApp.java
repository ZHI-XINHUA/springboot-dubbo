package com.springboot.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xh.zhi on 2018-11-27.
 */
@SpringBootApplication(scanBasePackages = "com.springboot.controller")
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }
}
