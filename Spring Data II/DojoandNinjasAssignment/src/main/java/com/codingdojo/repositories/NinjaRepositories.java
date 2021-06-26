package com.codingdojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.codingdojo.models.Ninja;



public interface NinjaRepositories extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}
