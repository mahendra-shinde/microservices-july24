package com.mahendra.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	@Value("${owner.name}")
	private String owner; 
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello "+owner);		
	}
	
}
