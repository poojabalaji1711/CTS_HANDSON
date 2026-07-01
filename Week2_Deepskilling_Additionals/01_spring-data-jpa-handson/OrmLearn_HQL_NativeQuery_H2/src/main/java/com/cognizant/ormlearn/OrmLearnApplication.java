package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("===== HQL QUERY =====");
        LOGGER.info("List all countries.");
        List<Country> hqlCountries = countryService.getAllCountriesHql();
        hqlCountries.forEach(c -> LOGGER.info("{}", c));

        LOGGER.info("Search country \"India\".");
        Country india = countryService.getCountryByNameHql("India");
        LOGGER.info("{}", india);

        LOGGER.info("===== NATIVE QUERY =====");
        LOGGER.info("List all countries.");
        List<Country> nativeCountries = countryService.getAllCountriesNative();
        nativeCountries.forEach(c -> LOGGER.info("{}", c));

        LOGGER.info("Search country code \"US\".");
        Country us = countryService.getCountryByCodeNative("US");
        LOGGER.info("{}", us);
    }
}
