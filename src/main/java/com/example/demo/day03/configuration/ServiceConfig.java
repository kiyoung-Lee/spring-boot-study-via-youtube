package com.example.demo.day03.configuration;

import com.example.demo.day03.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    // Service Annotation 을 Service Class 에 직접 정의하지 않아도
    // Configuration 파일에 등록하고 CompnentScan Aanotation 으로 설정을 스캔한다.
    @Bean
    public UserService userService(){
        return new UserService();
    }
}
