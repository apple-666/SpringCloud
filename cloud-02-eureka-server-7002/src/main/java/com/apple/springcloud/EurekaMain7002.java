package com.apple.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Double_apple
 * @Date 2021/10/30 23:36
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer  //表示自己是注册中心
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
