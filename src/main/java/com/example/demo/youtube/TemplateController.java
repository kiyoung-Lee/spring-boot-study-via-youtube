package com.example.demo.youtube.day16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemplateController {

//    @GetMapping("/template")
//    public String getTemplate(Model model, @RequestParam(defaultValue = "test") String name){
//        model.addAttribute("name",name);
//        return "template";
//    }

    @GetMapping("${index.path}")
    public String getTemplate2(Model model, @RequestParam(defaultValue = "test") String name){
        model.addAttribute("name",name);
        return "template";
    }

    @GetMapping("/thymeleaf")
    public String getLeaf(Model model, @RequestParam String name){
        model.addAttribute("name", name);
        return "tyme";
    }
}
