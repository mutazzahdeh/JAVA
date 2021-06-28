package com.codingdojo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
	//4
	@Query("SELECT c.name AS country, l.language, l.percentage FROM Country c JOIN c.languages l WHERE l.percentage > 89 ORDER BY l.percentage DESC")
	List<Object[]> findCountryLangs();

}
