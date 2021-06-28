package com.codingdojo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.models.City;
import com.codingdojo.models.Country;
import com.codingdojo.services.ApiService;


@RestController
public class ApiController {
		private final ApiService apiService;
		
	public ApiController(ApiService apiService) {
			this.apiService = apiService;
		}

	@GetMapping("/1")
	public   List<Object[]> Index() {
		return apiService.countrname("Slovene");
	}
	@GetMapping("/2")
	public   List<Object[]> Index2() {
		return apiService.numberofcity();
	}
	@GetMapping("/3")
	public   List<City> Index3() {
		return apiService.city();
	}
	@GetMapping("/4")
	public   List<Object[]> Index4() {
		return apiService.Lang();
	}
	@GetMapping("/5")
	public   List<Country> Index5() {
		return apiService.findDenseCountries();
	}
	@GetMapping("/6")
	public   List<Country> Index6() {
		return apiService.findConMonCountries();
	}
	@GetMapping("/7")
	public   List<Object[]> Index7() {
		return apiService.argentinaBuenosAires();
	}
	@GetMapping("/8")
	public   List<Object[]> Index8() {
		return apiService.findCountryByRegion();
	}
}
