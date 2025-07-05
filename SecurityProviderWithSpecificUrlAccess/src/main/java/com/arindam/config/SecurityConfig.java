package com.arindam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //This tells Spring that this class contains bean definitions.It makes the class part of Spring's application context — Spring will look here for configuration at runtime.
@EnableWebSecurity
public class SecurityConfig {
	@Bean
public SecurityFilterChain secure(HttpSecurity http) throws Exception
{
	http.authorizeHttpRequests(((req)->req.requestMatchers("/contact").permitAll() // Allow access to /contact without authentication
			                    .anyRequest().authenticated()))  // All other URLs require authentication
	.httpBasic(Customizer.withDefaults())// Enable HTTP Basic Authentication
	.formLogin(Customizer.withDefaults());	  // Enable form-based login                    
	                    
			                   
			
	return http.build();// Build and return the security filter chain
}
}

