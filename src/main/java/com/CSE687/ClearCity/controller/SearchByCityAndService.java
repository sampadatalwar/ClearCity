package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class SearchByCityAndService implements Search{

    @Override
    @GetMapping("/searchByCityAndService")
    public ResponseEntity<?> searchServices(String serviceAndCity) {

        String[] splitted = serviceAndCity.split("\\s+");
        //System.out.println("Enter service");
        String service = splitted[0];
        //System.out.println("Enter city");
        String city = splitted[1];

        if(service.equalsIgnoreCase("Drugstores")){
            DrugstoreService d = new DrugstoreService();
            return ResponseEntity.ok(d.retrieveListByCity(city)) ;
        }

        else if(service.equalsIgnoreCase("Healthcare")){
            HealthcareService h = new HealthcareService();
            return ResponseEntity.ok(h.retrieveListByCity(city));
        }

        else if(service.equalsIgnoreCase("Helplines")){
            EmergencyHelplineService eh = new EmergencyHelplineService();
            return ResponseEntity.ok(eh.retrieveListByCity(city));
        }

        else if(service.equalsIgnoreCase("Restaurants")){
            RestaurantService r = new RestaurantService();
            return ResponseEntity.ok(r.retrieveListByCity(city));
        }

        else if(service.equalsIgnoreCase("Shopping")){
            ShoppingService s = new ShoppingService();
            return ResponseEntity.ok(s.retrieveListByCity(city));
        }

        else{
            System.out.println("Service Not Found");
        }

        return null;
    }
}
