package com.codingdojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Lookify;

public interface Lookifyrepositories extends CrudRepository<Lookify, Long> {
	List<Lookify> findAll();
    List<Lookify> findByArtist(String search);

	

}
