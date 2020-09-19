package com.cloudalibaba.webflux.controller;

import com.cloudalibaba.webflux.entity.User;
import com.cloudalibaba.webflux.mapper.UserRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/7 0007 17:43
 */
@RestController
public class UserController {

    @Resource
    private UserRepository repository;

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User user){
        Mono<User> result = user;
        repository.insert(result);
//        repository.
    }
    @GetMapping("/{id}")
    public Mono<User> getUser(@PathVariable("id") Long id){
        return repository.findById(id);
    }
}
