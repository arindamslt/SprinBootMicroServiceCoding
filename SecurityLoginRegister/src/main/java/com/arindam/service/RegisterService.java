package com.arindam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.arindam.model.Register;
import com.arindam.repository.RegisterRepo;

@Service
public class RegisterService {
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
}
