package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.entity.Customer;
import com.arindam.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
private CustomerRepo crepo;
public void addData(Customer cs)
{
	crepo.save(cs);
}
public List<Customer> getData()
{
	return crepo.findAll();
}
public Customer getCustomerId(String cid)
{
	Customer cs=crepo.findById(cid).orElse(null);
	return cs;
}
public void deleteData(String cid)
{
	Customer cs=crepo.findById(cid).orElse(null);
	if(cs!=null)
	{
		crepo.delete(cs);
	}
}
public Customer updateData(String cid,Customer cst)
{
	Customer cs=crepo.findById(cid).orElse(null);
	if(cs!=null)
	{
		cs.setCname(cst.getCname());
		cs.setCphno(cst.getCphno());
	}
	return cs;
}
}
