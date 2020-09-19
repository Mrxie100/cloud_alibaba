package com.alibaba.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/10 0010 15:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelNaocsMain {
    public static void main(String[] args) {
        SpringApplication.run(SentinelNaocsMain.class,args);
    }
}
