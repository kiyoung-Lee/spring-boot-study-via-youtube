package com.example.demo.inflearn.day01;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
public class HoloManConfiguration {

//    @Bean
//    @ConditionalOnMissingBean // 중복되는 빈이 있으면 등록하지 않는다.
//    public HoloMan holoMan(HoloManProperties properties){
//        HoloMan holoMan = new HoloMan();
//        holoMan.setName(properties.getName());
//        holoMan.setAge(properties.getHowLong());
//        return holoMan;
//    }
}
