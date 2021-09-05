package com.util.apps.springapp.xample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.util.apps.springapp.xample.model.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@GetMapping("/customers")
	public List<Customer> getCustomerInfo() {
		return Arrays.asList(
				new Customer( "Fredirick",
							  "Schmidt",
							  "Frankfurt, Germany",
							  "Physician",
							  "0483736432",
							  "Male",
							  "Driver License"),
				new Customer( "Sarah",
						  	  "Vanhauten",
						  	  "Berlin, Germany",
						  	  "Engineur",
						  	  "0395141835",
						  	  "Female",
							  "Passfort")
				);
	}
}
