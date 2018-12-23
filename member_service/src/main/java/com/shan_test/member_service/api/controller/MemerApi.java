package com.shan_test.member_service.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemerApi {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getMember")
    public String getMember(){

        return "this is member,我是会员服务,调用端口："+serverPort;
    }
}
