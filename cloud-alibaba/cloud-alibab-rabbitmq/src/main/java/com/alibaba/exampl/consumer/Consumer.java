package com.alibaba.exampl.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @Author: xiehonyu
 * @Date: 2020/9/17 0017 17:06
 */
@Component
public class Consumer {
    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    /**
     * @RabbitHandler 指定消息的处理方法
     * @param message
     */
    @RabbitListener(queues = "first_queue")//@RabbitListener 监听 first_queue 队列
    @RabbitHandler
    public void process(String message) {
        //接收first_queue队列消息
        log.info("接收的消息为: {}", message);
    }

    @RabbitListener(queues = "second_queue")//@RabbitListener 监听 second_queue 队列
    @RabbitHandler
    public void process1(String message) {
        //接收second_queue队列消息
        log.info("2接收的消息为: {}", message);
    }

}
