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
public class ProductController {
	private final ProudctServices proudctServices;
	private final CatagoryServicies catagoryServicies;

	

	public ProductController(ProudctServices proudctServices, CatagoryServicies catagoryServicies) {
		super();
		this.proudctServices = proudctServices;
		this.catagoryServicies = catagoryServicies;
	}
	@RequestMapping("/product/new")
	public String index(Model model) {
	    model.addAttribute("proudct", new Product() );
	    return "newproudct.jsp";
	}
	@RequestMapping(value="/product/new",method=RequestMethod.POST)
	public String index2(@ModelAttribute("proudct") Product proudct, BindingResult result,Model model) {
		if (result.hasErrors()) {
	        return "newproudct.jsp";
	    } 
		
		proudctServices.createProduct(proudct);
		
	    return "redirect:/product/new";
	}
	@RequestMapping("/product/{Id}")
	public String show(@PathVariable("Id") Long id1,Model model) {
		Product product =proudctServices.findProduct(id1);
		
	
	  List<Category> category=catagoryServicies.CategoryWithoutProudct(product);
	  model.addAttribute("product",product);
	  model.addAttribute("category",category);
	  model.addAttribute("pro",new Category());

	        return "show.jsp";
	    }
	
	@RequestMapping(value="/product/update",method=RequestMethod.POST)
	public String index3(@RequestParam(value="name") String name, @RequestParam(value="id") Long id,Model model) {
		
		proudctServices.updateProduct(name,id);
		
	    return "redirect:/product/"+ id;
	}
}
