package com.example.demo.youtube.day16;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class TemplateControllerTest {

    @Test
    public void ModelTest() throws Exception {

        TemplateController controller = new TemplateController();
        Model model = new ExtendedModelMap();

        controller.getTemplate(model, "kiyoung");

        model.asMap().forEach((k, v) -> System.out.println("key: " + k + "value: " + v));
    }
}