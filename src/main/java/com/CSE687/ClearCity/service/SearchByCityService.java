package com.CSE687.ClearCity.service;

import java.util.ArrayList;
import java.util.List;

public class SearchByCityService implements AvailableServices{
    @Override
    public List<?> commonProxyService(String city) {

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
