package com.annotation.conf;

import com.alibaba.dubbo.config.*;
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
    @Bean("dbapplication")
    public ApplicationConfig applicationConfig(){
        ApplicationConfig application = new ApplicationConfig();
        //应用名称
        application.setName("spring-boot-provide-order-annotation");
        //应用所属这
        application.setOwner("olay");
        //设置应用日志
        //application.setLogger("log4j");
        return application;
    }

    /**
     * zookeeper注册中心设置
     * @return
     */
    @Bean("zkRegistry")
    public RegistryConfig zkRegistry(){
        RegistryConfig registryConfig = new RegistryConfig();
        //zookeeper作为注册中心（dubbo支持Multicast、Zookeeper、Redis、Simple注册中心，推荐使用ZooKeeper）
        registryConfig.setProtocol("zookeeper");
        //集群地址
        registryConfig.setAddress("192.168.3.31:2182");

        return  registryConfig;
    }

    /**
     * 监控中心
     * @return
     */
    @Bean("monitor")
    public MonitorConfig monitor(){
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("register");
        return monitorConfig;
    }



    /**
     * multicast注册中心
     * @return
     */
    @Bean("multRegistry")
    public RegistryConfig multRegistry(){
        RegistryConfig registryConfig = new RegistryConfig();
        //zookeeper作为注册中心（dubbo支持Multicast、Zookeeper、Redis、Simple注册中心，推荐使用ZooKeeper）
        //集群地址
        registryConfig.setAddress("multicast://224.5.6.7:1234");
        registryConfig.setDefault(false);
        //只订阅不注册
        //registryConfig.setRegister(false);
        //只注册不订阅
        //registryConfig.setSubscribe(false);
        return  registryConfig;
    }



    /**
     * 协议配置
     * @return
     */
    @Bean("dubboProtocol")
    public ProtocolConfig dubboProtocol(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        //协议类型（dubbo、rmi、hessian、http、webservice、thrift、memcached、redis、rest）
        protocolConfig.setName("dubbo");
        //协议端口
        protocolConfig.setPort(20881);
        return protocolConfig;
    }

    @Bean("rmiProtocol")
    public ProtocolConfig rmiProtocol(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        //协议类型（dubbo、rmi、hessian、http、webservice、thrift、memcached、redis、rest）
        protocolConfig.setName("rmi");
        //协议端口
        protocolConfig.setPort(20888);
        return protocolConfig;
    }

    @Bean("orderConsumer")
    public  ConsumerConfig getConsumerConfig(){
        ConsumerConfig consumerConfig = new ConsumerConfig();
        //应用
        consumerConfig.setApplication(applicationConfig());
        //注册中心
        consumerConfig.setRegistry(zkRegistry());
        consumerConfig.setMonitor(monitor());
        return consumerConfig;
    }

}
