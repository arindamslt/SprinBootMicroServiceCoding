package com.arindam.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.arindam.model.User;
import com.arindam.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
    private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 User user = userRepository.findByUsername(username)
		            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
		        return new org.springframework.security.core.userdetails.User(
		            user.getUsername(), user.getPassword(), new ArrayList<>());
		
	}
	 public User save(User user) {
	        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
	        return userRepository.save(user);
	    }

}
