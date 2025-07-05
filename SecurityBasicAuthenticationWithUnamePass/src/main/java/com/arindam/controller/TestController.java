package com.arindam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/msg")
public String showMsg()
{
	return "BASIC AUTHENTICATION WITH USERNAME AND PASSWORD";
}
}
