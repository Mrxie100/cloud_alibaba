package com.alibaba.example.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiehonyu
 * @Date: 2020/7/30 0030 09:56
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/serverport/{id}")
    public String getServerPort(@PathVariable("id") Integer id){
        return "nacos resiter paymentMain port:" + serverPort + "\tid "+ id;
    }
}
