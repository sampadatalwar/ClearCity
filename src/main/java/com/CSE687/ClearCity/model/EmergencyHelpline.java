package com.CSE687.ClearCity.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

public class EmergencyHelpline implements ServicesOffered{

    public int id;
    public String name;
    public ServiceCategories businessType;
    public String city;
    //public List<String> address;
    public String contact;

    public EmergencyHelpline(){}
    public EmergencyHelpline(int id, String name, ServiceCategories businessType, String city, String contact){
        this.id = id;
        this.name = name;
        this.businessType = businessType;
        this.city = city;
        this.contact = contact;
    }


    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }
}
