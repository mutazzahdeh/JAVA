package com.codingdojo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Category;
import com.codingdojo.models.Product;

public interface ProductRepository  extends CrudRepository<Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesIsNull();
	
	List<Product> findByCategoriesNotContaining(Category c);

}
