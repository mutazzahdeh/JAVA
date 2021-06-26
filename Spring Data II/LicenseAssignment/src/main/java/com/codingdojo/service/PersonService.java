package com.codingdojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.models.Person;
import com.codingdojo.repositories.PersonRepositories;

@Service
public class PersonService {
	private final PersonRepositories personRepositories;

	public PersonService(PersonRepositories personRepositories) {
		
		this.personRepositories = personRepositories;
	}
	
	public Person  createPerson(Person person ) {
		return personRepositories.save(person);	
	}
	
	public List<Person> findallperson(){
		return personRepositories.findAll();
	}
	public Person findPerson(Long id){
		  Optional<Person> optionalPerson = personRepositories.findById(id);
	        if(optionalPerson.isPresent()) {
	            return optionalPerson.get();
	        } else {
	            return null;
	        }

	}
	public List<Person> findPersonWithoutlinses(){
		return personRepositories.findByLicenseIsNull();
	}

	


}
