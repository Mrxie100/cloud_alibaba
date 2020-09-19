package com.cloudalibaba.webflux.mapper;

import com.cloudalibaba.webflux.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/7 0007 13:51
 */
public interface UserRepository extends ReactiveMongoRepository<User,Long> {
}
