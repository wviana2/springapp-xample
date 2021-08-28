package com.util.apps.springapp.xample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.util.apps.springapp.xample.model.CustomerInfo;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@GetMapping("/customerinfo")
	public CustomerInfo getCustomerInfo() {
		CustomerInfo custInfo = new CustomerInfo();
		custInfo.setFirstname("Fredirick");
		custInfo.setLastname("Schmidt");
		custInfo.setAddress("Frankfurt, Germany");
		custInfo.setOccupation("Physician");
		custInfo.setMobile("0483736432");
		custInfo.setGender("Male");
		custInfo.setIdentificationCard("Driver License");
		return custInfo;
	}
}
