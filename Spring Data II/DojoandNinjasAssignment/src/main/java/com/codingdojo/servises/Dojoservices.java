package com.codingdojo.servises;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.models.Dojo;
import com.codingdojo.repositories.DojoRepositories;

@Service
public class Dojoservices {
	private final DojoRepositories dojoRepositories;

	public Dojoservices(DojoRepositories dojoRepositories) {
		super();
		this.dojoRepositories = dojoRepositories;
	}
	public Dojo  createDojo(Dojo dojo ) {
		return dojoRepositories.save(dojo);	
	}
	
	public List<Dojo> findAllDojo(){
		return dojoRepositories.findAll();
	}
	public Dojo findDojo(Long id){
		  Optional<Dojo> optionalDojo = dojoRepositories.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
	            return null;
	        }

	}
	
}
