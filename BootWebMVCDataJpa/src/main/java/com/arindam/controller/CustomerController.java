package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.arindam.model.Customer;
import com.arindam.service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CustomerController {
	@Autowired
private CustomerService cservice;
	@GetMapping("/")
public String showCustomer()
{
	return "Customer";
}
	@GetMapping("/nav")
public String showNav()
{
	return "Nav";
}
	@PostMapping("/add")
public String addData(@ModelAttribute Customer customer,HttpServletRequest request)
{
		System.out.println("POST METHOD CALLING");
		System.out.println(customer.getCname());
	cservice.addData(customer);
	List<Customer> clist=cservice.getData();
	clist.stream().forEach(System.out::println);
	//model.addAttribute(clist);
	request.setAttribute("clist",clist);
	return "Show";
}
	@GetMapping("/show")
public String show()
{
	return "Show";
}
	@GetMapping("/delcs")
	public String ShowDelCustomer()
	{
		return "CustomerDel";
	}
	@GetMapping("/updcs")
	public String showUpdateCutomer()
	{
		return "CustomerUpd";
	}
	@GetMapping("/creport")
	public String getCustomerReport(HttpSession session)
	{
		List<Customer> clist=cservice.getData();
		clist.stream().forEach(System.out::println);
		//model.addAttribute(clist);
		session.setAttribute("clist",clist);
		return "CustomerReport";
	}
	@PostMapping("/del")
	public String deleteData(@ModelAttribute Customer customer,HttpServletRequest request)
	{
		cservice.deleteData(customer.getCid());
		List<Customer> clist=cservice.getData();
		clist.stream().forEach(System.out::println);
		//model.addAttribute(clist);
		request.setAttribute("clist",clist);
		return "Show";
	}
	@PostMapping("/upd")
	public String updateData(@ModelAttribute Customer customer,HttpServletRequest request)
	{
		cservice.updateData(customer.getCid(), customer);
		List<Customer> clist=cservice.getData();
		clist.stream().forEach(System.out::println);
		//model.addAttribute(clist);
		request.setAttribute("clist",clist);
		return "Show";
	}
}
