package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.service.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchByType implements Search{


    AvailableServices services;


    @Override
    @GetMapping("/searchByService/{service}")
    public ResponseEntity<?> searchServices(@RequestParam String service) {
        this.services = new SearchByTypeService();
        ResponseEntity<?> response = ResponseEntity.ok(services.retrieveServiceList(service));
        return response;

    }

}
