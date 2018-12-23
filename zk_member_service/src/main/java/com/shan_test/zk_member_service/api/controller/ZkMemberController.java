package com.shan_test.zk_member_service.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZkMemberController {

    @Value("${server.port}")
    private String servicePort;
    @RequestMapping("/getMember")
    public Object getMember(){

        return "this zkMember Service"+servicePort;
    }
}
