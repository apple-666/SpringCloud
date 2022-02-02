package com.apple.springcloud.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.apple.springcloud.CommonResult;

//创建CustomerBlockHandler类用于自定义限流处理逻辑： 提示一个4444异常
public class CustomerBlockHandler {

    public static CommonResult handlerException1(BlockException e){
        return new CommonResult(4444, "全局GLOBAL的客户自定义处理---1",4444);
    }

    public static CommonResult handlerException2(BlockException e){
        return new CommonResult(4444, "全局GLOBAL的客户自定义处理----2",4444);
    }
}
