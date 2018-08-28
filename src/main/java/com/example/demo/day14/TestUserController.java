package com.example.demo.day14;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestUserController {

    @GetMapping("/user/new")
    public String currentUser(){
        return "user/new";
    }

    @PostMapping("/user/new")
    public String newUser(@ModelAttribute TestUser user, BindingResult error){
        if(error.hasErrors()){
            return "user/new";
        }else{
            return "redirect:/users";
        }
    }
}
