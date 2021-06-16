package com.example.demo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	
	   @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/time")
    public String index2(Model model) {
    	   LocalDateTime myDateObj = LocalDateTime.now();   
   	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");  
   	    
   	    String formattedDate = myDateObj.format(myFormatObj);   
       model.addAttribute("dojoName", formattedDate);
        return "time.jsp";
    }
    
    @RequestMapping("/date")
    public String index3(Model model) {
    	   LocalDateTime myDateObj = LocalDateTime.now();   
    	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");  
    	    
    	    String formattedDate = myDateObj.format(myFormatObj);   
        model.addAttribute("dojoName", formattedDate);
        return "data.jsp";
    }

}
