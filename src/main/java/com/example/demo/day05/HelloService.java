package com.example.demo.day05;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage(){
        return "Hello Spring Boot!!!";
    }
}
