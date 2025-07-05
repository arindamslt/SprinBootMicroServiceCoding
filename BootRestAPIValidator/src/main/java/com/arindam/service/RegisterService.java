package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.RegisterRepo;
import com.arindam.dto.RegisterDto;
import com.arindam.model.Register;

@Service
public class RegisterService {
	@Autowired
private RegisterRepo rrepo;
	public void addData(RegisterDto rdto)
	{
		Register r=new Register();
		r.setUname(rdto.getUname());
		r.setPass(rdto.getPass());
		r.setNm(rdto.getNm());
		r.setEmail(rdto.getEmail());
		r.setPhno(rdto.getPhno());
		rrepo.save(r);
	}
	public List<Register> getData()
	{
		return rrepo.findAll();
	}
}
