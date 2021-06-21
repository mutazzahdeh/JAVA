package com.codingdojo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.codingdojo.models.Languages;
import com.codingdojo.repositories.LanguagesRepositories;

@Service
public class LanguagesServices {
	 private final LanguagesRepositories languagesRepository;
	 
	 public LanguagesServices(LanguagesRepositories languagesRepository) {
	        this.languagesRepository = languagesRepository;
	    }
	 public List<Languages> allLanguages() {
	        return languagesRepository.findAll();
	    }
	 public Languages createLanguages(Languages b) {
	        return languagesRepository.save(b);
	    }
	  public Languages findLanguages(Long id) {
	        Optional<Languages> optionalLanguages= languagesRepository.findById(id);
	        if(optionalLanguages.isPresent()) {
	            return optionalLanguages.get();
	        } else {
	            return null;
	        }
	    }
	  public Languages updateBook(Long id,String name,String creator,String version) {
		  Languages lanuages =findLanguages(id);
			 
		  lanuages.setName(name);
		  lanuages.setCreator(creator);
		  lanuages.setVersion(version);
		
			 
			 return languagesRepository.save(lanuages);
		 
		 }
	  public void deleteLanguages(Long id) {
		  Optional<Languages> optionalLanguages= languagesRepository.findById(id);
		     if(optionalLanguages.isPresent()) {
		    	 languagesRepository.deleteById(id);
		     } else {
		         System.out.println("There is no book with this id");
		     }
		 }
	  public Languages updateLanguages(@Valid Languages languages) {
		  Languages lanuages =findLanguages(languages.getId());
		  lanuages.setName(languages.getName());
		  lanuages.setCreator(languages.getCreator());
		  lanuages.setVersion(languages.getVersion());
			
			 return languagesRepository.save(lanuages);
		}
}
