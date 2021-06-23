package com.codingdojo.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;


import com.codingdojo.models.Lookify;
import com.codingdojo.repositories.Lookifyrepositories;

@Service
public class Lookifyservice {
	 private final Lookifyrepositories lookifyRepository;

	public Lookifyservice(Lookifyrepositories lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}
	
	public List<Lookify> allLookify(){
		return lookifyRepository.findAll();	
	} 
	
	public Lookify createLookify(Lookify lookify) {
		return lookifyRepository.save(lookify);
	}
	
	 public Lookify findLookify(Long id) {
	        Optional<Lookify> optionalLookify = lookifyRepository.findById(id);
	        if(optionalLookify.isPresent()) {
	            return optionalLookify.get();
	        } else {
	            return null;
	        }
	    }
	 public Lookify updateBook(Long id,String title,String artist,Integer rating) {
		 Lookify lookify =findLookify(id);
			 
		 lookify.setTitle(title);
		 lookify.setArtist(artist);
		 lookify.setRating(rating);
		
			 
			 return lookifyRepository.save( lookify);
		 
		 }
	  public void deleteLookify(Long id) {
		  Optional<Lookify> optionalLanguages= lookifyRepository.findById(id);
		     if(optionalLanguages.isPresent()) {
		    	 lookifyRepository.deleteById(id);
		     } else {
		         System.out.println("There is no book with this id");
		     }
		 }
	  public Lookify updateLanguages(@Valid Lookify lookify) {
		  Lookify lookify1 =findLookify(lookify.getId());
			 lookify1.setTitle( lookify.getTitle());
			 lookify1.setArtist(lookify.getArtist());
			 lookify1.setRating(lookify.getRating());
			
			 return lookifyRepository.save(lookify1);
		}
	  public List<Lookify> findtopten() {
				List<Lookify>  lookify= lookifyRepository.findAll();
				List<Lookify> lookify2 = new ArrayList<Lookify>() ;
				for(int i=10;i>=1;i--) {
					if(lookify2.size()==10)return lookify2;
					
					for(int j=0;j<lookify.size();j++) {
						System.out.println(lookify.get(j).getRating());
						if(lookify.get(j).getRating()==i ) {lookify2.add(lookify.get(j));}
						if(lookify2.size()==10)return lookify2;
					}
				}
				return lookify2;
			}
		
	 
	 
}
