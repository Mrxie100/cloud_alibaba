package com.alibaba.exampl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: xiehonyu
 * @Date: 2020/9/17 0017 16:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RabbitmqMain {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqMain.class,args);
    }
}
