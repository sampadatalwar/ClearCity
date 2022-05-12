package com.CSE687.ClearCity.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.ArrayList;
import java.util.List;

public class Drugstores implements ServicesOffered{


    public int id;
    public String name;
    public ServiceCategories businessType;
    public String city;
    //public List<String> address;
    public String address;




    //Getter
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }


    public ServiceCategories getBusinessType() {
        return businessType;
    }

    public String getAddress() {
        return address;
    }

    public Drugstores(){}

    public Drugstores(int id, String name, ServiceCategories businessType, String city, String address){
        this.id = id;
        this.name = name;
        this.businessType = businessType;
        this.city = city;
        this.address = address;
    }




    @Override
    public boolean equals(Object obj){
        if(this.getClass() == obj.getClass()){
            Drugstores d = (Drugstores)obj;
            if(this.id == d.getId() && this.name == d.getName() && this.address == d.getAddress())
                return true;
        }

        return false;
    }
}
