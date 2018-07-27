package com.example.demo.day08;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    @Value("${name}")
    private String name;

    @Value("${uuid}")
    private String uuid;

    public String getName(){
        return name;
    }

    public String getUuid(){
        return uuid;
    }
}
