package com.apple.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Double_apple
 * @Date 2021/10/31 23:19
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient  //consul或者zookeeper 使用的注解
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
