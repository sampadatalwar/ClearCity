package com.CSE687.ClearCity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public interface Search {

    Scanner sc = new Scanner(System.in);
    public ResponseEntity<?> searchServices(String service);
}
