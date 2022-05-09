package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchByService implements Search{

    AvailableServices services;

    public SearchByService(AvailableServices services){
        this.services = services;
    }

    @Override
    @GetMapping("/searchByService/{service}")
    public ResponseEntity<?> searchServices(@RequestParam String service) {

        services.commonProxyService(service);
/*
        if(service.equalsIgnoreCase("Drugstores")){
            DrugstoreService d = new DrugstoreService();
            return ResponseEntity.ok(d.retrieveList());
        }

        else if(service.equalsIgnoreCase("Healthcare")){
            HealthcareService h = new HealthcareService();
            return ResponseEntity.ok(h.retrieveList());
        }

        else if(service.equalsIgnoreCase("Helplines")){
            EmergencyHelplineService eh = new EmergencyHelplineService();
            return ResponseEntity.ok(eh.retrieveList());
        }

        else if(service.equalsIgnoreCase("Restaurants")){
            RestaurantService r = new RestaurantService();
            return ResponseEntity.ok(r.retrieveList());
        }

        else if(service.equalsIgnoreCase("Shopping")){
            ShoppingService s = new ShoppingService();
            return ResponseEntity.ok(s.retrieveList());
        }

        else{
            System.out.println("Service Not Found");
        }*/
        return null;
    }
}
