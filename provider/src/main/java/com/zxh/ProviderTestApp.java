package com.zxh;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *测试
 */
@DubboComponentScan("com.zxh") //dubbo注解，扫描dubbo的注解
@SpringBootApplication
public class ProviderTestApp
{
    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(ProviderTestApp.class, args);
        System.in.read();
    }
}
