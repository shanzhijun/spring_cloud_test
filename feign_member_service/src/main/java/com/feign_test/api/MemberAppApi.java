package com.feign_test.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberAppApi {

    @Value("${server.port}")
    private String memberPort;


    @RequestMapping("/memberPort")
    public String memberPort(){
        return "feign member port " +memberPort;
    }
}
