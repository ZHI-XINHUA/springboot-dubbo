package com.zxh.conf;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * dubbo 配置
 */
@Configuration
public class DubboConfiguration {

    /**
     * 当前应用配置，用于计算依赖关系
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig application = new ApplicationConfig();
        //应用名称
        application.setName("spring-boot-provide-order");
        //应用所属这
        application.setOwner("olay");
        //设置应用日志
        application.setLogger("log4j");
        return application;
    }

    /**
     * 注册中心设置
     * @return
     */
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        //zookeeper作为注册中心（dubbo支持Multicast、Zookeeper、Redis、Simple注册中心，推荐使用ZooKeeper）
        registryConfig.setProtocol("zookeeper");
        //集群地址
        registryConfig.setAddress("192.168.3.31:2181,192.168.3.46:2181,192.168.3.118:2181");
        return  registryConfig;
    }

    /**
     * 协议配置
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        //协议类型（dubbo、rmi、hessian、http、webservice、thrift、memcached、redis、rest）
        protocolConfig.setName("dubbo");
        //协议端口
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
}
