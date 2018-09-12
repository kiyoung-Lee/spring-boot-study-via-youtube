package com.example.demo.youtube.day07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArgumentController {

    @Autowired
    ArgumentService service;

    @RequestMapping("/argument")
    public String argument(){
        return service.argumentTest();
    }
}
