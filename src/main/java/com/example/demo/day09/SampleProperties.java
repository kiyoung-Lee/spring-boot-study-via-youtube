package com.example.demo.day09;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("whiteship")
public class SampleProperties {

    private String name;

    private List<MyPojo> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MyPojo> getList() {
        return list;
    }

    public void setList(List<MyPojo> list) {
        this.list = list;
    }
}
