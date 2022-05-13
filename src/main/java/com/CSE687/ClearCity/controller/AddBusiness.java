package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.model.ServicesOffered;
import com.CSE687.ClearCity.service.DrugstoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddBusiness implements Add{

    @GetMapping("/addBusiness")
    public String addBusiness(int id, String name, ServicesOffered.ServiceCategories category, String city, String address){
        DrugstoreService d = new DrugstoreService();
        //handle exception
        d.addDrugstore(id,name, category,city,address);
        return "Service added successfully";
    }



}
