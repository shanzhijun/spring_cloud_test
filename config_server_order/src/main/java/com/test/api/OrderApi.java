package com.test.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //动态获取配置信息 需要添加的注解，同时post请求  ：/actuator/refresh
public class OrderApi {

    @Value("${env.name}")
    private String envName;

    @RequestMapping("/getEnv")
    public String getEnv(){

        return envName;
    }
}
