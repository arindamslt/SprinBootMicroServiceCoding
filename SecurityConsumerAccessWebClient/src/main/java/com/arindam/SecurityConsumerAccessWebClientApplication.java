package com.arindam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SecurityConsumerAccessWebClientApplication implements CommandLineRunner{

	public static void main(String[] args){
		SpringApplication.run(SecurityConsumerAccessWebClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String baseUrl = "http://localhost:8080/msg";  // Replace with actual URL
        String username = "arindam";                       // Replace with actual username
        String password = "1234";                   // Replace with actual password

        WebClient webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeaders(headers -> headers.setBasicAuth(username, password))
                .build();

        String response = webClient.get()
                .uri("http://localhost:8080/msg")  // Replace with actual endpoint
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .block();  // Blocking for demo

        System.out.println("Provider Response: " + response);
	}

}
