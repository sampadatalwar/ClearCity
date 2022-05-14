package com.CSE687.ClearCity.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class SearchAvailableServices implements AvailableServices{

    @Override
    @GetMapping("/search")
    public List<?> retrieveServiceList(String service) {

        List<String> str = new ArrayList<>();
        str.add("Default class. Hit a different search url for your specific search.");
        return str;
    }
}
