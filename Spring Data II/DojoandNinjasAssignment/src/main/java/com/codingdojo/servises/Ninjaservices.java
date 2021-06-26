package com.codingdojo.servises;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.models.Ninja;
import com.codingdojo.repositories.NinjaRepositories;

@Service
public class Ninjaservices {
	private final NinjaRepositories ninjaRepositories;

	public Ninjaservices(NinjaRepositories ninjaRepositories) {
		super();
		this.ninjaRepositories = ninjaRepositories;
	}

	public Ninja  createNinja(Ninja ninja ) {
		return ninjaRepositories.save(ninja);	
	}
	
	public List<Ninja> findAlNinja(){
		return ninjaRepositories.findAll();
	}
	public Ninja findNinja(Long id){
		  Optional<Ninja> optionalNinja = ninjaRepositories.findById(id);
	        if(optionalNinja.isPresent()) {
	            return optionalNinja.get();
	        } else {
	            return null;
	        }

	}

}
