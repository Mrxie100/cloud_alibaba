package com.cloudalibaba.webflux.entity;


import org.springframework.data.annotation.Id;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/7 0007 13:50
 */

public class User extends Mono<User> {
    @Id
    private Long id;

    private String username;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public User() {

    }

    @Override
    public void subscribe(CoreSubscriber<? super User> coreSubscriber) {

    }
}
