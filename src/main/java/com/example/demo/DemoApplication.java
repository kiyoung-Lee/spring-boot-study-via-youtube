package com.example.demo;

import com.example.demo.day06.MyListener;
import com.example.demo.day09.SampleProperties;
import javafx.application.Application;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
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

	// third party configuration 을 bean으로 주입 받을때
	// 아래와 같이 등록하면 third party lib property를 가져올수 있다.
//	@Bean
//	@ConfigurationProperties("whiteship")
//	public SampleProperties sampleProperties(){
//		return new SampleProperties();
//	}




	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.addListeners(new MyListener());
		application.run(args);


//		application.setWebApplicationType(WebApplicationType.REACTIVE);
//		application.setApplicationContextClass();

//		System.exit(SpringApplication.exit(SpringApplication.run(DemoApplication.class, args)));
	}
}
