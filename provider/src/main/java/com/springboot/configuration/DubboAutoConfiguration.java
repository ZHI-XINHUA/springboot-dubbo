package com.springboot.configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.Exporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xh.zhi on 2018-11-27.
 * dubbo 配置
 */
@Configuration
//@ConditionalOnClass(Exporter.class)
public class DubboAutoConfiguration {
    /**
    private String dubbo;
    private int dubboPort;
    private String rmi;
    private int rmiPort;

    @Bean("dubboProviderConfig")
    public ProviderConfig dubboProviderConfig( ApplicationConfig applicationConfig, RegistryConfig registryConfig){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName(dubbo);
        protocolConfig.setPort(dubboPort);
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setApplication(applicationConfig);
        providerConfig.setRegistry(registryConfig);
        providerConfig.setProtocol(protocolConfig);
        providerConfig.setTimeout(500);
        return providerConfig;
    }
    **/
}
