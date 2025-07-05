package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Employee;
import com.arindam.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
private EmployeeRepo erepo;
	public void  addData(Employee emp)
	{
		erepo.save(emp);
	}
	public List<Employee> getData()
	{
		return erepo.findAll();
	}
	public Employee findByEid(String eid)
	{
		return erepo.findById(eid).orElse(null);
	}
	public Employee updateData(String eid,Employee emp)
	{
		Employee empl=erepo.findById(eid).orElse(null);
		if(empl!=null)
		{
			empl.setEname(emp.getEname());
			empl.setDesig(emp.getDesig());
			empl.setDeptnm(emp.getDeptnm());
			erepo.save(empl);
		}
		return empl;
	}
	public void deleteData(String eid)
	{

		Employee empl=erepo.findById(eid).orElse(null);
		if(empl!=null)
		{
			erepo.delete(empl);
		}
	}
}
