package com.xml.bootstrap;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;


/**
 * 启动类
 */

@ImportResource(locations = "classpath:dubbo.xml") //导入dubbo配置
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
