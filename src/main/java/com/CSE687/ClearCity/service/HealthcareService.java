package com.CSE687.ClearCity.service;

import com.CSE687.ClearCity.model.Drugstores;
import com.CSE687.ClearCity.model.HealthcareInstitutions;
import com.CSE687.ClearCity.model.ServicesOffered.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HealthcareService implements Services {

    private static List<HealthcareInstitutions> healthcareList = new ArrayList<HealthcareInstitutions>();

    static{
        healthcareList.add(new HealthcareInstitutions(01, "Upstate Health Care Center",ServiceCategories.Healthcare,"Syracuse","90 Presidential Plaza, Syracuse, NY 13202"));
        healthcareList.add(new HealthcareInstitutions(02, "Interim HealthCare of Syracuse NY",ServiceCategories.Healthcare,"Syracuse","3502 James St, Syracuse, NY 13206"));
        healthcareList.add(new HealthcareInstitutions(03, "Syracuse University Health Services",ServiceCategories.Healthcare,"Syracuse","150 Sims Dr, Syracuse, NY 13210"));
    }

    @Override
    public List<HealthcareInstitutions> retrieveList(){

        return healthcareList;
    }

    @Override
    public List<HealthcareInstitutions> retrieveListByCity(String city) {

        List<HealthcareInstitutions> filteredList = new ArrayList<HealthcareInstitutions>();

        for(HealthcareInstitutions healthcare : healthcareList){

            if(healthcare.getCity().equalsIgnoreCase(city)){
                filteredList.add(healthcare);
            }
        }

        return filteredList;
    }

}
