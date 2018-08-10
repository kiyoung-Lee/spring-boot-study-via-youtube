package com.example.demo.day10;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LukeController {

    @Autowired
    LukeProperties properties;

    @RequestMapping("/luke/properties")
    public void printProperties(){
        System.out.println(properties.getWorkFor());
        System.out.println(properties.getWorkWhere());

        System.out.println(properties.getTime1());
        System.out.println(properties.getTime2());
        System.out.println(properties.getTime3());
        System.out.println(properties.getNumber());
    }
}
