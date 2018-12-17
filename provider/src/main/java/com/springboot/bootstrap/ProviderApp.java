package com.springboot.bootstrap;

import com.springboot.service.DefaultOrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.io.IOException;


/**
 * 启动类
 */
@SpringBootApplication
public class ProviderApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderApp.class)
                .web(WebApplicationType.NONE)  //非web设置
               .run(args);
        //或者
        //SpringApplication.run(ProviderApp.class,args);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
