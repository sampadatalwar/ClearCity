package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.model.ServicesOffered;
import com.CSE687.ClearCity.service.DrugstoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddBusiness {
// make interface
    @GetMapping("/addBusiness")
    public String addBusiness(){
        DrugstoreService d = new DrugstoreService();
        //handle exception
        d.addDrugstore(01,"New Store", ServicesOffered.ServiceCategories.Drugstore,"Syracuse","");
        return "Service added successfully";
    }



}
