package com.example.demo.day16;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;

@Controller
public class MyErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return null;
    }
}
