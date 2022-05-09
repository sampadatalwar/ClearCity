package com.CSE687.ClearCity.service;

import com.CSE687.ClearCity.model.Drugstores;
import com.CSE687.ClearCity.model.ServicesOffered.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DrugstoreService implements Services {

    private static List<Drugstores> drugstoreList = new ArrayList<Drugstores>();

    static{

        drugstoreList.add(new Drugstores(01,"CVS Healthcare", ServiceCategories.Drugstore,"Syracuse",""));
        drugstoreList.add(new Drugstores(02,"Walgreens",ServiceCategories.Drugstore,"Syracuse",""));
        drugstoreList.add(new Drugstores(03,"Rite Aid",ServiceCategories.Drugstore,"Syracuse",""));
        drugstoreList.add(new Drugstores(04,"Costco",ServiceCategories.Drugstore,"Syracuse",""));
    }

    public static void setDrugstoreList(List<Drugstores> drugstoreList) {
        DrugstoreService.drugstoreList = drugstoreList;
    }

    public static List<Drugstores> getDrugstoreList() {
        return drugstoreList;
    }

    public List<Drugstores> retrieveList(){

        return drugstoreList;
    }

    public List<Drugstores> retrieveListByCity(String city) {

        List<Drugstores> filteredList = new ArrayList<Drugstores>();

        for(Drugstores drugstore : drugstoreList){

            if(drugstore.getCity().equalsIgnoreCase(city)){
                filteredList.add(drugstore);
            }
        }

        return filteredList;
    }

    public void addDrugstore(int id, String name, ServiceCategories businessType, String city, String address){
        drugstoreList.add(new Drugstores(id,name, businessType,city,address));
    }

}
