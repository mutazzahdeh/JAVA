package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class CounterApplication {
private static int count=0;
	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
    @RequestMapping("/")
    public String index(HttpSession session) {
    	
           
           count++;
          
          
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String index2(HttpSession session) {
    	
		session.setAttribute("count", count);
    	
        return "counter.jsp";
    }
}
