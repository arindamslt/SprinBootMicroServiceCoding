package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.model.Employee;
import com.arindam.service.EmployeeService;

@SpringBootApplication
public class BootDataJpaApplication implements CommandLineRunner {
	@Autowired
private EmployeeService eservice;
	public static void main(String[] args) {
		SpringApplication.run(BootDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("E1","SUMAN","MANAGER","MKTG");
		Employee emp2=new Employee("E2","ALOKE","MANAGER","HR");
		//eservice.addData(emp1);
		//eservice.addData(emp2);
		System.out.println("BEFORE UPDATE ALL DATA====");
		List<Employee> elist=eservice.getData();
		elist.stream().forEach(System.out::println);
		System.out.println("SEARCH DATA BASED ON EMPLOYEE ID===");
		Employee e=eservice.findByEid("E1");
		System.out.println(e);
		System.out.println("UPDATE DATA");
		Employee updemp=new Employee();
		updemp.setEname("RAMAN");
		updemp.setDesig("ANALYST");
		updemp.setDeptnm("FINANCE");
		eservice.updateData("E2", updemp);
		List<Employee> elist1=eservice.getData();
		elist1.stream().forEach(System.out::println);
		System.out.println("DELETE DATA=========");
		eservice.deleteData("E2");
		System.out.println("AFTER DELETE RECORDS");
		List<Employee> elist2=eservice.getData();
		elist2.stream().forEach(System.out::println);
	}

}
