package com.codingdojo.Repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Category;
import com.codingdojo.models.Product;

public interface CategoryRepository extends CrudRepository<Category, Long> {
List<Category> findAll();
List<Category> findByProductsIsNull();

List<Category> findByProductsNotContains(Product pro);
Category findByName(String Name);





}
