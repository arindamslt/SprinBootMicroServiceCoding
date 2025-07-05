package com.arindam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public page.";
    }

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "This is a secure page. You are authenticated!";
    }
}
