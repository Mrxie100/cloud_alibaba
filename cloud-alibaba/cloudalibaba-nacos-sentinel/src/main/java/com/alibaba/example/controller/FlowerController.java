package com.alibaba.example.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.*;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/10 0010 15:34
 */
@RestController
public class FlowerController {

    @GetMapping("/testA")
    @SentinelResource(value = "testA",blockHandler = "testAHandler")
    public String testA() {
        int age = 10/0;
        return "------testA";
    }

    public String testAHandler() {
        return "::>_<::-----testA";
    }
    @GetMapping("/testB")
    public String testB() {

        return "------testB";
    }

//    static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
//
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Future<String> outterFuture = threadPoolExecutor.submit(() -> {
//
//            Future<String> innerFuture = threadPoolExecutor.submit(() -> {
//                System.out.println("inner finish");
//                return "inner finish";
//            });
//            String s = innerFuture.get();
//
//            System.out.println("outter get inner finish:" + s);
//
//            System.out.println("outter finish");
//            return "outter finish";
//        });
//        String s = outterFuture.get();
//        System.out.println("process get outter finish:" + s);
//    }
}
