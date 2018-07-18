package com.example.demo.day01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/exam")
    String home(){
        return "Hello World";
    }
}
