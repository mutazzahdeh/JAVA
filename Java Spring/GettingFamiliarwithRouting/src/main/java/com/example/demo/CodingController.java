package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")

@SpringBootApplication
@RestController
@RequestMapping("/coding")
public class CodingController {

	public static void main(String[] args) {
		SpringApplication.run(CodingController.class, args);
	}
	@RequestMapping("")
    public String hello() {
            return "Hello Coding Dojo!";
    }
	
	@RequestMapping("/python")
    public String hi() {
            return "Python/Django was awesome!";
    }
	@RequestMapping("/java")
    public String h() {
            return "Java/Spring is better!";
    }
   

}
