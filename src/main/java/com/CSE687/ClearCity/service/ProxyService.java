package com.CSE687.ClearCity.service;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class ProxyService implements AvailableServices {

    //controller code.
    public ResponseEntity<?> commonProxyService(String service) {


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
        }
        return null;
    }

}
