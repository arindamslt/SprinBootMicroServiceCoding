package com.arindam.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
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
	@Autowired
private AuthenticationManager authManager;
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
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Register r)
	{
		UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(r.getEmail(), r.getPwd());
		Authentication authenticate=authManager.authenticate(token);
		boolean status=authenticate.isAuthenticated();//CHEKCING USERNAME AND PASSWORD
		if(status)
		{
			return new ResponseEntity<String>("LOGIN SUCCESS",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("LOGIN FAILURE",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
