package com.CSE687.ClearCity.service;

import com.CSE687.ClearCity.model.EmergencyHelpline;
import com.CSE687.ClearCity.model.ServicesOffered.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmergencyHelplineService implements Services {

    private static List<EmergencyHelpline> helplineList = new ArrayList<EmergencyHelpline>();

    static{
        helplineList.add(new EmergencyHelpline(01,"Contact Community Services",ServiceCategories.EmergencyHelpline,"Syracuse","(315) 251-1400"));
        helplineList.add(new EmergencyHelpline(02,"Legal Services of Central New York",ServiceCategories.EmergencyHelpline,"Syracuse","(315) 703-6500"));
        helplineList.add(new EmergencyHelpline(03,"Onondaga County Public Assistance Division",ServiceCategories.EmergencyHelpline,"Syracuse","(315) 435-2700"));
    }

    public List<EmergencyHelpline> retrieveList(){

        return helplineList;
    }

    public List<EmergencyHelpline> retrieveListByCity(String city) {

        List<EmergencyHelpline> filteredList = new ArrayList<EmergencyHelpline>();

        for(EmergencyHelpline helpline : helplineList){

            if(helpline.getCity() != null){
                if(helpline.getCity().equalsIgnoreCase(city)){
                    filteredList.add(helpline);
                }
            }

        }

        return filteredList;
    }

}
