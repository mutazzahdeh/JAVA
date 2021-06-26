package com.codingdojo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.codingdojo.models.Person;
import com.codingdojo.service.PersonService;

@Controller
public class PersonController {
private final PersonService personService;

public PersonController(PersonService personService) {

	this.personService = personService;
}
@RequestMapping("/person/new")
public String index(Model model) {
    model.addAttribute("person", new Person() );
    return "new.jsp";
}
@RequestMapping(value="/person/new",method=RequestMethod.POST)
public String index2(@ModelAttribute("person") Person person, BindingResult result,Model model) {
	if (result.hasErrors()) {
        return "new.jsp";
    } 
	personService.createPerson(person);
	
	
    return "redirect:/license/new";
}

}
