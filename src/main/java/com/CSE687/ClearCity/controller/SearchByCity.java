package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchByCity implements Search{

    //@Override
    @GetMapping("/searchByCity")
    public ResponseEntity<?> searchServices(String city) {
        //System.out.println("Enter city");
        //String city = sc.nextLine();

        List<Object> filteredList = new ArrayList<>();

        DrugstoreService d = new DrugstoreService();
        HealthcareService h = new HealthcareService();
        EmergencyHelplineService eh = new EmergencyHelplineService();
        RestaurantService r = new RestaurantService();
        ShoppingService s = new ShoppingService();


        filteredList.addAll(d.retrieveListByCity(city));
        filteredList.addAll(h.retrieveListByCity(city));
        filteredList.addAll(eh.retrieveListByCity(city));
        filteredList.addAll(r.retrieveListByCity(city));
        filteredList.addAll(s.retrieveListByCity(city));

        return ResponseEntity.ok(filteredList);
        //return null;
    }
}


