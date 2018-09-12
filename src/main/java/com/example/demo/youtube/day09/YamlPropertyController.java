package com.example.demo.youtube.day09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YamlPropertyController {

    @Value("${whiteship.name}")
    String yamlName;

//    @Value("${myPojo}")
//    List<MyPojo> pojoList;

    @Autowired
    SampleProperties properties;


    @RequestMapping("/yaml")
    public String getYaml(){
        return yamlName;
    }

    @RequestMapping("/mypojo")
    public void checkYaml(){
//        System.out.println(pojoList.size());
        System.out.println(properties.getList().size());
    }
}
