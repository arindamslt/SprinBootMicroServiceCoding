package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Customer;
import com.arindam.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
private CustomerRepo crepo;
	public void addData(Customer c)
	{
		crepo.save(c);
	}
	public List<Customer> getData()
	{
		return crepo.findAll();
	}
	public void deleteData(String cid)
	{
		Customer cs=crepo.findById(cid).orElse(null);
		if(cs!=null)
		{
			crepo.delete(cs);
		}
	}
	public void updateData(String cid,Customer cst)
	{
		Customer cs=crepo.findById(cid).orElse(null);
		if(cs!=null)
		{
			cs.setCname(cst.getCname());
			cs.setCphno(cst.getCphno());
			crepo.save(cs);
			
		}
	}
}
