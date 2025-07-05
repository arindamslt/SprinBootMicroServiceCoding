package com.arindam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	@Bean
	BCryptPasswordEncoder passwordEncoder() {

	    return new BCryptPasswordEncoder();
	}


	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(((req)->req.requestMatchers("/register/add").permitAll() // Allow access to /contact without authentication
                .anyRequest().authenticated()))  // All other URLs require authentication
.httpBasic(Customizer.withDefaults())// Enable HTTP Basic Authentication
.formLogin(Customizer.withDefaults());	  // Enable form-based login                    
        
               

return http.csrf().disable().build();// Build and return the security filter chain csrf disable required in case of postmapping
		
		
		
	}
}
