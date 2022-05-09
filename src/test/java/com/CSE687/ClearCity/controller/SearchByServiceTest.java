package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.model.Drugstores;
import com.CSE687.ClearCity.model.ServicesOffered;
import com.CSE687.ClearCity.service.AvailableServices;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchByServiceTest {

    AvailableServices services = Mockito.mock(AvailableServices.class);
    SearchByService search = new SearchByService(services);


    @Test
    public void searchServices() {

        List<Drugstores> drugstoreList = new ArrayList<Drugstores>();
        drugstoreList.add(new Drugstores(01,"CVS Healthcare", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        drugstoreList.add(new Drugstores(02,"Walgreens", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        drugstoreList.add(new Drugstores(03,"Rite Aid", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        drugstoreList.add(new Drugstores(04,"Costco", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));


        Mockito.when(services.commonProxyService("drugstores")).thenReturn(null);
                //thenReturn(drugstoreList);
        //mockMvc.perform()

        ResponseEntity<?> response = search.searchServices("drugstores");


        assertEquals(null,response);





    }
}