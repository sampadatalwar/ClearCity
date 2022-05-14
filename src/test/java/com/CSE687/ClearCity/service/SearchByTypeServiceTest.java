package com.CSE687.ClearCity.service;

import com.CSE687.ClearCity.model.Drugstores;
import com.CSE687.ClearCity.model.ServicesOffered;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchByTypeServiceTest {

    private AvailableServices services = new SearchByTypeService();
    @Test
    void commonServiceTest(){


        List<Drugstores> expectedDrugstoreList = new ArrayList<Drugstores>();
        expectedDrugstoreList.add(new Drugstores(01,"CVS Healthcare", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        expectedDrugstoreList.add(new Drugstores(02,"Walgreens", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        expectedDrugstoreList.add(new Drugstores(03,"Rite Aid", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        expectedDrugstoreList.add(new Drugstores(04,"Costco", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));


        List<?> response = services.retrieveServiceList("drugstores");

        List<Drugstores> resp = (List<Drugstores>) response;

        assertEquals(expectedDrugstoreList.get(1).getId(),resp.get(1).getId());

    }


}