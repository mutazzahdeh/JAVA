package com.codingdojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.models.License;
import com.codingdojo.models.Person;
import com.codingdojo.repositories.LicenseRepositories;

@Service
public class LicenseService {
private final  LicenseRepositories  licenseRepositories;
public static int licenseNumber;

public LicenseService(LicenseRepositories licenseRepositories) {
	
	this.licenseRepositories = licenseRepositories;
} 
public License  createLicense(License license ) {
	license.setNumber(this.createLicenseNumber());
	return licenseRepositories.save(license);	
}

public List<License> findallLinces(){
	return licenseRepositories.findAll();
}
public License findLicense(Long id){
	  Optional<License> optionalLicense = licenseRepositories.findById(id);
      if(optionalLicense.isPresent()) {
          return optionalLicense.get();
      } else {
          return null;
      }
}
public String createLicenseNumber() {
	License license = licenseRepositories.findTopByOrderByNumberDesc();//retrieve the most recent license in DB
	
	if(license == null)
		return "000001";
	else{
		int newLicenseNumberUnformatted = Integer.parseInt(license.getNumber());//get most recent license in DB and convert to int
		newLicenseNumberUnformatted++;//increment by one
		
		String newLicenseNumber = Integer.toString(newLicenseNumberUnformatted);//convert to string
		
		int numOfZeros = 6-String.valueOf(newLicenseNumberUnformatted).length();//get num of digits excluding leading zeros
		
		//prepend zeros in front of license number
		for (int i = 0; i < numOfZeros; i++) {
			newLicenseNumber = "0" + newLicenseNumber;
		}
		
		return newLicenseNumber;
	}
}
}
