package com.alibaba.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: xiehonyu
 * @Date: 2020/7/31 0031 09:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain.class,args);
    }
}
