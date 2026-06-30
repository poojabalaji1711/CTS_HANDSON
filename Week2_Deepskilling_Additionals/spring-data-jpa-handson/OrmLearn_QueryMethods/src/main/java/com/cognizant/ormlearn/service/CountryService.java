package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional(readOnly = true)
    public List<Country> searchCountriesByNameContains(String text) {
        return countryRepository.findByNameContaining(text);
    }

    @Transactional(readOnly = true)
    public List<Country> searchCountriesByNameStartsWith(String prefix) {
        return countryRepository.findByNameStartingWith(prefix);
    }

    @Transactional(readOnly = true)
    public List<Country> searchCountriesByNameEndsWith(String suffix) {
        return countryRepository.findByNameEndingWith(suffix);
    }

    @Transactional(readOnly = true)
    public List<Country> searchCountriesByNameOrdered(String name) {
        return countryRepository.findByNameOrderByNameAsc(name);
    }

    @Transactional(readOnly = true)
    public List<Country> getTop3CountriesOrderedByNameAsc() {
        return countryRepository.findTop3ByOrderByNameAsc();
    }
}
