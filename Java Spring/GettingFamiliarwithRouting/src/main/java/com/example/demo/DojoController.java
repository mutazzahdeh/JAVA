package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DojoController {
	 @RequestMapping("/{dojo}")
	    public String showLesson(@PathVariable("dojo") String dojo){
	    	if(dojo=="dojo") {return "The dojo is awesome!";}
	    	if(dojo.equals("burbank-dojo")) {return "Burbank Dojo is located in Southern California";}
	    	if(dojo.equals("san-jose")) {return "SJ dojo is the headquarters";}
	    	
	    	return dojo;
	    	
	 }
	 
	
}
