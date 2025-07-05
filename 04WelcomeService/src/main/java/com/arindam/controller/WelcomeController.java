package com.arindam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public String getMsg()
	{
		String msg="WELCOME TO FIRST MICROSERVICE APPLICATION";
		return msg;
	}

}
