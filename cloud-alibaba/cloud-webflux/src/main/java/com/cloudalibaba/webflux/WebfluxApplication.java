package com.cloudalibaba.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/7 0007 11:37
 */
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class WebfluxApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebfluxApplication.class,args);
    }
}
