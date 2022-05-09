package com.CSE687.ClearCity.service;

import com.CSE687.ClearCity.model.Restaurants;
import com.CSE687.ClearCity.model.ServicesOffered.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService implements Services{

    private static List<Restaurants> restaurantList = new ArrayList<Restaurants>();

    static{
        restaurantList.add(new Restaurants(01,"Rise N Shine Diner Westcott", ServiceCategories.Restaurant,"Syracuse","500 Westcott St, Syracuse, NY 13210"));
        restaurantList.add(new Restaurants(02,"Alto Cinco", ServiceCategories.Restaurant,"Syracuse","526 Westcott St, Syracuse, NY 13210"));
        restaurantList.add(new Restaurants(03,"Phoebe's Restaurant & Coffee Lounge", ServiceCategories.Restaurant,"Syracuse","900 E Genesee St, Syracuse, NY 13244"));
        restaurantList.add(new Restaurants(04,"Dinosaur Bar-B-Que", ServiceCategories.Restaurant,"Syracuse","246 W Willow St, Syracuse, NY 13202"));
        restaurantList.add(new Restaurants(05,"Lemon Grass Restaurant", ServiceCategories.Restaurant,"Syracuse","113 Walton St, Syracuse, NY 13202"));
    }

    public List<Restaurants> retrieveList(){

        return restaurantList;
    }

    public List<Restaurants> retrieveListByCity(String city) {

        List<Restaurants> filteredList = new ArrayList<Restaurants>();

        for(Restaurants restaurant : restaurantList){

            if(restaurant.getCity().equalsIgnoreCase(city)){
                filteredList.add(restaurant);
            }
        }

        return filteredList;
    }

}
