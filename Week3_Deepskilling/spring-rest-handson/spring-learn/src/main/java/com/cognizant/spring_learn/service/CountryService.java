package com.cognizant.spring_learn.service;

import java.util.ArrayList;
import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private ArrayList<Country> countryList;

    @SuppressWarnings("unchecked")
    public CountryService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        this.countryList = (ArrayList<Country>) context.getBean("countryList", ArrayList.class);
    }

    public ArrayList<Country> getAllCountries() {
        return countryList;
    }

    public Country getCountry(String code) throws CountryNotFoundException {
        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new CountryNotFoundException("Country not found"));
    }
}
