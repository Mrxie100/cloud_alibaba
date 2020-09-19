//package com.cloudalibaba.webflux.router;
//
//import com.cloudalibaba.webflux.handler.UserHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.server.RequestPredicates;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
///**
// * @Author: xiehonyu
// * @Date: 2020/8/7 0007 13:54
// */
//@Configuration
//public class UserRouter {
//    @Bean
//    public RouterFunction<ServerResponse> routeCity(UserHandler userHandler) {
//        return RouterFunctions
//                .route(RequestPredicates.GET("/listUser")
//                                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
//                        userHandler::listUser)
//                .andRoute(RequestPredicates.GET("/user/{id}")
//                                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
//                        userHandler::getUser)
//                .andRoute(RequestPredicates.GET("/deleteUser/{id}")
//                                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
//                        userHandler::deleteUser)
//                .andRoute(RequestPredicates.POST("/saveUser")
//                                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
//                        userHandler::saveUser);
//    }
//}
