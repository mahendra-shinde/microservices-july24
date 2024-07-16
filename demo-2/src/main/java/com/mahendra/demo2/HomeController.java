package com.mahendra.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping(produces = "application/json")
	
	public String home() {
		return "{\"App\":\"Demo-2\", \"Framework\": \"Spring boot 3.3.1\" }";
	}
}
