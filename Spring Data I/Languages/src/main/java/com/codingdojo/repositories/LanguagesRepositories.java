package com.codingdojo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Languages;



public interface LanguagesRepositories extends CrudRepository<Languages, Long> {
	  // this method retrieves all the books from the database
    List<Languages> findAll();
    List<Languages> findByCreator(String creator);
    List<Languages> findByName(String name);
    

}
