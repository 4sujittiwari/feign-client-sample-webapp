package com.example.customer_detail.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.customer_detail.dto.Customer;

@FeignClient(name = "customer")
public interface CustomerDetailsService {

	@GetMapping(value = "/details")
	public Customer getCustomerDetails();

}
