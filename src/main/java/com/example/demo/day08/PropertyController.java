package com.example.demo.day08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

    @Autowired
    PropertyService service;

    @RequestMapping("/property")
    public String getName(){
        return service.getName();
    }

    @RequestMapping("/uuid")
    public String getUUid(){
        return service.getUuid();
    }
}
