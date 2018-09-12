package com.example.demo.youtube.day11;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdBean implements MyProfile{
    @Override
    public String getMessage() {
        return "prod bean";
    }
}
