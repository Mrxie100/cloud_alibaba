package com.cloudalibaba.cache.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/8 0008 09:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String password;
    private String phone;

    public interface Create {

    }
    public interface Update {

    }
}
