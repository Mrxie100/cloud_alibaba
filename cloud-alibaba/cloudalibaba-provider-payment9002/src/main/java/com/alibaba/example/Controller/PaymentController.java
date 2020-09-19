package com.alibaba.example.Controller;

import com.alibaba.example.entity.WaterDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

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
        List<WaterDTO> list = new ArrayList<>();
        for (int i = 0 ;i < 5000 ;i++){
            LocalDateTime dateTime = LocalDateTime.now();
            LocalDateTime yesterday = dateTime.plusDays(-i);
            list.add(new WaterDTO(String.valueOf(10000 - i),"sdasvdghjska"+i,yesterday.toString()));
        }
        return null;
    }

    public static void main(String[] args) {
        List<WaterDTO> list = new ArrayList<>();
        for (int i = 0 ;i < 5000 ;i++){
            LocalDateTime dateTime = LocalDateTime.now();
            LocalDateTime yesterday = dateTime.plusDays(-i);
            list.add(new WaterDTO(String.valueOf(10000 - i),"sdasvdghjska"+i,yesterday.toString()));
        }
        System.out.println(" = " + list.size());
    }
}
