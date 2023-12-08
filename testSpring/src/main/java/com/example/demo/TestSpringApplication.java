package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringApplication.class, args);
		//new SpringApplicationBuilder(ApplicationContext.class).bannerMode(Banner.Mode.valueOf("resources/banner.txt")).run(args);
	}

}
