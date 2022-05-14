package com.CSE687.ClearCity.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchByCityService implements AvailableServices{

    @Override
    public List<?> retrieveServiceList(String city) {

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

        return filteredList;


    }
}
