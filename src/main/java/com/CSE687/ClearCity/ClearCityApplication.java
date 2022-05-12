package com.CSE687.ClearCity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.CSE687.ClearCity.service","com.CSE687.ClearCity.model","com.CSE687.ClearCity.controller"})
public class ClearCityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClearCityApplication.class, args);
	}

}
