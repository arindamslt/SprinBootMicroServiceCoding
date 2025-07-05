package com.arindam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SecurityConsumerAccessBasicAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityConsumerAccessBasicAuthenticationApplication.class, args);
		String apiUrl="http://localhost:8080/msg";
		RestTemplate rt = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("arindam","1234");
		HttpEntity<String> reqEntity=new HttpEntity<>(headers);
		/*ResponseEntity<String> re=rt.getForEntity(apiUrl,String.class);
		System.out.println(re.getBody());*/
		ResponseEntity<String> resEntity=rt.exchange(apiUrl,HttpMethod.GET, reqEntity,String.class);
		System.out.println(resEntity.getBody());
		
		
	}

}
