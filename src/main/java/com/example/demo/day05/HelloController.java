package com.example.demo.day05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @RequestMapping("/hello")
    String showMessage(){
        return helloService.getMessage();
    }
}
