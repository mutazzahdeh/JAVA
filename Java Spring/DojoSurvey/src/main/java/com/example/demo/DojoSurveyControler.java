package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DojoSurveyControler {
	 @RequestMapping(value="/result", method=RequestMethod.POST)
     public String login(Model model,@RequestParam(value="name") String name,@RequestParam(value="location") String location,@RequestParam(value="lang") String lang,@RequestParam(value="text") String comment) {
		 model.addAttribute("name", name);
		 model.addAttribute("location", location);
		 model.addAttribute("lang", lang);
		 model.addAttribute("comment", comment);
		
           return "information.jsp";
     }
	 @RequestMapping("/")
	    public String index2() {
	    	
	        return "index.jsp";}
	 

}
