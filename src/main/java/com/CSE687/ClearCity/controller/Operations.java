package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Operations {

    Scanner sc = new Scanner(System.in);

    //Search by service
    //@GetMapping("/searchByService")
    public List<Object> searchByService(){

        System.out.println("Enter service");
        String service = sc.nextLine();

        if(service.equalsIgnoreCase("Drugstores")){
            DrugstoreService d = new DrugstoreService();
            return Collections.singletonList(d.retrieveList());
        }

        else if(service.equalsIgnoreCase("Healthcare")){
            HealthcareService h = new HealthcareService();
            return Collections.singletonList(h.retrieveList());
        }

        else if(service.equalsIgnoreCase("Helplines")){
            EmergencyHelplineService eh = new EmergencyHelplineService();
            return Collections.singletonList(eh.retrieveList());
        }

        else if(service.equalsIgnoreCase("Restaurants")){
            RestaurantService r = new RestaurantService();
            return Collections.singletonList(r.retrieveList());
        }

        else if(service.equalsIgnoreCase("Shopping")){
            ShoppingService s = new ShoppingService();
            return Collections.singletonList(s.retrieveList());
        }

        else{
            System.out.println("Service Not Found");
        }

        return null;
    }

    //Search by city
    //@GetMapping("/searchByCity")
    public List<Object> searchByCity(){

        System.out.println("Enter city");
        String city = sc.nextLine();
/*
        Drugstore d = new Drugstore();
        Healthcare h = new Healthcare();
        EmergencyHelpline eh = new EmergencyHelpline();
        Restaurant r = new Restaurant();
        Shopping s = new Shopping();

        List<Object> result = new ArrayList<>();
        result.addAll(d.getServiceList());
        result.addAll(h.getServiceList());

        //call each get service and add objects with same city in list
        for(Object x : d.getServiceList()){
            /*
            if(x.city == "Syracuse"){

            }
        }*/

        return null;
    }

}
