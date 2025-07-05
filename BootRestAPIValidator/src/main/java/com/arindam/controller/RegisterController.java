package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.dto.RegisterDto;
import com.arindam.model.Register;
import com.arindam.service.RegisterService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/register")
public class RegisterController {
	@Autowired
private RegisterService rservice;
	@Autowired
private Environment env;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@Valid @RequestBody RegisterDto rdto)
	{
		String msg=env.getProperty("register.add");
		rservice.addData(rdto);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/fetch")
	public ResponseEntity<List<Register>> getData()
	{
		List<Register> rlist=rservice.getData();
		return new ResponseEntity<List<Register>>(rlist,HttpStatus.OK);
	}
}
