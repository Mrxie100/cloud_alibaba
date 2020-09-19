//package com.cloudalibaba.webflux.handler;
//
//import com.cloudalibaba.webflux.entity.User;
//import com.cloudalibaba.webflux.mapper.UserRepository;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//import static org.springframework.http.MediaType.APPLICATION_JSON;
//
///**
// * @Author: xiehonyu
// * @Date: 2020/8/7 0007 13:52
// */
//@Component
//public class UserHandler {
//    private final UserRepository repository;
//
//    public UserHandler(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    //http://localhost:8888/saveUser
//    public Mono<ServerResponse> saveUser(ServerRequest request) {
//        Mono<User> user = request.bodyToMono(User.class);
//        return ServerResponse.ok().build(repository.insert(user).then());
//    }
//
//    //http://localhost:8888/deleteUser/1
//    public Mono<ServerResponse> deleteUser(ServerRequest request) {
//        Long userId = Long.valueOf(request.pathVariable("id"));
//        return ServerResponse.ok().build(repository.deleteById(userId).then());
//    }
//
//    //http://localhost:8888/user/1
//    public Mono<ServerResponse> getUser(ServerRequest request) {
//        Long userId = Long.valueOf(request.pathVariable("id"));
//        Mono<User> userInfo = repository.findById(userId);
//        return ServerResponse.ok().contentType(APPLICATION_JSON).body(userInfo, User.class);
//    }
//
//    //http://localhost:8888/listUser
//    public Mono<ServerResponse> listUser(ServerRequest request) {
//        Flux<User> userList = repository.findAll();
//        return ServerResponse.ok().contentType(APPLICATION_JSON).body(userList, User.class);
//    }
//}
