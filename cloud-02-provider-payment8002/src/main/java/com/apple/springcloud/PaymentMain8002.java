package com.apple.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther zzyy
 * @create 2020-02-17 21:13
 */
@SpringBootApplication
@EnableEurekaClient   //表示Eureka 监视的client
//@EnableDiscoveryClientpublic
//@EnableDiscoveryClient
public class PaymentMain8002
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}