package com.arindam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.client.WelcomeFeignClient;

@RestController
public class GreetController {
@Autowired
private WelcomeFeignClient welcomeClient;
	@GetMapping("/greet")
public String getMsg()
{
		String welmsg=welcomeClient.getMsg();
	return (welmsg +" "+"WELCOME TO SECOND MICROSERVICE");
}
}
