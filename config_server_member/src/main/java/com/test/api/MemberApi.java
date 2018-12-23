package com.test.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MemberApi {

    @Value("${env.name}")
    private String envName;

    @RequestMapping("/getEnv")
    public String getEnv(){

        return envName;
    }
}
