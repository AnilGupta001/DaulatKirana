package com.apnigrocery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apnigrocery.Entity.User;

@SpringBootApplication
public class ApniGroceryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApniGroceryApplication.class, args);
	}
}
