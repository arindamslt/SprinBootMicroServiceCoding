package com.arindam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/msg")
public String showMsg()
{
	return "SPRING SECURITY WITH BASIC AUTHENTICATION";
}
	@GetMapping("/reg")
	public String ShowRegistration()
	{
		return "WELCOME TO OUR APP";
	}
	@GetMapping("/contact")
	public String getContact()
	{
		return "CALL 73736473";
	}
}
