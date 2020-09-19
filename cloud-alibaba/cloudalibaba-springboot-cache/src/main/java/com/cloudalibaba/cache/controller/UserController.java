package com.cloudalibaba.cache.controller;

import com.cloudalibaba.cache.model.entity.User;
import com.cloudalibaba.cache.service.IUserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/8 0008 09:40
 */
@RestController
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping(value = "/getUser")
    public User getUser(@RequestParam(value = "id") Integer id){
        return userService.getUser(id);
    }

    @PutMapping(value = "/updateUser")
    @ResponseBody
    public void updateUser(@RequestBody @Validated(User.Update.class) User user){
         userService.updateUser(user);
    }
}
