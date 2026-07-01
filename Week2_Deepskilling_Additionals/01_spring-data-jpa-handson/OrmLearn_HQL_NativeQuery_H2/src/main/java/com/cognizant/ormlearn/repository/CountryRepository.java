package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("SELECT c FROM Country c ORDER BY c.name ASC")
    List<Country> getAllCountriesHql();

    @Query("SELECT c FROM Country c WHERE c.name = :name")
    Country getCountryByNameHql(@Param("name") String name);

    @Query(value = "SELECT * FROM country", nativeQuery = true)
    List<Country> getAllCountriesNative();

    @Query(value = "SELECT * FROM country WHERE code = :code", nativeQuery = true)
    Country getCountryByCodeNative(@Param("code") String code);
}
