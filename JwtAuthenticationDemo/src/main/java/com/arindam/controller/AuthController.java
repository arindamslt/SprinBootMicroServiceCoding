package com.arindam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.config.JwtUtil;
import com.arindam.dto.JwtRequest;
import com.arindam.dto.JwtResponse;
import com.arindam.model.User;
import com.arindam.service.CustomUserDetailsService;

@RestController
public class AuthController {
	@Autowired
    private CustomUserDetailsService userService;

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@RequestBody JwtRequest request) throws Exception {
        try {
            authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid credentials", e);
        }

        final UserDetails userDetails = userService.loadUserByUsername(request.getUsername());
        final String token = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }

    @GetMapping("/secured")
    public ResponseEntity<?> securedData() {
        return ResponseEntity.ok("You are authenticated!");
    }
}
