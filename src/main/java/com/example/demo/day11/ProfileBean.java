package com.example.demo.day11;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class ProfileBean implements MyProfile{

    @Override
    public String getMessage() {
        return "Dev Bean";
    }

}
