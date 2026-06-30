package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByNameContaining(String text);
    List<Country> findByNameStartingWith(String prefix);
    List<Country> findByNameEndingWith(String suffix);
    List<Country> findByNameOrderByNameAsc(String name);
    List<Country> findTop3ByOrderByNameAsc();
}
