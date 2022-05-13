package com.CSE687.ClearCity.controller;

import com.CSE687.ClearCity.model.Drugstores;
import com.CSE687.ClearCity.model.ServicesOffered;
import com.CSE687.ClearCity.service.AvailableServices;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;

@WebMvcTest(SearchByType.class)
class SearchByServiceTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    AvailableServices services = Mockito.mock(AvailableServices.class);
    @InjectMocks
    SearchByType search ;

    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(search).build();
    }

    @Test
    public void searchServices() throws Exception {

        List<Drugstores> drugstoreList = new ArrayList<Drugstores>();
        drugstoreList.add(new Drugstores(01,"CVS Healthcare", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        drugstoreList.add(new Drugstores(02,"Walgreens", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        drugstoreList.add(new Drugstores(03,"Rite Aid", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        drugstoreList.add(new Drugstores(04,"Costco", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));

        ResponseEntity<?>  result = ResponseEntity.ok(drugstoreList);

        doReturn(result).when(services.retrieveServiceList("drugstores"));
        ResponseEntity<?> response = search.searchServices("drugstores");

        mockMvc.perform(
                MockMvcRequestBuilders.get("/searchByService/Drugstores")
        ).andExpect(MockMvcResultMatchers.status().isOk());


    }
}