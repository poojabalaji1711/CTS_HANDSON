package com.cognizant.country;

import com.cognizant.country.entity.Country;
import com.cognizant.country.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryManagementApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryManagementApplication.class);

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Start");
        try {
            Country country = countryService.findCountryByCode("IN");
            LOGGER.info("Country: {}", country);
        } catch (Exception e) {
            LOGGER.error("Error finding country", e);
        }
        LOGGER.info("End");
    }
}
