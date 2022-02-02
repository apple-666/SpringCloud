package com.apple.springcloud.controller;

import com.apple.springcloud.entities.CommonResult;
import com.apple.springcloud.entities.Payment;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author Double_apple
 * @Date 2021/10/30 22:25
 * @Version 1.0
 */
@SuppressWarnings("all")
@RestController
@Slf4j
public class OrderController {

    //单机生产者
//    public static final String PAYMENT_URL = "http://localhost:8001";
    //集群生产者
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

//    从浏览器只能发GET请求
    // 但是下面的template.postForObject调用却是POST请求
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
