package com.CSE687.ClearCity.model;

public class Shopping implements ServicesOffered{

    public int id;
    public String name;
    public ServiceCategories businessType;
    public String city;
    //public List<String> address;
    public String address;

    public Shopping(){}
    public Shopping(int id, String name, ServiceCategories businessType, String city, String address){
        this.id = id;
        this.name = name;
        this.businessType = businessType;
        this.city = city;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

}
