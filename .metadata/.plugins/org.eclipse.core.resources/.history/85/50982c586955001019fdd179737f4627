package com.arindam.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.model.Register;
import com.arindam.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	@Autowired
private RegisterService rservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Register r)
	{
		System.out.println("CONTROLLER INVOKED====");
		boolean status=rservice.addData(r);
		System.out.println(status);
		if(status)
		{
			String msg="REGISTRATION SUCCESSFULL";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		else
		{

			String msg="REGISTRATION FAILURE";
			return new ResponseEntity<String>(msg,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
