package com.example.demo.config;

import com.gjing.common.core.ProxyRegister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Gjing
 **/
@Configuration
public class DemoConfiguration {
    @Bean
    public ProxyRegister proxyRegister() {
        return new ProxyRegister("com.example.demo.service");
    }
}
