package com.codingdojo.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.Services.CatagoryServicies;
import com.codingdojo.Services.ProudctServices;
import com.codingdojo.models.Category;
import com.codingdojo.models.Product;

@Controller
public class CategoryController {
	private final ProudctServices proudctServices;
	private final CatagoryServicies catagoryServicies;

	public CategoryController(ProudctServices proudctServices, CatagoryServicies catagoryServicies) {
		super();
		this.proudctServices = proudctServices;
		this.catagoryServicies = catagoryServicies;
	}
	
	
	@RequestMapping("/category/new")
	public String index(Model model) {
	    model.addAttribute("category", new Category() );
	    return "newcatg.jsp";
	}
	@RequestMapping(value="/category/new",method=RequestMethod.POST)
	public String index2(@ModelAttribute("person") Category category, BindingResult result,Model model) {
		if (result.hasErrors()) {
	        return "newcatg.jsp";
	    } 
		catagoryServicies.createCategory(category);
		
	    return "redirect:/category/new";
	}
	@RequestMapping("/category/{Id}")
	public String show(@PathVariable("Id") Long id1,Model model) {
		Category category =catagoryServicies.findCategory(id1);
		
	
	  List<Product> product=proudctServices.ProductWithoutcategory(category);
	  model.addAttribute("category",category);
	  model.addAttribute("product",product);
	 

	        return "show2.jsp";
	    }
	
	@RequestMapping(value="/category/update",method=RequestMethod.POST)
	public String index3(@RequestParam(value="product") Long idp, @RequestParam(value="id") Long id,Model model) {
		
		catagoryServicies.updatecategory(idp,id);
		
	    return "redirect:/category/"+id;
	}
}

