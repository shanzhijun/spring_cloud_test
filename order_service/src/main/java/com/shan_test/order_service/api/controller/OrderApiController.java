package com.shan_test.order_service.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderApiController {

    @Resource
    private RestTemplate restTemplate;

    //订单服务调用会员服务
    @RequestMapping("/getOrder")
    public Object getOrder(){

        //通过服务别名访问其他服务需要为restTemplate添加注解启动负载均衡策略
        String forObject = restTemplate.getForObject("http://member-service/getMember", String.class);

        return "this is order service"+forObject;
    }
}
