package com.arindam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.web.SecurityFilterChain;

import com.arindam.service.RegisterService;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	@Autowired
	private RegisterService rservice;
	@Bean
	BCryptPasswordEncoder passwordEncoder() {

	    return new BCryptPasswordEncoder();
	}
	@Bean
	public AuthenticationManager authManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}

	@Bean
	public DaoAuthenticationProvider authProvider() {

		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

		authProvider.setUserDetailsService(rservice);
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}

	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(((req)->req.requestMatchers("/register/add","/register/login").permitAll() // Allow access to /contact without authentication
                .anyRequest().authenticated()))  // All other URLs require authentication
.httpBasic(Customizer.withDefaults())// Enable HTTP Basic Authentication
.formLogin(Customizer.withDefaults());	  // Enable form-based login                    
        
               

return http.csrf().disable().build();// Build and return the security filter chain csrf disable required in case of postmapping
		
		
		
	}
}
