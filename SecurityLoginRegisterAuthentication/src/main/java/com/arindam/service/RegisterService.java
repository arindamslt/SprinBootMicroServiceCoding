package com.arindam.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.arindam.model.Register;
import com.arindam.repository.RegisterRepo;

@Service
public class RegisterService  implements UserDetailsService{
	@Autowired
private RegisterRepo rrepo;
	@Autowired
private BCryptPasswordEncoder pwdEncoder;
public boolean addData(Register r)
{
	System.out.println("ADDING DATA=====");
	String encodedPwd=pwdEncoder.encode(r.getPwd());
	r.setPwd(encodedPwd);
	Register rs=rrepo.save(r);
	return rs.getCid()!=null;
}

@Override
public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	// TODO Auto-generated method stub
	Register r=rrepo.findByEmail(email);
	return new User(r.getEmail(),r.getPwd(),Collections.emptyList());
	
}


}
