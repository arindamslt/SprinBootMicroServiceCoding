package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.bean.Employee;

@SpringBootApplication
public class BootSetterInjectionApplication implements CommandLineRunner {
    @Autowired
	private Employee emp;
	public static void main(String[] args) {
		SpringApplication.run(BootSetterInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(emp);
	}

}
