package com.cloudalibaba.cache.mapper;

import com.cloudalibaba.cache.model.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/8 0008 09:40
 */
public interface UserMapper {
    User getUser(@Param("id") Integer id);

    void updateUser(User user);
}
