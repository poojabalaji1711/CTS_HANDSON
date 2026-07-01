package com.cognizant.orm_learn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = "com.cognizant")
@EnableJpaRepositories(basePackages = "com.cognizant.ormlearn.repository")
@EntityScan(basePackages = "com.cognizant.ormlearn.model")
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Starting query methods demonstration...");

        // 1. findByNameContaining
        String text = "United";
        LOGGER.info("1. Countries containing '{}':", text);
        List<Country> containing = countryService.searchCountriesByNameContains(text);
        containing.forEach(c -> LOGGER.info("{}", c));

        // 2. findByNameStartingWith
        String prefix = "Ind";
        LOGGER.info("2. Countries starting with '{}':", prefix);
        List<Country> starting = countryService.searchCountriesByNameStartsWith(prefix);
        starting.forEach(c -> LOGGER.info("{}", c));

        // 3. findByNameEndingWith
        String suffix = "ia";
        LOGGER.info("3. Countries ending with '{}':", suffix);
        List<Country> ending = countryService.searchCountriesByNameEndsWith(suffix);
        ending.forEach(c -> LOGGER.info("{}", c));

        // 4. findByNameOrderByNameAsc
        String name = "Japan";
        LOGGER.info("4. Country search by name '{}' ordered:", name);
        List<Country> orderedName = countryService.searchCountriesByNameOrdered(name);
        orderedName.forEach(c -> LOGGER.info("{}", c));

        // 5. findTop3ByOrderByNameAsc
        LOGGER.info("5. Top 3 countries by order by name ascending:");
        List<Country> top3 = countryService.getTop3CountriesOrderedByNameAsc();
        top3.forEach(c -> LOGGER.info("{}", c));

        LOGGER.info("Query methods demonstration completed.");
    }
}
