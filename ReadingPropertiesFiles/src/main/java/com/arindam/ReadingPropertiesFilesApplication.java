package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.bean.Customer;

@SpringBootApplication
public class ReadingPropertiesFilesApplication implements CommandLineRunner{
    @Autowired
	private Customer cst;
	public static void main(String[] args) {
		SpringApplication.run(ReadingPropertiesFilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println(cst);	
	}

}
