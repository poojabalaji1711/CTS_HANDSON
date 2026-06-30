package com.cognizant.country.service;

import com.cognizant.country.entity.Country;
import com.cognizant.country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country getCountry(String code) {
        return countryRepository.findById(code)
                .orElseThrow(() -> new NoSuchElementException("Country not found with code: " + code));
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(Country country) {
        if (!countryRepository.existsById(country.getCoCode())) {
            throw new NoSuchElementException("Country not found with code: " + country.getCoCode());
        }
        return countryRepository.save(country);
    }

    public void deleteCountry(String code) {
        if (!countryRepository.existsById(code)) {
            throw new NoSuchElementException("Country not found with code: " + code);
        }
        countryRepository.deleteById(code);
    }

    public List<Country> searchCountries(String partialName) {
        return countryRepository.findByCoNameContainingIgnoreCase(partialName);
    }
}
