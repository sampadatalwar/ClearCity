package com.CSE687.ClearCity.service;

import java.util.List;

public class SearchByTypeService implements AvailableServices {

    //controller code.
    public List<?> commonProxyService(String service) {


        if(service.equalsIgnoreCase("Drugstores")){
            DrugstoreService d = new DrugstoreService();
            return (d.retrieveList());
        }

        else if(service.equalsIgnoreCase("Healthcare")){
            HealthcareService h = new HealthcareService();
            return (h.retrieveList());
        }

        else if(service.equalsIgnoreCase("Helplines")){
            EmergencyHelplineService eh = new EmergencyHelplineService();
            return (eh.retrieveList());
        }

        else if(service.equalsIgnoreCase("Restaurants")){
            RestaurantService r = new RestaurantService();
            return (r.retrieveList());
        }

        else if(service.equalsIgnoreCase("Shopping")){
            ShoppingService s = new ShoppingService();
            return (s.retrieveList());
        }

        else{
            System.out.println("Service Not Found");
        }
        return null;
    }

}
