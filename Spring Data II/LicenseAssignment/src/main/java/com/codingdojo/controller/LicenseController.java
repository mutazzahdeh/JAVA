package com.codingdojo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.models.License;
import com.codingdojo.models.Person;
import com.codingdojo.service.LicenseService;
import com.codingdojo.service.PersonService;

@Controller
public class LicenseController{
	
private final LicenseService licenseService;
private final PersonService personService;

public LicenseController(LicenseService licenseService, PersonService personService) {
	this.licenseService = licenseService;
	this.personService = personService;
}


@RequestMapping("/license/new")
public String LicenseNew(Model model) {
	List<Person> person =personService.findPersonWithoutlinses();
	List<License> license =licenseService.findallLinces();

    model.addAttribute("persons", person );
    model.addAttribute("linses", new License());
    return "new1.jsp";
}

@RequestMapping(value="/license/new",method=RequestMethod.POST)
public String index2(@ModelAttribute("linses") License license, BindingResult result,Model model) {
	if (result.hasErrors()) {
        return "new1.jsp";
    } 
	
	licenseService.createLicense(license);
	
	
    return "redirect:/license/new";
}
@RequestMapping("/person/{Id}")
public String show(@PathVariable("Id") Long id1,Model model) {
  Person person =personService.findPerson(id1);

  model.addAttribute("person",person);

        return "show.jsp";
    }

}

