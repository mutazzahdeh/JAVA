package com.codingdojo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.models.Languages;
import com.codingdojo.models.Lookify;
import com.codingdojo.services.Lookifyservice;
@Controller
public class LookifyController {
	private final  Lookifyservice lookifyservice;

	public LookifyController(Lookifyservice lookifyservice) {
		this.lookifyservice = lookifyservice;
	}
	
	@RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
	@RequestMapping("/dashboard")
    public String start(Model model) {
		List<Lookify> lookify=lookifyservice.allLookify();
		model.addAttribute("songs",lookify);
		model.addAttribute("song",new Lookify());
        return "dashborad.jsp";
    }
	@RequestMapping("/songs/new")
    public String newsong(Model model) {
		model.addAttribute("song",new Lookify());
        return "new.jsp";
    }
	  @RequestMapping(value="/new/song", method=RequestMethod.POST)
	    public String create( @ModelAttribute("song") Lookify lookify, BindingResult result,Model model) {
	        if (result.hasErrors()) {
	            return "new.jsp";
	        } else {
	        	lookify=lookifyservice.createLookify(lookify);
	        	 model.addAttribute("song",lookify );
	        	
	            return "redirect:/songs/"+lookify.getId();
	        }
	    }
	  @RequestMapping("/songs/{Id}")
	    public String show(@PathVariable("Id") Long id1,Model model) {
		  
		 Lookify lookify=lookifyservice.findLookify(id1);
		  
		  model.addAttribute("song",lookify);
	
	            return "show.jsp";
	        }
	    @RequestMapping(value="/delete/{id}")
	    
	    public String destroy(@PathVariable("id") Long id) {
	    	lookifyservice.deleteLookify(id);
	        return "redirect:/dashboard";
	    }
	    @RequestMapping(value="/search", method=RequestMethod.POST)
	    public String search(@Valid @ModelAttribute("song") Lookify lookify, BindingResult result,Model model,@RequestParam(value="artist") String artist) {
	    	  if (result.hasErrors()) {
	    		  List<Lookify> lookify2=lookifyservice.allLookify();
	    			model.addAttribute("songs",lookify2);
	    			model.addAttribute("song",new Lookify());
		            return "dashborad.jsp";
		        } 
	    		String x=artist;
//	    		List<Lookify> lookify1=lookifyservice.allLookify();
//	        	List<Lookify> lookify2 = new ArrayList<Lookify>() ;
//	     
//	        	for(int i=0;i<lookify1.size();i++)
//	        	{
//	        		if(lookify1.get(i).getArtist().equals(x))lookify2.add(lookify1.get(i));}
//	        	model.addAttribute("artist",x);   
//	        	model.addAttribute("song",lookify2);
	       	    return"redirect:/search/"+x;
	     
	    }
	    @RequestMapping(value="/search/{artist}")
	    public String search1(@PathVariable("artist") String x,Model model) {
    		
	    	List<Lookify> lookify1=lookifyservice.allLookify();
        	List<Lookify> lookify2 = new ArrayList<Lookify>() ;
     
        	for(int i=0;i<lookify1.size();i++)
        	{
        		if(lookify1.get(i).getArtist().equals(x))lookify2.add(lookify1.get(i));}
        	model.addAttribute("artist",x);   
        	model.addAttribute("songs",lookify2);
        	model.addAttribute("song",new Lookify() );
   	    return"search.jsp";
//   
	    }
	    
	    @RequestMapping(value="/search/topTen")
	    public String search1(Model model) {
    		
	    	List<Lookify> lookify1=lookifyservice.allLookify();
        	List<Lookify> lookify2 = lookifyservice.findtopten() ;
     
        
        	model.addAttribute("songs",lookify2);
        	model.addAttribute("song",new Lookify() );
   	    return"topten.jsp";
//   
	    }
//	 
}
