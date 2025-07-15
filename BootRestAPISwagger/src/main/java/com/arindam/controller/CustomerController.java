package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.entity.Customer;
import com.arindam.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/customer")
@Tag(name="Customer API",description = "Operation Related Customer")
public class CustomerController {
	@Autowired
private CustomerService cservice;
	@PostMapping("/add")
	@Operation(summary = "Create a new Customer",
	description = "Adding a new Record to the Customer")
	public ResponseEntity<String> addData(@RequestBody Customer cs)
	{
		String msg="DATA INSERTED SUCCESSFULLY";
		cservice.addData(cs);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/fetch")
	@Operation(summary = "Fetching Data ",
	description = "Getting List of Data From Customer")
	public ResponseEntity<List<Customer>> getData()
	{
		List<Customer> clist=cservice.getData();
		return new ResponseEntity<List<Customer>>(clist,HttpStatus.OK);
	}
}
