package com.cloudalibaba.cache.service;

import com.cloudalibaba.cache.model.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/8 0008 09:40
 */
public interface IUserService{
    User getUser(Integer id);

    void updateUser(User user);
}
