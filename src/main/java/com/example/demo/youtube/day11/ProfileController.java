package com.example.demo.youtube.day11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProfileController {

    @Autowired
    MyProfile profileBean;

//    @Autowired
//    Environment environment;

    @RequestMapping("/profile")
    public String getProfileMessage(){
//        ConfigurableEnvironment configurableEnvironment = (ConfigurableEnvironment) environment;
//        configurableEnvironment.setActiveProfiles("prod");
//
//        ConfigurableEnvironment env = new StandardEnvironment();
//        env.setActiveProfiles("prod");

        return profileBean.getMessage();
    }
}
