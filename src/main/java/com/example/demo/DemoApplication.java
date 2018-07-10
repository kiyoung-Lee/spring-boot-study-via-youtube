package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//EnableAutoconfigutation
//@Configutation
//@Import(ServiceCofig.class) - 이와같이 bean을 등록 가능하다.
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
