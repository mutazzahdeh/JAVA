package com.codingdojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Person;

public interface PersonRepositories extends CrudRepository<Person, Long>{ 
	  List<Person> findAll();
	  List<Person> findByLicenseIsNull();
}
