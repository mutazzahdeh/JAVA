package com.codingdojo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.Repository.CityRepository;
import com.codingdojo.Repository.CointryRepository;
import com.codingdojo.Repository.LanguageRepository;
import com.codingdojo.models.City;
import com.codingdojo.models.Country;
@Service
public class ApiService {

	private final CityRepository cityRepository;
	private final CointryRepository countryRepository;
	private final LanguageRepository languageRepositary;



	public ApiService(CityRepository cityRepository, CointryRepository countryRepository,
			LanguageRepository languageRepositary) {
		super();
		this.cityRepository = cityRepository;
		this.countryRepository = countryRepository;
		this.languageRepositary = languageRepositary;
	}



	public   List<Object[]> countrname(String name){
		return countryRepository.findCountryByLang(name);
	}
	public   List<Object[]> numberofcity(){
		return countryRepository.findCountryCityCount();
	}
	
	public   List<City> city(){
		return cityRepository.mexicanCities();
	}
	public   List<Object[]> Lang(){
		return languageRepositary.findCountryLangs();
	}
	public   List<Country> findDenseCountries(){
		return countryRepository.findDenseCountries();
	}
	public   List<Country> findConMonCountries(){
		return countryRepository.findConMonCountries();
	}
	public   List<Object[]> argentinaBuenosAires(){
		return cityRepository.argentinaBuenosAires();
	}
	public   List<Object[]> findCountryByRegion(){
		return countryRepository.findCountryByRegion();
	}
}