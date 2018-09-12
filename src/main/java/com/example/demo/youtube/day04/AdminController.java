package com.example.demo.youtube.day04;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @RequestMapping("/admin")
    String home(){
        return "Hello World";
    }
}
