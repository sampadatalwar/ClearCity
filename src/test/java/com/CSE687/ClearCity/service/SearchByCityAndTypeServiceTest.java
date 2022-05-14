package com.CSE687.ClearCity.service;

import com.CSE687.ClearCity.model.Drugstores;
import com.CSE687.ClearCity.model.ServicesOffered;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchByCityAndTypeServiceTest {

    private AvailableServices services = new SearchByCityAndTypeService();
    @Test
    void commonServiceTest(){


        List<Drugstores> expectedDrugstoreList = new ArrayList<Drugstores>();
        expectedDrugstoreList.add(new Drugstores(01,"CVS Healthcare", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        expectedDrugstoreList.add(new Drugstores(02,"Walgreens", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        expectedDrugstoreList.add(new Drugstores(03,"Rite Aid", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        expectedDrugstoreList.add(new Drugstores(04,"Costco", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));


        List<?> response = services.retrieveServiceList("drugstores syracuse");

        List<Drugstores> resp = (List<Drugstores>) response;

        assertEquals(expectedDrugstoreList.size(),resp.size());

    }


}