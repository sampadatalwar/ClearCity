package com.CSE687.ClearCity.service;

import com.CSE687.ClearCity.model.ServicesOffered.*;
import com.CSE687.ClearCity.model.Shopping;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingService implements Services{

    private static List<Shopping> shoppingMallList = new ArrayList<Shopping>();

    static{
        shoppingMallList.add(new Shopping(01, "Destiny USA",ServiceCategories.Shopping, "Syracuse", "9090 Destiny USA Dr, Syracuse, NY 13204"));
        shoppingMallList.add(new Shopping(02, "Marshall Square Mall",ServiceCategories.Shopping, "Syracuse", "720 University Ave #14, Syracuse, NY 13210"));
        shoppingMallList.add(new Shopping(03, "Shop City Shopping Center",ServiceCategories.Shopping, "Syracuse", "105 Shop City Plaza, Syracuse, NY 13206"));
        shoppingMallList.add(new Shopping(04, "Nottingham Plaza",ServiceCategories.Shopping, "Syracuse", "315 Nottingham Rd, Syracuse, NY 13224"));
        shoppingMallList.add(new Shopping(05, "Empire Plaza",ServiceCategories.Shopping, "Syracuse", "3150 Erie Blvd E, Syracuse, NY 13214"));
    }

    public List<Shopping> retrieveList(){

        return shoppingMallList;
    }

    public List<Shopping> retrieveListByCity(String city) {

        List<Shopping> filteredList = new ArrayList<Shopping>();

        for(Shopping restaurant : shoppingMallList){

            if(restaurant.getCity() != null){
                if(restaurant.getCity().equalsIgnoreCase(city)){
                    filteredList.add(restaurant);
                }
            }

        }

        return filteredList;
    }

}
