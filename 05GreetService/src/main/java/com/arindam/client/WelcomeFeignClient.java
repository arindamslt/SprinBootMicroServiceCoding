package com.arindam.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="04WELCOMESERVICE")
public interface WelcomeFeignClient {
	@GetMapping("/welcome")
	public String getMsg();
	

}
