package com.CSE687.ClearCity.service;

import com.CSE687.ClearCity.model.Drugstores;
import com.CSE687.ClearCity.model.ServicesOffered;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
class DrugstoreServiceTest {

    @Autowired
    MockMvc mockMvc;

    @Mock
    private SearchByTypeService services = mock(SearchByTypeService.class);

    /*
    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(services).build();
    }*/
    private AvailableServices services1 = new SearchByTypeService();
    @Test
    void commonProxyServiceTest(){


        List<Drugstores> expectedDrugstoreList = new ArrayList<Drugstores>();
        expectedDrugstoreList.add(new Drugstores(01,"CVS Healthcare", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        expectedDrugstoreList.add(new Drugstores(02,"Walgreens", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        expectedDrugstoreList.add(new Drugstores(03,"Rite Aid", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));
        expectedDrugstoreList.add(new Drugstores(04,"Costco", ServicesOffered.ServiceCategories.Drugstore,"Syracuse",""));

        ResponseEntity<?> result = ResponseEntity.ok(expectedDrugstoreList);
        //Mockito.when(services.commonProxyService("drugstores")).thenReturn(null);
        //thenReturn(drugstoreList);
        //given(services.commonProxyService("drugstores")).willReturn(expectedDrugstoreList);
        //doReturn(result).when(services.commonProxyService("drugstores"));
        ResponseEntity<?> response = ResponseEntity.ok(services1.retrieveServiceList("drugstores"));

        System.out.println(response);
        assertEquals(result,response);

    }

}