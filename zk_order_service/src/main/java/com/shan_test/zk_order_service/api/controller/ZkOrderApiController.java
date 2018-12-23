package com.shan_test.zk_order_service.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ZkOrderApiController {


    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/getOrder")
    public Object gtOrder(){
        String forObject = restTemplate.getForObject("http://zk-member/getMember", String.class);
        return "this is order service "+forObject;
    }
}
