package com.CSE687.ClearCity.service;

import org.springframework.http.ResponseEntity;

public interface AvailableServices {

    public ResponseEntity<?> commonProxyService(String service);

}
