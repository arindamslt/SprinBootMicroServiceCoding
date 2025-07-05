package com.arindam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/public").permitAll()     // No login required for /public
                .anyRequest().authenticated()              // All other URLs need authentication
            )
            .httpBasic(Customizer.withDefaults())// Enable HTTP Basic Authentication
        	.formLogin(Customizer.withDefaults());                                  // Enable HTTP Basic auth (for tools like Postman/curl)

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // Define two in-memory users: user and admin
        var user = User.withUsername("user")
                .password("{noop}password")                // {noop} means plain text password (no encoding)
                .roles("USER")
                .build();

        var admin = User.withUsername("admin")
                .password("{noop}admin123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

}
