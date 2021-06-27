package com.codingdojo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.Repository.CategoryRepository;
import com.codingdojo.Repository.ProductRepository;
import com.codingdojo.models.Category;
import com.codingdojo.models.Product;

@Service
public class CatagoryServicies {


		private final ProductRepository productRepository;
		private final CategoryRepository categoryRepository;
		private final ProudctServices proudctServices;
		
		

		public CatagoryServicies(ProductRepository productRepository, CategoryRepository categoryRepository, ProudctServices proudctServices) {
			super();
			this.productRepository = productRepository;
			this.categoryRepository = categoryRepository;
			this.proudctServices = proudctServices;
		}

		public Category  createCategory(Category category ) {
			return categoryRepository.save(category);	
		}
		
		public List<Category> findAllCategory(){
			return categoryRepository.findAll();
		}
		public Category findCategory(Long id){
			  Optional<Category> optionalCategory = categoryRepository.findById(id);
		        if(optionalCategory.isPresent()) {
		            return optionalCategory.get();
		        } else {
		            return null;
		        }

		}
		public List<Category>  CategoryWithoutProudct() {
			return categoryRepository.findByProductsIsNull();	
		}
		public List<Category> CategoryWithoutProudct(Product p){
			return  categoryRepository.findByProductsNotContains(p);
		}
		
		public void updatecategory(Long idp,Long idc ) {
			Product product2=proudctServices.findProduct(idp);
			Category cat =this.findCategory(idc);
			List <Product> p=cat.getProducts();
			p.add(product2);
			cat.setProducts(p);
			categoryRepository.save(cat);
		}


	}


