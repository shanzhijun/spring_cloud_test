package com.shan_test.zk_member_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZkMemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkMemberServiceApplication.class, args);
    }
}
