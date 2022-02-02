package com.apple.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.apple.springcloud.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        // qps 是进来前的拦截
        // 线程 是进来后对等待时间长的拦截
//            try {
//                TimeUnit.SECONDS.sleep(3);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        log.info(Thread.currentThread().getName()+":::"+System.currentTimeMillis());
        return "testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "--------testB";
    }

    @GetMapping("/testHotkey")
    @SentinelResource(value = "Hotkeytab",blockHandler = "dealHotkey")
    public String testHotkey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2)
    {
        return "正常运行------------------";
    }

    public String dealHotkey(String p1, String p2, BlockException exception){
        return "dealhotkey,没法正常运行";
    }

    @GetMapping("/testHotkey2")
    @SentinelResource(value = "Hotkeytab2")
    public String testHotkey2(@RequestParam(value = "p3",required = false) String p3,
                             @RequestParam(value = "p4",required = false) String p4)
    {
        return "正常运行------------------";
    }

    //
    @GetMapping("/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",blockHandlerClass =CustomerBlockHandler.class,blockHandler = "handlerException1")//从自己写的地方拿方法
    public CommonResult customerBlockHandler(){
        return new CommonResult(200,"按客户自定义",200);
    }

}
