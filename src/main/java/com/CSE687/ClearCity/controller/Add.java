package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.model.ServicesOffered;

public interface Add {

    public String addBusiness(int id, String name, ServicesOffered.ServiceCategories category, String city, String address);
}
