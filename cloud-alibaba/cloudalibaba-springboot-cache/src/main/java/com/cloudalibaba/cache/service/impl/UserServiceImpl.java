package com.cloudalibaba.cache.service.impl;

import com.cloudalibaba.cache.mapper.UserMapper;
import com.cloudalibaba.cache.model.entity.User;
import com.cloudalibaba.cache.service.IUserService;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/8 0008 09:41
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Cacheable(cacheNames = "users")
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

    @Override
    @CachePut(cacheNames = "users")
    public void updateUser(User user) {
        System.out.println("user = " + user);
         userMapper.updateUser(user);
    }
}
