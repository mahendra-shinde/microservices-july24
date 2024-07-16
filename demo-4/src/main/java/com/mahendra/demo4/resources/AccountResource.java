package com.mahendra.demo4.resources;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.demo4.models.Account;
import com.mahendra.demo4.models.Customer;

@RestController
@RequestMapping("/")
public class AccountResource {

	@Autowired private CustomerClient client;
	
	@GetMapping(produces = "application/json")
	@RequestMapping("/{accNo}")
	public Account find(@PathVariable("accNo") String accNo) {
		Account acc = new Account();
		acc.setAccountNo(accNo);
		acc.setOpeningDate(getDate("1/1/2012"));
		acc.setBalance(12300.00);
		Customer cust = client.find("C1111");
		acc.setCustomer(cust);
		return acc;
	}
	
	private Date getDate(String dateString) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		try {
			return df.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Date();
		}
	}
}
