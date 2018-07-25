package com.example.demo;

import javafx.application.Application;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

//EnableAutoconfigutation
//@Configutation
//@Import(ServiceCofig.class) - 이와같이 bean을 등록 가능하다.
public class DemoApplication {


	@Bean
	public ExitCodeGenerator exitCodeGenerator(){
		return () -> 42;
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		SpringApplication application = new SpringApplication(Application.class);
//		application.setWebApplicationType(WebApplicationType.REACTIVE);
//		application.setApplicationContextClass();

//		System.exit(SpringApplication.exit(SpringApplication.run(DemoApplication.class, args)));
	}
}
