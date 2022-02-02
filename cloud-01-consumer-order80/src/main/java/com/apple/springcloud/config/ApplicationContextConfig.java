package com.apple.springcloud.config;

//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Double_apple
 * @Date 2021/10/30 22:24
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//赋予rest模板有 负载均衡的能力
    //和spring中的 applicationContext.xml <bean id="" class="">  一样
    public RestTemplate getRestTemplate(){ return new RestTemplate();}
}
