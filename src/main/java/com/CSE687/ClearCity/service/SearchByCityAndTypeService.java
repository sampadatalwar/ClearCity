package com.CSE687.ClearCity.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchByCityAndTypeService implements AvailableServices{

    @Override
    public List<?> retrieveServiceList(String serviceAndCity) {

        String[] splitted = serviceAndCity.split("\\s+");
        //System.out.println("Enter service");
        String service = splitted[0];
        //System.out.println("Enter city");
        String city = splitted[1];

        if(service.equalsIgnoreCase("Drugstores")){
            DrugstoreService d = new DrugstoreService();
            return d.retrieveListByCity(city) ;
        }

        else if(service.equalsIgnoreCase("Healthcare")){
            HealthcareService h = new HealthcareService();
            return h.retrieveListByCity(city);
        }

        else if(service.equalsIgnoreCase("Helplines")){
            EmergencyHelplineService eh = new EmergencyHelplineService();
            return eh.retrieveListByCity(city);
        }

        else if(service.equalsIgnoreCase("Restaurants")){
            RestaurantService r = new RestaurantService();
            return r.retrieveListByCity(city);
        }

        else if(service.equalsIgnoreCase("Shopping")){
            ShoppingService s = new ShoppingService();
            return s.retrieveListByCity(city);
        }

        else{
            System.out.println("Service Not Found");
        }

        return null;

    }
}
