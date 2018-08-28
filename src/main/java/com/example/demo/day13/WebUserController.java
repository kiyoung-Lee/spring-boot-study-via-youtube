package com.example.demo.day13;

import com.example.demo.day14.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebUserController {


    @Autowired
    HttpMessageConverters convertersList;

    // main view 를 찾아서 리턴한다
    // using - view resolver가 판별한다.
    // 최종판단은 contentNegotiationViewResolver 가 하여 리턴한다.

    @RequestMapping("/web")
    public String index() {
        convertersList.getConverters().forEach(c -> System.out.println("::::::::" + c.getClass()));
        return "main";
    }

    @GetMapping("/getuser")
    public TestUser currentUser(){
        TestUser user  = new TestUser();
        user.setName("test");
        user.setAge(12);

        return user;
    }

}
