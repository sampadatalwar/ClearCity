package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchByCityAndType implements Search{


    AvailableServices services;

    @Override
    @GetMapping("/searchByCityAndService")
    public ResponseEntity<?> searchServices(String serviceAndCity) {

        this.services = new SearchByCityAndTypeService();
        ResponseEntity<?> response = ResponseEntity.ok(services.commonProxyService(serviceAndCity));
        return response;


    }
}
