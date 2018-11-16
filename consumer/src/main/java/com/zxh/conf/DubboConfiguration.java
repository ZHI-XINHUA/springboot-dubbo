package com.zxh.conf;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 服务消费 dubbo配置
 */
@Configuration
public class DubboConfiguration {


    /**
     * 应用配置
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("spring-boot-consumer-order");
        applicationConfig.setOwner("james");
        return applicationConfig;
    }

    /**
     * 注册中心配置
     * @return
     */
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        //注册中心（ZooKeeper、Multicast、Redis、Simple，推荐使用ZooKeeper）
        registryConfig.setProtocol("zookeeper");
        //集群配置
        registryConfig.setAddress("192.168.3.31:2181,192.168.3.46:2181,192.168.3.118:2181");
        return registryConfig;
    }

    /**
     * 服务消费者全量配置
     * @return
     */
    @Bean
    public ConsumerConfig consumerConfig(){
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(5000);
        return consumerConfig;
    }
}
