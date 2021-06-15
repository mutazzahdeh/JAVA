package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class HumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanApplication.class, args);
	}
	  @RequestMapping("/")
	    public String index(@RequestParam(value="name" , required=false ) String name) {
		  if(name==null)
	        return "<h1>Hello Human</h1> <p>Welcome to Spring boot</p>";
		  else
			  return "<h1>Hello "+name+"</h1> <p>Welcome to Spring boot</p>";
	    }
	
}
