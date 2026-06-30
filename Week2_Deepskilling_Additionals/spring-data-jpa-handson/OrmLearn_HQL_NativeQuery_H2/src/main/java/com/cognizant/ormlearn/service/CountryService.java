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
    public List<Country> getAllCountriesHql() {
        return countryRepository.getAllCountriesHql();
    }

    @Transactional(readOnly = true)
    public Country getCountryByNameHql(String name) {
        return countryRepository.getCountryByNameHql(name);
    }

    @Transactional(readOnly = true)
    public List<Country> getAllCountriesNative() {
        return countryRepository.getAllCountriesNative();
    }

    @Transactional(readOnly = true)
    public Country getCountryByCodeNative(String code) {
        return countryRepository.getCountryByCodeNative(code);
    }
}
