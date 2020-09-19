package com.cloudalibaba.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/8 0008 09:36
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
@MapperScan("com.cloudalibaba.cache.mapper")
public class CloudCacheMain {
    public static void main(String[] args) {
        SpringApplication.run(CloudCacheMain.class,args);
    }
}
