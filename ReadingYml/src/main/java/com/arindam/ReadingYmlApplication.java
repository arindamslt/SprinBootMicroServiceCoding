package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.bean.Product;

@SpringBootApplication
public class ReadingYmlApplication implements CommandLineRunner{
    @Autowired
	private Product pd;
	public static void main(String[] args) {
		SpringApplication.run(ReadingYmlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println(pd);	
	}

}
