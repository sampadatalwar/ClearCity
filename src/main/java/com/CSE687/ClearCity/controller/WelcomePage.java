package com.CSE687.ClearCity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class WelcomePage {

    /*
    Can use enum for different services
    Can create interface for displaying info
     */
    Scanner sc = new Scanner(System.in);
    @GetMapping("/welcome")
    @ResponseBody
    public String welcome(){
        //System.out.println("Enter your name");
        //String name = sc.nextLine();
        return"Welcome!!";
    }

    public List<String> printDetails(List<String> details){

        return details;

    }
}
