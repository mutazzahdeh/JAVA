package com.codingdojo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.City;

public interface CityRepository extends CrudRepository<City, Long>{
	
			
	List<City> findAll();
	//3
	@Query("SELECT ci FROM City ci JOIN ci.country c WHERE c.name = 'Mexico' AND c.population > 500000 ORDER BY c.population DESC")
	List<City> mexicanCities();
	//7
	@Query("SELECT c.name AS countryName, ci.name AS cityName, ci.district, ci.population FROM City ci JOIN ci.country c WHERE c.name = 'Argentina' AND ci.district = 'Buenos Aires' AND c.population > 500000 ORDER BY ci.population DESC")
	List<Object[]> argentinaBuenosAires();
}

