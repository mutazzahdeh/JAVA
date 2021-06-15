package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class StringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringApplication.class, args);
	}
	@RequestMapping("")
	public String Hello() {
		return "Hello Clint How are you doing?";
		
	}
	@RequestMapping("/random")
	public String Random() {
		return "Spring Boot is great ! So easy to just respond With Strings ";
		
	}
}
