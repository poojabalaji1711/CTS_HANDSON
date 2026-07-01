package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Spring Learn application started successfully.");
		displayDate();
		displayCountry();
	}

	public static void displayDate() {
		LOGGER.info("START - displayDate");
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
			SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
			Date date = format.parse("31/12/2018");
			LOGGER.info("Parsed Date: {}", date);
		} catch (Exception e) {
			LOGGER.error("Error parsing date: ", e);
		}
		LOGGER.info("END - displayDate");
	}

	public static void displayCountry() {
		LOGGER.info("START - displayCountry");
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
			Country country = context.getBean("country", Country.class);
			LOGGER.debug("Country : {}", country);
		} catch (Exception e) {
			LOGGER.error("Error loading country: ", e);
		}
		LOGGER.info("END - displayCountry");
	}

}
