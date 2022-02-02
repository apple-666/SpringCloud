package com.apple.springcloud;

import com.apple.springcloud.entities.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Double_apple
 * @Date 2022/1/30 19:29
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain83 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain83.class,args);
    }
}
