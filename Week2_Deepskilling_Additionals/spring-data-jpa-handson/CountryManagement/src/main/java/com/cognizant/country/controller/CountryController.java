package com.cognizant.country.controller;

import com.cognizant.country.entity.Country;
import com.cognizant.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    // GET /countries/{code}
    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountry(@PathVariable String code) {
        try {
            Country country = countryService.getCountry(code);
            return ResponseEntity.ok(country);
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // POST /countries
    @PostMapping
    public ResponseEntity<Country> addCountry(@RequestBody Country country) {
        Country savedCountry = countryService.addCountry(country);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCountry);
    }

    // PUT /countries
    @PutMapping
    public ResponseEntity<Country> updateCountry(@RequestBody Country country) {
        try {
            Country updatedCountry = countryService.updateCountry(country);
            return ResponseEntity.ok(updatedCountry);
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // DELETE /countries/{code}
    @DeleteMapping("/{code}")
    public ResponseEntity<Void> deleteCountry(@PathVariable String code) {
        try {
            countryService.deleteCountry(code);
            return ResponseEntity.noContent().build();
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // GET /countries/search?name=
    @GetMapping("/search")
    public ResponseEntity<List<Country>> searchCountries(@RequestParam String name) {
        List<Country> countries = countryService.searchCountries(name);
        return ResponseEntity.ok(countries);
    }
}
