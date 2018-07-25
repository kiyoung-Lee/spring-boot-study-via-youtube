package com.example.demo.day07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArgumentService {

    @Autowired
    ApplicationArguments arguments;

//    @Value("${foo}")
//    String[] helloValues;

    public String argumentTest(){
        //1번 방벙
        List<String> helloValues = arguments.getOptionValues("hello");
        return helloValues.stream().collect(Collectors.joining(","));

        // 2번 방법
//        return Arrays.stream(helloValues).collect(Collectors.joining(","));
    }
}
