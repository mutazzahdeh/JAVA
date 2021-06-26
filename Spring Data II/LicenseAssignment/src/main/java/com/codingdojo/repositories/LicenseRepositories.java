package com.codingdojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.License;

public interface LicenseRepositories extends CrudRepository<License, Long>{ 
	 List<License> findAll();
	 License findTopByOrderByNumberDesc();

}
