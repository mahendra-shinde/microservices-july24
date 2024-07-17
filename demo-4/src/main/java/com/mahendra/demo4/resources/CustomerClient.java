package com.mahendra.demo4.resources;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mahendra.demo4.models.Customer;

// A Load Balancer to connect and communicate with "Customer-Service"

/** Scenario 1 : Only ONE instance of "customer-service" on eureka
 * 						All requests would be forwared to SAME instance
 * 
 *  Scenario 2 : If More than ONE instance of "customer-service" on eureka
 *  					Ensure that ONE instance does not get ALL load
 *  					All Requests would be "Distributed evenly" across instances. 
*/

@FeignClient(name="customer-service")
public interface CustomerClient {
	@GetMapping("/find/{custId}")
	Customer find(@PathVariable("custId}") String custId);
}
