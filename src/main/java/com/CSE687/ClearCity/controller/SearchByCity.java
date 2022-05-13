package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchByCity implements Search{


    AvailableServices services;

    @Override
    @GetMapping("/searchByCity")
    public ResponseEntity<?> searchServices(String city) {

        this.services = new SearchByCityService();
        ResponseEntity<?> response = ResponseEntity.ok(services.retrieveServiceList(city));
        return response;

    }
}


