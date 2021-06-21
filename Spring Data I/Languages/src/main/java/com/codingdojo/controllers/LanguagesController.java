package com.codingdojo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.models.Languages;
import com.codingdojo.services.LanguagesServices;




@Controller
public class LanguagesController {
	  private final LanguagesServices languagesService ;

	public LanguagesController(LanguagesServices languagesService) {
		this.languagesService = languagesService;
	}
    @RequestMapping("/Languages")
    public String index(Model model) {
        List<Languages> languages = languagesService.allLanguages();
        model.addAttribute("languages", languages);
        model.addAttribute("language",new Languages());
        return "index.jsp";
    }
    @RequestMapping(value="/Languages", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Languages language, BindingResult result,Model model) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	
        	 model.addAttribute("languages", languagesService.createLanguages(language));
            return "show.jsp";
        }
    }
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
    	Languages language = languagesService.findLanguages(id);
        model.addAttribute("language", language);
        return "edit.jsp";
    }
    
    @RequestMapping(value="/edit/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Languages language, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
        	languagesService.updateLanguages(language);
            return "redirect:/Languages";
        }
    }
    @RequestMapping(value="/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
    	languagesService.deleteLanguages(id);
        return "redirect:/Languages";
    }
    
}
