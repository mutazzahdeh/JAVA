package com.codingdojo.services;

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
				List<Lookify> allSongs = lookifyRepository.findAll();
				Collections.sort(allSongs, Comparator.comparingDouble(Lookify::getRating).reversed()); //sort the list in descinding order according to the rating
				for (int i = allSongs.size()-1; i >0; i--) { //traverse on the array from the last and remove all the indexes that are large than 9 because we want only the top 10 songs
					if(allSongs.size() <10) { //if the list is already contains less than 10 songs so return the list directly without removing from it.
						return allSongs;
					}
					if (i !=9) {
						allSongs.remove(i);
					}
					else {
						return allSongs;
					}
				}

				return allSongs;

			}
		
	 
	 
}
