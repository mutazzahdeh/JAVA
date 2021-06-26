package com.codingdojo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.models.Dojo;
import com.codingdojo.models.Ninja;
import com.codingdojo.servises.Dojoservices;
import com.codingdojo.servises.Ninjaservices;
@Controller
public class NinjaController {
	private final Ninjaservices ninjaservices;
	private final Dojoservices dojoservices;


	
	
	


	public NinjaController(Ninjaservices ninjaservices, Dojoservices dojoservices) {
		super();
		this.ninjaservices = ninjaservices;
		this.dojoservices = dojoservices;
	}

	@RequestMapping("/Ninja/new")
	public String NinjaNew(Model model) {
		List<Dojo> dojo =dojoservices.findAllDojo();
		

	    model.addAttribute("dojos", dojo );
	    model.addAttribute("ninja", new Ninja());
	    return "new1.jsp";
	}

	@RequestMapping(value="/Ninja/new",method=RequestMethod.POST)
	public String index2(@ModelAttribute("ninja") Ninja ninja, BindingResult result,Model model) {
		if (result.hasErrors()) {
	        return "new1.jsp";
	    } 
		
		ninjaservices.createNinja(ninja);
		
		
	    return "redirect:/Ninja/new";
	}
}
